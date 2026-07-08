package com.ss.android.ugc.aweme.pipo.cashier.agentbridge;

import X.C080U;
import X.C0X52;
import X.C0XMB;
import X.C1494590ozp;
import X.InterfaceC1904907d9;
import X.InterfaceC841770X0l;
import com.bytedance.retrofit2.client.Request;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class AgentBridgeMockHeaderInterceptor implements InterfaceC1904907d9 {
    public static final AgentBridgeMockHeaderInterceptor LL = new AgentBridgeMockHeaderInterceptor();

    @Override // X.InterfaceC1904907d9
    public final C0X52<?> intercept(InterfaceC841770X0l interfaceC841770X0l) {
        String path;
        List<C080U> headers;
        Request requestLIZ = ((C1494590ozp) interfaceC841770X0l).LIZJ;
        if (requestLIZ != null) {
            path = requestLIZ.getPath();
        } else {
            path = null;
        }
        if (Intrinsics.LJFF(path, "/payment/v1/access_token") && requestLIZ != null && (headers = requestLIZ.getHeaders()) != null) {
            ArrayList arrayList = new ArrayList(headers);
            arrayList.add(new C080U("pipo-mock", "access_token"));
            C0XMB c0xmbNewBuilder = requestLIZ.newBuilder();
            if (c0xmbNewBuilder != null) {
                c0xmbNewBuilder.LIZJ = arrayList;
                requestLIZ = c0xmbNewBuilder.LIZ();
            } else {
                requestLIZ = null;
            }
        }
        return ((C1494590ozp) interfaceC841770X0l).LIZ(requestLIZ);
    }
}
