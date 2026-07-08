package com.ss.android.ugc.aweme.tablet.common.auth;

import X.C080U;
import X.C0X52;
import X.C1494590ozp;
import X.C2188811AlT;
import X.InterfaceC1904907d9;
import X.InterfaceC841770X0l;
import com.bytedance.retrofit2.client.Request;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class CurlLoggingInterceptor implements InterfaceC1904907d9 {
    @Override // X.InterfaceC1904907d9
    public final C0X52<?> intercept(InterfaceC841770X0l interfaceC841770X0l) {
        C1494590ozp c1494590ozp = (C1494590ozp) interfaceC841770X0l;
        Request request = c1494590ozp.LIZJ;
        List<C080U> headers = request.getHeaders();
        if (headers != null) {
            for (C080U c080u : headers) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(" -H \"");
                sbLIZ.append(c080u.LIZ);
                sbLIZ.append(": ");
                sbLIZ.append(c080u.LIZIZ);
                sbLIZ.append('\"');
                C2188811AlT.LIZIZ(sbLIZ);
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(" -X ");
        sbLIZ2.append(request.getMethod());
        sbLIZ2.append(" \"");
        sbLIZ2.append(request.getUrl());
        sbLIZ2.append('\"');
        C2188811AlT.LIZIZ(sbLIZ2);
        if (request.getBody() != null) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(" --data-binary \"@");
            sbLIZ3.append(request.getBody());
            sbLIZ3.append('\"');
            C2188811AlT.LIZIZ(sbLIZ3);
        }
        return c1494590ozp.LIZ(request);
    }
}
