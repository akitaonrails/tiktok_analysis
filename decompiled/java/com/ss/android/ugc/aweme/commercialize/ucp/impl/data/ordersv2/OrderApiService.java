package com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2;

import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501130pAN;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC2174708fZ;
import X.InterfaceC2175608fi;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public interface OrderApiService {
    @InterfaceC1501170pAR
    Object createOrder(@InterfaceC2174708fZ String str, @InterfaceC2175608fi Map<String, String> map, @InterfaceC1485405rg ShopOrderCreateRequestBody shopOrderCreateRequestBody, InterfaceC1364105Vn<? super ShopOrderCreateResponseModel> interfaceC1364105Vn);

    @InterfaceC1501160pAQ
    Object getOrderList(@InterfaceC2174708fZ String str, @InterfaceC2175608fi Map<String, String> map, @InterfaceC1501130pAN Map<String, Object> map2, InterfaceC1364105Vn<? super ShopOrderListResponseModel> interfaceC1364105Vn);
}
