package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import java.util.List;
import kotlin.jvm.internal.AFwS185S0000000_1;

/* JADX INFO: loaded from: classes2.dex */
public final class EcPaymentIndependentPriceConfigSettings {
    public static final PaymentPricingModel LIZ = new PaymentPricingModel(Boolean.TRUE, Boolean.TRUE, Boolean.TRUE, Boolean.FALSE, 10000, Boolean.TRUE, Boolean.TRUE, Boolean.TRUE, Boolean.FALSE, Boolean.FALSE, Boolean.TRUE, null, Boolean.FALSE, Boolean.TRUE);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS185S0000000_1.get$arr$(56));

    public static PaymentPricingModel LIZJ() {
        return (PaymentPricingModel) LIZIZ.getValue();
    }

    public static boolean LIZ() {
        Boolean bool;
        return LIZIZ() && (bool = LIZJ().supportFallbackPaymentSummary) != null && bool.booleanValue();
    }

    public static boolean LIZIZ() {
        Boolean bool = LIZJ().supportIndependentPricing;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public static final class PaymentPricingModel {

        @C09CT("cashier_cci_installment_separate_select")
        public final Boolean cashierSupportSeparateSelect;

        @C09CT("check_and_refresh_origin_data")
        public final Boolean checkAndRefreshOriginData;

        @C09CT("only_update_latest_request")
        public final Boolean onlyUpdateLatestRequest;

        @C09CT("request_timeout")
        public final long requestTimeOut;

        @C09CT("sec_pay_silent_loading")
        public final Boolean secPaySilentLoading;

        @C09CT("sec_pay_silent_pricing_request")
        public final Boolean secPaySilentPricingRequest;

        @C09CT("second_cache_fake_bind_pm_list")
        public final List<String> secondCacheFakeBindPmList;

        @C09CT("silent_loading")
        public final Boolean silentLoading;

        @C09CT("silent_pricing_request")
        public final Boolean silentPricingRequest;

        @C09CT("support_anchor_installment_refresh")
        public final Boolean supportAnchorInstallmentRefresh;

        @C09CT("support_fallback_payment_summary")
        public final Boolean supportFallbackPaymentSummary;

        @C09CT("support_independent_pricing")
        public final Boolean supportIndependentPricing;

        @C09CT("support_new_card_calculation")
        public final Boolean supportNewCardCalculation;

        @C09CT("support_new_ccdc_card_calculation")
        public final Boolean supportNewCcdcCardCalculation;

        public PaymentPricingModel() {
            this(Boolean.TRUE, Boolean.TRUE, Boolean.TRUE, Boolean.FALSE, 10000L, Boolean.TRUE, Boolean.TRUE, Boolean.TRUE, Boolean.FALSE, Boolean.FALSE, Boolean.TRUE, null, Boolean.FALSE, Boolean.TRUE);
        }

        public PaymentPricingModel(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, long j, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, List<String> list, Boolean bool11, Boolean bool12) {
            this.supportIndependentPricing = bool;
            this.supportNewCardCalculation = bool2;
            this.silentPricingRequest = bool3;
            this.supportFallbackPaymentSummary = bool4;
            this.requestTimeOut = j;
            this.checkAndRefreshOriginData = bool5;
            this.cashierSupportSeparateSelect = bool6;
            this.secPaySilentPricingRequest = bool7;
            this.secPaySilentLoading = bool8;
            this.silentLoading = bool9;
            this.onlyUpdateLatestRequest = bool10;
            this.secondCacheFakeBindPmList = list;
            this.supportNewCcdcCardCalculation = bool11;
            this.supportAnchorInstallmentRefresh = bool12;
        }
    }
}
