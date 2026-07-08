package com.ss.android.ugc.aweme.app.api;

import X.InterfaceC1493760oyU;
import X.InterfaceC1494860p0G;
import android.content.Context;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.ttnet.TTNetInit;
import com.bytedance.ttnet.tnc.TNCManager;

/* JADX INFO: loaded from: classes24.dex */
public class OkClient implements InterfaceC1494860p0G {
    @Override // X.InterfaceC1494860p0G
    public InterfaceC1493760oyU get() {
        return new InterfaceC1493760oyU() { // from class: X.0oyR
            @Override // X.InterfaceC1493760oyU
            public final InterfaceC1494830p0D LIZ(Request request) {
                Context context = TTNetInit.getTTNetDepend().getContext();
                C1493780oyW c1493780oyWLJII = C1493780oyW.LJII(context);
                if (C2104008Mc.LIZIZ(context)) {
                    TNCManager tNCManagerLJI = TNCManager.LJI();
                    c1493780oyWLJII.getClass();
                    C1493780oyW.LJIIJJI = tNCManagerLJI;
                }
                return c1493780oyWLJII.LIZ(request);
            }
        };
    }
}
