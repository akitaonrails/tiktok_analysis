package com.facebook;

import X.C2188191AkT;
import X.C2202741BIy;
import X.C2214201BlK;
import X.C2408409cA;
import X.C788530UwV;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes35.dex */
public final class CurrentAccessTokenExpirationBroadcastReceiver extends BroadcastReceiver {
    public static void LIZ(Intent intent) {
        if (Intrinsics.LJFF("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED", intent.getAction()) && FacebookSdk.LJII()) {
            C2202741BIy c2202741BIyLIZ = C2202741BIy.LJFF.LIZ();
            AccessToken accessToken = c2202741BIyLIZ.LIZJ;
            c2202741BIyLIZ.LIZIZ(accessToken, accessToken);
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
