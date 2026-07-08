package tikcast.api.wallet.tiktok;

import X.C09CT;
import com.bytedance.android.livesdk.model.Extra;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.List;
import webcast.data.RspCampaignStatus;

/* JADX INFO: loaded from: classes28.dex */
public final class QueryOrderResult {

    @C09CT("data")
    public ChargeOrderData data;

    @C09CT("extra")
    public ChargeOrderExtra extra;

    /* JADX INFO: loaded from: classes19.dex */
    public static final class ChargeOrderData {

        @C09CT("extra")
        public String extra = "";

        @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
        public int status;
    }

    public static final class ChargeOrderExtra extends Extra {

        @C09CT("campaign_status")
        public RspCampaignStatus campaignStatus;

        @C09CT("coupon")
        public String coupon = "";

        @C09CT("coupon_description")
        public String couponDescription = "";

        @C09CT("coupon_detail")
        public List<CouponDetailData> couponDetail = new ArrayList();

        @C09CT("kyc_incentive")
        public KYCIncentive kycIncentive;

        @C09CT("ploy_id")
        public long ployId;

        @C09CT("quick_charge_info")
        public QuickChargeInfo quickChargeInfo;

        @C09CT("vault_gift_info")
        public VaultGiftInfo vaultGiftInfo;

        @C09CT("voucher_details")
        public VoucherDetails voucherDetails;

        @C09CT("w_quick_charge_info")
        public WQuickChargeInfo wQuickChargeInfo;
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class CouponDetailData {

        @C09CT("product")
        public String product = "";

        @C09CT("discount")
        public String discount = "";
    }

    public static final class GiftDetails {

        @C09CT("gift_coins")
        public long giftCoins;

        @C09CT("gift_id")
        public long giftId;

        @C09CT("gift_name")
        public String giftName = "";

        @C09CT("gift_icon_uri")
        public String giftIconUri = "";
    }

    public static final class KYCIncentive {

        @C09CT("is_show_entrance")
        public boolean isShowEntrance;
    }

    public static final class QuickChargeInfo {

        @C09CT("day_limit")
        public long dayLimit;

        @C09CT("jump_url")
        public String jumpUrl = "";

        @C09CT("max_view_count")
        public long maxViewCount;
    }

    public static final class VaultGiftInfo {

        @C09CT("booster")
        public Booster booster;

        @C09CT("gift_details")
        public GiftDetails giftDetails;

        @C09CT("gift_id")
        public long giftId;

        @C09CT("num_gift_unlocked")
        public long numGiftUnlocked;

        @C09CT("user_vault_gift_level")
        public int userVaultGiftLevel;

        @C09CT("vault_gift_schema_url")
        public String vaultGiftSchemaUrl = "";

        @C09CT("vault_gift_coins_added")
        public String vaultGiftCoinsAdded = "";
    }

    public static final class VoucherDetails {

        @C09CT("is_voucher_redeemed_success")
        public boolean isVoucherRedeemedSuccess;

        @C09CT("voucher_type")
        public int voucherType;

        @C09CT("voucher_template_id")
        public String voucherTemplateId = "";

        @C09CT("cashback_amount_usd")
        public String cashbackAmountUsd = "";
    }

    public static final class WQuickChargeInfo {

        @C09CT("day_limit")
        public int dayLimit;

        @C09CT("is_eligible")
        public boolean isEligible;
    }
}
