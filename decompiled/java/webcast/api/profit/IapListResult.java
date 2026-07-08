package webcast.api.profit;

import X.C09CT;
import com.bytedance.android.livesdk.wallet.Diamond;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import webcast.data.CurrencyInfo;
import webcast.data.FXRate;

/* JADX INFO: loaded from: classes28.dex */
public final class IapListResult {

    @C09CT("data")
    public List<Diamond> data = new ArrayList();

    @C09CT("extra")
    public ListResultExtra extra;

    public static final class ActivityDetail {

        @C09CT("end_time")
        public long endTime;

        @C09CT("start_time")
        public long startTime;

        @C09CT("activity_id")
        public String activityId = "";

        @C09CT("activity_main_path")
        public String activityMainPath = "";

        @C09CT("activity_image")
        public String activityImage = "";
    }

    public static final class ActivityInfo {

        @C09CT("activity_list")
        public List<ActivityDetail> activityList = new ArrayList();

        @C09CT("is_show_banner")
        public boolean isShowBanner;
    }

    public static final class IapCustomData {

        @C09CT("discount_rate")
        public int discountRate;

        @C09CT("enable_custom_option")
        public boolean enableCustomOption;

        @C09CT("enable_failure_custom_entrance_guide")
        public boolean enableFailureCustomEntranceGuide;

        @C09CT("enable_payment_token")
        public boolean enablePaymentToken;

        @C09CT("recharge_button_design")
        public int rechargeButtonDesign;

        @C09CT("skip_popup_url")
        public boolean skipPopupUrl;

        @C09CT("recharge_v2_panel_url")
        public String rechargeV2PanelUrl = "";

        @C09CT("recharge_v3_panel_url")
        public String rechargeV3PanelUrl = "";

        @C09CT("try_now_intermediate_url")
        public String tryNowIntermediateUrl = "";

        @C09CT("custom_popup_url")
        public String customPopupUrl = "";

        @C09CT("custom_intermediate_url")
        public String customIntermediateUrl = "";

        @C09CT("balance_page_try_now_intermediate_url")
        public String balancePageTryNowIntermediateUrl = "";

        @C09CT("balance_page_custom_popup_url")
        public String balancePageCustomPopupUrl = "";

        @C09CT("balance_page_custom_intermediate_url")
        public String balancePageCustomIntermediateUrl = "";

        @C09CT("custom_subtitle")
        public String customSubtitle = "";

        @C09CT("failure_popup_url")
        public String failurePopupUrl = "";

        @C09CT("failure_try_now_url")
        public String failureTryNowUrl = "";

        @C09CT("insufficient_try_now_url")
        public String insufficientTryNowUrl = "";
    }

    public static final class ListResultExtra {

        @C09CT("activity_info")
        public ActivityInfo activityInfo;

        @C09CT("coin_solution_ab_enabled")
        public boolean coinSolutionAbEnabled;

        @C09CT("custom_entrance_banner_config")
        public CustomEntranceBannerConfig customEntranceBannerConfig;

        @C09CT("default_packet_coin")
        public long defaultPacketCoin;

        @C09CT("enable_m2_guidance")
        public boolean enableM2Guidance;

        @C09CT("iap_custom_data")
        public IapCustomData iapCustomData;

        @C09CT("iap_max_customized_diamond_cnt")
        public int iapMaxCustomizedDiamondCnt;

        @C09CT("iap_min_customized_diamond_cnt")
        public int iapMinCustomizedDiamondCnt;

        @C09CT("is_default")
        public boolean isDefault;

        @C09CT("is_new_recommend_package")
        public boolean isNewRecommendPackage;

        @C09CT("max_customized_diamond_cnt")
        public int maxCustomizedDiamondCnt;

        @C09CT("min_customized_diamond_cnt")
        public int minCustomizedDiamondCnt;

        @C09CT("need_display_multi_currency")
        public boolean needDisplayMultiCurrency;

        @C09CT("package_unavailable_config")
        public PackageUnavailableConfig packageUnavailableConfig;

        @C09CT("quick_charge_config")
        public QuickChargeConfig quickChargeConfig;

        @C09CT("recently_purchased_packet_id")
        public long recentlyPurchasedPacketId;

        @C09CT("recommended_packet_id")
        public long recommendedPacketId;

        @C09CT("use_default_packet")
        public boolean useDefaultPacket;

        @C09CT("channel")
        public String channel = "";

        @C09CT("customized_ids")
        public List<Long> customizedIds = new ArrayList();

        @C09CT("merchant_id")
        public String merchantId = "";

        @C09CT("region")
        public String region = "";

        @C09CT("insufficient_balance_ab_group_id")
        public String insufficientBalanceAbGroupId = "";

        @C09CT("full_list")
        public List<Diamond> fullList = new ArrayList();

        @C09CT("request_id")
        public String requestId = "";

        @C09CT("voucher_list")
        public List<VoucherItem> voucherList = new ArrayList();

        @C09CT("pipo_domain")
        public String pipoDomain = "";

        @C09CT("store_region")
        public String storeRegion = "";

        @C09CT("m2_download_url")
        public String m2DownloadUrl = "";

        @C09CT("available_currency_list")
        public List<CurrencyInfo> availableCurrencyList = new ArrayList();

        @C09CT("last_selected_currency")
        public String lastSelectedCurrency = "";

        @C09CT("default_local_currency")
        public String defaultLocalCurrency = "";

        @C09CT("local_currency_list")
        public List<String> localCurrencyList = new ArrayList();

        @C09CT("multi_currency_display_fx_rate_list")
        public List<FXRate> multiCurrencyDisplayFxRateList = new ArrayList();

        @C09CT("web_recharge_packages")
        public Map<Long, Diamond> webRechargePackages = new LinkedHashMap();
    }

    public static final class QuickChargeConfig {

        @C09CT("activated_before")
        public boolean activatedBefore;

        @C09CT("has_valid_biz_contract")
        public boolean hasValidBizContract;

        @C09CT("jump_url")
        public String jumpUrl = "";

        @C09CT("red_dot_dedup_id")
        public String redDotDedupId = "";

        @C09CT("show_red_dot")
        public boolean showRedDot;
    }

    public static final class VoucherItem {

        @C09CT("cashback_info")
        public CashbackInfo cashbackInfo;

        @C09CT("expire_timestamp")
        public long expireTimestamp;

        @C09CT("lock_expiry_unix")
        public long lockExpiryUnix;

        @C09CT("max_order_coins_amount")
        public long maxOrderCoinsAmount;

        @C09CT("min_order_coins_amount")
        public long minOrderCoinsAmount;

        @C09CT("voucher_starling_content")
        public VoucherStarlingContent voucherStarlingContent;

        @C09CT("voucher_status")
        public int voucherStatus;

        @C09CT("voucher_type")
        public int voucherType;

        @C09CT("voucher_token")
        public String voucherToken = "";

        @C09CT("reward_detail")
        public String rewardDetail = "";

        @C09CT("voucher_template_id")
        public String voucherTemplateId = "";

        public static final class CashbackInfo {

            @C09CT("cashback_percentage")
            public CashbackPercentage cashbackPercentage;

            @C09CT("show_cashback")
            public boolean showCashback;

            @C09CT("usd_conversion_rate")
            public USDConversionRate usdConversionRate;

            @C09CT("diamond_id_to_cashback_usd_amt")
            public Map<Long, String> diamondIdToCashbackUsdAmt = new LinkedHashMap();

            @C09CT("max_cashback_usd_amt")
            public String maxCashbackUsdAmt = "";

            @C09CT("currency")
            public String currency = "";

            public static final class CashbackPercentage {

                @C09CT("iap")
                public String iap = "";

                @C09CT("webapp")
                public String webapp = "";
            }

            public static final class USDConversionRate {

                @C09CT("rate")
                public int rate;

                @C09CT("rate_decimal_position")
                public int rateDecimalPosition;
            }
        }

        public static final class VoucherStarlingContent {

            @C09CT("voucher_tags")
            public List<String> voucherTags = new ArrayList();

            @C09CT("discount_amount")
            public String discountAmount = "";

            @C09CT("min_amount")
            public String minAmount = "";

            @C09CT("max_amount")
            public String maxAmount = "";

            @C09CT("validity_period")
            public String validityPeriod = "";

            @C09CT("terms_and_conditions")
            public String termsAndConditions = "";

            @C09CT("voucher_applied")
            public String voucherApplied = "";
        }
    }
}
