package com.ss.android.ugc.aweme.pipo.common.network;

import X.C0X52;
import X.C1494590ozp;
import X.C1903807cy;
import X.C2097908Jt;
import X.InterfaceC1904907d9;
import X.InterfaceC841770X0l;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Pair;

/* JADX INFO: loaded from: classes4.dex */
public final class SessionIdHeaderInterceptor implements InterfaceC1904907d9 {
    public final String LL;

    public SessionIdHeaderInterceptor(String str) {
        this.LL = str;
    }

    @Override // X.InterfaceC1904907d9
    public final C0X52<?> intercept(InterfaceC841770X0l interfaceC841770X0l) {
        Request requestLIZ = ((C1494590ozp) interfaceC841770X0l).LIZJ;
        if (requestLIZ != null) {
            requestLIZ = C1903807cy.LIZ(requestLIZ, C2097908Jt.LIZJ(new Pair("pipo-fp-session-id", this.LL)));
        }
        try {
            return ((C1494590ozp) interfaceC841770X0l).LIZ(requestLIZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
