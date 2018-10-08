package com.santos.angela.santosangelalab5;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class SecondActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.d( "4ITF ", "oncreate has executed.... "  );

        Intent i =  new Intent(this, MyService.class);
        startService(i);


    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d( "4ITF ", "onstart has executed.... "  );
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d( "4ITF ", "onresume has executed.... "  );
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d( "4ITF ", "onpause has executed.... "  );
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d( "4ITF ", "onpause has executed.... "  );
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d( "4ITF ", "onRestart has executed.... "  );
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d( "4ITF ", "object is deallocated "  );
    }


    public void display1 (View v) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void process2 (View v) {
        Intent i = null, chooser = null;
        if (v.getId()== R.id.btnMap2 ) {
            i = new Intent (Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.6151592,120.9865843"));
            chooser = Intent.createChooser(i, "Select your map app");

            startActivity(chooser);
        }
    }



}
