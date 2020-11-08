package com.uit.musicplayer.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.squareup.picasso.Picasso;
import com.uit.musicplayer.R;
import com.uit.musicplayer.model.Advertisement;

import java.util.ArrayList;

public class BannerAdapter extends PagerAdapter {

    Context context;
    ArrayList<Advertisement> arrayBanner;

    public BannerAdapter(Context context, ArrayList<Advertisement> arrayAdvertisement) {
        this.context = context;
        this.arrayBanner = arrayAdvertisement;
    }

    @Override
    public int getCount() {
        return arrayBanner.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.template_banner, null);

        ImageView imageViewBackground = view.findViewById(R.id.imageViewBackground);
        ImageView imageViewBanner = view.findViewById(R.id.imageViewBanner);
        TextView txtTitleBanner = view.findViewById(R.id.textViewTitleBanner);
        TextView txtContentBanner = view.findViewById(R.id.textViewContent);

        Picasso.get().load(arrayBanner.get(position).getImageadvertisement()).into(imageViewBackground);
        Picasso.get().load(arrayBanner.get(position).getImageSong()).into(imageViewBanner);
        txtTitleBanner.setText(arrayBanner.get(position).getNameSong());
        txtContentBanner.setText(arrayBanner.get(position).getContentadvertisement());

        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }
}
