package com.ss.android.ugc.aweme.utils;

import X.C0W75;
import X.C0X52;
import X.C0XLP;
import X.C0XLQ;
import X.C0XMB;
import X.C1494590ozp;
import X.C2188811AlT;
import X.InterfaceC1904907d9;
import X.InterfaceC841770X0l;
import android.text.TextUtils;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes14.dex */
public class SecUidInterceptorTTNet implements InterfaceC1904907d9 {
    @Override // X.InterfaceC1904907d9
    public final C0X52 intercept(InterfaceC841770X0l interfaceC841770X0l) {
        C1494590ozp c1494590ozp = (C1494590ozp) interfaceC841770X0l;
        Request requestLIZ = c1494590ozp.LIZJ;
        C0XLQ c0xlqLJIIL = C0XLQ.LJIIL(requestLIZ.getUrl());
        if (c0xlqLJIIL != null) {
            C0W75.LIZ().getClass();
            if (!C0W75.LIZJ()) {
                try {
                    C0W75.LJFF(c0xlqLJIIL.LJFF(), false);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            C0XLP c0xlpLJIIJ = c0xlqLJIIL.LJIIJ();
            for (String str : C0W75.LIZIZ) {
                String strLJIILLIIL = c0xlqLJIIL.LJIILLIIL(str);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("sec_");
                sbLIZ.append(str);
                if (TextUtils.isEmpty(c0xlqLJIIL.LJIILLIIL(C2188811AlT.LIZIZ(sbLIZ)))) {
                    String strLIZIZ = C0W75.LIZ().LIZIZ(strLJIILLIIL);
                    if (!TextUtils.isEmpty(strLIZIZ)) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("sec_");
                        sbLIZ2.append(str);
                        c0xlpLJIIJ.LJIIL(C2188811AlT.LIZIZ(sbLIZ2), strLIZIZ);
                    }
                }
            }
            C0XMB c0xmbNewBuilder = requestLIZ.newBuilder();
            c0xmbNewBuilder.LIZJ(c0xlpLJIIJ.LIZLLL().LJIIIIZZ);
            requestLIZ = c0xmbNewBuilder.LIZ();
        }
        return c1494590ozp.LIZ(requestLIZ);
    }
}
