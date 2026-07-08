package com.bytedance.pumbaa.hybrid.monitor.jsinjection;

import X.C04TD;
import X.C800480Vag;
import X.C800490Vah;
import com.bytedance.lynx.hybrid.webkit.WebViewHooker;
import com.bytedance.pumbaa.hybrid.monitor.api.IHybridJsInjectionMonitorService;

/* JADX INFO: loaded from: classes14.dex */
public final class HybridMonitorJsInjectionServiceImpl implements IHybridJsInjectionMonitorService {
    public static IHybridJsInjectionMonitorService LIZLLL() {
        Object objLIZ = C04TD.LIZ(IHybridJsInjectionMonitorService.class, false);
        if (objLIZ != null) {
            return (IHybridJsInjectionMonitorService) objLIZ;
        }
        if (C04TD.LJJJJLL == null) {
            synchronized (IHybridJsInjectionMonitorService.class) {
                if (C04TD.LJJJJLL == null) {
                    C04TD.LJJJJLL = new HybridMonitorJsInjectionServiceImpl();
                }
            }
        }
        return C04TD.LJJJJLL;
    }

    @Override // com.bytedance.pumbaa.hybrid.monitor.api.IHybridMonitorService
    public final void LIZ(C800490Vah c800490Vah) {
        C800480Vag.LIZ = c800490Vah;
        WebViewHooker.LIZLLL(new WebStatusClientExt());
    }

    @Override // com.bytedance.pumbaa.hybrid.monitor.api.IHybridMonitorService
    public final void LIZJ(C800490Vah c800490Vah) {
        C800480Vag.LIZ = c800490Vah;
    }
}
