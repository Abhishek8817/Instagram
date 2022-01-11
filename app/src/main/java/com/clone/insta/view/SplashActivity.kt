package com.clone.insta.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.clone.insta.R
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import java.util.concurrent.TimeUnit

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        startLoginActivity()
        finish()

//        runBlocking {
//            delay(3000)
//            withContext(Dispatchers.Main){
//                startLoginActivity()
//                finish()
//            }
//        }
    }



    fun startLoginActivity(){
        var intent =Intent(this, LoginActivity::class.java)
        startActivity(intent)
    }


}