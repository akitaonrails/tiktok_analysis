package com.ss.android.ugc.aweme.minis.model.payment;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: loaded from: classes20.dex */
public final class MinisCreateOrderResponse extends BaseResponse {

    @C09CT("is_sandbox")
    public final boolean isSandbox;

    @C09CT("iap_payload")
    public final String iapPayLoad = "";

    @C09CT("web_payload")
    public final String webPayLoad = "";

    @C09CT("trade_order_id")
    public final String tradeOrderId = "";

    @C09CT("web_redirect_url")
    public final String webRedirectUrl = "";
}
