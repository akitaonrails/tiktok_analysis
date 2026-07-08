package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.network;

import X.C0D83;
import X.C0D8X;
import X.C0X52;
import X.C1494590ozp;
import X.C2188811AlT;
import X.InterfaceC1904907d9;
import X.InterfaceC841770X0l;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public final class NetworkRetryInterceptor implements InterfaceC1904907d9 {
    @Override // X.InterfaceC1904907d9
    public final C0X52<?> intercept(InterfaceC841770X0l interfaceC841770X0l) throws Exception {
        int i;
        Request request = ((C1494590ozp) interfaceC841770X0l).LIZJ;
        Exception e = null;
        int i2 = 0;
        C0X52 c0x52LIZ = null;
        while (i2 < 3) {
            try {
                c0x52LIZ = ((C1494590ozp) interfaceC841770X0l).LIZ(request);
            } catch (Exception e2) {
                e = e2;
                TryCatchGuardChecker.doCheck(e);
                C0D83 c0d83LIZIZ = C0D8X.LIZIZ();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[NetworkRetry] Network exception: ");
                sbLIZ.append(e.getMessage());
                sbLIZ.append(" on ");
                sbLIZ.append(request.getPath());
                sbLIZ.append(". Retrying... (");
                sbLIZ.append(i2 + 1);
                sbLIZ.append("/3)");
                C2188811AlT.LIZIZ(sbLIZ);
                c0d83LIZIZ.w();
            }
            if (c0x52LIZ.LIZJ() || ((i = c0x52LIZ.LIZ.LIZIZ) != 429 && i < 500)) {
                return c0x52LIZ;
            }
            C0D83 c0d83LIZIZ2 = C0D8X.LIZIZ();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("[NetworkRetry] HTTP ");
            sbLIZ2.append(c0x52LIZ.LIZ.LIZIZ);
            sbLIZ2.append(" on ");
            sbLIZ2.append(request.getPath());
            sbLIZ2.append(". Retrying... (");
            sbLIZ2.append(i2 + 1);
            sbLIZ2.append("/3)");
            C2188811AlT.LIZIZ(sbLIZ2);
            c0d83LIZIZ2.w();
            i2++;
            if (i2 >= 3) {
                break;
            }
            try {
                Thread.sleep(((long) i2) * 500);
            } catch (InterruptedException e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
        }
        if (c0x52LIZ == null) {
            if (e == null) {
                throw new IOException("Unknown network error after 3 retries");
            }
            throw e;
        }
        return c0x52LIZ;
    }
}
