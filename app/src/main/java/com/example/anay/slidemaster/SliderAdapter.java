package com.example.anay.slidemaster;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class SliderAdapter extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;
    ImageView slideImageView;
    TextView slideHeading, slideDescription;



    public SliderAdapter(Context context) {
        this.context = context;
    }

    //Array
    public int[] slide_images = {
            R.drawable.logo,
            R.drawable.logo,
            R.drawable.logo
    };

    public String[] slide_headings = {
            "EAT",
            "SLEEP",
            "CODE",
    };

    public String[] slide_desc = {
            "Lorem ipsum color sit amet consectur adipising elit" + "aliqua",
            "Lorem ipsum color sit amet consectur adipising elit" + "aliqua",
            "Lorem ipsum color sit amet consectur adipising elit" + "aliqua"
    };


    @Override
    public int getCount() {
        return slide_headings.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object o) {
        return view == (RelativeLayout) o;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slide_layout, container, false);

        slideImageView = view.findViewById(R.id.slide_image);
        slideHeading = view.findViewById(R.id.slide_heading);
        slideDescription = view.findViewById(R.id.slide_desc);

        slideImageView.setImageResource(slide_images[position]);
        slideHeading.setText(slide_headings[position]);
        slideDescription.setText(slide_desc[position]);


        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((RelativeLayout)object);
    }



}
