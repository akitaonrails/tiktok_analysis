package com.ss.android.ugc.aweme.cubes.engage;

import X.C2188191AkT;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C2408409cA;
import X.C788530UwV;
import X.C811110Vrp;
import X.C844470XAv;
import X.InterfaceC809720Vpa;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class EngageBroadcastReceiver extends BroadcastReceiver {
    public static void LIZ(Intent intent) {
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            return;
        }
        if (Intrinsics.LJFF(action, "com.google.android.engage.action.PUBLISH_RECOMMENDATION")) {
            C811110Vrp c811110Vrp = C811110Vrp.LIZ;
            C844470XAv.LIZ.getClass();
            Context contextLIZ = C844470XAv.LIZ();
            InterfaceC809720Vpa interfaceC809720Vpa = new InterfaceC809720Vpa() { // from class: X.0VPu
                @Override // X.InterfaceC809720Vpa
                public final void LIZ() {
                    C0VQB.LIZIZ.LIZJ(EnumC1483805rQ.UPDATE_BY_BROADCAST, false);
                }

                @Override // X.InterfaceC809720Vpa
                public final void LIZIZ(C0VQL c0vql) {
                    int i = C0VQH.LIZ[c0vql.ordinal()];
                    if (i != 1) {
                        if (i != 2) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("onInitFail(ERR_ELSE: ");
                            sbLIZ.append(c0vql);
                            sbLIZ.append(')');
                            C2188811AlT.LIZIZ(sbLIZ);
                            C0VQB.LIZIZ.LJ(false, null);
                            return;
                        }
                        C0VQB.LIZIZ.LJ(false, null);
                    }
                }
            };
            c811110Vrp.getClass();
            C811110Vrp.LIZLLL(contextLIZ, interfaceC809720Vpa);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onReceive(");
        sbLIZ.append(action);
        sbLIZ.append(')');
        C2188811AlT.LIZIZ(sbLIZ);
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
