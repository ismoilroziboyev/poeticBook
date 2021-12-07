package uz.ismoilroziboyev.dunyoningishlarihamidovusmonxon.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.List;

import uz.ismoilroziboyev.dunyoningishlarihamidovusmonxon.fragments.ChaptersFragment;
import uz.ismoilroziboyev.dunyoningishlarihamidovusmonxon.fragments.HomeFragment;
import uz.ismoilroziboyev.dunyoningishlarihamidovusmonxon.fragments.LikedFragment;

public class ViewPagerFragmentAdapter extends FragmentStateAdapter {

    private List<Integer> fragmentsList;

    public ViewPagerFragmentAdapter(@NonNull FragmentActivity fragmentActivity, List<Integer> fragmentsList) {
        super(fragmentActivity);
        this.fragmentsList = fragmentsList;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {

        switch (fragmentsList.get(position)) {
            case 0:
                return new HomeFragment();

            case 1:
                return new ChaptersFragment();

            case 2:
                return new LikedFragment();

            default:
                return new Fragment();
        }
    }

    @Override
    public int getItemCount() {
        return fragmentsList.size();
    }
}
