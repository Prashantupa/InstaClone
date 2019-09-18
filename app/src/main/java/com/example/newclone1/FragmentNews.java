package com.example.newclone1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class FragmentNews extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_news, container, false);


     /*   BottomNavigationView bottomNavigationView = view.findViewById(R.id.nav_view);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                Fragment selectedFragment = null;
                switch (menuItem.getItemId()) {
                    case R.id.navigation_home:
                        selectedFragment = new FragmentHome();

                        Toast.makeText(getContext(), "nav_home", Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.navigation_Search:
                        selectedFragment = new FragmentSearch();

                        Toast.makeText(getContext(), "search", Toast.LENGTH_SHORT).show();

                        break;

                    case R.id.navigation_gallery:
                        selectedFragment = new FragmentGallery();
                        Toast.makeText(getContext(), "gallery", Toast.LENGTH_SHORT).show();

                        break;

                    case R.id.navigation_req:
                        selectedFragment = new FragmentReq();
                        Toast.makeText(getContext(), "req", Toast.LENGTH_SHORT).show();

                        break;

                    case R.id.navigation_profile:
                        selectedFragment = new FragmentProfile();
                        Toast.makeText(getContext(), "profile", Toast.LENGTH_SHORT).show();

                        break;
                }
                getActivity().getSupportFragmentManager().beginTransaction().add(R.id.container1,selectedFragment).commit();*/

             //   return true;

          //  }
       // });





        return view;

    }
}
    //}
   /* private void setupBottomViewPager(){
        BottomNavigationViewPager adapter = new BottomNavigationViewPager(getActivity().getSupportFragmentManager());
        adapter.addfragment(new FragmentHome());
        adapter.addfragment(new FragmentSearch());
        adapter.addfragment(new FragmentGallery());
        adapter.addfragment(new FragmentReq());
        adapter.addfragment(new FragmentProfile());
        ViewPager viewPager = (ViewPager)getView().findViewById(R.id.container1);
        viewPager.setAdapter(adapter);


    }
}*/

        /*getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container1, new FragmentHome()).commit();

        BottomNavigationView bottomNavigationView = view.findViewById(R.id.nav_view);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                Fragment selectedFragment = null;
                switch (menuItem.getItemId()) {
                    case R.id.navigation_home:
                        selectedFragment = new FragmentHome();

                        Toast.makeText(getContext(), "nav_home", Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.navigation_Search:
                        selectedFragment = new FragmentSearch();
                        Toast.makeText(getContext(), "search", Toast.LENGTH_SHORT).show();

                        break;

                    case R.id.navigation_gallery:
                        selectedFragment = new FragmentGallery();
                        Toast.makeText(getContext(), "gallery", Toast.LENGTH_SHORT).show();

                        break;

                    case R.id.navigation_req:
                        selectedFragment = new FragmentReq();
                        Toast.makeText(getContext(), "req", Toast.LENGTH_SHORT).show();

                        break;

                    case R.id.navigation_profile:
                        selectedFragment = new FragmentProfile();
                        Toast.makeText(getContext(), "profile", Toast.LENGTH_SHORT).show();

                        break;
                }

//                getFragmentManager().beginTransaction().
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container1, selectedFragment).commit();
                return true;
            }
        });

    /*    BottomNavigationView.OnNavigationItemSelectedListener nav = new
                BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                        Fragment selectedFragment = null;
                        switch (menuItem.getItemId()){
                            case R.id.navigation_home:
                                selectedFragment = new FragmentHome();
                                break;

                            case R.id.navigation_Search:
                                selectedFragment = new FragmentSearch();
                                break;

                            case R.id.navigation_gallery:
                                selectedFragment = new FragmentGallery();
                                break;

                            case R.id.navigation_req:
                                selectedFragment = new FragmentReq();
                                break;

                            case R.id.navigation_profile:
                                selectedFragment = new FragmentProfile();
                                break;
                        }

                        getFragmentManager().beginTransaction().replace(R.id.container1,selectedFragment).commit();

                        return true;
                    }
                };

*/
  //      return view;
    //}





//}

