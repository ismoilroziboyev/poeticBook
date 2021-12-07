package uz.ismoilroziboyev.dunyoningishlarihamidovusmonxon.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.squareup.picasso.Picasso;

import java.util.List;
import java.util.Map;

import uz.ismoilroziboyev.dunyoningishlarihamidovusmonxon.databinding.ItemRandomPoetBinding;
import uz.ismoilroziboyev.dunyoningishlarihamidovusmonxon.models.Chapter;
import uz.ismoilroziboyev.dunyoningishlarihamidovusmonxon.models.Poet;

public class RandomPoetViewPagerAdapter extends PagerAdapter {
    private OnItemClickListener onItemClickListener;
    private List<Poet> poetList;

    public RandomPoetViewPagerAdapter(OnItemClickListener onItemClickListener, List<Poet> poetList) {
        this.onItemClickListener = onItemClickListener;
        this.poetList = poetList;
    }

    @Override
    public int getCount() {
        return poetList.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        ItemRandomPoetBinding binding = ItemRandomPoetBinding.inflate(LayoutInflater.from(container.getContext()), container, false);

        binding.chapterTv.setText(poetList.get(position).getChapter());

        binding.titleTv.setText(poetList.get(position).getName());

        Picasso.get().load(poetList.get(position).getImageResource()).into(binding.imageView);

        binding.getRoot().setOnClickListener(v -> onItemClickListener.onItemClicked(poetList.get(position).getChapter(), poetList.get(position)));

        container.addView(binding.getRoot());

        return binding.getRoot();
    }

    @Override
    public void destroyItem(ViewGroup collection, int position, Object view) {
        collection.removeView((View) view);
    }

    public interface OnItemClickListener {
        void onItemClicked(String chapter, Poet poet);
    }
}
