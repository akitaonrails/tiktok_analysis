package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.highlights.repo;

import X.C0X52;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.highlights.model.HighlightResponseData;

/* JADX INFO: loaded from: classes10.dex */
public interface HighlightsNetApi {
    @InterfaceC1501170pAR("/aweme/v1/oec/live/setting/change")
    Object changeLiveSetting(@InterfaceC1485405rg ChangeLiveSettingRequest changeLiveSettingRequest, InterfaceC1364105Vn<? super C0X52<Response<Object>>> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/api/live_creator/v1/highlight/get")
    Object highlightList(@InterfaceC1501070pAH("author_id") String str, @InterfaceC1501070pAH("offset") int i, InterfaceC1364105Vn<? super C0X52<Response<HighlightResponseData>>> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/aweme/v1/oec/live/highlight/report")
    Object reportPinCardClick(@InterfaceC1485405rg ReportPinCardClickRequest reportPinCardClickRequest, InterfaceC1364105Vn<? super C0X52<Response<Object>>> interfaceC1364105Vn);
}
