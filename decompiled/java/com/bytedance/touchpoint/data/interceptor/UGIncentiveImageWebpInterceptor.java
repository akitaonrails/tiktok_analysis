package com.bytedance.touchpoint.data.interceptor;

import X.C01U6;
import X.C0X52;
import X.C0XMB;
import X.C1494590ozp;
import X.C1910707e5;
import X.InterfaceC1904907d9;
import X.InterfaceC1910807e6;
import X.InterfaceC841770X0l;
import com.bytedance.retrofit2.client.Request;
import kotlin.jvm.internal.AwS88S1000000_3;

/* JADX INFO: loaded from: classes4.dex */
public final class UGIncentiveImageWebpInterceptor implements InterfaceC1904907d9 {
    public static final /* synthetic */ int LL = 0;

    @Override // X.InterfaceC1904907d9
    public final C0X52<?> intercept(InterfaceC841770X0l interfaceC841770X0l) {
        boolean zLIZJ;
        C1494590ozp c1494590ozp = (C1494590ozp) interfaceC841770X0l;
        Request request = c1494590ozp.LIZJ;
        String str = (String) C01U6.LJFF(new AwS88S1000000_3(request.getUrl(), 2));
        InterfaceC1910807e6.LIZ.getClass();
        InterfaceC1910807e6 interfaceC1910807e6LIZ = C1910707e5.LIZ();
        if (interfaceC1910807e6LIZ != null) {
            zLIZJ = interfaceC1910807e6LIZ.LIZJ();
        } else {
            zLIZJ = true;
        }
        if (str != null && zLIZJ) {
            C0XMB c0xmbNewBuilder = request.newBuilder();
            c0xmbNewBuilder.LIZJ(str);
            return c1494590ozp.LIZ(c0xmbNewBuilder.LIZ());
        }
        return c1494590ozp.LIZ(request);
    }
}
