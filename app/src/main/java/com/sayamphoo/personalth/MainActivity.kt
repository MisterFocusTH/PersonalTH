package com.sayamphoo.personalth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sayamphoo.th_personal_id.THIDCardCheck

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mPersonal: String = "1234567890123"


        THIDCardCheck(mPersonal).checkPersonalID(object : THIDCardCheck.SetOnVerificationStatus {

            override fun onVerifiedStatusSuccess() {
                TODO("Not yet implemented")
            }

            override fun onVerifiedStatusFailed() {
                TODO("Not yet implemented")
            }
        })




    }
}