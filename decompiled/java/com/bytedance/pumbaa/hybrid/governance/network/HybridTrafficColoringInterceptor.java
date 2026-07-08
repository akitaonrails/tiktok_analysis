package com.bytedance.pumbaa.hybrid.governance.network;

import X.C0X52;
import X.C1494590ozp;
import X.InterfaceC1904907d9;
import X.InterfaceC841770X0l;
import com.bytedance.retrofit2.client.Request;

/* JADX INFO: loaded from: classes4.dex */
public final class HybridTrafficColoringInterceptor implements InterfaceC1904907d9 {
    @Override // X.InterfaceC1904907d9
    public final C0X52<?> intercept(InterfaceC841770X0l interfaceC841770X0l) {
        C1494590ozp c1494590ozp = (C1494590ozp) interfaceC841770X0l;
        Request request = c1494590ozp.LIZJ;
        if (request == null) {
            request = null;
        }
        return c1494590ozp.LIZ(request);
    }
}
