package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class IndependentPricingPaymentMethodInfo {

    @C09CT("card_bin")
    public final String cardBin;

    @C09CT("payment_method_id")
    public final String id;

    @C09CT("installment_info")
    public InstallmentInfo installmentInfo;

    @C09CT("installment_info_list")
    public List<InstallmentInfo> installmentInfoList;

    @C09CT("bnpl_and_hybrid_payment_interaction_style")
    public final Integer interactionStyle;

    @C09CT("is_choose_recommend")
    public Boolean isChooseRecommend;

    @C09CT("is_client_bind")
    public final Boolean isClientBind;

    @C09CT("is_installment")
    public final Boolean isInstallment;

    @C09CT("last_four")
    public final String lastFour;

    @C09CT("needs_independent_pricing")
    public final Boolean needsIndependentPricing;

    @C09CT("payment_price_version_id")
    public final String paymentPriceVersionId;

    @C09CT("payment_service_fee_info")
    public PaymentServiceFeeInfo paymentServiceFeeInfo;

    @C09CT("payment_unit_id")
    public final String paymentUnitId;

    @C09CT("promotion_info")
    public List<PaymentPromotion> promotionInfo;

    @C09CT("sub_payment_methods")
    public List<IndependentPricingPaymentMethodInfo> subPaymentMethods;

    @C09CT("payment_method_token")
    public String token;

    public IndependentPricingPaymentMethodInfo(String str, String str2, Boolean bool, List<IndependentPricingPaymentMethodInfo> list, List<PaymentPromotion> list2, PaymentServiceFeeInfo paymentServiceFeeInfo, InstallmentInfo installmentInfo, List<InstallmentInfo> list3, String str3, Boolean bool2, String str4, Boolean bool3, String str5, String str6, Boolean bool4, Integer num) {
        this.id = str;
        this.token = str2;
        this.isChooseRecommend = bool;
        this.subPaymentMethods = list;
        this.promotionInfo = list2;
        this.paymentServiceFeeInfo = paymentServiceFeeInfo;
        this.installmentInfo = installmentInfo;
        this.installmentInfoList = list3;
        this.paymentPriceVersionId = str3;
        this.needsIndependentPricing = bool2;
        this.paymentUnitId = str4;
        this.isInstallment = bool3;
        this.cardBin = str5;
        this.lastFour = str6;
        this.isClientBind = bool4;
        this.interactionStyle = num;
    }
}
