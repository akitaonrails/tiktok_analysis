package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.network;

import X.C080U;
import X.C0X52;
import X.C0XMB;
import X.C1494590ozp;
import X.InterfaceC1904907d9;
import X.InterfaceC841770X0l;
import com.bytedance.retrofit2.client.Request;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class OutboundComplianceHeaderInterceptor implements InterfaceC1904907d9 {
    @Override // X.InterfaceC1904907d9
    public final C0X52<?> intercept(InterfaceC841770X0l interfaceC841770X0l) {
        C1494590ozp c1494590ozp = (C1494590ozp) interfaceC841770X0l;
        Request request = c1494590ozp.LIZJ;
        ArrayList arrayList = new ArrayList();
        if (request.getHeaders() != null) {
            arrayList.addAll(request.getHeaders());
        }
        arrayList.add(new C080U("x-tt-dataflow-id", "0x28000404"));
        arrayList.add(new C080U("x-tt-pns-dt-pass-id", "0x10080007"));
        arrayList.add(new C080U("x-metasec-network-zone", "2"));
        arrayList.add(new C080U("x-metasec-bypass-ttnet-features", "1"));
        C0XMB c0xmbNewBuilder = request.newBuilder();
        c0xmbNewBuilder.LIZJ = arrayList;
        c0xmbNewBuilder.LIZJ(request.getUrl());
        return c1494590ozp.LIZ(c0xmbNewBuilder.LIZ());
    }
}
