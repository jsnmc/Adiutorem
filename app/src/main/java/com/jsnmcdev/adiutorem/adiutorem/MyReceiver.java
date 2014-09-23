package com.jsnmcdev.adiutorem.adiutorem;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class MyReceiver extends BroadcastReceiver {
    public MyReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        Intent adiutoremService = new Intent(context,AdiutoremAlaramManager.class);
        context.startService(adiutoremService);
    }
}
