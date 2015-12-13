package com.example.vinothvino.sharepreferencejtp;

import android.preference.PreferenceActivity;
import android.os.Bundle;

/**
 * Created by vinothvino on 07/12/15.
 */
public class prefsactivity extends PreferenceActivity {

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.prefs);
    }
}
