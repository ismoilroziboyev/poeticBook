package uz.ismoilroziboyev.dunyoningishlarihamidovusmonxon.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.squareup.picasso.Picasso;

import uz.ismoilroziboyev.dunyoningishlarihamidovusmonxon.R;
import uz.ismoilroziboyev.dunyoningishlarihamidovusmonxon.adapters.PoetViewPagerAdapter;
import uz.ismoilroziboyev.dunyoningishlarihamidovusmonxon.databinding.FragmentPoetViewBinding;
import uz.ismoilroziboyev.dunyoningishlarihamidovusmonxon.models.Poet;

public class PoetViewFragment extends Fragment {

    private static final String ARG_PARAM1 = "poet";

    private Poet poet;

    public PoetViewFragment() {
        // Required empty public constructor
    }

    public static PoetViewFragment newInstance(Poet poet) {
        PoetViewFragment fragment = new PoetViewFragment();
        Bundle args = new Bundle();
        args.putSerializable(ARG_PARAM1, poet);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            poet = (Poet) getArguments().getSerializable(ARG_PARAM1);
        }
    }

    private FragmentPoetViewBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentPoetViewBinding.inflate(inflater, container, false);


        binding.descrpitionTv.setText(poet.getPoetText());

        binding.titeTv.setText(poet.getName());

        setHasOptionsMenu(true);

//        binding.imageTv.setImageResource(poet.getImageResource());
        Picasso.get().load(poet.getImageResource()).into(binding.imageTv);


        return binding.getRoot();
    }
}