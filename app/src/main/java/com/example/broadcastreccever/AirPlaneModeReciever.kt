package com.example.broadcastreccever

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log

class AirPlaneModeReciever: BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
       if (intent?.action == Intent.ACTION_AIRPLANE_MODE_CHANGED)
           Log.d("checkresult", "Airplane is Changed: ")
    }
}