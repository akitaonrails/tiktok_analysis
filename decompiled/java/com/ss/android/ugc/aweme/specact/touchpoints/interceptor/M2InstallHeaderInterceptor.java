package com.ss.android.ugc.aweme.specact.touchpoints.interceptor;

import X.C080U;
import X.C0X52;
import X.C0XMB;
import X.C1494590ozp;
import X.C1930607hI;
import X.C2162308dZ;
import X.C844470XAv;
import X.InterfaceC1904907d9;
import X.InterfaceC841770X0l;
import com.bytedance.retrofit2.client.Request;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class M2InstallHeaderInterceptor implements InterfaceC1904907d9 {
    @Override // X.InterfaceC1904907d9
    public final C0X52<?> intercept(InterfaceC841770X0l interfaceC841770X0l) {
        String str;
        C1494590ozp c1494590ozp = (C1494590ozp) interfaceC841770X0l;
        Request requestLIZ = c1494590ozp.LIZJ;
        ArrayList arrayList = new ArrayList();
        if (requestLIZ.getHeaders() != null) {
            arrayList.addAll(requestLIZ.getHeaders());
            if (Intrinsics.LJFF(C1930607hI.LIZ, "unknown")) {
                C844470XAv.LIZ.getClass();
                if (C2162308dZ.LJFF(C844470XAv.LIZ(), "com.nc.tiktok.usmain")) {
                    str = "1";
                } else {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                C1930607hI.LIZ = str;
            }
            arrayList.add(new C080U("x-newmain-enable", C1930607hI.LIZ));
            C0XMB c0xmbNewBuilder = requestLIZ.newBuilder();
            c0xmbNewBuilder.LIZJ = arrayList;
            requestLIZ = c0xmbNewBuilder.LIZ();
        }
        return c1494590ozp.LIZ(requestLIZ);
    }
}
