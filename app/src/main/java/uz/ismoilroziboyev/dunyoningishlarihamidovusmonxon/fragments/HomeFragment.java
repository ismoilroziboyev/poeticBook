package uz.ismoilroziboyev.dunyoningishlarihamidovusmonxon.fragments;

import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import uz.ismoilroziboyev.dunyoningishlarihamidovusmonxon.HeaderFooterActivity;
import uz.ismoilroziboyev.dunyoningishlarihamidovusmonxon.PoetViewActivity;
import uz.ismoilroziboyev.dunyoningishlarihamidovusmonxon.R;
import uz.ismoilroziboyev.dunyoningishlarihamidovusmonxon.adapters.RandomPoetViewPagerAdapter;
import uz.ismoilroziboyev.dunyoningishlarihamidovusmonxon.adapters.SearchBoxAdapter;
import uz.ismoilroziboyev.dunyoningishlarihamidovusmonxon.databinding.FragmentHomeBinding;
import uz.ismoilroziboyev.dunyoningishlarihamidovusmonxon.databinding.InfoAboutProgramBinding;
import uz.ismoilroziboyev.dunyoningishlarihamidovusmonxon.models.Chapter;
import uz.ismoilroziboyev.dunyoningishlarihamidovusmonxon.models.Poet;
import uz.ismoilroziboyev.dunyoningishlarihamidovusmonxon.service.LoadData;
import uz.ismoilroziboyev.dunyoningishlarihamidovusmonxon.service.MySharedPreferences;

public class HomeFragment extends Fragment {

    public HomeFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    private FragmentHomeBinding binding;
    private RandomPoetViewPagerAdapter randomPoetViewPagerAdapter;
    private Handler handler;
    private SearchBoxAdapter searchBoxAdapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(inflater, container, false);

        randomPoetViewPagerAdapter = new RandomPoetViewPagerAdapter(new RandomPoetViewPagerAdapter.OnItemClickListener() {
            @Override
            public void onItemClicked(String chapter, Poet poet) {
                Intent intent = new Intent(getContext(), PoetViewActivity.class);
                intent.putExtra("poet", poet);

                startActivity(intent);
            }
        }, getRandomPoetsList());

        searchBoxAdapter = new SearchBoxAdapter(getContext(), getAllPoets(), new SearchBoxAdapter.OnItemClickListener() {
            @Override
            public void onItemClicked(Poet poet) {
                Intent intent = new Intent(getContext(), PoetViewActivity.class);
                intent.putExtra("poet", poet);
                binding.searchbox.setText("");
                startActivity(intent);
            }
        });

        binding.searchbox.setAdapter(searchBoxAdapter);

        binding.randomPoetPager.setAdapter(randomPoetViewPagerAdapter);

        handler = new Handler(Looper.getMainLooper());
        handler.postDelayed(runnable, 5000);

        binding.infoButton.setOnClickListener(v -> {
            AlertDialog.Builder builder = new AlertDialog.Builder(getContext());

            InfoAboutProgramBinding aboutProgramBinding = InfoAboutProgramBinding.inflate(LayoutInflater.from(getContext()));

            aboutProgramBinding.contactWithAuthor.setOnClickListener(v1 -> {
                Intent telegram = new Intent(Intent.ACTION_VIEW, Uri.parse("https://telegram.me/Usmankhan_13"));
                startActivity(telegram);
            });

            builder.setView(aboutProgramBinding.getRoot());

            AlertDialog alertDialog = builder.create();

            alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            alertDialog.show();
        });

        binding.prefaceButton.setOnClickListener(v -> {
            Intent intent = new Intent(getContext(), HeaderFooterActivity.class);
            intent.putExtra("type", "muqaddima");
            startActivity(intent);
        });

        binding.xotimaButton.setOnClickListener(v -> {
            Intent intent = new Intent(getContext(), HeaderFooterActivity.class);
            intent.putExtra("type", "xotima");
            startActivity(intent);
        });

        binding.randomPoetButton.setOnClickListener(v -> {
            Intent intent = new Intent(getContext(), PoetViewActivity.class);
            Random random = new Random();

            Poet poet = getAllPoets().get(random.nextInt(getAllPoets().size()));
            intent.putExtra("poet", poet);

            startActivity(intent);
        });

        return binding.getRoot();
    }

    private List<Poet> getAllPoets() {
        List<Poet> poetList = new ArrayList<>();
        List<Chapter> chapterList = LoadData.getChaptersList();

        for (int i = 0; i < chapterList.size(); i++) {
            poetList.addAll(chapterList.get(i).getPoetList());
        }

        return poetList;
    }


    Runnable runnable = new Runnable() {
        @Override
        public void run() {

            int currentItem = binding.randomPoetPager.getCurrentItem();

            if (currentItem == 5) {
                binding.randomPoetPager.setCurrentItem(0, true);
            } else {
                binding.randomPoetPager.setCurrentItem(currentItem + 1, true);
            }
            handler.postDelayed(this::run, 5000);

        }
    };

    private List<Poet> getRandomPoetsList() {
        List<Chapter> chapters = LoadData.getChaptersList();
        Random random = new Random();

        int index1 = Math.abs(random.nextInt(chapters.size()));
        int index2 = Math.abs(random.nextInt(chapters.size()));
        int index3 = Math.abs(random.nextInt(chapters.size()));

        List<Poet> randomPoetsList = new ArrayList<>();

        randomPoetsList.add(chapters.get(index1).getPoetList().get(0));
        randomPoetsList.add(chapters.get(index1).getPoetList().get(2));
        randomPoetsList.add(chapters.get(index2).getPoetList().get(1));
        randomPoetsList.add(chapters.get(index2).getPoetList().get(3));
        randomPoetsList.add(chapters.get(index3).getPoetList().get(0));
        randomPoetsList.add(chapters.get(index3).getPoetList().get(3));

        Collections.shuffle(randomPoetsList);

        return randomPoetsList;
    }


}