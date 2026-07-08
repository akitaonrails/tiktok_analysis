package com.bytedance.pipo.verify.base.network.interceptor;

import X.C080U;
import X.C0X52;
import X.C0XMB;
import X.C1494590ozp;
import X.C1713570uh1;
import X.C1713600uh4;
import X.InterfaceC1904907d9;
import X.InterfaceC841770X0l;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class SessionHeaderInterceptor implements InterfaceC1904907d9 {
    public final String LL;

    public SessionHeaderInterceptor(String str) {
        this.LL = str;
    }

    @Override // X.InterfaceC1904907d9
    public final C0X52<?> intercept(InterfaceC841770X0l interfaceC841770X0l) {
        String strLJI;
        Request requestLIZ = ((C1494590ozp) interfaceC841770X0l).LIZJ;
        if (requestLIZ != null) {
            try {
                List<C080U> headers = requestLIZ.getHeaders();
                if (headers != null) {
                    ArrayList arrayList = new ArrayList(headers);
                    C1713570uh1 c1713570uh1LIZ = C1713600uh4.LIZ(this.LL);
                    if (c1713570uh1LIZ != null && (strLJI = c1713570uh1LIZ.LJI()) != null) {
                        arrayList.add(new C080U("pipo-fp-session-id", strLJI));
                    }
                    C0XMB c0xmbNewBuilder = requestLIZ.newBuilder();
                    if (c0xmbNewBuilder != null) {
                        c0xmbNewBuilder.LIZJ = arrayList;
                        requestLIZ = c0xmbNewBuilder.LIZ();
                    } else {
                        requestLIZ = null;
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return ((C1494590ozp) interfaceC841770X0l).LIZ(requestLIZ);
    }
}
