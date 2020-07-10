package com.sayamphoo.personalth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.sayamphoo.th_personal_id.Personal
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mPersonal: Long = 1234567890123


        Personal(mPersonal).checkPersonalIdTHai(object : Personal.setPersonalIdTH {
            override fun statusPersonal(status: Boolean) {
                Log.d("Personal_status", status.toString())
            }
        })


    }
}