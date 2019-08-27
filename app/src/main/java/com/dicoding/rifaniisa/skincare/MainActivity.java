package com.dicoding.rifaniisa.skincare;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.dicoding.rifaniisa.skincare.adapter.ListSkincareAdapter;
import com.dicoding.rifaniisa.skincare.model.Skincare;
import com.dicoding.rifaniisa.skincare.model.SkincareData;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvSkincare;
    private ArrayList<Skincare> list = new ArrayList<>();
    private Toolbar topToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        rvSkincare = findViewById(R.id.rv_skincare);
        rvSkincare.setHasFixedSize(true);

        list.addAll(SkincareData.getListData());
        showRecyclerList();

        topToolbar = findViewById(R.id.myToolbar);
    }


    private void showRecyclerList(){
        rvSkincare.setLayoutManager(new LinearLayoutManager(this));
        ListSkincareAdapter listSkincareAdapter = new ListSkincareAdapter(list);
        rvSkincare.setAdapter(listSkincareAdapter);
        listSkincareAdapter.setOnItemClickCallback(new ListSkincareAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Skincare data) {
                showSelectedSkincare(data);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_profile) {
            Intent intentProfile = new Intent(MainActivity.this, ProfileActivity.class);
            startActivity(intentProfile);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void showSelectedSkincare(Skincare sc){
       Intent intentDetails = new Intent(MainActivity.this, DetailsActivity.class);
       intentDetails.putExtra(DetailsActivity.SKINCARE_NAME, sc.getName());
       intentDetails.putExtra(DetailsActivity.SKINCARE_DESC, sc.getFunction());
       intentDetails.putExtra(DetailsActivity.SKINCARE_IMAGE, sc.getPhoto());
       intentDetails.putExtra(DetailsActivity.SKINCARE_PRICE, sc.getPrice());
       startActivity(intentDetails);

    }
}
