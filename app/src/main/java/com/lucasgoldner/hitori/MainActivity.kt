package com.lucasgoldner.hitori

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import android.widget.Button
import androidx.compose.Composable
import com.github.florent37.kotlin.pleaseanimate.please


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupView()
    }

    fun setupView() {
        var home = findViewById<Button>(R.id.homeButton)
        var lessons = findViewById<Button>(R.id.lessonsButton)
        var notes = findViewById<Button>(R.id.notesButton)
        please {
            animate(home) toBe {
                bottomOfItsParent(marginDp = 36f)
                leftOfItsParent(marginDp = 16f)
                width(40, keepRatio = true, toDp = true)
            }
        }.start()

    }
}

