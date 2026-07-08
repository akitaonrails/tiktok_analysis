package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.common.api;

import X.AnonymousClass1880;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import com.google.gson.n;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.common.data.QuickProductCheck;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.framework.network.BaseResponse;

/* JADX INFO: loaded from: classes18.dex */
public interface EcAnchorApi {
    public static final AnonymousClass1880 LIZ = AnonymousClass1880.LIZ;

    @InterfaceC1501160pAQ("/aweme/v1/oec/live/quick_product/check")
    Object checkQuickProductAvailable(@InterfaceC1501070pAH("room_id") String str, InterfaceC1364105Vn<? super BaseResponse<QuickProductCheck>> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/instant/api/v1/product/product_creation/preload")
    Object preloadCreation(InterfaceC1364105Vn<? super BaseResponse<n>> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/aweme/v1/oec/live/short_touch/refresh")
    Object refreshShortTouch(@InterfaceC1485405rg RefreshShortTouchRequestBody refreshShortTouchRequestBody, InterfaceC1364105Vn<? super BaseResponse<RefreshShortTouchResponse>> interfaceC1364105Vn);
}
