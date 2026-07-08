package com.ss.android.ugc.aweme.ecommercelive.audience.common.business.cache;

import X.C20322614fY;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.common.service.IEcommerceProductCacheService;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.framework.annotation.EcommerceRegion;
import kotlin.jvm.internal.AwS611S0100000_32;

/* JADX INFO: loaded from: classes33.dex */
@EcommerceRegion
public final class EcommerceProductCacheService implements IEcommerceProductCacheService {
    @Override // com.ss.android.ugc.aweme.ecommercelive.common.biz.common.service.IEcommerceProductCacheService
    public final void LIZIZ(String str) {
        C20322614fY.LIZ.getClass();
        C20322614fY.LIZJ = str;
    }

    @Override // com.ss.android.ugc.aweme.ecommercelive.common.biz.common.service.IEcommerceProductCacheService
    public final void LIZJ(Long l, String str, String str2) {
        LiveExposedProductsCache.LIZ.getClass();
        if (str != null && l != null) {
            LiveExposedProductsCache.LIZ(str, str2, new AwS611S0100000_32(l, 68));
        }
    }
}
