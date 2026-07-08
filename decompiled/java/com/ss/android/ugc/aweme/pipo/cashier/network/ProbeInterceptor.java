package com.ss.android.ugc.aweme.pipo.cashier.network;

import X.C0X52;
import X.C0XMB;
import X.C1494590ozp;
import X.C1903807cy;
import X.C2097608Jq;
import X.InterfaceC1904907d9;
import X.InterfaceC841770X0l;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.pipo.probe.IProbeService;
import kotlin.Pair;

/* JADX INFO: loaded from: classes4.dex */
public final class ProbeInterceptor implements InterfaceC1904907d9 {
    @Override // X.InterfaceC1904907d9
    public final C0X52<?> intercept(InterfaceC841770X0l interfaceC841770X0l) {
        Request requestLIZ;
        String strLJ;
        Request requestLIZ2 = ((C1494590ozp) interfaceC841770X0l).LIZJ;
        C0X52 c0x52LIZ = null;
        if (requestLIZ2 != null) {
            try {
                Pair[] pairArr = new Pair[1];
                IProbeService iProbeService = (IProbeService) PluggableExtentionKt.pluggableSpi$default(IProbeService.class, false, false, false, 14, null);
                if (iProbeService == null || (strLJ = iProbeService.LJ()) == null) {
                    strLJ = "";
                }
                pairArr[0] = new Pair("rpc-persist-probe-id", strLJ);
                requestLIZ = C1903807cy.LIZ(requestLIZ2, C2097608Jq.LJIIJ(pairArr));
            } catch (Throwable th) {
                th = th;
                requestLIZ = requestLIZ2;
            }
            try {
                C0XMB c0xmbNewBuilder = requestLIZ.newBuilder();
                if (c0xmbNewBuilder != null) {
                    c0xmbNewBuilder.LIZJ(requestLIZ2.getUrl());
                    requestLIZ2 = c0xmbNewBuilder.LIZ();
                } else {
                    requestLIZ2 = null;
                }
            } catch (Throwable th2) {
                th = th2;
                TryCatchGuardChecker.doCheck(th);
                requestLIZ2 = requestLIZ;
            }
        }
        try {
            c0x52LIZ = ((C1494590ozp) interfaceC841770X0l).LIZ(requestLIZ2);
            return c0x52LIZ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return c0x52LIZ;
        }
    }
}
