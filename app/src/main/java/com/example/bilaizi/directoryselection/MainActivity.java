package com.example.bilaizi.directoryselection;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

/**
 * Launcher Activity for the Directory Selection sample app.
 */
public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_directory_selection);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, DirectorySelectionFragment.newInstance())
                    .commit();
        }
    }
}
