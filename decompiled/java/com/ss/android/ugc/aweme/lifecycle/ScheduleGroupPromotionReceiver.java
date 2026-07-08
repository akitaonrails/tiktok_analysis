package com.ss.android.ugc.aweme.lifecycle;

import X.C2188191AkT;
import X.C2214201BlK;
import X.C2408409cA;
import X.C788530UwV;
import X.C823050WQl;
import Y.ARunnableS83S0000000_3;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public class ScheduleGroupPromotionReceiver extends BroadcastReceiver {
    public static final AtomicReference<BroadcastReceiver.PendingResult> LIZ = new AtomicReference<>(null);

    public final void LIZ(Intent intent) {
        if (intent != null) {
            try {
                if ("com.ss.android.ugc.aweme.lifecycle.active.fg".equals(intent.getAction())) {
                    long longExtra = intent.getLongExtra("fg_promotion_send_timestamp", -1L);
                    long longExtra2 = intent.getLongExtra("fg_promotion_duration", -1L);
                    if (longExtra >= 0 && longExtra2 > 0) {
                        long jElapsedRealtime = longExtra2 - (SystemClock.elapsedRealtime() - longExtra);
                        if (jElapsedRealtime > 0) {
                            BroadcastReceiver.PendingResult andSet = LIZ.getAndSet(goAsync());
                            if (andSet != null) {
                                try {
                                    andSet.finish();
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                }
                            }
                            C823050WQl.LJ().schedule(new ARunnableS83S0000000_3(17), jElapsedRealtime, TimeUnit.MILLISECONDS);
                        }
                    }
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
        }
    }

    public static void LIZIZ(long j, String str) {
        try {
            Context context = (Context) Class.forName("android.app.ActivityThread").getDeclaredMethod("getSystemContext", new Class[0]).invoke(Class.forName("android.app.ActivityThread").getDeclaredMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]), new Object[0]);
            if (context != null) {
                Intent intent = new Intent();
                intent.setComponent(new ComponentName(str, ScheduleGroupPromotionReceiver.class.getName()));
                intent.setAction("com.ss.android.ugc.aweme.lifecycle.active.fg");
                intent.addFlags(268435456);
                intent.putExtra("fg_promotion_send_timestamp", SystemClock.elapsedRealtime());
                intent.putExtra("fg_promotion_duration", j);
                BroadcastReceiver.PendingResult andSet = LIZ.getAndSet(null);
                if (andSet != null) {
                    andSet.finish();
                }
                context.sendBroadcast(intent);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
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
