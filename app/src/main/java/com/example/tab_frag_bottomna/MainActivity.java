package com.example.tab_frag_bottomna;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

import adapter.adapterview;

public class MainActivity extends AppCompatActivity {

    ViewPager viewpaper;
    TabLayout tab;
    BottomNavigationView bottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        viewpaper = findViewById(R.id.viewpaper);
        bottom = findViewById(R.id.navigation);
        adapterview adape = new adapterview(getSupportFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        viewpaper.setAdapter(adape);

        viewpaper.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                switch (position){
                    case 0 :
                        bottom.getMenu().findItem(R.id.Nha).setChecked(true);
                        break;
                    case 1:
                        bottom.getMenu().findItem(R.id.danhsach).setChecked(true);
                        break;
                    case 2:
                        bottom.getMenu().findItem(R.id.Taikhoan).setChecked(true);
                        break;
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

           bottom.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
               @Override
               public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                   if (item.getItemId() == R.id.Nha) {
                       viewpaper.setCurrentItem(0);
                       if (item.getItemId()==R.id.danhsach){
                           viewpaper.setCurrentItem(1);
                       }
                       if (item.getItemId()==R.id.Taikhoan){
                           viewpaper.setCurrentItem(2);
                       }
                   }
                   return true;

               }
           });


//        adapterview adapter = new adapterview(this);
//        viewpaper.setAdapter(adapter);
//
//        viewpaper.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
//            @Override
//            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
//                super.onPageScrolled(position, positionOffset, positionOffsetPixels);
//            }
//
//            @Override
//            public void onPageSelected(int position) {
//                switch (position){
//                    case 0:
//                        bottom.getMenu().findItem(R.id.Nha).setChecked(true);
//                        break;
//                    case 1:
//                        bottom.getMenu().findItem(R.id.danhsach).setChecked(true);
//                        break;
//                    case 2:
//                        bottom.getMenu().findItem(R.id.Taikhoan).setChecked(true);
//                        break;
//
//                }
//            }
//
//            @Override
//            public void onPageScrollStateChanged(int state) {
//                super.onPageScrollStateChanged(state);
//            }
//        });
}
}