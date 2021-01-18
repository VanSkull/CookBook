package com.example.cookbook

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class ViewRecipe : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_recipe);
    }
}