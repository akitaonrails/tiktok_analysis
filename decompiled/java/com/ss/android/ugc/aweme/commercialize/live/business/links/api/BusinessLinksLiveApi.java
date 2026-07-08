package com.ss.android.ugc.aweme.commercialize.live.business.links.api;

import X.AbstractC19484711Kz;
import X.C11NZ;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.commercialize.live.business.links.model.BusinessLinksCountResponse;

/* JADX INFO: loaded from: classes13.dex */
public interface BusinessLinksLiveApi {
    @InterfaceC1501170pAR("/aweme/v1/ad/ba/business/link/active/clear/")
    AbstractC19484711Kz<BaseResponse> clearBusinessLinksCards();

    @InterfaceC1501160pAQ("/aweme/v1/ad/ba/business/link/active/count/")
    C11NZ<BusinessLinksCountResponse> getActiveLinksCount();
}
