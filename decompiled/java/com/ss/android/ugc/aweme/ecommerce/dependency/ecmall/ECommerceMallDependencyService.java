package com.ss.android.ugc.aweme.ecommerce.dependency.ecmall;

import X.C04TD;
import X.C1770080wAA;
import com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecmall.IECommerceMallDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: loaded from: classes25.dex */
public final class ECommerceMallDependencyService implements IECommerceMallDependencyService {
    public void initService() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecmall.IECommerceMallDependencyService
    public boolean hitTopTabExpExperiment() {
        return ((IECommerceMallService) ServiceManager.get().getService(IECommerceMallService.class)).hitTopTabExpExperiment();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecmall.IECommerceMallDependencyService
    public void onEcOrderSubmit() {
        ((IECommerceMallService) ServiceManager.get().getService(IECommerceMallService.class)).onEcOrderSubmit();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecmall.IECommerceMallDependencyService
    public Boolean shouldShowMall2TabOrTopTab() {
        IECommerceMallService iECommerceMallService = (IECommerceMallService) ServiceManager.get().getService(IECommerceMallService.class);
        if (iECommerceMallService != null) {
            return Boolean.valueOf(iECommerceMallService.shouldShowMall2TabOrTopTab());
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecmall.IECommerceMallDependencyService
    public boolean shouldShowMallTab() {
        return ((IECommerceMallService) ServiceManager.get().getService(IECommerceMallService.class)).shouldShowMallTab();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecmall.IECommerceMallDependencyService
    public boolean shouldShowMallTopTab() {
        return ((IECommerceMallService) ServiceManager.get().getService(IECommerceMallService.class)).shouldShowMallTopTab();
    }

    public static IECommerceMallDependencyService createIECommerceMallDependencyServicebyMonsterPlugin(boolean z) {
        Object objLIZ = C04TD.LIZ(IECommerceMallDependencyService.class, z);
        if (objLIZ != null) {
            return (IECommerceMallDependencyService) objLIZ;
        }
        if (C04TD.m == null) {
            synchronized (IECommerceMallDependencyService.class) {
                if (C04TD.m == null) {
                    C04TD.m = new ECommerceMallDependencyService();
                }
            }
        }
        return C04TD.m;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecmall.IECommerceMallDependencyService
    public void onAnchorPanelClose(C1770080wAA c1770080wAA) {
        ((IECommerceMallService) ServiceManager.get().getService(IECommerceMallService.class)).onAnchorPanelClose(c1770080wAA);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecmall.IECommerceMallDependencyService
    public void onAnchorPanelOpen(C1770080wAA c1770080wAA) {
        ((IECommerceMallService) ServiceManager.get().getService(IECommerceMallService.class)).onAnchorPanelOpen(c1770080wAA);
    }
}
