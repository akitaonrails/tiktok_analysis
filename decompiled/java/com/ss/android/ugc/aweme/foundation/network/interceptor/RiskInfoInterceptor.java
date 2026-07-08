package com.ss.android.ugc.aweme.foundation.network.interceptor;

import X.C0W8M;
import X.C0WOT;
import X.C0X0X;
import X.C0X52;
import X.C1494590ozp;
import X.C1718110uoL;
import X.C1974107oJ;
import X.C2097608Jq;
import X.C837610WtT;
import X.InterfaceC1904907d9;
import X.InterfaceC837600WtS;
import X.InterfaceC841770X0l;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class RiskInfoInterceptor implements InterfaceC1904907d9 {
    public final String LL;

    public RiskInfoInterceptor(String str) {
        this.LL = str;
    }

    @Override // X.InterfaceC1904907d9
    public final C0X52<?> intercept(InterfaceC841770X0l interfaceC841770X0l) {
        C1974107oJ c1974107oJ;
        Method method;
        C1494590ozp c1494590ozp = (C1494590ozp) interfaceC841770X0l;
        if (!C0W8M.LIZJ("RiskInfoInterceptor", c1494590ozp.LIZJ.getUrl())) {
            return c1494590ozp.LIZ(c1494590ozp.LIZJ);
        }
        Request requestLIZIZ = c1494590ozp.LIZJ;
        if (requestLIZIZ != null && (c1974107oJ = (C1974107oJ) requestLIZIZ.tag(C1974107oJ.class)) != null && (method = c1974107oJ.LIZ) != null && method.getAnnotation(InterfaceC837600WtS.class) != null && requestLIZIZ != null) {
            try {
                C1718110uoL c1718110uoL = C1718110uoL.LIZ;
                String str = this.LL;
                requestLIZIZ.getPath();
                c1718110uoL.getClass();
                Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("risk_info", C1718110uoL.LIZ(str)));
                if (Intrinsics.LJFF(requestLIZIZ.getMethod(), "POST") && (requestLIZIZ.getRequestBody() instanceof C0X0X)) {
                    requestLIZIZ = C837610WtT.LIZ(requestLIZIZ, mapLJIIJ);
                } else {
                    requestLIZIZ = C837610WtT.LIZIZ(requestLIZIZ, mapLJIIJ);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        C0WOT.LIZ(requestLIZIZ, c1494590ozp.LIZJ, "RiskInfoInterceptor");
        return c1494590ozp.LIZ(requestLIZIZ);
    }
}
