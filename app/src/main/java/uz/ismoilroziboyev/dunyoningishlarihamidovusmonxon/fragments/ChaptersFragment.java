package uz.ismoilroziboyev.dunyoningishlarihamidovusmonxon.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.squareup.picasso.Picasso;

import java.util.List;

import uz.ismoilroziboyev.dunyoningishlarihamidovusmonxon.ListViewChapterActivity;
import uz.ismoilroziboyev.dunyoningishlarihamidovusmonxon.R;
import uz.ismoilroziboyev.dunyoningishlarihamidovusmonxon.databinding.FragmentChaptersBinding;
import uz.ismoilroziboyev.dunyoningishlarihamidovusmonxon.models.Chapter;
import uz.ismoilroziboyev.dunyoningishlarihamidovusmonxon.service.LoadData;

public class ChaptersFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    private FragmentChaptersBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentChaptersBinding.inflate(inflater, container, false);

        List<Chapter> chaptersList = LoadData.getChaptersList();

        binding.firstCount.setText(chaptersList.get(0).getPoetList().size() + " ta she'r");
        binding.firstTitle.setText(chaptersList.get(0).getTitle());
        Picasso.get().load(chaptersList.get(0).getAlbumResource()).into(binding.firstImage);

        binding.secondCount.setText(chaptersList.get(1).getPoetList().size() + " ta she'r");
        binding.secondTitle.setText(chaptersList.get(1).getTitle());
        Picasso.get().load(chaptersList.get(1).getAlbumResource()).into(binding.secondImage);

        binding.thirdCount.setText(chaptersList.get(2).getPoetList().size() + " ta she'r");
        binding.thirdTitle.setText(chaptersList.get(2).getTitle());
        Picasso.get().load(chaptersList.get(2).getAlbumResource()).into(binding.thirdImage);

        binding.fourthCount.setText(chaptersList.get(3).getPoetList().size() + " ta she'r");
        binding.fourthTitle.setText(chaptersList.get(3).getTitle());
        Picasso.get().load(chaptersList.get(3).getAlbumResource()).into(binding.fourthImage);

        binding.fifthCount.setText(chaptersList.get(4).getPoetList().size() + " ta she'r");
        binding.fifthTitle.setText(chaptersList.get(4).getTitle());
        Picasso.get().load(chaptersList.get(4).getAlbumResource()).into(binding.fifthImage);

        binding.sixthCount.setText(chaptersList.get(5).getPoetList().size() + " ta she'r");
        binding.sixthTitle.setText(chaptersList.get(5).getTitle());
        Picasso.get().load(chaptersList.get(5).getAlbumResource()).into(binding.sixthImage);


        binding.firstChapter.setOnClickListener(v -> {
            Intent intent = new Intent(getContext(), ListViewChapterActivity.class);
            intent.putExtra("chapter", LoadData.getChaptersList().get(0).getPoetList().get(0));

            startActivity(intent);
        });


        binding.secondChapter.setOnClickListener(v -> {
            Intent intent = new Intent(getContext(), ListViewChapterActivity.class);
            intent.putExtra("chapter", LoadData.getChaptersList().get(1).getPoetList().get(0));

            startActivity(intent);
        });

        binding.thirdChapter.setOnClickListener(v -> {
            Intent intent = new Intent(getContext(), ListViewChapterActivity.class);
            intent.putExtra("chapter", LoadData.getChaptersList().get(2).getPoetList().get(0));

            startActivity(intent);
        });

        binding.fourthChapter.setOnClickListener(v -> {
            Intent intent = new Intent(getContext(), ListViewChapterActivity.class);
            intent.putExtra("chapter", LoadData.getChaptersList().get(3).getPoetList().get(0));

            startActivity(intent);
        });

        binding.fifthChapter.setOnClickListener(v -> {
            Intent intent = new Intent(getContext(), ListViewChapterActivity.class);
            intent.putExtra("chapter", LoadData.getChaptersList().get(4).getPoetList().get(0));

            startActivity(intent);
        });


        binding.sixthChapter.setOnClickListener(v -> {
            Intent intent = new Intent(getContext(), ListViewChapterActivity.class);
            intent.putExtra("chapter", LoadData.getChaptersList().get(5).getPoetList().get(0));

            startActivity(intent);
        });


        return binding.getRoot();
    }
}