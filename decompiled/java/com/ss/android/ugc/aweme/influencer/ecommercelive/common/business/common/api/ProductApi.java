package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.common.api;

import X.C0X9S;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501150pAP;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.broadcaster.beforelive.slot.preview.model.ProductNum;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.framework.network.BaseResponse;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public interface ProductApi {
    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/aweme/v1/oec/affiliate/live/product/del")
    C0X9S<BaseResponse<String>> deleteProducts(@InterfaceC1501150pAP Map<String, String> map);

    @InterfaceC1501160pAQ("/aweme/v1/oec/affiliate/live/product/num")
    C0X9S<BaseResponse<ProductNum>> getProductsCount(@InterfaceC1501070pAH("room_id") String str, @InterfaceC1501070pAH("is_owner") boolean z);
}
