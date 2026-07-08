package com.ss.android.ugc.aweme.ecommerce.core.router;

import X.C1549860qQy;
import X.C1697810uHb;
import com.ss.android.ugc.aweme.ecommerce.router.ISparkRouterInterceptor;
import com.ss.android.ugc.aweme.ecommerce.service.IEcomHybridSparkMatchService;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class BusinessEcomSparkMatcherProvider implements IEcomHybridSparkMatchService {
    public final List<ISparkRouterInterceptor> LIZ = C1697810uHb.LJIILJJIL(new C1549860qQy());

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IEcomHybridSparkMatchService
    public final List<ISparkRouterInterceptor> LIZ() {
        return this.LIZ;
    }
}
