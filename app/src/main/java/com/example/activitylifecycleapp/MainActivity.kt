package com.example.activitylifecycleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.v("Test","onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.v("Test","onStart")

    }

    override fun onResume() {
        super.onResume()
        Log.v("Test","onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.v("Test","onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.v("Test","onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.v("Test","onDestroy")
    }
}