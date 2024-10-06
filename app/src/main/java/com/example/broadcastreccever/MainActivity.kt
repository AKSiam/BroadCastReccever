package com.example.broadcastreccever

import android.content.Intent
import android.content.IntentFilter
import android.net.ConnectivityManager
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private val exampleBroadcast = ExampleBroadcast()
    private val airPlaneModeChangedReceiver = AirPlaneModeReciever()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val intentFilter = IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION)
        intentFilter.addAction(Intent.ACTION_TIME_TICK)


        registerReceiver(exampleBroadcast,intentFilter)
        registerReceiver(airPlaneModeChangedReceiver,IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED))

    }

    override fun onDestroy() {
        super.onDestroy()

        unregisterReceiver(exampleBroadcast)
        unregisterReceiver(airPlaneModeChangedReceiver)

    }
}