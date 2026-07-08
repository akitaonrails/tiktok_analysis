package com.ss.android.ugc.aweme.ecommerce.dependency.ecug;

import X.C04TD;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.IEcUgBackButtonDependencyService;
import com.ss.android.ugc.aweme.ecommerce.ug.backbutton.service.IEcUgBackButtonServiceOfficial;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;

/* JADX INFO: loaded from: classes3.dex */
public final class EcUgBackButtonDependencyService implements IEcUgBackButtonDependencyService {
    public void initService() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.IEcUgBackButtonDependencyService
    public boolean getInFYP() {
        IEcUgBackButtonServiceOfficial iEcUgBackButtonServiceOfficial = (IEcUgBackButtonServiceOfficial) PluggableExtentionKt.pluggableSpi$default(IEcUgBackButtonServiceOfficial.class, false, false, false, 14, null);
        return iEcUgBackButtonServiceOfficial != null && iEcUgBackButtonServiceOfficial.getInFYP();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.IEcUgBackButtonDependencyService
    public boolean getInMallTab() {
        IEcUgBackButtonServiceOfficial iEcUgBackButtonServiceOfficial = (IEcUgBackButtonServiceOfficial) PluggableExtentionKt.pluggableSpi$default(IEcUgBackButtonServiceOfficial.class, false, false, false, 14, null);
        return iEcUgBackButtonServiceOfficial != null && iEcUgBackButtonServiceOfficial.getInMallTab();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.IEcUgBackButtonDependencyService
    public void releaseBackButton() {
        IEcUgBackButtonServiceOfficial iEcUgBackButtonServiceOfficial = (IEcUgBackButtonServiceOfficial) PluggableExtentionKt.pluggableSpi$default(IEcUgBackButtonServiceOfficial.class, false, false, false, 14, null);
        if (iEcUgBackButtonServiceOfficial != null) {
            iEcUgBackButtonServiceOfficial.releaseBackButton();
        }
    }

    public static IEcUgBackButtonDependencyService createIEcUgBackButtonDependencyServicebyMonsterPlugin(boolean z) {
        Object objLIZ = C04TD.LIZ(IEcUgBackButtonDependencyService.class, z);
        if (objLIZ != null) {
            return (IEcUgBackButtonDependencyService) objLIZ;
        }
        if (C04TD.s == null) {
            synchronized (IEcUgBackButtonDependencyService.class) {
                if (C04TD.s == null) {
                    C04TD.s = new EcUgBackButtonDependencyService();
                }
            }
        }
        return C04TD.s;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.IEcUgBackButtonDependencyService
    public void prepareBackButton(String str, ImageUrlModel imageUrlModel, String str2) {
        IEcUgBackButtonServiceOfficial iEcUgBackButtonServiceOfficial = (IEcUgBackButtonServiceOfficial) PluggableExtentionKt.pluggableSpi$default(IEcUgBackButtonServiceOfficial.class, false, false, false, 14, null);
        if (iEcUgBackButtonServiceOfficial != null) {
            iEcUgBackButtonServiceOfficial.prepareBackButton(str, imageUrlModel, str2);
        }
    }
}
