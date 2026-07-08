package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.common.api;

import X.C0X9S;
import X.InterfaceC1501160pAQ;
import com.google.gson.n;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.framework.network.BaseResponse;

/* JADX INFO: loaded from: classes10.dex */
public interface RouteStatusApi {
    @InterfaceC1501160pAQ("/api/v1/affiliate/account/route_status")
    C0X9S<BaseResponse<n>> getStatus();
}
