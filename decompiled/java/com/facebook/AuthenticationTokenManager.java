package com.facebook;

import X.C2188191AkT;
import X.C2214201BlK;
import X.C2408409cA;
import X.C788530UwV;
import X.C821600WKw;
import X.C821610WKx;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes14.dex */
public final class AuthenticationTokenManager {
    public static final C821610WKx LIZLLL = new Object() { // from class: X.0WKx
    };
    public static AuthenticationTokenManager LJ;
    public final LocalBroadcastManager LIZ;
    public final C821600WKw LIZIZ;
    public AuthenticationToken LIZJ;

    /* JADX INFO: loaded from: classes4.dex */
    public static final class CurrentAuthenticationTokenChangedBroadcastReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (!C2214201BlK.LJIIJJI && intent != null) {
                if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                    C2188191AkT.LIZIZ();
                }
            }
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                C2408409cA.LIZ();
            }
        }
    }

    public AuthenticationTokenManager(LocalBroadcastManager localBroadcastManager, C821600WKw c821600WKw) {
        this.LIZ = localBroadcastManager;
        this.LIZIZ = c821600WKw;
    }
}
