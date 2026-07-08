package tikcast.api.wallet.tiktok;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;
import webcast.data.RechargeCustomError;

/* JADX INFO: loaded from: classes28.dex */
public final class PeriodicPayoutPageResult {

    @C09CT("data")
    public ResultData data;

    public static final class ResultData {

        @C09CT("amount_status")
        public int amountStatus;

        @C09CT("custom_error")
        public RechargeCustomError customError;

        @C09CT("decoupling_ab_group")
        public int decouplingAbGroup;

        @C09CT("enrolled_video_gift_status")
        public int enrolledVideoGiftStatus;

        @C09CT("exchange")
        public Exchange exchange;

        @C09CT("is_bill_query_failed")
        public boolean isBillQueryFailed;

        @C09CT("is_global_periodic_payout")
        public boolean isGlobalPeriodicPayout;

        @C09CT("is_lmg_whitelist_user")
        public boolean isLmgWhitelistUser;

        @C09CT("is_lower_default_threshold_experiment")
        public boolean isLowerDefaultThresholdExperiment;

        @C09CT("is_periodic_user")
        public boolean isPeriodicUser;

        @C09CT("is_rfi_required")
        public boolean isRfiRequired;

        @C09CT("kyc_customised_error")
        public KYCCustomisedError kycCustomisedError;

        @C09CT("kyc_status")
        public int kycStatus;

        @C09CT("organization_account_data")
        public OrganizationAccountData organizationAccountData;

        @C09CT("periodic_payout_info")
        public PeriodicPayoutInfo periodicPayoutInfo;

        @C09CT("periodic_payout_limit")
        public PeriodicPayoutLimit periodicPayoutLimit;

        @C09CT("pi_bind_status")
        public int piBindStatus;

        @C09CT("pi_status")
        public int piStatus;

        @C09CT("primary_pi_data")
        public PrimaryPIData primaryPiData;

        @C09CT("user_money")
        public PeriodicUserMoneyV2 userMoney;

        @C09CT("formatted_total_past_payout_amount")
        public String formattedTotalPastPayoutAmount = "";

        @C09CT("periodic_payout_tags")
        public List<String> periodicPayoutTags = new ArrayList();
    }
}
