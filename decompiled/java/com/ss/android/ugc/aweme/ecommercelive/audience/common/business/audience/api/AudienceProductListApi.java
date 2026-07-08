package com.ss.android.ugc.aweme.ecommercelive.audience.common.business.audience.api;

import X.C0X9S;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.business.audience.api.data.FansPopUpDatas;

/* JADX INFO: loaded from: classes.dex */
public interface AudienceProductListApi {
    @InterfaceC1501160pAQ("/aweme/v1/oec/live/popup/prebuy/get")
    C0X9S<BaseResponse<FansPopUpDatas>> getFansPopUp(@InterfaceC1501070pAH("source") int i, @InterfaceC1501070pAH("room_id") String str, @InterfaceC1501070pAH("anchor_id") String str2, @InterfaceC1501070pAH("product_ids") String str3);
}
