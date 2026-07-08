package com.ss.android.ugc.aweme.legoImp.task.pumbaa;

import X.C080U;
import X.C0X52;
import X.C0XMB;
import X.C1494590ozp;
import X.C805380Via;
import X.InterfaceC1904907d9;
import X.InterfaceC841770X0l;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class AddDFIDInterceptor implements InterfaceC1904907d9 {
    @Override // X.InterfaceC1904907d9
    public final C0X52<?> intercept(InterfaceC841770X0l interfaceC841770X0l) {
        C1494590ozp c1494590ozp = (C1494590ozp) interfaceC841770X0l;
        Request request = c1494590ozp.LIZJ;
        try {
            String host = request.getHost();
            if (Intrinsics.LJFF(host, "34.102.215.99") || Intrinsics.LJFF(host, "dns.google.com")) {
                C0XMB c0xmbNewBuilder = request.newBuilder();
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(request.getHeaders());
                if (!Intrinsics.LJFF(host, "34.102.215.99")) {
                    arrayList.add(new C080U("x-tt-dataflow-id", "671088910"));
                } else {
                    arrayList.add(new C080U("x-tt-dataflow-id", "671088898"));
                }
                c0xmbNewBuilder.LIZJ = arrayList;
                return ((C1494590ozp) interfaceC841770X0l).LIZ(c0xmbNewBuilder.LIZ());
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C805380Via.LIZJ(e, "sandbox_AddDFIDInterceptor_error");
        }
        return c1494590ozp.LIZ(request);
    }
}
