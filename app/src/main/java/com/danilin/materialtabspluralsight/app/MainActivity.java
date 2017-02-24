package com.danilin.materialtabspluralsight.app;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.danilin.materialtabspluralsight.R;
import com.danilin.materialtabspluralsight.tabs.TextTabs;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Toolbar toolbar;
    private Button btnSimpleTabs, btnScrollableTabs, btnIconTabs, btnCustomIconTextTabs;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        btnSimpleTabs = (Button) findViewById(R.id.btnSimpleTabs);
        btnScrollableTabs = (Button) findViewById(R.id.btnScrollabeTabs);
        btnIconTabs = (Button) findViewById(R.id.btnIconTabs);
        btnCustomIconTextTabs= (Button) findViewById(R.id.btnCustomIconTabs);


        btnSimpleTabs.setOnClickListener(this);
        btnScrollableTabs.setOnClickListener(this);
        btnIconTabs.setOnClickListener(this);
        btnCustomIconTextTabs.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnSimpleTabs:
                Intent i = new Intent(MainActivity.this, TextTabs.class);
                startActivity(i);
                break;
            case R.id.btnIconTabs:
                break;
            case R.id.btnScrollabeTabs:
                break;
            case R.id.btnCustomIconTabs:
                break;



        }
    }
}
