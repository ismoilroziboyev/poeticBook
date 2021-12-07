package uz.ismoilroziboyev.dunyoningishlarihamidovusmonxon.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.List;

import uz.ismoilroziboyev.dunyoningishlarihamidovusmonxon.fragments.PoetViewFragment;
import uz.ismoilroziboyev.dunyoningishlarihamidovusmonxon.models.Poet;

public class PoetViewPagerAdapter extends FragmentStateAdapter {

    private List<Poet> poetList;

    public PoetViewPagerAdapter(@NonNull FragmentActivity fragmentActivity, List<Poet> poetList) {
        super(fragmentActivity);
        this.poetList = poetList;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return PoetViewFragment.newInstance(poetList.get(position));
    }

    @Override
    public int getItemCount() {
        return poetList.size();
    }


}
