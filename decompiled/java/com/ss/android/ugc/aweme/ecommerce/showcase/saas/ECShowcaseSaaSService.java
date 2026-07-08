package com.ss.android.ugc.aweme.ecommerce.showcase.saas;

import com.ss.android.ugc.aweme.ecommerce.saas.business.dependency.showcase.IECShowcaseSaaSService;
import com.ss.android.ugc.aweme.ecommerce.showcase.profile.TabShowcaseFragment;
import com.ss.android.ugc.aweme.ecommerce.showcase.profile.TabStoreFragment;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.saas.TabCommerceFragment;

/* JADX INFO: loaded from: classes27.dex */
public final class ECShowcaseSaaSService implements IECShowcaseSaaSService {
    public void initService() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.business.dependency.showcase.IECShowcaseSaaSService
    public TabCommerceFragment createProfileTab(int i) {
        if (i == 14) {
            return new TabStoreFragment();
        }
        return new TabShowcaseFragment();
    }
}
