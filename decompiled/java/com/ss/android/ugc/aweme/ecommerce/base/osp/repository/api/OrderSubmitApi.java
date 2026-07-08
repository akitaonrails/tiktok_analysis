package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.api;

import X.C03NA;
import X.C03NB;
import X.C03QD;
import X.C040F;
import X.C040I;
import X.C040J;
import X.C040K;
import X.C11NZ;
import X.C1515820pY4;
import X.C15O7;
import X.C859403Xk;
import X.C935103l7;
import X.C994803uk;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501240pAY;
import X.InterfaceC1501370pAl;
import com.ss.android.ugc.aweme.app.api.proto.ComposePbAndJson;
import com.ss.android.ugc.aweme.ecommerce.base.osp.preview.preload.dto.PreloadBillInfoRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.AddOnWriteImpressionRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.AddOnWriteImpressionResponse;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.AfterRenderRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRenderRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoResponse;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CancelOrderRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CancelOrderResponse;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CheckIdentityRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CheckIdentityResponse;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CheckLawfulRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CheckLawfulResponse;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CreateOrderRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.GetBillFlowTypeInfoRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PollOrderStatusRequest;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public interface OrderSubmitApi {
    public static final C859403Xk LIZ = C859403Xk.LIZ;

    @InterfaceC1501240pAY("/api/v1/trade/check_lawful")
    C11NZ<CheckLawfulResponse> LIZ(@C040I CheckLawfulRequest checkLawfulRequest);

    @InterfaceC1501240pAY("/api/v1/shop/bill_info/flow_type_info")
    C11NZ<C935103l7> LIZIZ(@C040I GetBillFlowTypeInfoRequest getBillFlowTypeInfoRequest);

    @InterfaceC1501240pAY("/api/v1/shop/identity/check")
    C11NZ<CheckIdentityResponse> LIZJ(@C040I CheckIdentityRequest checkIdentityRequest);

    @InterfaceC1501240pAY("/api/v1/shop/bill_info/render")
    Object LIZLLL(@C040I BillInfoRenderRequest billInfoRenderRequest, InterfaceC1364105Vn<? super C03QD> interfaceC1364105Vn);

    @InterfaceC1501240pAY("/api/v2/shop/bill_info/preload")
    C11NZ<BillInfoResponse> LJ(@C040I BillInfoRequest billInfoRequest);

    @InterfaceC1501240pAY("/api/v1/shop/recommend/impression/write")
    C11NZ<AddOnWriteImpressionResponse> LJFF(@C040I AddOnWriteImpressionRequest addOnWriteImpressionRequest);

    @InterfaceC1501240pAY("/api/v1/shop/bill_info/after_render")
    Object LJI(@C040I AfterRenderRequest afterRenderRequest, InterfaceC1364105Vn<Object> interfaceC1364105Vn);

    @InterfaceC1501240pAY("/api/v1/shop/bill_info/preload")
    C11NZ<BillInfoResponse> LJII(@C040I PreloadBillInfoRequest preloadBillInfoRequest);

    @InterfaceC1501240pAY("/api/v2/shop/bill_info/preload")
    @C040K
    C11NZ<ComposePbAndJson<C994803uk, BillInfoResponse>> LJIIIIZZ(@C040I BillInfoRequest billInfoRequest);

    @InterfaceC1501240pAY("/api/v1/shop/bill_info/preload")
    @C040K
    C11NZ<ComposePbAndJson<C994803uk, BillInfoResponse>> LJIIIZ(@C040I PreloadBillInfoRequest preloadBillInfoRequest);

    @InterfaceC1501240pAY("/api/v1/reverse/cancel_order")
    Object cancelOrder(@C040I CancelOrderRequest cancelOrderRequest, @C040F HashMap<String, String> map, InterfaceC1364105Vn<? super CancelOrderResponse> interfaceC1364105Vn);

    @InterfaceC1501240pAY("/api/v1/reverse/coupon_system_cancel_order")
    Object couponCancelOrder(@C040I CancelOrderRequest cancelOrderRequest, @C040F HashMap<String, String> map, InterfaceC1364105Vn<? super CancelOrderResponse> interfaceC1364105Vn);

    @InterfaceC1501240pAY("/api/v1/trade/order/create")
    C11NZ<C03NB> createOrder(@C040I CreateOrderRequest createOrderRequest, @C040F HashMap<String, String> map, @InterfaceC1501370pAl("x-gec-token") String str);

    @InterfaceC1501240pAY("/api/v1/shop/bill_info/get")
    C11NZ<BillInfoResponse> getBillInfo(@C040I BillInfoRequest billInfoRequest, @C040F HashMap<String, String> map);

    @C040J
    @InterfaceC1501240pAY("/api/v2/shop/bill_info/get")
    C15O7<C1515820pY4<BillInfoResponse>> getBillInfoByChunk(@C040I BillInfoRequest billInfoRequest, @C040F HashMap<String, String> map);

    @C040J
    @InterfaceC1501240pAY("/api/v2/shop/bill_info/get")
    C11NZ<C1515820pY4<BillInfoResponse>> getBillInfoByChunkObservable(@C040I BillInfoRequest billInfoRequest, @C040F HashMap<String, String> map);

    @C040J
    @InterfaceC1501240pAY("/api/v2/shop/bill_info/get")
    @C040K
    C15O7<C1515820pY4<ComposePbAndJson<C994803uk, BillInfoResponse>>> getBillInfoByChunkPb(@C040I BillInfoRequest billInfoRequest, @C040F HashMap<String, String> map);

    @C040J
    @InterfaceC1501240pAY("/api/v2/shop/bill_info/get")
    @C040K
    C11NZ<C1515820pY4<ComposePbAndJson<C994803uk, BillInfoResponse>>> getBillInfoByChunkPbObservable(@C040I BillInfoRequest billInfoRequest, @C040F HashMap<String, String> map);

    @InterfaceC1501240pAY("/api/v1/shop/express_bill_info/get")
    C11NZ<BillInfoResponse> getBillInfoForHalfPage(@C040I BillInfoRequest billInfoRequest, @C040F HashMap<String, String> map);

    @C040J
    @InterfaceC1501240pAY("/api/v2/shop/express_bill_info/get")
    C15O7<C1515820pY4<BillInfoResponse>> getBillInfoForHalfPageByChunk(@C040I BillInfoRequest billInfoRequest, @C040F HashMap<String, String> map);

    @C040J
    @InterfaceC1501240pAY("/api/v2/shop/express_bill_info/get")
    C11NZ<C1515820pY4<BillInfoResponse>> getBillInfoForHalfPageByChunkObservable(@C040I BillInfoRequest billInfoRequest, @C040F HashMap<String, String> map);

    @C040J
    @InterfaceC1501240pAY("/api/v2/shop/express_bill_info/get")
    @C040K
    C15O7<C1515820pY4<ComposePbAndJson<C994803uk, BillInfoResponse>>> getBillInfoForHalfPageByChunkPb(@C040I BillInfoRequest billInfoRequest, @C040F HashMap<String, String> map);

    @InterfaceC1501240pAY("/api/v2/shop/express_bill_info/get")
    C11NZ<C1515820pY4<ComposePbAndJson<C994803uk, BillInfoResponse>>> getBillInfoForHalfPageByChunkPbObservable(@C040I BillInfoRequest billInfoRequest, @C040F HashMap<String, String> map);

    @InterfaceC1501240pAY("/api/v1/shop/express_bill_info/get")
    @C040K
    C11NZ<ComposePbAndJson<C994803uk, BillInfoResponse>> getBillInfoForHalfPagePb(@C040I BillInfoRequest billInfoRequest, @C040F HashMap<String, String> map);

    @InterfaceC1501240pAY("/api/v1/shop/bill_info/get")
    @C040K
    C11NZ<ComposePbAndJson<C994803uk, BillInfoResponse>> getBillInfoPb(@C040I BillInfoRequest billInfoRequest, @C040F HashMap<String, String> map);

    @InterfaceC1501240pAY("/api/v1/trade/order/status/poll")
    C11NZ<C03NA> pollOrderStatus(@C040I PollOrderStatusRequest pollOrderStatusRequest, @C040F HashMap<String, String> map);
}
