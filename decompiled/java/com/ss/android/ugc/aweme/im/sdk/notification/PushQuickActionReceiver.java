package com.ss.android.ugc.aweme.im.sdk.notification;

import X.C0PEM;
import X.C2188191AkT;
import X.C2214201BlK;
import X.C23250099c;
import X.C2408409cA;
import X.C788530UwV;
import X.C814540VxM;
import X.C817503Hh;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes15.dex */
public final class PushQuickActionReceiver extends BroadcastReceiver {
    /* JADX WARN: Removed duplicated region for block: B:113:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0204  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(android.content.Intent r28, X.InterfaceC1364105Vn<? super kotlin.Unit> r29) {
        /*
            Method dump skipped, instruction units count: 674
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.notification.PushQuickActionReceiver.LIZ(android.content.Intent, X.05Vn):java.lang.Object");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!C2214201BlK.LJIIJJI && intent != null) {
            if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                C2188191AkT.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            if (context != null) {
                C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C814540VxM(this, intent, null), 2);
            }
        } else {
            C2408409cA.LIZ();
            if (context == null) {
                return;
            }
            C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C814540VxM(this, intent, null), 2);
        }
    }
}
