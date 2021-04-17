package com.lucasgoldner.hitori

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import android.widget.Button
import android.widget.LinearLayout
import androidx.compose.Composable
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.github.florent37.kotlin.pleaseanimate.please


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupView()
    }

    fun setupView() {
        var layout = findViewById<LinearLayout>(R.id.bottomBarLayout)
        var recyclerView = findViewById<RecyclerView>(R.id.cardRecyclerView)
        //recyclerView.setAdapter(myAdapter);
        //recyclerView.setLayoutManager(LinearLayoutManager(context));
        var home = findViewById<Button>(R.id.homeButton)
        var lessons = findViewById<Button>(R.id.lessonsButton)
        var notes = findViewById<Button>(R.id.notesButton)
        layout.layoutParams.height = 0
        please {
            animate(layout) toBe {
                height(150, keepRatio = true, toDp = true)
                bottomOfItsParent(marginDp = 30f)
            }
        }.start()

    }
}

