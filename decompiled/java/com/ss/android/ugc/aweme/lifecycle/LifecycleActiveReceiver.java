package com.ss.android.ugc.aweme.lifecycle;

import X.C0C64;
import X.C1BWL;
import X.C2188191AkT;
import X.C2214201BlK;
import X.C2408409cA;
import X.C788530UwV;
import X.C823050WQl;
import Y.ARunnableS14S0101000_3;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.provider.Settings;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class LifecycleActiveReceiver extends BroadcastReceiver {
    public static volatile int LIZ = 8000;
    public static volatile long LIZIZ;
    public static volatile int LIZJ;
    public static volatile Keva LIZLLL;

    public static boolean LIZ(Context context) {
        try {
            if (C0C64.LJIILLIIL().LJIJ(31744, 0, "4480_lifecycle_ignore_dev", true) == 1) {
                return true;
            }
            Keva repo = LIZLLL;
            if (repo == null) {
                repo = Keva.getRepo("LifecycleActiveReceiver");
                LIZLLL = repo;
            }
            if (repo.getBoolean("d_mode_enable", false)) {
                return false;
            }
            if (Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) == 0) {
                return true;
            }
            repo.storeBoolean("d_mode_enable", true);
            return false;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }

    public final void LIZIZ(Intent intent) {
        int intExtra;
        int intExtra2;
        if (intent != null && "com.ss.android.ugc.aweme.lifecycle.active".equals(intent.getAction()) && (intExtra = intent.getIntExtra("session_id", 0)) == LIZJ && (intExtra2 = intent.getIntExtra("active_duration", 0)) > 0) {
            C823050WQl.LJ().schedule(new ARunnableS14S0101000_3(intExtra, goAsync(), 5), intExtra2, TimeUnit.MILLISECONDS);
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
            LIZIZ(intent);
        } else {
            C2408409cA.LIZ();
            LIZIZ(intent);
        }
    }

    public static void LIZJ(int i, int i2, boolean z) {
        try {
            Intent intent = new Intent("com.ss.android.ugc.aweme.lifecycle.active");
            intent.setClass(C1BWL.LIZ(), LifecycleActiveReceiver.class);
            intent.putExtra("active_duration", i);
            intent.putExtra("session_id", i2);
            if (z) {
                intent.addFlags(268435456);
            }
            C1BWL.LIZ().sendBroadcast(intent);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static void LIZLLL(int i, long j, boolean z) {
        int i2 = LIZJ + 1;
        LIZJ = i2;
        LIZ = i;
        LIZIZ = SystemClock.elapsedRealtime() + j;
        LIZJ(i, i2, z);
    }
}
