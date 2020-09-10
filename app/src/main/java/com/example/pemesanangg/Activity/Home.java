package com.example.pemesanangg.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.pemesanangg.Fragment.HomeFragment;
import com.example.pemesanangg.Fragment.LainFragment;
import com.example.pemesanangg.Fragment.OrderFragment;
import com.example.pemesanangg.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Home extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        loadFragment(new HomeFragment());
        setContentView(R.layout.activity_home);

        loadFragment(new HomeFragment());
        BottomNavigationView bottomNavigationView = findViewById(R.id.btnnav);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
    }

    private boolean loadFragment(Fragment fragment) {
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fl_container, fragment)
                    .commit();
            return true;
        }
        return false;

    };

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment fragment = null;
        switch (item.getItemId()) {
            case R.id.home_menu:
                fragment = new HomeFragment();
                break;
            case R.id.order_menu:
                fragment = new OrderFragment();
                break;
            case R.id.lain_menu:
                fragment = new LainFragment();
                break;
        }
        return loadFragment(fragment);
    };
}