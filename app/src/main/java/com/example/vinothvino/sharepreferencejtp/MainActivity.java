package com.example.vinothvino.sharepreferencejtp;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends Activity {

    Button b1,b2;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.storeinfo);
        b2 = (Button) findViewById(R.id.retrieveinfo);
        t1 = (TextView) findViewById(R.id.data);

        View.OnClickListener listener = new View.OnClickListener(){

            public void onClick(View v){
                switch (v.getId()){

                    case R.id.storeinfo:

                        Intent intent = new Intent(MainActivity.this,prefsactivity.class);
                        startActivity(intent);
                        break;

                    case R.id.retrieveinfo:

                        storedetailsInPreference();
                        break;
                    default:
                        break;
                }
            }
        };

        b1.setOnClickListener(listener);
        b2.setOnClickListener(listener);
    }

    public void storedetailsInPreference(){

        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);

        String username = prefs.getString("username", "Default Name");
        String password = prefs.getString("password", "sfsfsd");
        boolean checkbox = prefs.getBoolean("checkbox", false);
        String listpref = prefs.getString("listpref", "Default list preference");

        StringBuilder builder = new StringBuilder();
        builder.append("Username :"+username+ " \n");
        builder.append("Password :"+password+ " \n");
        builder.append("Keep me logged in :"+String.valueOf(checkbox)+ " \n");
        builder.append("List Preference :"+listpref);

        t1.setText(builder.toString());
    }
}
