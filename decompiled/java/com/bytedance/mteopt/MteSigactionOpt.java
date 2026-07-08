package com.bytedance.mteopt;

import X.C08PL;
import X.C2111908Pd;
import X.C2112108Pf;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import com.bytedance.shadowhook.ShadowHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class MteSigactionOpt {
    public static boolean LIZ;
    public static boolean LIZIZ;

    public static native boolean optimize();

    static {
        new BroadcastReceiver() { // from class: X.09c7
            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                AudioManager audioManager;
                AudioManager audioManager2;
                if (!C2214201BlK.LJIIJJI && intent != null) {
                    if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                        C2188191AkT.LIZIZ();
                    }
                }
                if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                    if ("android.media.VOLUME_CHANGED_ACTION".equals(intent.getAction()) && (audioManager2 = (AudioManager) C786410Ut5.H2(context, "audio")) != null) {
                        audioManager2.setStreamVolume(3, 0, 0);
                        return;
                    }
                    return;
                }
                C2408409cA.LIZ();
                if (!"android.media.VOLUME_CHANGED_ACTION".equals(intent.getAction()) || (audioManager = (AudioManager) C786410Ut5.H2(context, "audio")) == null) {
                    return;
                }
                audioManager.setStreamVolume(3, 0, 0);
            }
        };
    }

    public static synchronized boolean LIZ(Context context) {
        if (LIZ) {
            return LIZIZ;
        }
        if (C2111908Pd.LIZ(context)) {
            C2112108Pf c2112108Pf = new C2112108Pf();
            c2112108Pf.LIZ = C08PL.SHARED.value;
            c2112108Pf.LIZIZ = true;
            ShadowHook.init(c2112108Pf.LIZ());
            try {
                LIZIZ = optimize();
                LIZ = true;
            } catch (NoSuchMethodError e) {
                TryCatchGuardChecker.doCheck(e);
            } catch (UnsatisfiedLinkError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        return LIZIZ;
    }
}
