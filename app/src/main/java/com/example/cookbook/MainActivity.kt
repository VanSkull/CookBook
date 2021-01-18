package com.example.cookbook

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    fun goToSearch(view: View) {
        val searchPage = Intent(this, SearchRecipe::class.java);
        startActivity(searchPage);
    }
    fun goToCreate(view: View) {
        val editPage = Intent(this, EditRecipe::class.java);
        startActivity(editPage);
    }
}