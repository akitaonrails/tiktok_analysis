package com.ss.android.ugc.aweme.geoblocking.interceptor;

import X.C054G;
import X.C0PEM;
import X.C0X52;
import X.C1494590ozp;
import X.C1518940pd6;
import X.C1519020pdE;
import X.C2296808zG;
import X.C23250099c;
import X.C786410Ut5;
import X.InterfaceC1904907d9;
import X.InterfaceC841770X0l;
import android.os.Bundle;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.geoblocking.api.IGeoBlockingDepService;

/* JADX INFO: loaded from: classes24.dex */
public final class GeoBlockInterceptor implements InterfaceC1904907d9 {
    public static final GeoBlockInterceptor LL = new GeoBlockInterceptor();
    public static final C054G LLILLJJLI = C2296808zG.LIZ(C0PEM.LIZ);

    @Override // X.InterfaceC1904907d9
    public final C0X52<?> intercept(InterfaceC841770X0l interfaceC841770X0l) {
        Request request = ((C1494590ozp) interfaceC841770X0l).LIZJ;
        try {
            try {
                C0X52<?> c0x52LIZ = ((C1494590ozp) interfaceC841770X0l).LIZ(request);
                ((IGeoBlockingDepService) ServiceManager.get().getService(IGeoBlockingDepService.class)).LIZ();
                C1519020pdE.LIZ.LIZJ();
                return c0x52LIZ;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                Bundle bundle = new Bundle();
                String host = request.getHost();
                String str = "";
                if (host == null) {
                    host = "";
                }
                C786410Ut5.LJJJI("domain", host, bundle);
                String path = request.getPath();
                if (path != null) {
                    str = path;
                }
                C786410Ut5.LJJJI("path", str, bundle);
                if (((IGeoBlockingDepService) ServiceManager.get().getService(IGeoBlockingDepService.class)).LIZLLL()) {
                    C23250099c.LIZLLL(LLILLJJLI, null, null, new C1518940pd6(e, request, null), 3);
                }
                ((IGeoBlockingDepService) ServiceManager.get().getService(IGeoBlockingDepService.class)).LJ(bundle, e);
                throw e;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1519020pdE.LIZ.LIZJ();
            throw th;
        }
    }
}
