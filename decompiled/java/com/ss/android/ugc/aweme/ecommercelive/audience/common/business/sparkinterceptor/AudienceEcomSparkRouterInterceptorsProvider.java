package com.ss.android.ugc.aweme.ecommercelive.audience.common.business.sparkinterceptor;

import X.C1124904ad;
import X.C1125004ae;
import X.C13BV;
import com.ss.android.ugc.aweme.ecommerce.service.IEComHybridSparkInterceptorService;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.settings.LiveSparkSwitchConfig;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class AudienceEcomSparkRouterInterceptorsProvider implements IEComHybridSparkInterceptorService {
    @Override // com.ss.android.ugc.aweme.ecommerce.service.IEComHybridSparkInterceptorService
    public final List LIZ() {
        return ((LiveSparkSwitchConfig) C1124904ad.LIZIZ.getValue()).enableSparkInterceptor ? Collections.singletonList(C1125004ae.LIZ.getValue()) : C13BV.INSTANCE;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IEComHybridSparkInterceptorService
    public final List LIZIZ() {
        return C13BV.INSTANCE;
    }
}
