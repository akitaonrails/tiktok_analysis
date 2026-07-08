package com.bytedance.effectcreatormobile.infrastructure.network.interceptor;

import X.C0X52;
import X.C0XLP;
import X.C0XLQ;
import X.C0XMB;
import X.C1494590ozp;
import X.C844470XAv;
import X.InterfaceC1904907d9;
import X.InterfaceC841770X0l;
import com.bytedance.retrofit2.client.Request;

/* JADX INFO: loaded from: classes14.dex */
public final class EPRequestInterceptor implements InterfaceC1904907d9 {
    @Override // X.InterfaceC1904907d9
    public final C0X52<?> intercept(InterfaceC841770X0l interfaceC841770X0l) {
        C1494590ozp c1494590ozp = (C1494590ozp) interfaceC841770X0l;
        Request requestLIZ = c1494590ozp.LIZJ;
        C0XLQ c0xlqLJIIL = C0XLQ.LJIIL(requestLIZ.getUrl());
        if (c0xlqLJIIL != null) {
            C0XLP c0xlpLJIIJ = c0xlqLJIIL.LJIIJ();
            C844470XAv.LIZ.getClass();
            c0xlpLJIIJ.LJIIL("channel", C844470XAv.LJIILL);
            String str = c0xlpLJIIJ.LIZLLL().LJIIIIZZ;
            C0XMB c0xmbNewBuilder = requestLIZ.newBuilder();
            c0xmbNewBuilder.LIZJ(str);
            requestLIZ = c0xmbNewBuilder.LIZ();
        }
        return c1494590ozp.LIZ(requestLIZ);
    }
}
