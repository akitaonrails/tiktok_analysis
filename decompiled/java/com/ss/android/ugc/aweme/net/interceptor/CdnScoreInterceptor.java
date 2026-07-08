package com.ss.android.ugc.aweme.net.interceptor;

import X.C01GW;
import X.C0X52;
import X.C13LP;
import X.C1494590ozp;
import X.C842440X3a;
import X.C842450X3b;
import X.C842470X3d;
import X.C842480X3e;
import X.InterfaceC841770X0l;
import com.bytedance.retrofit2.client.Request;
import com.ss.android.ugc.aweme.ml.api.SmartCDNRankService;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class CdnScoreInterceptor extends FeedBaseCronetInterceptor {
    @Override // com.ss.android.ugc.aweme.net.interceptor.FeedBaseCronetInterceptor, X.InterfaceC1904907d9
    public final C0X52<?> intercept(InterfaceC841770X0l interfaceC841770X0l) {
        List<C842480X3e> list;
        List<C842480X3e> list2;
        ArrayList arrayList = new ArrayList();
        SmartCDNRankService.LIZ.getClass();
        C01GW<SmartCDNRankService> c01gw = C842450X3b.LIZIZ;
        C842470X3d c842470X3dLIZIZ = c01gw.getValue().LIZIZ();
        if (c842470X3dLIZIZ != null && (list2 = c842470X3dLIZIZ.LIZ) != null) {
            arrayList.addAll(list2);
        }
        C842470X3d c842470X3dLIZIZ2 = c01gw.getValue().LIZIZ();
        if (c842470X3dLIZIZ2 != null && (list = c842470X3dLIZIZ2.LIZIZ) != null) {
            arrayList.addAll(list);
        }
        final String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, ";", null, null, 0, null, new C842440X3a(), 30);
        if (strLJJLIIIJ.length() > 0) {
            final C1494590ozp c1494590ozp = (C1494590ozp) interfaceC841770X0l;
            return super.intercept(new InterfaceC841770X0l() { // from class: X.0X0m
                @Override // X.InterfaceC841770X0l
                public final Request request() {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.addAll(c1494590ozp.request().getHeaders());
                    arrayList2.add(new C080U("x-tt-cs", strLJJLIIIJ));
                    C0XMB c0xmbNewBuilder = c1494590ozp.request().newBuilder();
                    c0xmbNewBuilder.LIZJ = arrayList2;
                    return c0xmbNewBuilder.LIZ();
                }

                @Override // X.InterfaceC841770X0l
                public final C0X52<?> LIZ(Request request) {
                    return c1494590ozp.LIZ(request);
                }
            });
        }
        return super.intercept(interfaceC841770X0l);
    }
}
