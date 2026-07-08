package com.bytedance.frameworks.baselib.network.http.retrofit;

import X.C0X52;
import X.C0XMB;
import X.C1494230ozF;
import X.C1494420ozY;
import X.C1494570ozn;
import X.C1494590ozp;
import X.C1494710p01;
import X.InterfaceC841770X0l;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.ttnet.TTInternalInterceptor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes24.dex */
public final class RequestVertifyInterceptor implements TTInternalInterceptor {
    @Override // X.InterfaceC1904907d9
    public final C0X52 intercept(InterfaceC841770X0l interfaceC841770X0l) {
        C1494590ozp c1494590ozp = (C1494590ozp) interfaceC841770X0l;
        Request requestLIZ = c1494590ozp.LIZJ;
        if (requestLIZ != null && !requestLIZ.isResponseStreaming()) {
            try {
                String url = requestLIZ.getUrl();
                requestLIZ.isAddCommonParam();
                C1494570ozn metrics = requestLIZ.getMetrics();
                requestLIZ.getBody();
                if (C1494230ozF.LIZ != null) {
                    if (metrics != null) {
                        metrics.LJLILLLLZI.LIZIZ.LIZIZ();
                    }
                    try {
                        C1494230ozF.LIZ.LIZJ(url);
                        if (metrics != null) {
                            C1494710p01 c1494710p01 = metrics.LJLILLLLZI.LIZIZ;
                            c1494710p01.LJII = c1494710p01.LIZ();
                            metrics.LJJJJ = C1494420ozY.LIZIZ(metrics.LJLILLLLZI.LIZIZ.LJII);
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        if (metrics != null) {
                            C1494710p01 c1494710p012 = metrics.LJLILLLLZI.LIZIZ;
                            c1494710p012.LJII = c1494710p012.LIZ();
                            metrics.LJJJJ = C1494420ozY.LIZIZ(metrics.LJLILLLLZI.LIZIZ.LJII);
                        }
                        throw th;
                    }
                } else {
                    url = null;
                }
                C0XMB c0xmbNewBuilder = requestLIZ.newBuilder();
                c0xmbNewBuilder.LIZJ(url);
                requestLIZ = c0xmbNewBuilder.LIZ();
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
        }
        if (C1494590ozp.LJFF) {
            return c1494590ozp.LIZJ(requestLIZ);
        }
        return c1494590ozp.LIZ(requestLIZ);
    }
}
