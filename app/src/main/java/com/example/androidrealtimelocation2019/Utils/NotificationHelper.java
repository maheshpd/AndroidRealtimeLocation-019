package com.example.androidrealtimelocation2019.Utils;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.net.Uri;
import android.os.Build;
import android.support.annotation.RequiresApi;

import com.example.androidrealtimelocation2019.R;

public class NotificationHelper extends ContextWrapper {
    private static final String CREATEAPP_CHENNEL_ID = "com.example.androidrealtimelocation2019";
    private static final String CREATEAPP_CHENNEL_NAME = "Realtime2019";
    private NotificationManager manager;

    public NotificationHelper(Context base) {
        super(base);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O)
            createChannel();
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    private void createChannel() {
        NotificationChannel createChannel = new NotificationChannel(CREATEAPP_CHENNEL_ID,
                CREATEAPP_CHENNEL_NAME,NotificationManager.IMPORTANCE_DEFAULT);
        createChannel.enableLights(false);
        createChannel.enableVibration(true);
        createChannel.setLockscreenVisibility(Notification.VISIBILITY_PRIVATE);

        getManager().createNotificationChannel(createChannel);
    }

    public NotificationManager getManager() {
        if (manager == null)
            manager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        return manager;
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public Notification.Builder getRealtimeTrackingNotification(String title, String content, Uri defaultSound) {
        return new Notification.Builder(getApplicationContext(),CREATEAPP_CHENNEL_ID)
                .setSmallIcon(R.mipmap.ic_launcher_round)
                .setContentTitle(title)
                .setContentText(content)
                .setSound(defaultSound)
                .setAutoCancel(false);
    }
}
