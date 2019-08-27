package com.dicoding.rifaniisa.skincare;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

public class DetailsActivity extends AppCompatActivity {

    ImageView imageView, icFav, icShare;
    TextView tvDataSkincare, tvDataScDesc, tvPrice;

    public static final String SKINCARE_NAME = "skincare_name";
    public static final String SKINCARE_DESC = "skincare_desc";
    public static final String SKINCARE_IMAGE = "skincare_img";
    public static final String SKINCARE_PRICE = "skincare_price";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setActionBarTitle("Skincare Details");
        setContentView(R.layout.activity_details);

        Toolbar toolbar = findViewById(R.id.myToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //What to do on back clicked
                onBackPressed();
                finish();
            }
        });

        tvDataSkincare = findViewById(R.id.skincare_name);
        tvDataScDesc = findViewById(R.id.sc_desc);
        imageView = findViewById(R.id.img_item_photo);
        tvPrice = findViewById(R.id.skincare_price);

        final String name = getIntent().getStringExtra(SKINCARE_NAME);
        String desc = getIntent().getStringExtra(SKINCARE_DESC);
        String img = getIntent().getStringExtra(SKINCARE_IMAGE);
        String price = getIntent().getStringExtra(SKINCARE_PRICE);

        tvDataSkincare.setText(name);
        tvDataScDesc.setText(desc);
        Glide.with(this).asBitmap().load(img).into(imageView);
        tvPrice.setText(price);

    }

    private void setActionBarTitle(String title){
        if (getSupportActionBar() != null){
            getSupportActionBar().setTitle(title);
        }
    }
}
