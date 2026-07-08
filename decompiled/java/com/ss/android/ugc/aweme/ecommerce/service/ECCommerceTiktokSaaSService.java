package com.ss.android.ugc.aweme.ecommerce.service;

import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.ugc.aweme.ecommerce.interceptor.EcomLaunchChatInterceptor;
import com.ss.android.ugc.aweme.saas.ecommerce.service.IECommerceTTDependencyService;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ECCommerceTiktokSaaSService implements IECommerceTTDependencyService {
    @Override // com.ss.android.ugc.aweme.saas.ecommerce.service.IECommerceTTDependencyService
    public final List<IInterceptor> LIZJ() {
        return Collections.singletonList(new EcomLaunchChatInterceptor());
    }
}
