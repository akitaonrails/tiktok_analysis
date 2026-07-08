package com.ss.android.ugc.aweme.web.business.preload;

import X.C01GW;
import X.C04TD;
import X.C1533850q19;
import X.C452501pT;
import com.ss.android.ugc.aweme.ad.preload.interfaces.IAdWebViewInterceptorService;
import kotlin.jvm.internal.AFwS212S0000000_23;

/* JADX INFO: loaded from: classes3.dex */
public final class AdWebViewInterceptorService implements IAdWebViewInterceptorService {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(105));

    public static IAdWebViewInterceptorService LIZIZ() {
        Object objLIZ = C04TD.LIZ(IAdWebViewInterceptorService.class, false);
        if (objLIZ != null) {
            return (IAdWebViewInterceptorService) objLIZ;
        }
        if (C04TD.d6 == null) {
            synchronized (IAdWebViewInterceptorService.class) {
                if (C04TD.d6 == null) {
                    C04TD.d6 = new AdWebViewInterceptorService();
                }
            }
        }
        return C04TD.d6;
    }

    @Override // com.ss.android.ugc.aweme.ad.preload.interfaces.IAdWebViewInterceptorService
    public final C1533850q19 LIZ() {
        return (C1533850q19) this.LIZ.getValue();
    }
}
