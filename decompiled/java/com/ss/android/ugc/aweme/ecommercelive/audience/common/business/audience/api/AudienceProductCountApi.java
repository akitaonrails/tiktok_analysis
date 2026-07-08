package com.ss.android.ugc.aweme.ecommercelive.audience.common.business.audience.api;

import X.InterfaceC1364105Vn;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.business.audience.api.data.ProductCount;

/* JADX INFO: loaded from: classes.dex */
public interface AudienceProductCountApi {
    @InterfaceC1501160pAQ("/aweme/v1/oec/live/product/num")
    Object getProductsCount(@InterfaceC1501070pAH("room_id") String str, @InterfaceC1501070pAH("is_owner") boolean z, @InterfaceC1501070pAH("is_retry") boolean z2, InterfaceC1364105Vn<? super BaseResponse<ProductCount>> interfaceC1364105Vn);
}
