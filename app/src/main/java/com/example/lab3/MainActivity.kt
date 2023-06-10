package com.example.lab3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import android.view.WindowManager

class MainActivity : AppCompatActivity() {

    var frag = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        frag = 0
        setContentView(R.layout.activity_main)
        window.setFlags(WindowManager.LayoutParams.FLAG_SECURE, WindowManager.LayoutParams.FLAG_SECURE)
    }

    fun btnChecker1(view: android.view.View) {
        supportFragmentManager.commit {
            frag = 1
            replace<FirstFragment>(R.id.fragmentContainerView)
        }
    }
    fun btnChecker2(view: android.view.View) {
        supportFragmentManager.commit {
            frag = 2
            replace<SecondFragment>(R.id.fragmentContainerView)
        }
    }
    fun btnSwitch(view: android.view.View) {
        if( frag == 1) supportFragmentManager.commit {
            frag = 2
            replace<SecondFragment>(R.id.fragmentContainerView)
        }else supportFragmentManager.commit {
            frag = 1
            replace<FirstFragment>(R.id.fragmentContainerView)
        }
    }
}
