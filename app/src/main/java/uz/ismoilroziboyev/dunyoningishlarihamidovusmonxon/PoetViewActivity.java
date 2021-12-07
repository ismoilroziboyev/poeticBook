package uz.ismoilroziboyev.dunyoningishlarihamidovusmonxon;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.List;

import uz.ismoilroziboyev.dunyoningishlarihamidovusmonxon.adapters.PoetViewPagerAdapter;
import uz.ismoilroziboyev.dunyoningishlarihamidovusmonxon.databinding.ActivityPoetViewBinding;
import uz.ismoilroziboyev.dunyoningishlarihamidovusmonxon.models.Chapter;
import uz.ismoilroziboyev.dunyoningishlarihamidovusmonxon.models.Poet;
import uz.ismoilroziboyev.dunyoningishlarihamidovusmonxon.service.LoadData;
import uz.ismoilroziboyev.dunyoningishlarihamidovusmonxon.service.MySharedPreferences;

public class PoetViewActivity extends AppCompatActivity {

    private ActivityPoetViewBinding binding;
    private Poet poet;
    private MySharedPreferences mySharedPreferences;
    private Chapter chapter;
    private PoetViewPagerAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPoetViewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Intent intent = getIntent();
        mySharedPreferences = MySharedPreferences.getInstance(this);
        poet = (Poet) intent.getSerializableExtra("poet");

        List<Poet> likedPoetsList1 = mySharedPreferences.getLikedPoetsList();

        if (likedPoetsList1.contains(poet)) {
            binding.likeButton.setImageResource(R.drawable.ic_liked);
        } else {
            binding.likeButton.setImageResource(R.drawable.ic_unliked);
        }

        binding.backButton.setOnClickListener(v -> {
            finish();
        });

        if (getIntent().getBooleanExtra("isLikedPage", false)) {
            chapter = new Chapter("Sevimlilar", mySharedPreferences.getLikedPoetsList(), R.drawable.hamma_gapiradi);
        } else {
            chapter = getPoetChapter(poet);
        }


        binding.labelTv.setText(chapter.getTitle());

        adapter = new PoetViewPagerAdapter(this, chapter.getPoetList());

        binding.poetViewPager.setAdapter(adapter);

        binding.poetViewPager.setCurrentItem(chapter.getPoetList().indexOf(poet), false);

        binding.nextPage.setOnClickListener(v -> {
            binding.poetViewPager.setCurrentItem(binding.poetViewPager.getCurrentItem() + 1, true);
        });

        binding.poetViewPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                if (position == chapter.getPoetList().size() - 1) {
                    binding.nextPage.setVisibility(View.INVISIBLE);
                } else {
                    binding.nextPage.setVisibility(View.VISIBLE);
                }

                if (position == 0) {
                    binding.previousPage.setVisibility(View.INVISIBLE);
                } else {
                    binding.previousPage.setVisibility(View.VISIBLE);
                }

                Poet poet = chapter.getPoetList().get(position);

                if (mySharedPreferences.getLikedPoetsList().contains(poet)) {
                    binding.likeButton.setImageResource(R.drawable.ic_liked);
                } else {
                    binding.likeButton.setImageResource(R.drawable.ic_unliked);
                }
            }
        });


        binding.likeButton.setOnClickListener(v -> {
            Poet poet = chapter.getPoetList().get(binding.poetViewPager.getCurrentItem());
            List<Poet> likedPoetsList = mySharedPreferences.getLikedPoetsList();
            if (likedPoetsList.contains(poet)) {
                likedPoetsList.remove(poet);

                mySharedPreferences.putLikedPoets(likedPoetsList);

                Toast.makeText(this, "Sevimlilar ro'yxatidan o'chirildi!", Toast.LENGTH_SHORT).show();

                binding.likeButton.setImageResource(R.drawable.ic_unliked);
            } else {
                likedPoetsList.add(poet);

                binding.likeButton.setImageResource(R.drawable.ic_liked);
                mySharedPreferences.putLikedPoets(likedPoetsList);

                Toast.makeText(this, "Sevimlilar ro'yxatiga qo'shildi!", Toast.LENGTH_SHORT).show();
            }
        });

        binding.previousPage.setOnClickListener(v -> {
            binding.poetViewPager.setCurrentItem(binding.poetViewPager.getCurrentItem() - 1, true);
        });

    }

    private Chapter getPoetChapter(Poet poet) {
        Chapter chapter = null;

        List<Chapter> chaptersList = LoadData.getChaptersList();

        for (int i = 0; i < chaptersList.size(); i++) {

            if (chaptersList.get(i).getTitle().equals(poet.getChapter())) {
                chapter = chaptersList.get(i);
                break;
            }
        }

        return chapter;
    }
}