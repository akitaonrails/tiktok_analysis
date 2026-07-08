package com.ss.android.ugc.aweme.net.interceptor;

import X.C080U;
import X.C0X52;
import X.C0XMB;
import X.C1494590ozp;
import X.C1498560p6E;
import X.C2175508fh;
import X.C806950Vl7;
import X.C807330Vlj;
import X.C807350Vll;
import X.C807380Vlo;
import X.C807390Vlp;
import X.InterfaceC1904907d9;
import X.InterfaceC841770X0l;
import android.text.TextUtils;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes14.dex */
public class TTNetworkContextInterceptor implements InterfaceC1904907d9 {
    @Override // X.InterfaceC1904907d9
    public final C0X52 intercept(InterfaceC841770X0l interfaceC841770X0l) throws Throwable {
        String strLIZIZ;
        C0X52 c0x52LIZ;
        C2175508fh c2175508fh;
        String str = "";
        C1494590ozp c1494590ozp = (C1494590ozp) interfaceC841770X0l;
        Request requestLIZ = c1494590ozp.LIZJ;
        String path = requestLIZ.getPath();
        C806950Vl7 c806950Vl7 = C806950Vl7.LIZIZ;
        if (!c806950Vl7.LJIIIIZZ(path)) {
            C807380Vlo.LIZIZ.removeNetworkContext(path);
            return c1494590ozp.LIZ(requestLIZ);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        C807390Vlp c807390VlpRemoveNetworkContext = C807380Vlo.LIZIZ.removeNetworkContext(path);
        if (c807390VlpRemoveNetworkContext != null) {
            if (System.currentTimeMillis() - c807390VlpRemoveNetworkContext.LIZIZ < c806950Vl7.LJ().LIZ) {
                strLIZIZ = c807390VlpRemoveNetworkContext.LIZ;
            } else {
                strLIZIZ = null;
            }
        } else {
            strLIZIZ = C807350Vll.LIZIZ.LIZIZ(null);
        }
        if (!TextUtils.isEmpty(strLIZIZ)) {
            C807330Vlj c807330Vlj = C807330Vlj.LIZIZ;
            c807330Vlj.LIZJ(-1, strLIZIZ, requestLIZ.getUrl(), -1L, "");
            ArrayList arrayList = new ArrayList(requestLIZ.getHeaders());
            arrayList.add(new C080U(c807330Vlj.LJ(), c807330Vlj.LJFF(strLIZIZ)));
            C0XMB c0xmbNewBuilder = requestLIZ.newBuilder();
            c0xmbNewBuilder.LIZJ = arrayList;
            requestLIZ = c0xmbNewBuilder.LIZ();
        }
        int iLIZIZ = -1;
        try {
            try {
                c0x52LIZ = ((C1494590ozp) interfaceC841770X0l).LIZ(requestLIZ);
                c2175508fh = c0x52LIZ.LIZ;
                iLIZIZ = c2175508fh.LIZIZ;
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            C080U c080uLIZ = c2175508fh.LIZ("x-tt-logid");
            if (c080uLIZ != null) {
                str = c080uLIZ.LIZIZ;
            }
            if (!TextUtils.isEmpty(strLIZIZ)) {
                C807330Vlj.LIZIZ.LIZJ(iLIZIZ, strLIZIZ, requestLIZ.getUrl(), System.currentTimeMillis() - jCurrentTimeMillis, str);
            }
            return c0x52LIZ;
        } catch (Exception e2) {
            e = e2;
            TryCatchGuardChecker.doCheck(e);
            iLIZIZ = C1498560p6E.LIZIZ(e, null);
            throw e;
        } catch (Throwable th2) {
            th = th2;
            while (true) {
                try {
                    TryCatchGuardChecker.doCheck(th);
                    break;
                } catch (Throwable th3) {
                    th = th3;
                }
            }
            if (!TextUtils.isEmpty(strLIZIZ)) {
                C807330Vlj.LIZIZ.LIZJ(iLIZIZ, strLIZIZ, requestLIZ.getUrl(), System.currentTimeMillis() - jCurrentTimeMillis, "");
            }
            throw th;
        }
    }
}
