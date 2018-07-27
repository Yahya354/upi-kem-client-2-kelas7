package com.upi.bahasaindonesia.kem.adapters;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.upi.bahasaindonesia.kem.R;

/**
 * Created by USER on 26/07/2018.
 */

public class SliderAdapter extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;

    public SliderAdapter(Context context){
        this.context = context;
    }

    //daftar gambar
    public int[] slide_image = {
            R.drawable.slider_1,
            R.drawable.slider_2,
            R.drawable.slider_3,
            R.drawable.slider_4,
            R.drawable.slider_5

    };

    //daftar header
    public String[] slide_heading = {
            "Kemampuan Efektif Membaca\nKelas 7 SMP\n",
            "Latihan",
            "Teks",
            "Grafik Nilai",
            "SELAMAT DATANG"
    };

    //daftar deskripsi
    public String[] slide_descs = {
            "Aplikasi ini akan membantumu berlatih dan mengetahui kemampuan membacamu secara mandiri di mana pun dan kapan pun\n",
            "Ada teks dan soal yang dapat kamu gunakan untuk mengetahui sejauh mana pemahamanmu terhadap bacaan itu!\n",
            "Terdapat beragam judul teks yang akan membantu meningkatkan kemampuan membaca pemahamanmu, mari membaca sekarang juga!\n",
            "Lihat grafik untuk melihat perkembangan kemampuan membacamu dari tiap teks yang telah dibaca!\n",
            "di aplikasi pelatihan\nKemampuan Efektif Membaca (KEM) untuk siswa kelas 7 SMP\n"
    };



    @Override
    public int getCount(){
        return slide_heading.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object o){
        return view == (RelativeLayout) o;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position){
        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slide_layout, container, false
        );

        ImageView slideImage = (ImageView) view.findViewById(R.id.slide_image);
        TextView slideHeading = (TextView) view.findViewById(R.id.slide_heading);
        TextView slideDesc = (TextView) view.findViewById(R.id.slide_desc);

        slideImage.setImageResource(slide_image[position]);
        slideHeading.setText(slide_heading[position]);
        slideDesc.setText(slide_descs[position]);

        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object){
        container.removeView((RelativeLayout)object);
    }

}
