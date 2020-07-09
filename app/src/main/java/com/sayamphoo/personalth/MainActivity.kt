package com.sayamphoo.personalth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.sayamphoo.th_personal_id.CheckPersonalIdTh
import com.sayamphoo.th_personal_id.Personal
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        button.setOnClickListener {

            Personal(3813459837559).checkPersonalIdThai(object : CheckPersonalIdTh{
                override fun statusPersonal(status: Boolean) {
                    Log.d("0012301",status.toString())
                }

                override fun errorPersona(ex: Exception) {
                    Log.d("0012301",ex.toString())
                }
            })

        }
    }
}