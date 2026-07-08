package com.ss.android.ugc.aweme.opt;

import X.C080U;
import X.C0X52;
import X.C0XMB;
import X.C1494590ozp;
import X.C1917707fD;
import X.C20645086x;
import X.InterfaceC1904907d9;
import X.InterfaceC841770X0l;
import com.bytedance.retrofit2.client.Request;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class BackendApiCallerOptInterceptor implements InterfaceC1904907d9 {
    @Override // X.InterfaceC1904907d9
    public final C0X52<?> intercept(InterfaceC841770X0l interfaceC841770X0l) {
        String path;
        C20645086x c20645086x = C20645086x.LIZIZ;
        if (!c20645086x.LIZJ()) {
            C1494590ozp c1494590ozp = (C1494590ozp) interfaceC841770X0l;
            return c1494590ozp.LIZ(c1494590ozp.LIZJ);
        }
        C1494590ozp c1494590ozp2 = (C1494590ozp) interfaceC841770X0l;
        Request request = c1494590ozp2.LIZJ;
        if (request != null) {
            path = request.getPath();
        } else {
            path = null;
        }
        if (!c20645086x.LIZLLL(path)) {
            return c1494590ozp2.LIZ(c1494590ozp2.LIZJ);
        }
        String string = C1917707fD.LIZ().getString("key_backend_params_data", "");
        if (string.length() == 0) {
            return c1494590ozp2.LIZ(request);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(request.getHeaders());
        arrayList.add(new C080U("x-opti-ut", string));
        C0XMB c0xmbNewBuilder = c1494590ozp2.LIZJ.newBuilder();
        c0xmbNewBuilder.LIZJ = arrayList;
        return c1494590ozp2.LIZ(c0xmbNewBuilder.LIZ());
    }
}
