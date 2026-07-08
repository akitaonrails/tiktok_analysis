package com.ss.android.ugc.aweme.ecommercelive.common.container;

import X.C13LP;
import X.C21188817vy;
import X.C21207117yv;
import X.InterfaceC20673515v3;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.framework.annotation.EcommerceRegion;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.region.IEcommerceRegionService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.ILiveParasiticModuleLaunchService;
import java.lang.annotation.Annotation;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes33.dex */
public final class EcommerceLiveParasiticLaunchService implements ILiveParasiticModuleLaunchService {
    @Override // com.ss.android.ugc.aweme.live.ILiveParasiticModuleLaunchService
    public final void launch() {
        if (((IEcommerceRegionService) ServiceManager.get().getService(IEcommerceRegionService.class)).LIZ()) {
            for (IEcommerceLiveLaunchService iEcommerceLiveLaunchService : ServiceManager.get().getServices(IEcommerceLiveLaunchService.class)) {
                Annotation[] annotations = iEcommerceLiveLaunchService.getClass().getAnnotations();
                ArrayList arrayList = new ArrayList();
                for (Annotation annotation : annotations) {
                    if (annotation instanceof EcommerceRegion) {
                        arrayList.add(annotation);
                    }
                }
                EcommerceRegion ecommerceRegion = (EcommerceRegion) C13LP.LJJJLL(arrayList);
                if (ecommerceRegion != null) {
                    IEcommerceRegionService iEcommerceRegionService = (IEcommerceRegionService) PluggableExtentionKt.pluggableSpi$default(IEcommerceRegionService.class, false, false, false, 14, null);
                    if ((iEcommerceRegionService != null ? iEcommerceRegionService.region() : null) == ecommerceRegion.region()) {
                    }
                }
                iEcommerceLiveLaunchService.launch();
            }
            ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
            if (iLiveOuterService != null) {
                iLiveOuterService.j6().registerSlot(new C21207117yv());
                InterfaceC20673515v3 interfaceC20673515v3K4 = iLiveOuterService.k4();
                if (interfaceC20673515v3K4 != null) {
                    interfaceC20673515v3K4.LJJJJL(C21188817vy.LIZIZ.getValue());
                }
            }
        }
    }
}
