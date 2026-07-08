package com.ss.android.ugc.aweme.ecommerce.mall.customdot.repository;

import X.C0X52;
import X.C1768840w8A;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501120pAM;
import X.InterfaceC1501240pAY;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.CustomDotGetParams;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.CustomDotGetParamsV2;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.CustomDotResponseV2;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.CustomDotUpdateParams;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.CustomDotUpdateParamsV2;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.ShopReachControlGetParams;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.ShopReachControlResponse;

/* JADX INFO: loaded from: classes27.dex */
public interface CustomDotApi {
    public static final C1768840w8A LIZ = C1768840w8A.LIZ;

    @InterfaceC1501240pAY("api/v1/mall/shop_tab/algorithm/reach/get")
    Object shopAlgorithmReachGet(@InterfaceC1485405rg CustomDotGetParamsV2 customDotGetParamsV2, @InterfaceC1501120pAM("mock_status") String str, @InterfaceC1501120pAM("mock_time") String str2, @InterfaceC1501120pAM("mock_extra") String str3, InterfaceC1364105Vn<? super C0X52<Response<CustomDotResponseV2>>> interfaceC1364105Vn);

    @InterfaceC1501240pAY("api/v1/mall/shop_tab/algorithm/reach/update")
    Object shopAlgorithmReachUpdate(@InterfaceC1485405rg CustomDotUpdateParamsV2 customDotUpdateParamsV2, InterfaceC1364105Vn<? super C0X52<Response<CustomDotResponseV2>>> interfaceC1364105Vn);

    @InterfaceC1501240pAY("/api/v1/mall/shop_tab/delivery_landing/get")
    Object shopDeliveryLandingGet(@InterfaceC1485405rg CustomDotGetParamsV2 customDotGetParamsV2, @InterfaceC1501120pAM("mock_status") String str, @InterfaceC1501120pAM("mock_time") String str2, @InterfaceC1501120pAM("mock_extra") String str3, InterfaceC1364105Vn<? super C0X52<Response<CustomDotResponseV2>>> interfaceC1364105Vn);

    @InterfaceC1501240pAY("api/v1/shop_tab/reach/control/get")
    Object shopReachControlGet(@InterfaceC1485405rg ShopReachControlGetParams shopReachControlGetParams, InterfaceC1364105Vn<? super C0X52<Response<ShopReachControlResponse>>> interfaceC1364105Vn);

    @InterfaceC1501240pAY("api/v1/mall/shop_tab/reach/get")
    Object shopReachGet(@InterfaceC1485405rg CustomDotGetParams customDotGetParams, InterfaceC1364105Vn<? super C0X52<Response<Object>>> interfaceC1364105Vn);

    @InterfaceC1501240pAY("api/v2/mall/shop_tab/reach/get")
    Object shopReachGetV2(@InterfaceC1485405rg CustomDotGetParamsV2 customDotGetParamsV2, @InterfaceC1501120pAM("mock_status") String str, @InterfaceC1501120pAM("mock_time") String str2, @InterfaceC1501120pAM("mock_extra") String str3, InterfaceC1364105Vn<? super C0X52<Response<CustomDotResponseV2>>> interfaceC1364105Vn);

    @InterfaceC1501240pAY("api/v1/mall/shop_tab/reach/update")
    Object shopReachUpdate(@InterfaceC1485405rg CustomDotUpdateParams customDotUpdateParams, InterfaceC1364105Vn<? super C0X52<Response<Object>>> interfaceC1364105Vn);

    @InterfaceC1501240pAY("api/v2/mall/shop_tab/reach/update")
    Object shopReachUpdateV2(@InterfaceC1485405rg CustomDotUpdateParamsV2 customDotUpdateParamsV2, InterfaceC1364105Vn<? super C0X52<Response<CustomDotResponseV2>>> interfaceC1364105Vn);

    @InterfaceC1501240pAY("/api/v1/shop/recommend/impression/write")
    Object shopTabRecImpression(@InterfaceC1485405rg n nVar, InterfaceC1364105Vn<? super C0X52<Response<Object>>> interfaceC1364105Vn);
}
