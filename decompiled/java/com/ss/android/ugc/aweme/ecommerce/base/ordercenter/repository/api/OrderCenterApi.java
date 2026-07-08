package com.ss.android.ugc.aweme.ecommerce.base.ordercenter.repository.api;

import X.C05WQ;
import X.C0X52;
import X.C11NZ;
import X.InterfaceC1485405rg;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import com.bytedance.retrofit2.mime.TypedInput;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;

/* JADX INFO: loaded from: classes3.dex */
public interface OrderCenterApi {
    public static final C05WQ LIZ = C05WQ.LIZ;

    @InterfaceC1501170pAR("/api/v1/aftersale/list_order/get")
    C11NZ<C0X52<TypedInput>> getGlobalOrderList(@InterfaceC1485405rg ListOrderRequest listOrderRequest);

    @InterfaceC1501170pAR("/api/v1/trade/order_center/get")
    C11NZ<C0X52<Response<Object>>> getOrderCenter(@InterfaceC1501070pAH("experiment_version") String str, @InterfaceC1501070pAH("previous_page") String str2);

    @InterfaceC1501160pAQ("/api/v1/trade/list_order/get")
    C11NZ<C0X52<TypedInput>> getOrderList(@InterfaceC1501070pAH("cursor") int i, @InterfaceC1501070pAH("tab") Integer num, @InterfaceC1501070pAH("size") int i2, @InterfaceC1501070pAH("is_new_return_entrance") boolean z, @InterfaceC1501070pAH("index") String str, @InterfaceC1501070pAH("is_new_payment") boolean z2, @InterfaceC1501070pAH("is_prefetch") boolean z3, @InterfaceC1501070pAH("version") int i3);
}
