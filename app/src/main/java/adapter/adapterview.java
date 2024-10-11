package adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.tab_frag_bottomna.FragmentUser;
import com.example.tab_frag_bottomna.fragmentList;
import com.example.tab_frag_bottomna.fragmenthome;
import com.google.android.material.search.SearchView;

public class adapterview extends FragmentStatePagerAdapter {


    public adapterview(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0 : return new fragmenthome();

            case 1 :  return  new fragmentList();

            case 2 : return new FragmentUser();

            default: return new fragmenthome();
        }


    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String tittle = "";
        switch (position){
            case 0 :
                tittle="Trang chủ";
                break;
            case 1 :
                tittle="Danh sách";
                break;
            case 3 :
                tittle="Tài khoản";
                break;

        }
        return super.getPageTitle(position);
    }
}
