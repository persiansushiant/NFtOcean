package com.mrgamification.nftocean;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.mrgamification.nftocean.model.Product;

public class SplashActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        long count = Product.count(Product.class,null,null);
        //inja serfan ye seri dataye alaki vared kardam
        if(count==0){
            new Product("a","a",1,500,500,500,500,500,500,1).save();
            new Product("b","b",1,500,500,500,500,500,500,1).save();
            new Product("c","c",1,500,500,500,500,500,500,1).save();
            new Product("d","d",1,500,500,500,500,500,500,1).save();
            new Product("e","e",1,500,500,500,500,500,500,1).save();
            new Product("f","f",1,500,500,500,500,500,500,1).save();
            new Product("g","g",1,500,500,500,500,500,500,1).save();

        }


    }

    public void OK(View v) {
        startActivity(new Intent(SplashActivity.this, MainActivity.class));
    }
}