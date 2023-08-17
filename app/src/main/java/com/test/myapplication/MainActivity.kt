package com.test.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.test.myapplication.databinding.ActivityMain3Binding
import com.test.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var activityMainBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)

        activityMainBinding.run {
            button.run {
                setOnClickListener {
                    val mainActivity3Intent = Intent(this@MainActivity, MainActivity3::class.java)
                    startActivity(mainActivity3Intent)
                }
            }
        }
    }
}