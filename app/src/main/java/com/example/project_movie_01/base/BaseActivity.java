package com.example.project_movie_01.base;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public abstract class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());

        initComponents();
        registerListener();
    }

    protected abstract void registerListener();

    protected abstract void initComponents();

    protected abstract int getLayoutId();
}
