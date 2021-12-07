package uz.ismoilroziboyev.dunyoningishlarihamidovusmonxon;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import uz.ismoilroziboyev.dunyoningishlarihamidovusmonxon.databinding.ActivityHeaderFooterBinding;
import uz.ismoilroziboyev.dunyoningishlarihamidovusmonxon.models.HeaderAndFooterModel;
import uz.ismoilroziboyev.dunyoningishlarihamidovusmonxon.service.LoadData;

public class HeaderFooterActivity extends AppCompatActivity {

    private ActivityHeaderFooterBinding binding;
    private HeaderAndFooterModel model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHeaderFooterBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        if (getIntent().getStringExtra("type").equals("muqaddima")) {
            model = LoadData.getSozboshi();
        } else {
            model = LoadData.getXotima();
        }

        binding.titeTv.setText(model.getName());
        binding.labelTv.setText(model.getName());

        binding.descrpitionTv.setText(model.getText());

        binding.backButton.setOnClickListener(v -> {
            finish();
        });

    }
}