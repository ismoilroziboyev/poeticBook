package uz.ismoilroziboyev.dunyoningishlarihamidovusmonxon;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.WindowManager;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

import uz.ismoilroziboyev.dunyoningishlarihamidovusmonxon.adapters.ViewPagerFragmentAdapter;
import uz.ismoilroziboyev.dunyoningishlarihamidovusmonxon.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private MenuItem lastSelectedMenuItem;
    private ViewPagerFragmentAdapter pagerFragmentAdapter;
    private List<Integer> pagesList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_NOTHING);

        lastSelectedMenuItem = binding.bottomNavigationBar.getMenu().getItem(0);

        loadPagesList();

        pagerFragmentAdapter = new ViewPagerFragmentAdapter(this, pagesList);

        binding.viewPager.setAdapter(pagerFragmentAdapter);

        binding.viewPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                binding.bottomNavigationBar.setSelectedItemId(binding.bottomNavigationBar.getMenu().getItem(position).getItemId());
            }
        });

        binding.viewPager.setUserInputEnabled(false);

        binding.bottomNavigationBar.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                if (lastSelectedMenuItem.getItemId() != item.getItemId()) {
                    setMenuListener(item);
                }
                return true;
            }
        });


    }

    private void loadPagesList() {
        pagesList = new ArrayList<>();
        pagesList.add(0);
        pagesList.add(1);
        pagesList.add(2);
    }

    private void setMenuListener(MenuItem newMenuItem) {

        switch (lastSelectedMenuItem.getItemId()) {
            case R.id.home:
                lastSelectedMenuItem.setIcon(R.drawable.ic_home_unselected);
                break;

            case R.id.chapters:
                lastSelectedMenuItem.setIcon(R.drawable.ic_menu_unselected);
                break;

            case R.id.liked:
                lastSelectedMenuItem.setIcon(R.drawable.ic_like_unselected);
                break;
        }

        switch (newMenuItem.getItemId()) {
            case R.id.home:
                newMenuItem.setIcon(R.drawable.ic_home_selected);
                binding.viewPager.setCurrentItem(0, true);
                break;

            case R.id.chapters:
                newMenuItem.setIcon(R.drawable.ic_menu_selected);
                binding.viewPager.setCurrentItem(1, true);
                break;

            case R.id.liked:
                newMenuItem.setIcon(R.drawable.ic_like_selected);
                binding.viewPager.setCurrentItem(2, true);
                break;
        }


        lastSelectedMenuItem = newMenuItem;
    }
}