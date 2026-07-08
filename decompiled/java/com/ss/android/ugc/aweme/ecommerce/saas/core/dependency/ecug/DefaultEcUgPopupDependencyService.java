package com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class DefaultEcUgPopupDependencyService implements IEcUgPopupDependencyService {
    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.IEcUgPopupDependencyService
    public void checkPageSourceInfo(String str) {
    }

    public void initService() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.IEcUgPopupDependencyService
    public Boolean isFromEcUg(Map<String, ? extends Object> map) {
        return Boolean.FALSE;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.IEcUgPopupDependencyService
    public Boolean isFromEcUgVSA(Map<String, ? extends Object> map) {
        return Boolean.FALSE;
    }
}
