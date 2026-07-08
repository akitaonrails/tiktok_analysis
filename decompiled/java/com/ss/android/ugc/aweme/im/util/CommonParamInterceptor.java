package com.ss.android.ugc.aweme.im.util;

import X.C0X52;
import X.C0XLP;
import X.C0XLQ;
import X.C0XMB;
import X.C1494590ozp;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC1904907d9;
import X.InterfaceC841770X0l;
import android.os.Build;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Locale;

/* JADX INFO: loaded from: classes14.dex */
public final class CommonParamInterceptor implements InterfaceC1904907d9 {
    public static final CommonParamInterceptor LL = new CommonParamInterceptor();

    @Override // X.InterfaceC1904907d9
    public final C0X52<?> intercept(InterfaceC841770X0l interfaceC841770X0l) {
        C1494590ozp c1494590ozp = (C1494590ozp) interfaceC841770X0l;
        Request request = c1494590ozp.LIZJ;
        C0XLP c0xlpLJIIJ = C0XLQ.LJIIIZ(request.getUrl()).LJIIJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(Build.BRAND);
        sbLIZ.append(' ');
        sbLIZ.append(Build.MODEL);
        c0xlpLJIIJ.LIZJ("device_type", C2188811AlT.LIZIZ(sbLIZ));
        String strSubstring = Build.VERSION.RELEASE;
        if (strSubstring != null) {
            try {
                if (strSubstring.length() > 10) {
                    strSubstring = strSubstring.substring(0, 10);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        c0xlpLJIIJ.LIZJ("device_platform", "Android " + strSubstring);
        c0xlpLJIIJ.LIZJ("os_language", C786410Ut5.t2(Locale.getDefault()));
        c0xlpLJIIJ.LIZJ("os_type", "Android");
        C0XMB c0xmbNewBuilder = request.newBuilder();
        c0xmbNewBuilder.LIZJ(c0xlpLJIIJ.LIZLLL().LJIIIIZZ);
        return c1494590ozp.LIZ(c0xmbNewBuilder.LIZ());
    }
}
