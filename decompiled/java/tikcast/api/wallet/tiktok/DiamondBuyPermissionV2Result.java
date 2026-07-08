package tikcast.api.wallet.tiktok;

import X.C09CT;
import tikcast.api.wallet.UserKYCIncentiveData;

/* JADX INFO: loaded from: classes28.dex */
public final class DiamondBuyPermissionV2Result {

    @C09CT("data")
    public PermissionData data;

    public static final class PWAInfo {

        @C09CT("has_entered_hs_in_past_30_days")
        public long hasEnteredHsInPast30Days;

        @C09CT("is_pwa_ab")
        public long isPwaAb;

        @C09CT("is_recharge_panel_banner_frequency_control_passed")
        public long isRechargePanelBannerFrequencyControlPassed;

        @C09CT("is_success_recharge_enable_button_frequency_control_passed")
        public long isSuccessRechargeEnableButtonFrequencyControlPassed;

        @C09CT("promote_home_screen_display")
        public String promoteHomeScreenDisplay = "";
    }

    public static final class Package {

        @C09CT("local_price")
        public long localPrice;

        @C09CT("local_price_real_dot")
        public int localPriceRealDot;

        @C09CT("price")
        public long price;

        @C09CT("real_dot")
        public int realDot;

        @C09CT("local_currency")
        public String localCurrency = "";

        @C09CT("platform_type")
        public String platformType = "";
    }

    public static final class PermissionData {

        @C09CT("block_coin_page")
        public boolean blockCoinPage;

        @C09CT("coins")
        public long coins;

        @C09CT("enable_web_recharge_m2")
        public boolean enableWebRechargeM2;

        @C09CT("exchange")
        public Exchange exchange;

        @C09CT("frozen_coins")
        public long frozenCoins;

        @C09CT("has_google_recharge")
        public boolean hasGoogleRecharge;

        @C09CT("is_allow")
        public boolean isAllow;

        @C09CT("is_email_confirmed")
        public boolean isEmailConfirmed;

        @C09CT("is_first_web_recharge")
        public boolean isFirstWebRecharge;

        @C09CT("is_periodic_payout")
        public boolean isPeriodicPayout;

        @C09CT("is_show")
        public boolean isShow;

        @C09CT("kyc_incentive_info")
        public UserKYCIncentiveData kycIncentiveInfo;

        /* JADX INFO: renamed from: package, reason: not valid java name */
        @C09CT("package")
        public Package f94package;

        @C09CT("pc_web_recharge_status")
        public int pcWebRechargeStatus;

        @C09CT("pwa_info")
        public PWAInfo pwaInfo;

        @C09CT("pwa_user_category")
        public int pwaUserCategory;

        @C09CT("quick_payment_available")
        public boolean quickPaymentAvailable;

        @C09CT("redeem_info")
        public RedeemInfoData redeemInfo;

        @C09CT("show_input_tooltip")
        public boolean showInputTooltip;

        @C09CT("show_recharge_amount_adjusted_text")
        public boolean showRechargeAmountAdjustedText;

        @C09CT("verified_email")
        public String verifiedEmail = "";

        @C09CT("w_quick_charge_info")
        public WQuickChargeInfo wQuickChargeInfo;

        @C09CT("web_recharge_input_option")
        public int webRechargeInputOption;
    }

    public static final class WQuickChargeInfo {

        @C09CT("contract_status")
        public int contractStatus;

        @C09CT("is_eligible")
        public boolean isEligible;

        @C09CT("show_red_dot")
        public boolean showRedDot;
    }
}
