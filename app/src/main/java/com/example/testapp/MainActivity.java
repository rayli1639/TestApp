package com.example.testapp;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.testapp.ui.main.SectionsPagerAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);
        FloatingActionButton fab = findViewById(R.id.fab);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }


=======
<<<<<<< HEAD
>>>>>>> 384505c2aeae6b0041c240f85144d4f40e48fc9d

    public static void testMethod() {
    }

<<<<<<< HEAD
    public static void anotherTestMethod() {

    }

=======
    public static void raysTestMethod(){

    }
<<<<<<< HEAD
=======
=======
>>>>>>> d2a68d14827687ce850109048e4fccc244327642
>>>>>>> 384505c2aeae6b0041c240f85144d4f40e48fc9d
>>>>>>> f8c0ef799428a93850a6a009796a6abc4ebbe34e
}