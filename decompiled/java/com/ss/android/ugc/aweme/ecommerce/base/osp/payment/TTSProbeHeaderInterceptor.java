package com.ss.android.ugc.aweme.ecommerce.base.osp.payment;

import X.C080U;
import X.C098200Yq;
import X.C0X52;
import X.C0XMB;
import X.C1008803x0;
import X.C1494590ozp;
import X.C189200o6;
import X.InterfaceC1904907d9;
import X.InterfaceC841770X0l;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class TTSProbeHeaderInterceptor implements InterfaceC1904907d9 {
    @Override // X.InterfaceC1904907d9
    public final C0X52<?> intercept(InterfaceC841770X0l interfaceC841770X0l) throws Exception {
        Object obj;
        Request request;
        Request requestLIZ;
        String encodedPath;
        String strLIZIZ;
        int size;
        Request request2 = ((C1494590ozp) interfaceC841770X0l).LIZJ;
        if (request2 != null) {
            try {
                String url = request2.getUrl();
                if (url != null && (encodedPath = UriProtector.parse(url).getEncodedPath()) != null && (strLIZIZ = C1008803x0.LIZIZ(encodedPath)) != null) {
                    List<C080U> headers = request2.getHeaders();
                    if (headers != null) {
                        size = headers.size();
                    } else {
                        size = 0;
                    }
                    ArrayList arrayList = new ArrayList(size + 1);
                    List<C080U> headers2 = request2.getHeaders();
                    if (headers2 != null) {
                        arrayList.addAll(headers2);
                    }
                    arrayList.add(new C080U("rpc-persist-probe-id", strLIZIZ));
                    C0XMB c0xmbNewBuilder = request2.newBuilder();
                    c0xmbNewBuilder.LIZJ = arrayList;
                    requestLIZ = c0xmbNewBuilder.LIZ();
                } else {
                    requestLIZ = request2;
                }
                C189200o6.m2constructorimpl(requestLIZ);
                obj = requestLIZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C098200Yq c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
                obj = c098200Yq;
            }
            Object obj2 = request2;
            if (C189200o6.m5exceptionOrNullimpl(obj) == null) {
                obj2 = obj;
            }
            request = (Request) obj2;
        } else {
            request = null;
        }
        try {
            return ((C1494590ozp) interfaceC841770X0l).LIZ(request);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        }
    }
}
