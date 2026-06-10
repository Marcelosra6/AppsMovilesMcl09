package com.mchi.msgskotlin

import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

class MensajesKotlin : FirebaseMessagingService() {
    companion object{
        const val TAG : String = "PushNotification"
    }
    fun PushNotification() {
    }
    override fun onMessageReceived(remoteMessage: RemoteMessage) {
        super.onMessageReceived(remoteMessage)
        Log.d(com.mchi.msgskotlin.MensajesKotlin.TAG, "From: " + remoteMessage.getFrom())
    }
}