package uz.ismoilroziboyev.dunyoningishlarihamidovusmonxon.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import uz.ismoilroziboyev.dunyoningishlarihamidovusmonxon.PoetViewActivity;
import uz.ismoilroziboyev.dunyoningishlarihamidovusmonxon.R;
import uz.ismoilroziboyev.dunyoningishlarihamidovusmonxon.adapters.PoetsListAdapter;
import uz.ismoilroziboyev.dunyoningishlarihamidovusmonxon.databinding.FragmentLikedBinding;
import uz.ismoilroziboyev.dunyoningishlarihamidovusmonxon.models.Poet;
import uz.ismoilroziboyev.dunyoningishlarihamidovusmonxon.service.MySharedPreferences;

public class LikedFragment extends Fragment {


    public LikedFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    private FragmentLikedBinding binding;
    private MySharedPreferences mySharedPreferences;
    private PoetsListAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentLikedBinding.inflate(inflater, container, false);
        mySharedPreferences = MySharedPreferences.getInstance(getContext());

        return binding.getRoot();
    }

    @Override
    public void onResume() {
        List<Poet> likedPoetsList = mySharedPreferences.getLikedPoetsList();

        if (likedPoetsList.size() == 0) {
            binding.poetsRecyclerView.setVisibility(View.GONE);
            binding.emptyTv.setVisibility(View.VISIBLE);
        } else {
            binding.poetsRecyclerView.setVisibility(View.VISIBLE);
            binding.emptyTv.setVisibility(View.GONE);
        }

        adapter = new PoetsListAdapter(likedPoetsList, new PoetsListAdapter.OnItemClickListener() {
            @Override
            public void onItemClicked(Poet poet) {
                Intent intent = new Intent(getActivity(), PoetViewActivity.class);
                intent.putExtra("poet", poet);
                intent.putExtra("isLikedPage", true);
                startActivity(intent);
            }
        });

        binding.poetsRecyclerView.setAdapter(adapter);
        super.onResume();
    }
}