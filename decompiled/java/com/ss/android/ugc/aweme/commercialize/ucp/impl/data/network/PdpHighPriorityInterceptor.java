package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.network;

import X.C0X52;
import X.C0XMB;
import X.C1494590ozp;
import X.InterfaceC1904907d9;
import X.InterfaceC841770X0l;

/* JADX INFO: loaded from: classes4.dex */
public final class PdpHighPriorityInterceptor implements InterfaceC1904907d9 {
    public static final PdpHighPriorityInterceptor LL = new PdpHighPriorityInterceptor();

    @Override // X.InterfaceC1904907d9
    public final C0X52<?> intercept(InterfaceC841770X0l interfaceC841770X0l) {
        C1494590ozp c1494590ozp = (C1494590ozp) interfaceC841770X0l;
        C0XMB c0xmbNewBuilder = c1494590ozp.LIZJ.newBuilder();
        c0xmbNewBuilder.LJI = 4;
        c0xmbNewBuilder.LJFF = 3;
        return c1494590ozp.LIZ(c0xmbNewBuilder.LIZ());
    }
}
