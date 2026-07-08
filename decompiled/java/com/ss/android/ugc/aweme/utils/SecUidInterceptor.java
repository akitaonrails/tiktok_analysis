package com.ss.android.ugc.aweme.utils;

import X.C0W75;
import X.C0X0W;
import X.C0X33;
import X.C0XLP;
import X.C0XLQ;
import X.C0XLY;
import X.C1495400p18;
import X.C2188811AlT;
import X.InterfaceC836900WsK;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import okhttp3.Request;

/* JADX INFO: loaded from: classes14.dex */
public class SecUidInterceptor implements InterfaceC836900WsK {
    @Override // X.InterfaceC836900WsK
    public final C0XLY intercept(C0X0W c0x0w) {
        C1495400p18 c1495400p18 = (C1495400p18) c0x0w;
        Request requestLIZIZ = c1495400p18.LJFF;
        C0XLQ c0xlqUrl = requestLIZIZ.url();
        if (c0xlqUrl != null) {
            C0W75.LIZ().getClass();
            if (!C0W75.LIZJ()) {
                try {
                    C0W75.LJFF(c0xlqUrl.LJFF(), false);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            C0XLP c0xlpLJIIJ = c0xlqUrl.LJIIJ();
            for (String str : C0W75.LIZIZ) {
                String strLJIILLIIL = c0xlqUrl.LJIILLIIL(str);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("sec_");
                sbLIZ.append(str);
                if (TextUtils.isEmpty(c0xlqUrl.LJIILLIIL(C2188811AlT.LIZIZ(sbLIZ)))) {
                    String strLIZIZ = C0W75.LIZ().LIZIZ(strLJIILLIIL);
                    if (!TextUtils.isEmpty(strLIZIZ)) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("sec_");
                        sbLIZ2.append(str);
                        c0xlpLJIIJ.LJIIL(C2188811AlT.LIZIZ(sbLIZ2), strLIZIZ);
                    }
                }
            }
            C0X33 c0x33NewBuilder = requestLIZIZ.newBuilder();
            c0x33NewBuilder.LJII(c0xlpLJIIJ.LIZLLL().LJIIIIZZ);
            requestLIZIZ = c0x33NewBuilder.LIZIZ();
        }
        return c1495400p18.LIZ(requestLIZIZ);
    }
}
