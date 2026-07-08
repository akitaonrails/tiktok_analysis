package com.ss.android.ugc.aweme.commentv2.commentlist;

import X.C0X0X;
import X.C0X52;
import X.C0XLP;
import X.C0XLQ;
import X.C0XMB;
import X.C0XMH;
import X.C1494590ozp;
import X.C19252910Tv;
import X.C2344809Gs;
import X.C837630WtV;
import X.InterfaceC1904907d9;
import X.InterfaceC827860Wdk;
import X.InterfaceC841770X0l;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class TabletCommonParamsInterceptor implements InterfaceC1904907d9 {
    public static Request LIZ(Request request) {
        C0X0X c0x0x = (C0X0X) request.getRequestBody();
        C837630WtV c837630WtV = new C837630WtV();
        int iLJI = c0x0x.LJI();
        for (int i = 0; i < iLJI; i++) {
            c837630WtV.LIZIZ(c0x0x.LJFF(i), (String) ListProtector.get(c0x0x.LIZIZ, i));
        }
        InterfaceC827860Wdk interfaceC827860WdkLJIIJ = C19252910Tv.LIZIZ.LIZLLL().LJIIJ();
        int iIsPad = interfaceC827860WdkLJIIJ.isPad();
        int iLIZ = interfaceC827860WdkLJIIJ.LIZ();
        c837630WtV.LIZIZ("is_pad", String.valueOf(iIsPad));
        c837630WtV.LIZIZ("is_landscape", String.valueOf(iLIZ));
        C0X0X c0x0xLIZJ = c837630WtV.LIZJ();
        C0XMB c0xmbNewBuilder = request.newBuilder();
        c0xmbNewBuilder.LIZIZ(new C0XMH(c0x0xLIZJ), "POST");
        return c0xmbNewBuilder.LIZ();
    }

    public static Request LIZIZ(Request request) {
        C0XLQ c0xlqLJIIL = C0XLQ.LJIIL(request.getUrl());
        if (c0xlqLJIIL != null) {
            Set<String> setLJIIZILJ = c0xlqLJIIL.LJIIZILJ();
            C0XLP c0xlpLJIIJ = c0xlqLJIIL.LJIIJ();
            for (String str : setLJIIZILJ) {
                Iterator<String> it2 = c0xlqLJIIL.LJIJ(str).iterator();
                while (it2.hasNext()) {
                    c0xlpLJIIJ.LIZJ(str, it2.next());
                }
            }
            InterfaceC827860Wdk interfaceC827860WdkLJIIJ = C19252910Tv.LIZIZ.LIZLLL().LJIIJ();
            int iIsPad = interfaceC827860WdkLJIIJ.isPad();
            int iLIZ = interfaceC827860WdkLJIIJ.LIZ();
            c0xlpLJIIJ.LIZJ("is_pad", String.valueOf(iIsPad));
            c0xlpLJIIJ.LIZJ("is_landscape", String.valueOf(iLIZ));
            C0XMB c0xmbNewBuilder = request.newBuilder();
            c0xmbNewBuilder.LIZJ(c0xlpLJIIJ.LIZLLL().LJIIIIZZ);
            return c0xmbNewBuilder.LIZ();
        }
        return request;
    }

    @Override // X.InterfaceC1904907d9
    public final C0X52<?> intercept(InterfaceC841770X0l interfaceC841770X0l) {
        Request requestLIZIZ = ((C1494590ozp) interfaceC841770X0l).LIZJ;
        if (requestLIZIZ != null) {
            try {
                if (Intrinsics.LJFF(requestLIZIZ.getMethod(), "POST") && (requestLIZIZ.getRequestBody() instanceof C0X0X)) {
                    requestLIZIZ = LIZ(requestLIZIZ);
                } else {
                    requestLIZIZ = LIZIZ(requestLIZIZ);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C2344809Gs.LJI(th);
            }
        }
        return ((C1494590ozp) interfaceC841770X0l).LIZ(requestLIZIZ);
    }
}
