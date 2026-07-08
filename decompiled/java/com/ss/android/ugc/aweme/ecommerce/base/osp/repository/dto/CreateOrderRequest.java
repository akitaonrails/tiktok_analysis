package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C03O0;
import X.C09CT;
import X.C1019103yf;
import X.C2188811AlT;
import X.EnumC1014603xw;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CommuteType;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodPayInfo;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class CreateOrderRequest {
    public String LIZ;

    @C09CT("activity_ids")
    public final List<String> activityIds;

    @C09CT("add_on_product_ids")
    public final List<String> addOnProductIds;

    @C09CT("age_confirm_status")
    public Integer ageConfirmStatus;

    @C09CT("authorization_snap_info")
    public final EmailAuthorizationSnapInfo authorizationSnapInfo;

    @C09CT("bcm_chain")
    public final String bcmChain;

    @C09CT("bill_info_logid")
    public final String billInfoLogId;

    @C09CT("buy_type")
    public final int buyType;

    @C09CT("buyer_addr_id")
    public final String buyerAddrId;

    @C09CT("combo_id")
    public final String comboId;

    @C09CT("commute_type")
    public final CommuteType commuteType;

    @C09CT("cpf_elem")
    public final CpfElem cpfElem;

    @C09CT("create_order_info_from_bill")
    public final String createOrderInfoFromBill;

    @C09CT("deeplink")
    public final String deepLink;

    @C09CT("donation_info")
    public DonationInfo donationInfo;

    @C09CT("experiment")
    public final Map<String, Object> experiment;

    @C09CT("flow_type")
    public final Integer flowType;

    @C09CT("identity_info")
    public final IdentityInfo identityInfo;

    @C09CT("is_from_otp")
    public final Boolean isFromOtp;

    @C09CT("is_new_payment")
    public final Boolean isNewPayment;

    @C09CT("one_step_flow_page_type")
    public Integer oneStepFlowPageType;

    @C09CT("order_secret")
    public final String orderSecret;

    @C09CT("order_shop")
    public final List<OrderShopRequestParam> orderShop;

    @C09CT("__rd_tiktokec_verifier_scene_params__")
    public final OspScene ospScene;

    @C09CT("page_source_info")
    public final String pageSourceInfo;

    @C09CT("pay_request_id")
    public final String payRequestId;

    @C09CT("pay_risk_control_param")
    public final PayRiskControlParam payRiskControlParam;

    @C09CT("payment_extra")
    public final PaymentExtra paymentExtra;

    @C09CT("payment_method")
    public final PaymentMethodInfo paymentMethod;

    @C09CT("payment_method_combination")
    public final List<PaymentMethodPayInfo> paymentMethodCombination;

    @C09CT("payment_param")
    public final Map<String, String> paymentParam;

    @C09CT("payment_price_param")
    public String paymentPriceParam;

    @C09CT("pipo_error_code_params")
    public String pipoErrorCodeParams;

    @C09CT("post_order_diversion_params")
    public final PostOrderDiversionParams postOrderDiversionParams;

    @C09CT("post_order_schema_params")
    public final PostOrderSchemaParams postOrderSchemaParams;

    @C09CT("price_info")
    public final PriceInfoRequestParams priceInfo;

    @C09CT("redirect_url")
    public final String redirectUrl;

    @C09CT("refundable_sample_selected_status")
    public Integer refundableSampleSelectedStatus;

    @C09CT("retry_time")
    public final Integer retryTime;

    @C09CT("server_issued_params")
    public final String serverIssuedParams;

    @C09CT("shipping_address")
    public final Address shippingAddress;

    @C09CT("trace_id")
    public final String traceId;

    @C09CT("traffic_source_list")
    public final int[] trafficSourceList;

    @C09CT("use_bonus_redeem")
    public final Boolean useBonusRedeem;

    @C09CT("vouchers")
    public final List<Voucher> voucher;

    /* JADX WARN: Removed duplicated region for block: B:9:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZIZ(java.lang.String r2, boolean r3) {
        /*
            if (r2 != 0) goto L6
            if (r3 != 0) goto L1a
            r0 = 0
            return r0
        L6:
            java.util.HashMap r2 = X.C1741890vQh.LJIIJ(r2)
            if (r2 == 0) goto L1a
        Lc:
            if (r3 == 0) goto L15
            java.lang.String r1 = "skip_duplicated_order_check"
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r2.put(r1, r0)
        L15:
            java.lang.String r0 = X.C1741890vQh.LJIIIIZZ(r2)
            return r0
        L1a:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CreateOrderRequest.LIZIZ(java.lang.String, boolean):java.lang.String");
    }

    public static CreateOrderRequest LIZ(CreateOrderRequest createOrderRequest, String str, String str2) {
        return new CreateOrderRequest(createOrderRequest.traceId, createOrderRequest.orderShop, createOrderRequest.priceInfo, createOrderRequest.buyerAddrId, createOrderRequest.voucher, createOrderRequest.orderSecret, createOrderRequest.isNewPayment, createOrderRequest.paymentMethod, createOrderRequest.redirectUrl, createOrderRequest.deepLink, str, createOrderRequest.activityIds, createOrderRequest.buyType, createOrderRequest.payRiskControlParam, createOrderRequest.shippingAddress, createOrderRequest.commuteType, str2, createOrderRequest.isFromOtp, createOrderRequest.billInfoLogId, createOrderRequest.trafficSourceList, createOrderRequest.addOnProductIds, createOrderRequest.createOrderInfoFromBill, createOrderRequest.pageSourceInfo, createOrderRequest.cpfElem, createOrderRequest.payRequestId, createOrderRequest.useBonusRedeem, createOrderRequest.retryTime, createOrderRequest.experiment, createOrderRequest.paymentExtra, createOrderRequest.paymentMethodCombination, createOrderRequest.bcmChain, createOrderRequest.ospScene, createOrderRequest.authorizationSnapInfo, createOrderRequest.postOrderDiversionParams, createOrderRequest.identityInfo, createOrderRequest.flowType, createOrderRequest.paymentParam, createOrderRequest.pipoErrorCodeParams, createOrderRequest.postOrderSchemaParams, createOrderRequest.donationInfo, createOrderRequest.paymentPriceParam, createOrderRequest.refundableSampleSelectedStatus, createOrderRequest.ageConfirmStatus, createOrderRequest.oneStepFlowPageType);
    }

    public CreateOrderRequest(String str, List<OrderShopRequestParam> list, PriceInfoRequestParams priceInfoRequestParams, String str2, List<Voucher> list2, String str3, Boolean bool, PaymentMethodInfo paymentMethodInfo, String str4, String str5, String str6, List<String> list3, int i, PayRiskControlParam payRiskControlParam, Address address, CommuteType commuteType, String str7, Boolean bool2, String str8, int[] iArr, List<String> list4, String str9, String str10, CpfElem cpfElem, String str11, Boolean bool3, Integer num, Map<String, ? extends Object> map, PaymentExtra paymentExtra, List<PaymentMethodPayInfo> list5, String str12, OspScene ospScene, EmailAuthorizationSnapInfo emailAuthorizationSnapInfo, PostOrderDiversionParams postOrderDiversionParams, IdentityInfo identityInfo, Integer num2, Map<String, String> map2, String str13, PostOrderSchemaParams postOrderSchemaParams, DonationInfo donationInfo, String str14, Integer num3, Integer num4, Integer num5) {
        this.traceId = str;
        this.orderShop = list;
        this.priceInfo = priceInfoRequestParams;
        this.buyerAddrId = str2;
        this.voucher = list2;
        this.orderSecret = str3;
        this.isNewPayment = bool;
        this.paymentMethod = paymentMethodInfo;
        this.redirectUrl = str4;
        this.deepLink = str5;
        this.serverIssuedParams = str6;
        this.activityIds = list3;
        this.buyType = i;
        this.payRiskControlParam = payRiskControlParam;
        this.shippingAddress = address;
        this.commuteType = commuteType;
        this.comboId = str7;
        this.isFromOtp = bool2;
        this.billInfoLogId = str8;
        this.trafficSourceList = iArr;
        this.addOnProductIds = list4;
        this.createOrderInfoFromBill = str9;
        this.pageSourceInfo = str10;
        this.cpfElem = cpfElem;
        this.payRequestId = str11;
        this.useBonusRedeem = bool3;
        this.retryTime = num;
        this.experiment = map;
        this.paymentExtra = paymentExtra;
        this.paymentMethodCombination = list5;
        this.bcmChain = str12;
        this.ospScene = ospScene;
        this.authorizationSnapInfo = emailAuthorizationSnapInfo;
        this.postOrderDiversionParams = postOrderDiversionParams;
        this.identityInfo = identityInfo;
        this.flowType = num2;
        this.paymentParam = map2;
        this.pipoErrorCodeParams = str13;
        this.postOrderSchemaParams = postOrderSchemaParams;
        this.donationInfo = donationInfo;
        this.paymentPriceParam = str14;
        this.refundableSampleSelectedStatus = num3;
        this.ageConfirmStatus = num4;
        this.oneStepFlowPageType = num5;
        if (list == null || list.isEmpty()) {
            EnumC1014603xw enumC1014603xw = EnumC1014603xw.ERR24;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("orderShop is null ");
            sbLIZ.append(this);
            RuntimeException runtimeException = new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
            C03O0.LIZ.getClass();
            C1019103yf.LIZ(enumC1014603xw, runtimeException, C03O0.LIZIZ);
        }
    }
}
