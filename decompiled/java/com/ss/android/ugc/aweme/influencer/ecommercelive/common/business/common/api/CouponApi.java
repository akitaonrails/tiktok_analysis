package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.common.api;

import X.C594160NSc;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501170pAR;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.framework.network.BaseResponse;

/* JADX INFO: loaded from: classes10.dex */
public interface CouponApi {
    public static final C594160NSc LIZ = C594160NSc.LIZ;

    @InterfaceC1501170pAR("/api/v1/shop/marketing_interactive/task/stop_pre")
    Object stopPreTask(InterfaceC1364105Vn<? super BaseResponse<String>> interfaceC1364105Vn);
}
