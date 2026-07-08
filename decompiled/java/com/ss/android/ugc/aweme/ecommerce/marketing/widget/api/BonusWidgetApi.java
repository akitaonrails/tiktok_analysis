package com.ss.android.ugc.aweme.ecommerce.marketing.widget.api;

import X.InterfaceC1364105Vn;
import X.InterfaceC1501170pAR;
import com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse;

/* JADX INFO: loaded from: classes10.dex */
public interface BonusWidgetApi {
    @InterfaceC1501170pAR("/api/v1/promotion_bonus/page/get_bonus_widget")
    Object fetch(InterfaceC1364105Vn<? super BaseResponse<BonusWidgetDataResponse>> interfaceC1364105Vn);
}
