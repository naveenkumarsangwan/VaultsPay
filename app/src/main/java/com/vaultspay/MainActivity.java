package com.vaultspay;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.valutspaylibrary.RssFeedProvider;
import com.valutspaylibrary.RssItem;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void updateDetail(String uri) {  //
        List<RssItem> list = RssFeedProvider
                .parse(uri);
        String itemListAsString = list.toString();
    }
}