package com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug;

import com.ss.android.ugc.aweme.base.ImageUrlModel;

/* JADX INFO: loaded from: classes29.dex */
public final class DefaultEcUgBackButtonDependencyService implements IEcUgBackButtonDependencyService {
    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.IEcUgBackButtonDependencyService
    public boolean getInFYP() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.IEcUgBackButtonDependencyService
    public boolean getInMallTab() {
        return false;
    }

    public void initService() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.IEcUgBackButtonDependencyService
    public void prepareBackButton(String str, ImageUrlModel imageUrlModel, String str2) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.IEcUgBackButtonDependencyService
    public void releaseBackButton() {
    }
}
