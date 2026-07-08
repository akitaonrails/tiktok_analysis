package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.productlist.repository;

import X.C0X52;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.productlist.data.BroadcasterProductsData;

/* JADX INFO: loaded from: classes27.dex */
public interface BroadcasterProductListApi {
    @InterfaceC1501160pAQ("/aweme/v1/oec/affiliate/live/product/list")
    Object getBroadcasterProductList(@InterfaceC1501070pAH("room_id") long j, @InterfaceC1501070pAH("is_owner") boolean z, @InterfaceC1501070pAH("kol_id") String str, InterfaceC1364105Vn<? super C0X52<Response<BroadcasterProductsData>>> interfaceC1364105Vn);
}
