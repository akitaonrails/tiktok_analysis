package com.ss.android.ugc.aweme.common.net;

import X.C036E;
import X.C1440005kM;
import X.C2188191AkT;
import X.C2214201BlK;
import X.C2408409cA;
import X.C2411109cb;
import X.C788530UwV;
import X.C804420Vh2;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.util.NetworkUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class NetworkReceiver extends BroadcastReceiver {
    public static void LIZ(Context context, Intent intent) {
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            try {
                if (C036E.LIZ.LIZIZ()) {
                    if (C804420Vh2.LJI(context)) {
                        C1440005kM.LIZ(new C2411109cb(2));
                        return;
                    } else {
                        if (NetworkUtils.isMobile(context)) {
                            C1440005kM.LIZ(new C2411109cb(1));
                            return;
                        }
                        return;
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            C1440005kM.LIZ(new C2411109cb(0));
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
