package com.ss.android.ugc.aweme.foundation.network.interceptor;

import X.C0X0X;
import X.C0X52;
import X.C1494590ozp;
import X.C1717770unn;
import X.C2097608Jq;
import X.C837610WtT;
import X.InterfaceC1904907d9;
import X.InterfaceC841770X0l;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class CommonParamInterceptor implements InterfaceC1904907d9 {
    @Override // X.InterfaceC1904907d9
    public final C0X52<?> intercept(InterfaceC841770X0l interfaceC841770X0l) {
        Request requestLIZIZ = ((C1494590ozp) interfaceC841770X0l).LIZJ;
        if (requestLIZIZ != null) {
            try {
                Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("priority_region", C1717770unn.LJIIIIZZ().getCurrentRegionCode()), new Pair("send_request_timestamp", String.valueOf(System.currentTimeMillis())), new Pair("tz_name", TimeZone.getDefault().getID()));
                if (Intrinsics.LJFF(requestLIZIZ.getMethod(), "POST") && (requestLIZIZ.getRequestBody() instanceof C0X0X)) {
                    requestLIZIZ = C837610WtT.LIZ(requestLIZIZ, mapLJIIJ);
                } else {
                    requestLIZIZ = C837610WtT.LIZIZ(requestLIZIZ, mapLJIIJ);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return ((C1494590ozp) interfaceC841770X0l).LIZ(requestLIZIZ);
    }
}
