package com.example.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.os.bundleOf
import androidx.fragment.app.add
import androidx.fragment.app.commit

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(savedInstanceState == null){
            val exBundle = bundleOf(
                ARG_PARAM1 to "Prueba de Clase Argumento 1",
                ARG_PARAM2 to "Prueba de Clase Argumento 2"
            )

            supportFragmentManager.commit {
                add<FirstFragment>(R.id.fragCon1,args=exBundle)
            }
        }

    }
}