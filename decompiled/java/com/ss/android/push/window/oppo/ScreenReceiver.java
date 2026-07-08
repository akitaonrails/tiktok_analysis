package com.ss.android.push.window.oppo;

import X.C2188191AkT;
import X.C2214201BlK;
import X.C2408409cA;
import X.C788530UwV;
import X.C790570Uzn;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.bytedance.common.utility.Logger;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes14.dex */
public class ScreenReceiver extends BroadcastReceiver {
    public static void LIZ(Context context, Intent intent) {
        try {
            String action = intent.getAction();
            Logger.debug();
            if ("android.intent.action.USER_PRESENT".equals(action) && C790570Uzn.LIZIZ(context).LIZJ() && C790570Uzn.LIZIZ(context).LJ && C790570Uzn.LIZIZ(context).LIZ() != null) {
                C790570Uzn.LJI.getClass();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            Logger.debug();
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
            LIZ(context, intent);
        } else {
            C2408409cA.LIZ();
            LIZ(context, intent);
        }
    }
}
