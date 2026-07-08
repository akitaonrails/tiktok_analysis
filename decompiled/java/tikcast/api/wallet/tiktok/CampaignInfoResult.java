package tikcast.api.wallet.tiktok;

import X.C09CT;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes28.dex */
public final class CampaignInfoResult {

    @C09CT("data")
    public CampaignInfoData data;

    public static final class CampaignInfo {

        @C09CT("campaign_end_time")
        public long campaignEndTime;

        @C09CT("campaign_start_time")
        public long campaignStartTime;

        @C09CT("campaign_status")
        public int campaignStatus;

        @C09CT("user_campaign_status")
        public int userCampaignStatus;

        @C09CT("campaign_id")
        public String campaignId = "";

        @C09CT("campaign_name")
        public String campaignName = "";

        @C09CT("extra")
        public Map<String, String> extra = new LinkedHashMap();

        @C09CT("recommended_users")
        public List<UserDetails> recommendedUsers = new ArrayList();
    }

    public static final class CampaignInfoData {

        @C09CT("voucher_list")
        public List<VoucherItem> voucherList = new ArrayList();

        @C09CT("campaign_list")
        public List<CampaignInfo> campaignList = new ArrayList();

        @C09CT("task_list")
        public List<TaskItem> taskList = new ArrayList();

        @C09CT("popup_list")
        public List<PopupInfo> popupList = new ArrayList();
    }

    /* JADX INFO: loaded from: classes27.dex */
    public static final class PopupInfo {

        @C09CT("data")
        public String data = "";
    }

    public static final class TaskItem {

        @C09CT("biz_source")
        public BizSource bizSource;

        @C09CT("campaign_meta_data")
        public CampaignMetaData campaignMetaData;

        @C09CT("claim_rule_v2")
        public ClaimRuleV2 claimRuleV2;

        @C09CT("is_always_applied")
        public boolean isAlwaysApplied;

        @C09CT("is_not_auto_selectable")
        public boolean isNotAutoSelectable;

        @C09CT("reward_image_url_config")
        public ImageUrlConfig rewardImageUrlConfig;

        @C09CT("selected_reward_claimable_icon")
        public ImageUrlConfig selectedRewardClaimableIcon;

        @C09CT("task_category")
        public int taskCategory;

        @C09CT("task_expiry_time")
        public long taskExpiryTime;

        @C09CT("data")
        public String data = "";

        @C09CT("task_id")
        public String taskId = "";

        @C09CT("selected_reward_claimable_text")
        public String selectedRewardClaimableText = "";

        @C09CT("task_title")
        public String taskTitle = "";

        @C09CT("voucher_cashback_amount")
        public String voucherCashbackAmount = "";
    }

    public static final class VoucherItem {

        @C09CT("biz_source")
        public BizSource bizSource;

        @C09CT("cashback_info")
        public CashbackInfo cashbackInfo;

        @C09CT("claim_rule")
        public int claimRule;

        @C09CT("claim_rule_v2")
        public ClaimRuleV2 claimRuleV2;

        @C09CT("expire_timestamp")
        public long expireTimestamp;

        @C09CT("is_not_auto_selectable")
        public boolean isNotAutoSelectable;

        @C09CT("lock_expiry_unix")
        public long lockExpiryUnix;

        @C09CT("max_order_coins_amount")
        public long maxOrderCoinsAmount;

        @C09CT("min_order_coins_amount")
        public long minOrderCoinsAmount;

        @C09CT("referral_code_info")
        public ReferralCodeInfo referralCodeInfo;

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

        @C09CT("campaign_id")
        public String campaignId = "";

        @C09CT("discount_info")
        public Map<String, DiscountRewardInfo> discountInfo = new LinkedHashMap();

        @C09CT("relative_discount_info")
        public Map<String, RelativePkgDiscountInfo> relativeDiscountInfo = new LinkedHashMap();

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

            @C09CT("currency_to_cashback_tiers")
            public Map<String, CashbackTiers> currencyToCashbackTiers = new LinkedHashMap();

            public static final class CashbackPercentage {

                @C09CT("iap")
                public String iap = "";

                @C09CT("webapp")
                public String webapp = "";
            }

            public static final class CashbackTiers {

                @C09CT("iap")
                public List<FixedCashbackAmount> iap = new ArrayList();

                @C09CT("webapp")
                public List<FixedCashbackAmount> webapp = new ArrayList();
            }

            public static final class FixedCashbackAmount {

                @C09CT("cashback_amt")
                public String cashbackAmt = "";

                @C09CT("min_local_spend")
                public MinLocalSpend minLocalSpend;
            }

            public static final class USDConversionRate {

                @C09CT("rate")
                public int rate;

                @C09CT("rate_decimal_position")
                public int rateDecimalPosition;
            }
        }

        public static final class DecimalAmount {

            @C09CT("amount")
            public long amount;

            @C09CT("dot")
            public int dot;
        }

        public static final class DiscountInfo {

            @C09CT("discount_percentage")
            public DecimalAmount discountPercentage;

            @C09CT("max_discount_local")
            public Map<String, DecimalAmount> maxDiscountLocal = new LinkedHashMap();
        }

        public static final class DiscountRewardInfo {

            @C09CT("discount_info")
            public DiscountInfo discountInfo;

            @C09CT("fixed_discount_info")
            public FixedDiscountInfo fixedDiscountInfo;

            @C09CT("relative_pkg_discount_info")
            public RelativePkgDiscountInfo relativePkgDiscountInfo;
        }

        public static final class FixedDiscountInfo {

            @C09CT("discount_local")
            public Map<String, DecimalAmount> discountLocal = new LinkedHashMap();
        }

        public static final class ReferralCodeInfo {

            @C09CT("is_default_code")
            public boolean isDefaultCode;

            @C09CT("is_display")
            public boolean isDisplay;

            @C09CT("is_editable")
            public boolean isEditable;

            @C09CT("referral_code")
            public String referralCode = "";
        }

        public static final class RelativePkgDiscountInfo {

            @C09CT("diamond_pkg_type")
            public int diamondPkgType;

            @C09CT("target_pkg_list")
            public String targetPkgList = "";

            @C09CT("max_discount_local")
            public Map<String, DecimalAmount> maxDiscountLocal = new LinkedHashMap();
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
