package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PayRiskControlParam;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PaymentExtra;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Summary;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class PayRequest {
    public static final /* synthetic */ int LIZ = 0;

    @C09CT("combo_Id")
    public final String comboId;

    @C09CT("commute_type")
    public final CommuteType commuteType;

    @C09CT("deeplink")
    public final String deepLink;

    @C09CT("entrance_scene")
    public Integer entranceScene;

    @C09CT("experiment")
    public final Map<String, Object> experiment;

    @C09CT("is_from_otp")
    public final Boolean isFromOtp;

    @C09CT("is_new_payment")
    public final Boolean isNewPayment;

    @C09CT("last_pay_order_id")
    public final String lastPayOrderId;

    @C09CT("order_ids")
    public final List<String> orderIds;

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
    public Map<String, String> paymentParam;

    @C09CT("payment_price_param")
    public String paymentPriceParam;

    @C09CT("pipo_error_code_params")
    public String pipoErrorCodeParams;

    @C09CT("pay_success_schema_params")
    public final PaySuccessSchemaParams postOrderSchemaParams;

    @C09CT("price_info")
    public final Summary priceInfo;

    @C09CT("redirect_url")
    public final String redirectUrl;

    @C09CT("server_issued_params")
    public final String serverIssuedParams;

    public PayRequest(String str, List<String> list, Boolean bool, PaymentMethodInfo paymentMethodInfo, String str2, String str3, PayRiskControlParam payRiskControlParam, CommuteType commuteType, String str4, Boolean bool2, String str5, Summary summary, List<PaymentMethodPayInfo> list2, String str6, PaymentExtra paymentExtra, Map<String, ? extends Object> map, String str7, Integer num, String str8, Map<String, String> map2, PaySuccessSchemaParams paySuccessSchemaParams) {
        this.comboId = str;
        this.orderIds = list;
        this.isNewPayment = bool;
        this.paymentMethod = paymentMethodInfo;
        this.redirectUrl = str2;
        this.deepLink = str3;
        this.payRiskControlParam = payRiskControlParam;
        this.commuteType = commuteType;
        this.serverIssuedParams = str4;
        this.isFromOtp = bool2;
        this.payRequestId = str5;
        this.priceInfo = summary;
        this.paymentMethodCombination = list2;
        this.lastPayOrderId = str6;
        this.paymentExtra = paymentExtra;
        this.experiment = map;
        this.pipoErrorCodeParams = str7;
        this.entranceScene = num;
        this.paymentPriceParam = str8;
        this.paymentParam = map2;
        this.postOrderSchemaParams = paySuccessSchemaParams;
    }
}
