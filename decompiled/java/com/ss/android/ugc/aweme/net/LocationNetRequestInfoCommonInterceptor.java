package com.ss.android.ugc.aweme.net;

import X.C0X52;
import X.C1205490hTX;
import X.C1494590ozp;
import X.C1494600ozq;
import X.C1EMR;
import X.C2175508fh;
import X.InterfaceC1201180hMa;
import X.InterfaceC1904907d9;
import X.InterfaceC841770X0l;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes4.dex */
public final class LocationNetRequestInfoCommonInterceptor implements InterfaceC1904907d9 {
    @Override // X.InterfaceC1904907d9
    public final C0X52<?> intercept(InterfaceC841770X0l interfaceC841770X0l) {
        Request request = ((C1494590ozp) interfaceC841770X0l).LIZJ;
        Object obj = null;
        if (request == null) {
            return null;
        }
        C0X52<?> c0x52LIZ = ((C1494590ozp) interfaceC841770X0l).LIZ(request);
        try {
            T t = c0x52LIZ.LIZIZ;
            C2175508fh c2175508fh = c0x52LIZ.LIZ;
            if (c2175508fh != null) {
                obj = c2175508fh.LJFF;
            }
            if ((t instanceof InterfaceC1201180hMa) && (obj instanceof C1494600ozq)) {
                ((InterfaceC1201180hMa) t).setRequestInfo((C1494600ozq) obj);
                return c0x52LIZ;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1205490hTX.LIZ.LJ(C1EMR.LOCATION_NET_INTERCEPTOR_ERROR, e);
        }
        return c0x52LIZ;
    }
}
