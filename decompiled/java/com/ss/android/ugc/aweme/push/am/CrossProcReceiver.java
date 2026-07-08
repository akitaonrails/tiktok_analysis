package com.ss.android.ugc.aweme.push.am;

import X.C2188191AkT;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C2408409cA;
import X.C788530UwV;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class CrossProcReceiver extends BroadcastReceiver {
    public static void LIZ(Intent intent) {
        String action;
        if (intent == null) {
            action = null;
        } else {
            try {
                action = intent.getAction();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return;
            }
        }
        if (Intrinsics.LJFF("com.process.fore.back.monitor", action)) {
            boolean booleanExtra = intent.getBooleanExtra(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, false);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onReceive isBackground:");
            sbLIZ.append(booleanExtra);
            C2188811AlT.LIZIZ(sbLIZ);
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
