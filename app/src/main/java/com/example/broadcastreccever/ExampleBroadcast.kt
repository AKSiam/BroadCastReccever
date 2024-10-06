package com.example.broadcastreccever

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager
import android.widget.Toast

class ExampleBroadcast: BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        if (Intent.ACTION_TIME_TICK == (intent?.action)) { // it's best practice to verify intent action before performing any operation
            Toast.makeText(context, "Time Updated", Toast.LENGTH_SHORT).show()
        } else if (ConnectivityManager.CONNECTIVITY_ACTION == (intent?.action)) {

            val booleanExtra = intent.getBooleanExtra(ConnectivityManager.EXTRA_NO_CONNECTIVITY,false)

            if(!booleanExtra){
                Toast.makeText(context, "Connected", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(context, "DisConnected", Toast.LENGTH_SHORT).show()
            }


        }
    }
}