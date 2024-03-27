package com.example.loggingandlz

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.loggingandlz.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val TAG : String = "MainActivity"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Log.v(TAG,"onCreate: Meine erste Logmeldung")

        // Die Verschiedenen LogLevel
//        Log.v(TAG,"onCreate: Verbose")
//        Log.d(TAG, "onCreate: Debug in Klasse $TAG")
//        Log.i(TAG, "onCreate: Info")
//        Log.w(TAG, "onCreate: Warning")
//        Log.e(TAG, "onCreate: Error", NullPointerException("xy ist NULL"))
//        Log.wtf(TAG,"onCreate: WTF")

        // Beispiel für Error Level
//        try {
//            if(true){
//                throw Exception("Absolute Fehler")
//            }
//        }catch (e: Exception){
//            Log.e(TAG, "onCreate: xy ist true", e)
//        }

    }
}