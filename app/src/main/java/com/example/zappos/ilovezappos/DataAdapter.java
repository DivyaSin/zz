package com.example.zappos.ilovezappos;

import android.app.Activity;
import android.content.Context;
//import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

//import com.example.zappos.ilovezappos.databinding.CardRowBinding;
import com.squareup.picasso.Picasso;

import java.util.List;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {
    private List<Results> product ;
    private Context context;

    public DataAdapter(Context context, List<Results> product) {
        this.context = context;
        this.product = product;
    }

    @Override
    public DataAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
//        CardRowBinding binding = CardRowBinding.inflate(layoutInflater, R.layout.card_row, viewGroup, false);
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_row, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.price.setText(product.get(i).getPrice());
        viewHolder.product_name.setText(product.get(i).getProductName());
        Picasso.with(context).load(product.get(i).getThumbnailImageUrl()).resize(50, 50).into(viewHolder.thumbnailImageUrl);
    }

    @Override
    public int getItemCount() {
        return product.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private TextView price, product_name;
        private ImageView thumbnailImageUrl;
        public ViewHolder(View view) {
            super(view);

            product_name = (TextView)view.findViewById(R.id.product_name);
//            style_id = (TextView)view.findViewById(R.id.style_id);
            price = (TextView)view.findViewById(R.id.price);
            thumbnailImageUrl = (ImageView)view.findViewById(R.id.thumbnail_image);
        }
    }
}