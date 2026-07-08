package com.ss.android.ugc.aweme.net.interceptor;

import X.C0X52;
import X.C0XDN;
import X.C0XK4;
import X.C0XLP;
import X.C0XLQ;
import X.C0XMB;
import X.C1494590ozp;
import X.InterfaceC1904907d9;
import X.InterfaceC841770X0l;
import com.bytedance.retrofit2.client.Request;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public class TokenSdkCommonParamsInterceptorTTNet implements InterfaceC1904907d9 {
    @Override // X.InterfaceC1904907d9
    public final C0X52 intercept(InterfaceC841770X0l interfaceC841770X0l) {
        int iLIZ = C0XK4.LIZ();
        C1494590ozp c1494590ozp = (C1494590ozp) interfaceC841770X0l;
        Request requestLIZ = c1494590ozp.LIZJ;
        String url = requestLIZ.getUrl();
        if (url != null && (url.contains("/passport/token/beat/") || url.contains("/passport/token/change/") || url.contains("/passport/user/logout/"))) {
            C0XLP c0xlpLJIIJ = C0XLQ.LJIIL(requestLIZ.getUrl()).LJIIJ();
            c0xlpLJIIJ.LIZJ("ts", String.valueOf(iLIZ));
            c0xlpLJIIJ.LIZJ("app_type", "normal");
            HashMap map = new HashMap();
            C0XDN.LIZJ(map, true);
            for (Map.Entry entry : map.entrySet()) {
                c0xlpLJIIJ.LIZJ((String) entry.getKey(), (String) entry.getValue());
            }
            C0XMB c0xmbNewBuilder = requestLIZ.newBuilder();
            c0xmbNewBuilder.LIZJ(c0xlpLJIIJ.LIZLLL().LJIIIIZZ);
            requestLIZ = c0xmbNewBuilder.LIZ();
        }
        return c1494590ozp.LIZ(requestLIZ);
    }
}
