package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.api;

import X.C040I;
import X.C0X52;
import X.C11NZ;
import X.C877403bo;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501120pAM;
import X.InterfaceC1501200pAU;
import X.InterfaceC1501240pAY;
import X.InterfaceC1501300pAe;
import X.InterfaceC1501370pAl;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.combinepayment.payment.dto.RiskContextRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.MembershipPreCheckPaymentRiskRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.MembershipPreCheckPaymentRiskResponse;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BalanceResponseData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BindInfoRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BindInfoResponseData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BindStatusRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BindStatusResponseData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CalcPaymentMethodPriceData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CalcPaymentMethodPriceRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ListPaymentMethodRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ListPaymentMethodResp;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PayRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PayResponseData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentListRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentListResponseData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentPreBindRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentPreBindResponse;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PiPoResponse;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.SetPrimaryPIRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.SetPrimaryVerifyResponse;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.UnbindPaymentMethodRequest;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.BalanceRequest;
import kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
public interface PaymentApi {
    public static final C877403bo LIZ = C877403bo.LIZ;

    @InterfaceC1501240pAY("/api/v1/pay/pre_bind_verify")
    Object LIZ(@C040I PaymentPreBindRequest paymentPreBindRequest, InterfaceC1364105Vn<? super Response<PaymentPreBindResponse>> interfaceC1364105Vn);

    @InterfaceC1501240pAY("/api/v1/trade/pay_method/get_bind_status")
    C11NZ<Response<BindStatusResponseData>> LIZIZ(@C040I BindStatusRequest bindStatusRequest);

    @InterfaceC1501240pAY("/api/v1/trade/order/calc_payment_method_price")
    Object LIZJ(@C040I CalcPaymentMethodPriceRequest calcPaymentMethodPriceRequest, InterfaceC1364105Vn<? super Response<CalcPaymentMethodPriceData>> interfaceC1364105Vn);

    @InterfaceC1501240pAY("/api/v1/pay/save_primary_payment_method")
    Object LIZLLL(@C040I SetPrimaryPIRequest setPrimaryPIRequest, InterfaceC1364105Vn<? super Response<SetPrimaryVerifyResponse>> interfaceC1364105Vn);

    @InterfaceC1501240pAY("/api/v1/trade/order/payment_list")
    C11NZ<Response<PaymentListResponseData>> LJ(@C040I PaymentListRequest paymentListRequest);

    @InterfaceC1501240pAY("/api/v1/trade/order/payment_method_bind_info")
    C11NZ<Response<BindInfoResponseData>> LJFF(@C040I BindInfoRequest bindInfoRequest);

    @InterfaceC1501240pAY("/api/v1/trade/order/pay")
    C11NZ<C0X52<Response<PayResponseData>>> LJI(@C040I PayRequest payRequest);

    @InterfaceC1501200pAU("/api/v1/trade/order/pay_result/query")
    Object LJII(@InterfaceC1501120pAM("order_id") String str, @InterfaceC1501120pAM("combo_id") String str2, @InterfaceC1501120pAM("api_version") int i, @InterfaceC1501120pAM("shop_tab_ab") Object obj, @InterfaceC1501120pAM("pay_to_mall_tab") Object obj2, @InterfaceC1501120pAM("pay_to_mall_source") Object obj3, @InterfaceC1501120pAM("back_btn_disable") Object obj4, @InterfaceC1501120pAM("pay_to_mall_scroll_to_feed_enable") Object obj5, @InterfaceC1501120pAM("source_info") Iterable<String> iterable, @InterfaceC1501120pAM("traffic_source_list") String str3, InterfaceC1364105Vn<? super n> interfaceC1364105Vn);

    @InterfaceC1501240pAY("/api/v1/pay/method/list_payment_method")
    C11NZ<Response<ListPaymentMethodResp>> LJIIIIZZ(@C040I ListPaymentMethodRequest listPaymentMethodRequest);

    @InterfaceC1501240pAY("/api/v1/trade/pay_method/get_balance")
    C11NZ<Response<BalanceResponseData>> LJIIIZ(@C040I BalanceRequest balanceRequest);

    @InterfaceC1501240pAY("/api/v1/pay/method/list_payment_method")
    C11NZ<String> LJIIJ(@C040I ListPaymentMethodRequest listPaymentMethodRequest);

    @InterfaceC1501240pAY("/api/v1/pay/unbind_payment_method")
    C11NZ<Response<Unit>> LJIIJJI(@C040I UnbindPaymentMethodRequest unbindPaymentMethodRequest);

    @InterfaceC1501240pAY("/api/v1/pay/get_risk_decision")
    Object LJIIL(@C040I MembershipPreCheckPaymentRiskRequest membershipPreCheckPaymentRiskRequest, InterfaceC1364105Vn<? super Response<MembershipPreCheckPaymentRiskResponse>> interfaceC1364105Vn);

    @InterfaceC1501240pAY("/payment/v1/risk_context")
    C11NZ<PiPoResponse> LJIILIIL(@C040I RiskContextRequest riskContextRequest, @InterfaceC1501370pAl("Referer") String str);

    @InterfaceC1501240pAY("/payment/v1/risk/get_appeal_authorization")
    @InterfaceC1501300pAe
    Object paymentAppeal(@InterfaceC1501050pAF("biz_content") String str, @InterfaceC1501050pAF("merchant_id") String str2, @InterfaceC1501050pAF("request_time") String str3, @InterfaceC1501050pAF("sign") String str4, @InterfaceC1501050pAF("nonce") String str5, InterfaceC1364105Vn<? super PiPoResponse> interfaceC1364105Vn);

    @InterfaceC1501240pAY("/payment/v1/store_payment_method")
    @InterfaceC1501300pAe
    Object paymentBindAndSetPrimarySuspendForm(@InterfaceC1501050pAF("merchant_id") String str, @InterfaceC1501050pAF("request_time") String str2, @InterfaceC1501050pAF("sign") String str3, @InterfaceC1501050pAF("biz_content") String str4, @InterfaceC1501050pAF("nonce") String str5, InterfaceC1364105Vn<? super PiPoResponse> interfaceC1364105Vn);

    @InterfaceC1501240pAY("/cashier/v1/authen_pre_risk")
    @InterfaceC1501300pAe
    Object paymentPreBindVerify(@InterfaceC1501050pAF("merchant_id") String str, @InterfaceC1501050pAF("request_time") String str2, @InterfaceC1501050pAF("sign") String str3, @InterfaceC1501050pAF("biz_content") String str4, @InterfaceC1501050pAF("nonce") String str5, InterfaceC1364105Vn<? super PiPoResponse> interfaceC1364105Vn);
}
