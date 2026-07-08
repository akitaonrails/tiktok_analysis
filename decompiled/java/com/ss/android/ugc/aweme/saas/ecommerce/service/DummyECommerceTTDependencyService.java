package com.ss.android.ugc.aweme.saas.ecommerce.service;

import X.C13BV;
import com.bytedance.router.interceptor.IInterceptor;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class DummyECommerceTTDependencyService implements IECommerceTTDependencyService {
    @Override // com.ss.android.ugc.aweme.saas.ecommerce.service.IECommerceTTDependencyService
    public final List<IInterceptor> LIZJ() {
        return C13BV.INSTANCE;
    }
}
