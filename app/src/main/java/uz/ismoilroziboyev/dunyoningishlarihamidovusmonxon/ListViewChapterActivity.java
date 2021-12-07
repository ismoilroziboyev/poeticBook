package uz.ismoilroziboyev.dunyoningishlarihamidovusmonxon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.List;

import uz.ismoilroziboyev.dunyoningishlarihamidovusmonxon.adapters.PoetsListAdapter;
import uz.ismoilroziboyev.dunyoningishlarihamidovusmonxon.databinding.ActivityListViewChapterBinding;
import uz.ismoilroziboyev.dunyoningishlarihamidovusmonxon.models.Chapter;
import uz.ismoilroziboyev.dunyoningishlarihamidovusmonxon.models.Poet;
import uz.ismoilroziboyev.dunyoningishlarihamidovusmonxon.service.LoadData;

public class ListViewChapterActivity extends AppCompatActivity {

    private ActivityListViewChapterBinding binding;
    private Poet poet;
    private Chapter chapter;
    private PoetsListAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityListViewChapterBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        poet = (Poet) getIntent().getSerializableExtra("chapter");

        chapter = getPoetChapter(poet);

        binding.labelTv.setText(chapter.getTitle());

        adapter = new PoetsListAdapter(chapter.getPoetList(), new PoetsListAdapter.OnItemClickListener() {
            @Override
            public void onItemClicked(Poet poet) {
                Intent intent = new Intent(ListViewChapterActivity.this, PoetViewActivity.class);
                intent.putExtra("poet", poet);
                startActivity(intent);
            }
        });

        binding.poetsRecyclerView.setAdapter(adapter);


        binding.backButton.setOnClickListener(v -> onBackPressed());
    }

    @Override
    protected void onResume() {
        adapter.notifyItemRangeChanged(0, chapter.getPoetList().size());
        super.onResume();
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