package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab;

import X.C01GW;
import X.C09CT;
import X.C13LP;
import X.C452501pT;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AFwS185S0000000_1;

/* JADX INFO: loaded from: classes2.dex */
public final class EcPaymentIndependentPriceDefaultConfig {
    public static final PaymentPricingDefaultConfig LIZ;
    public static final C01GW LIZIZ;

    static {
        Boolean bool = Boolean.TRUE;
        Boolean bool2 = Boolean.FALSE;
        LIZ = new PaymentPricingDefaultConfig(15000L, "@@##@@", bool, bool2, bool, bool, bool2, bool, bool, bool, Collections.singletonList("pm_pi_cci_all"), 8, bool, bool, bool, bool, bool, bool, bool, Collections.singletonList("pm_pi_ins_pipobnpl_c_d"), bool, bool);
        LIZIZ = C452501pT.LIZIZ(AFwS185S0000000_1.get$arr$(57));
    }

    public static PaymentPricingDefaultConfig LIZJ() {
        return (PaymentPricingDefaultConfig) LIZIZ.getValue();
    }

    public static boolean LIZIZ() {
        Boolean bool = LIZJ().enableTrack;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public static String LIZLLL() {
        String str = LIZJ().paymentUnitIdDivider;
        return str == null ? "@@##@@" : str;
    }

    public static boolean LIZ(PaymentMethod paymentMethod) {
        List<String> list;
        if (paymentMethod == null || !EcPaymentIndependentPriceConfigSettings.LIZIZ()) {
            return false;
        }
        Boolean bool = EcPaymentIndependentPriceConfigSettings.LIZJ().supportAnchorInstallmentRefresh;
        if ((bool != null && !bool.booleanValue()) || (list = LIZJ().enableSecondCacheAnchorPmLis) == null || !C13LP.LJJJJ(paymentMethod.id, list)) {
            return false;
        }
        return true;
    }

    public static final class PaymentPricingDefaultConfig {

        @C09CT("add_card_wait_time")
        public final Long addCardWaitTime;

        @C09CT("card_bin_length")
        public final Integer cardBinLength;

        @C09CT("clear_independent_data")
        public final Boolean clearIndependentData;

        @C09CT("disable_request_focus")
        public final Boolean disableRequestFocus;

        @C09CT("enable_debug_track")
        public final Boolean enableDebugTrack;

        @C09CT("enable_second_cache_anchor_pm_list")
        public final List<String> enableSecondCacheAnchorPmLis;

        @C09CT("enable_sort_installment")
        public final Boolean enableSortInstallment;

        @C09CT("enable_tenure_price_text")
        public final Boolean enableTenurePriceText;

        @C09CT("enable_track")
        public final Boolean enableTrack;

        @C09CT("filter_recommend_pm")
        public final Boolean filterRecommendPm;

        @C09CT("filter_sub_payment_methods")
        public final Boolean filterSubPaymentMethods;

        @C09CT("filter_unavailable_anchor_pm")
        public final Boolean filterUnavailableAnchorPm;

        @C09CT("filter_unavailable_pm")
        public final Boolean filterUnavailablePm;

        @C09CT("force_refresh_installment")
        public final Boolean forceRefreshInstallment;

        @C09CT("force_update_unit_and_price_id")
        public final Boolean forceUpdateUnitAndPriceId;

        @C09CT("payment_unit_id_divider")
        public final String paymentUnitIdDivider;

        @C09CT("rewrite_is_installment")
        public final Boolean reWriteIsInstallment;

        @C09CT("show_payment_tips_pm_list")
        public final List<String> showPaymentTipsPmList;

        @C09CT("sort_unavailable_pm")
        public final Boolean sortUnavailablePm;

        @C09CT("update_availability")
        public final Boolean updateAvailability;

        @C09CT("update_payment_price_id")
        public final Boolean updatePaymentPriceId;

        @C09CT("update_payment_unit_id")
        public final Boolean updatePaymentUnitId;

        public PaymentPricingDefaultConfig(Long l, String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, List<String> list, Integer num, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, List<String> list2, Boolean bool16, Boolean bool17) {
            this.addCardWaitTime = l;
            this.paymentUnitIdDivider = str;
            this.enableTrack = bool;
            this.disableRequestFocus = bool2;
            this.enableSortInstallment = bool3;
            this.forceRefreshInstallment = bool4;
            this.forceUpdateUnitAndPriceId = bool5;
            this.updatePaymentUnitId = bool6;
            this.updatePaymentPriceId = bool7;
            this.enableDebugTrack = bool8;
            this.showPaymentTipsPmList = list;
            this.cardBinLength = num;
            this.filterUnavailablePm = bool9;
            this.sortUnavailablePm = bool10;
            this.filterRecommendPm = bool11;
            this.updateAvailability = bool12;
            this.enableTenurePriceText = bool13;
            this.reWriteIsInstallment = bool14;
            this.clearIndependentData = bool15;
            this.enableSecondCacheAnchorPmLis = list2;
            this.filterSubPaymentMethods = bool16;
            this.filterUnavailableAnchorPm = bool17;
        }
    }
}
