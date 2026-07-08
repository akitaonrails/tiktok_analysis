package com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.localtest;

import java.util.Map;

/* JADX INFO: loaded from: classes29.dex */
public final class DefaultLocalTestDependencyService implements ILocalTestDependencyService {
    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.localtest.ILocalTestDependencyService
    public boolean enableBoe() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.localtest.ILocalTestDependencyService
    public boolean enableManualDowngrade() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.localtest.ILocalTestDependencyService
    public Map<String, String> getDownGradeList() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.localtest.ILocalTestDependencyService
    public String getEcommerceBoeHost() {
        return null;
    }

    public void initService() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.localtest.ILocalTestDependencyService
    public Boolean isPPEEnable() {
        return null;
    }
}
