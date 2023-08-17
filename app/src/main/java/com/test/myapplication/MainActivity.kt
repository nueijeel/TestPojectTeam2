package com.test.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.test.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var activityMainBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        installSplashScreen()

        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)


        activityMainBinding.run {
            buttonMainChangeTextView.setOnClickListener {
                textViewMainShowText.setText("Hello World!가 아닌 Hell World!")
            }
            button.run {
                setOnClickListener {
                    val mainActivity3Intent = Intent(this@MainActivity, MainActivity3::class.java)
                    startActivity(mainActivity3Intent)
                }
            }
        }
    }
}