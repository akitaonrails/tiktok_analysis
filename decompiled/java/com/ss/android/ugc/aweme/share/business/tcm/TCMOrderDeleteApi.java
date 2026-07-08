package com.ss.android.ugc.aweme.share.business.tcm;

import X.C11NZ;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: loaded from: classes.dex */
public interface TCMOrderDeleteApi {
    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/aweme/v1/commerce/tcm/item/delete/apply/")
    C11NZ<BaseResponse> applyDeleteTCMOrder(@InterfaceC1501050pAF("order_id") String str, @InterfaceC1501050pAF("item_id") String str2);

    @InterfaceC1501160pAQ("/aweme/v1/commerce/tcm/item/delete/status/")
    C11NZ<CheckTCMOrderDeleteStatusResp> checkTCMOrderDeleteStatus(@InterfaceC1501070pAH("order_id") String str, @InterfaceC1501070pAH("item_id") String str2);
}
