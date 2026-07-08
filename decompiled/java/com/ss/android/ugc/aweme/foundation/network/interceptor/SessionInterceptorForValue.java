package com.ss.android.ugc.aweme.foundation.network.interceptor;

import X.C09GC;
import X.C0W8M;
import X.C0WOT;
import X.C0X52;
import X.C0XMB;
import X.C1494590ozp;
import X.C2097608Jq;
import X.C837610WtT;
import X.InterfaceC1904907d9;
import X.InterfaceC841770X0l;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Pair;

/* JADX INFO: loaded from: classes14.dex */
public final class SessionInterceptorForValue implements InterfaceC1904907d9 {
    public final String LL;

    public SessionInterceptorForValue(String str) {
        this.LL = str;
    }

    @Override // X.InterfaceC1904907d9
    public final C0X52<?> intercept(InterfaceC841770X0l interfaceC841770X0l) {
        Request requestLIZJ;
        C1494590ozp c1494590ozp = (C1494590ozp) interfaceC841770X0l;
        if (!C0W8M.LIZJ("RiskInfoInterceptor", c1494590ozp.LIZJ.getUrl())) {
            return c1494590ozp.LIZ(c1494590ozp.LIZJ);
        }
        Request requestLIZ = c1494590ozp.LIZJ;
        if (requestLIZ != null) {
            try {
                requestLIZJ = C837610WtT.LIZJ(requestLIZ, C2097608Jq.LJIIJ(new Pair("pipo-fp-session-id", this.LL)));
            } catch (Throwable th) {
                th = th;
                requestLIZJ = requestLIZ;
            }
            try {
                String string = UriProtector.parse(requestLIZ.getUrl()).buildUpon().appendQueryParameter("ip_address", C09GC.LIZIZ()).toString();
                C0XMB c0xmbNewBuilder = requestLIZJ.newBuilder();
                if (c0xmbNewBuilder != null) {
                    c0xmbNewBuilder.LIZJ(string);
                    requestLIZ = c0xmbNewBuilder.LIZ();
                } else {
                    requestLIZ = null;
                }
            } catch (Throwable th2) {
                th = th2;
                TryCatchGuardChecker.doCheck(th);
                requestLIZ = requestLIZJ;
            }
        }
        C0WOT.LIZ(requestLIZ, c1494590ozp.LIZJ, "RiskInfoInterceptor");
        return c1494590ozp.LIZ(requestLIZ);
    }
}
