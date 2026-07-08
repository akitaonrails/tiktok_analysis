package com.ss.android.ugc.aweme.keepalive;

import X.C2188191AkT;
import X.C2214201BlK;
import X.C2408409cA;
import X.C786410Ut5;
import X.C788530UwV;
import X.ThreadFactoryC854690Xfv;
import Y.ARunnableS18S0100100_13;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes14.dex */
public class KeepAliveReceiver extends BroadcastReceiver {
    public static final AtomicBoolean LIZ = new AtomicBoolean(false);
    public static final ExecutorService LIZIZ = C786410Ut5.i4(new ThreadFactoryC854690Xfv(8));

    public final void LIZ(Intent intent) {
        if (!"com.ss.android.ugc.aweme.keepalive.action.HINT".equals(intent.getAction()) || !LIZ.compareAndSet(false, true)) {
            return;
        }
        long longExtra = intent.getLongExtra("hold_ms", 8500L);
        long jMin = 1;
        if (longExtra >= 1) {
            jMin = Math.min(longExtra, 9000L);
        }
        LIZIZ.execute(new ARunnableS18S0100100_13(longExtra, jMin, goAsync(), 7));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!C2214201BlK.LJIIJJI && intent != null) {
            if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                C2188191AkT.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            LIZ(intent);
        } else {
            C2408409cA.LIZ();
            LIZ(intent);
        }
    }
}
