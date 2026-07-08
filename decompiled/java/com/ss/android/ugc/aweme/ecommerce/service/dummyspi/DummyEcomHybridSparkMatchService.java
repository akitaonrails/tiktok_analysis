package com.ss.android.ugc.aweme.ecommerce.service.dummyspi;

import X.C13BV;
import com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor;
import com.ss.android.ugc.aweme.ecommerce.service.IEcomHybridSparkMatchService;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class DummyEcomHybridSparkMatchService implements IEcomHybridSparkMatchService {
    @Override // com.ss.android.ugc.aweme.ecommerce.service.IEcomHybridSparkMatchService
    public final List<ISparkRouterInterceptor> LIZ() {
        return C13BV.INSTANCE;
    }
}
