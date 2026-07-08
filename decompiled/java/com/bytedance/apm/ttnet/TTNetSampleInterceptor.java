package com.bytedance.apm.ttnet;

import X.C080U;
import X.C0X52;
import X.C0XMB;
import X.C1494590ozp;
import X.C2106708Nd;
import X.C787960Uva;
import X.C792720V7u;
import X.InterfaceC1904907d9;
import X.InterfaceC841770X0l;
import com.bytedance.retrofit2.client.Request;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes14.dex */
public class TTNetSampleInterceptor implements InterfaceC1904907d9 {
    @Override // X.InterfaceC1904907d9
    public final C0X52 intercept(InterfaceC841770X0l interfaceC841770X0l) {
        C1494590ozp c1494590ozp = (C1494590ozp) interfaceC841770X0l;
        Request request = c1494590ozp.LIZJ;
        if (C2106708Nd.LIZ(request.headers("x-tt-trace-log"))) {
            C792720V7u c792720V7u = C787960Uva.LIZ;
            if (c792720V7u.LLJJJ) {
                if (c792720V7u.LJIILJJIL() && c792720V7u.LLJI) {
                    return c1494590ozp.LIZ(LIZ(request, "01"));
                }
                if (c792720V7u.LLJ == 1 && c792720V7u.LLJI) {
                    return c1494590ozp.LIZ(LIZ(request, "02"));
                }
            }
        }
        return c1494590ozp.LIZ(request);
    }

    public static Request LIZ(Request request, String str) {
        ArrayList arrayList = new ArrayList(request.getHeaders());
        C0XMB c0xmbNewBuilder = request.newBuilder();
        arrayList.add(new C080U("x-tt-trace-log", str));
        c0xmbNewBuilder.LIZJ = arrayList;
        return c0xmbNewBuilder.LIZ();
    }
}
