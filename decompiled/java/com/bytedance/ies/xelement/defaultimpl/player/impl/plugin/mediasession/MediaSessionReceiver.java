package com.bytedance.ies.xelement.defaultimpl.player.impl.plugin.mediasession;

import X.C2188191AkT;
import X.C2214201BlK;
import X.C2408409cA;
import X.C788530UwV;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class MediaSessionReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!C2214201BlK.LJIIJJI && intent != null) {
            if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                C2188191AkT.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            if (context != null) {
                Intent intent2 = new Intent("intent.filter.X_ELEMENT_X_AUDIO_MEDIA_SESSION_BROADCAST");
                intent2.putExtra("EXTRA_MEDIA_BUTTON_DATA", intent);
                LocalBroadcastManager.LIZ(context).LIZJ(intent2);
                return;
            }
            return;
        }
        C2408409cA.LIZ();
        if (context == null) {
            return;
        }
        Intent intent3 = new Intent("intent.filter.X_ELEMENT_X_AUDIO_MEDIA_SESSION_BROADCAST");
        intent3.putExtra("EXTRA_MEDIA_BUTTON_DATA", intent);
        LocalBroadcastManager.LIZ(context).LIZJ(intent3);
    }
}
