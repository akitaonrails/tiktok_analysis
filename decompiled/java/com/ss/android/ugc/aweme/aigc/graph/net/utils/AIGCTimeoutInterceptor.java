package com.ss.android.ugc.aweme.aigc.graph.net.utils;

import X.C080U;
import X.C0X52;
import X.C0XMB;
import X.C1493620oyG;
import X.C1494160oz8;
import X.C1494590ozp;
import X.C2095008Iq;
import X.InterfaceC1904907d9;
import X.InterfaceC841770X0l;
import com.bytedance.retrofit2.client.Request;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class AIGCTimeoutInterceptor implements InterfaceC1904907d9 {
    @Override // X.InterfaceC1904907d9
    public final C0X52<?> intercept(InterfaceC841770X0l interfaceC841770X0l) {
        Long lLJIILIIL;
        Long lLJIILIIL2;
        C1494160oz8 c1494160oz8;
        String str;
        String str2;
        String str3;
        C1494590ozp c1494590ozp = (C1494590ozp) interfaceC841770X0l;
        Request request = c1494590ozp.LIZJ;
        C080U firstHeader = request.getFirstHeader("CONNECT_TIMEOUT");
        Long lLJIILIIL3 = null;
        if (firstHeader != null && (str3 = firstHeader.LIZIZ) != null) {
            lLJIILIIL = C2095008Iq.LJIILIIL(str3);
        } else {
            lLJIILIIL = null;
        }
        C080U firstHeader2 = request.getFirstHeader("WRITE_TIMEOUT");
        if (firstHeader2 != null && (str2 = firstHeader2.LIZIZ) != null) {
            lLJIILIIL2 = C2095008Iq.LJIILIIL(str2);
        } else {
            lLJIILIIL2 = null;
        }
        C080U firstHeader3 = request.getFirstHeader("READ_TIMEOUT");
        if (firstHeader3 != null && (str = firstHeader3.LIZIZ) != null) {
            lLJIILIIL3 = C2095008Iq.LJIILIIL(str);
        }
        if (lLJIILIIL != null && lLJIILIIL2 != null && lLJIILIIL3 != null) {
            Object extraInfo = request.getExtraInfo();
            if (extraInfo == null) {
                extraInfo = new C1493620oyG();
                request.setExtraInfo(extraInfo);
            }
            if ((extraInfo instanceof C1494160oz8) && (c1494160oz8 = (C1494160oz8) extraInfo) != null) {
                c1494160oz8.LIZJ = lLJIILIIL.longValue();
                c1494160oz8.LJ = lLJIILIIL2.longValue();
                c1494160oz8.LIZLLL = lLJIILIIL3.longValue();
            }
            List<C080U> headers = request.getHeaders();
            ArrayList arrayList = new ArrayList();
            for (C080U c080u : headers) {
                C080U c080u2 = c080u;
                if (!Intrinsics.LJFF(c080u2.LIZ, "CONNECT_TIMEOUT") && !Intrinsics.LJFF(c080u2.LIZ, "READ_TIMEOUT") && !Intrinsics.LJFF(c080u2.LIZ, "WRITE_TIMEOUT")) {
                    arrayList.add(c080u);
                }
            }
            C0XMB c0xmbNewBuilder = request.newBuilder();
            c0xmbNewBuilder.LIZJ = arrayList;
            return c1494590ozp.LIZ(c0xmbNewBuilder.LIZ());
        }
        return c1494590ozp.LIZ(request);
    }
}
