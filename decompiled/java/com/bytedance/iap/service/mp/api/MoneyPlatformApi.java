package com.bytedance.iap.service.mp.api;

import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.bytedance.iap.service.mp.model.CreateOrderRequest;
import com.bytedance.iap.service.mp.model.CreateOrderResponse;
import com.bytedance.iap.service.mp.model.IAPStoreSubRequest;
import com.bytedance.iap.service.mp.model.IAPStoreSubResponse;
import com.bytedance.iap.service.mp.model.MoneyV1ActiveContractResponse;
import com.bytedance.iap.service.mp.model.MoneyV1NextAvailableSKUsRequest;
import com.bytedance.iap.service.mp.model.MoneyV1NextAvailableSKUsResponse;
import com.bytedance.iap.service.mp.model.OrderStateResponse;

/* JADX INFO: loaded from: classes28.dex */
public interface MoneyPlatformApi {
    @InterfaceC1501170pAR("/money/iap/v1/store_sub_purchases")
    Object checkStoreSubStatus(@InterfaceC1485405rg IAPStoreSubRequest iAPStoreSubRequest, InterfaceC1364105Vn<? super IAPStoreSubResponse> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/money/v1/iap/pay")
    Object createOrder(@InterfaceC1485405rg CreateOrderRequest createOrderRequest, InterfaceC1364105Vn<? super CreateOrderResponse> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/money/v1/contract/active_contract/")
    Object getContractStatus(@InterfaceC1501070pAH("mid") String str, @InterfaceC1501070pAH("from_user_id") long j, @InterfaceC1501070pAH("sub_merchant_id") String str2, @InterfaceC1501070pAH("to_user_id") long j2, InterfaceC1364105Vn<? super MoneyV1ActiveContractResponse> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/money/v1/contract/next_available_skus/")
    Object getNextAvailableSKUs(@InterfaceC1485405rg MoneyV1NextAvailableSKUsRequest moneyV1NextAvailableSKUsRequest, InterfaceC1364105Vn<? super MoneyV1NextAvailableSKUsResponse> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/pipo/inner/order/query/v1")
    Object queryOrderStatus(@InterfaceC1501070pAH("merchant_id") String str, @InterfaceC1501070pAH("request_id") String str2, @InterfaceC1501070pAH("payment_method") String str3, @InterfaceC1501070pAH("channel_order_id") String str4, InterfaceC1364105Vn<? super OrderStateResponse> interfaceC1364105Vn);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/pipo/inner/receipt/v1")
    Object uploadToken(@InterfaceC1501050pAF("merchant_id") String str, @InterfaceC1501050pAF("biz_content") String str2, @InterfaceC1501050pAF("timestamp") String str3, @InterfaceC1501050pAF("client_flow") String str4, @InterfaceC1501050pAF("payment_scenario") String str5, InterfaceC1364105Vn<? super OrderStateResponse> interfaceC1364105Vn);
}
