package com.example.cartaoempresarial;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView siteTextView;
    private TextView phoneTextView;
    private TextView mapTextView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        siteTextView = findViewById(R.id.textViewSite);
        phoneTextView = findViewById(R.id.textViewPhone);
        mapTextView = findViewById(R.id.textViewMap);
    }

    private void openWebPage(String url){
        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(intent);
    }

    private void dialPhoneNumber(String number){
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse(number));
        startActivity(intent);
    }

    private final String LOCATION = "geo: -1.448335, -48.491765?z=18";

    private void showMap(){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(LOCATION));
        startActivity(intent);
    }
}







