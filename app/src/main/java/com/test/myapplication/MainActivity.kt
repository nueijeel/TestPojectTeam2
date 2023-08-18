package com.test.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.test.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var activityMainBindg: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        activityMainBindg = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBindg.root)

        activityMainBindg.run {
            button.run {
                setOnClickListener {
                    activityMainBindg.textView.text = "버튼"
                }
            }
        }
    }
}