package com.melisa.vitrinova.ui.newproducts;

import android.content.Context;
import android.widget.ImageView;

import com.melisa.vitrinova.R;
import com.squareup.picasso.Picasso;

public class PicassoClient {

    public static void downloadImage(Context c, String url, ImageView img)
    {
        if(url != null && url.length()>0)
        {
            Picasso.with(c).load(url).noFade().into(img);
        }else {
            Picasso.with(c).load(R.drawable.placeholder).into(img);
        }
    }

}