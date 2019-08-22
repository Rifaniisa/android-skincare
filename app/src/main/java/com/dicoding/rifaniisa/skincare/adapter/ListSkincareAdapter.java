package com.dicoding.rifaniisa.skincare.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.dicoding.rifaniisa.skincare.R;
import com.dicoding.rifaniisa.skincare.model.Skincare;

import java.util.ArrayList;

public class ListSkincareAdapter extends RecyclerView.Adapter<ListSkincareAdapter.ListViewHolder>{
    private ArrayList<Skincare> listSkincare;

    public  ListSkincareAdapter(ArrayList<Skincare> list){
        this.listSkincare = list;
    }

    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback){
        this.onItemClickCallback = onItemClickCallback;
    }

    @NonNull
    @Override
    public ListSkincareAdapter.ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_sc, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        Skincare sc = listSkincare.get(position);

        Glide.with(holder.itemView.getContext()).load(sc.getPhoto())
                .apply(new RequestOptions().override(55,55))
                .into(holder.imgPhoto);

        holder.tvName.setText(sc.getName());
        holder.tvFunction.setText(sc.getFunction());



        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClickCallback.onItemClicked(listSkincare.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listSkincare.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {

        ImageView imgPhoto;
        TextView tvName, tvFunction;
        ListViewHolder(@NonNull View itemView) {
            super(itemView);

            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvFunction = itemView.findViewById(R.id.tv_item_function);
        }
    }

    public interface OnItemClickCallback{
        void onItemClicked(Skincare data);
    }
}
