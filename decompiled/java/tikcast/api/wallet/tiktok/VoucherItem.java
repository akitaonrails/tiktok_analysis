package tikcast.api.wallet.tiktok;

import X.C09CT;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes28.dex */
public final class VoucherItem {

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

    public static final class CashbackInfo {

        @C09CT("cashback_percentage")
        public CashbackPercentage cashbackPercentage;

        @C09CT("diamond_id_to_cashback_usd_amt")
        public Map<Long, String> diamondIdToCashbackUsdAmt = new LinkedHashMap();

        @C09CT("max_cashback_usd_amt")
        public String maxCashbackUsdAmt = "";

        @C09CT("show_cashback")
        public boolean showCashback;

        @C09CT("usd_conversion_rate")
        public USDConversionRate usdConversionRate;

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

    public static final class ReferralCodeInfo {

        @C09CT("is_display")
        public boolean isDisplay;

        @C09CT("is_editable")
        public boolean isEditable;

        @C09CT("referral_code")
        public String referralCode = "";
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
