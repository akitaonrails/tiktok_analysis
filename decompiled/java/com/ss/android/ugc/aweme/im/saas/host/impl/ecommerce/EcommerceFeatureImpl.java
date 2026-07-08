package com.ss.android.ugc.aweme.im.saas.host.impl.ecommerce;

import X.C2369209Qc;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.ecommerce.EcommerceFeature;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
import kotlin.jvm.internal.AwS159S1100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class EcommerceFeatureImpl implements EcommerceFeature {
    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.ecommerce.EcommerceFeature
    public final void LIZ(String str, AwS159S1100000_10 awS159S1100000_10, String str2, String str3) {
        if (!C2369209Qc.LIZJ) {
            awS159S1100000_10.invoke();
            return;
        }
        IEcomSearchService iEcomSearchService = (IEcomSearchService) PluggableExtentionKt.pluggableSpi$default(IEcomSearchService.class, false, false, false, 14, null);
        if (iEcomSearchService == null) {
            awS159S1100000_10.invoke();
        } else {
            iEcomSearchService.LIZ(str, awS159S1100000_10, str2, str3);
        }
    }
}
