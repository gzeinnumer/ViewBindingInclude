package com.gzeinnumer.viewbindinginclude;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.gzeinnumer.viewbindinginclude.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.included.tv1.setOnClickListener(view -> Toast.makeText(MainActivity.this, "tv1 Clicked", Toast.LENGTH_SHORT).show());

        binding.included.tv2.setOnClickListener(view -> Toast.makeText(MainActivity.this, "tv2 Clicked", Toast.LENGTH_SHORT).show());
    }
}