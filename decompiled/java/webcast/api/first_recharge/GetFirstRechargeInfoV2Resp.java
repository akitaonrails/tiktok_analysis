package webcast.api.first_recharge;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.wallet.Diamond;
import java.util.ArrayList;
import java.util.List;
import webcast.data.TouchPointData;

/* JADX INFO: loaded from: classes.dex */
public final class GetFirstRechargeInfoV2Resp {

    @C09CT("data")
    public Data data;

    public static final class CampaignProcess {

        @C09CT("rewards")
        public List<RewardProcess> rewards = new ArrayList();

        @C09CT("task_expire_time")
        public long taskExpireTime;

        @C09CT("task_finished_amount")
        public long taskFinishedAmount;

        @C09CT("task_id")
        public long taskId;

        @C09CT("task_order")
        public int taskOrder;

        @C09CT("task_scene")
        public int taskScene;

        @C09CT("task_status")
        public int taskStatus;

        @C09CT("task_target_amount")
        public long taskTargetAmount;
    }

    public static final class CommonCampaignInfo {

        @C09CT("campaign_name")
        public String campaignName = "";

        @C09CT("campaign_process")
        public List<CampaignProcess> campaignProcess = new ArrayList();

        @C09CT("campaign_status")
        public int campaignStatus;

        @C09CT("expire_time")
        public long expireTime;
    }

    public static final class Data {

        @C09CT("campaign_type")
        public int campaignType;

        @C09CT("common_campaign_info")
        public CommonCampaignInfo commonCampaignInfo;

        @C09CT("first_recharge_campaign_v1")
        public FirstRechargeCampaignV1 firstRechargeCampaignV1;

        @C09CT("first_recharge_campaign_v2")
        public FirstRechargeCampaignV2 firstRechargeCampaignV2;

        @C09CT("server_unix_time")
        public long serverUnixTime;

        @C09CT("campaign_schema_url")
        public String campaignSchemaUrl = "";

        @C09CT("campaign_faq_url")
        public String campaignFaqUrl = "";

        @C09CT("tp_data_list")
        public List<TouchPointData> tpDataList = new ArrayList();
    }

    public static final class FirstChargeGuideEffectRule {

        @C09CT("enable_first_recharge_guide_effect")
        public boolean enableFirstRechargeGuideEffect;

        @C09CT("enter_room_show_time")
        public List<Integer> enterRoomShowTime = new ArrayList();

        @C09CT("watch_pk_show_time")
        public int watchPkShowTime;
    }

    public static final class FirstRechargeCampaignV1 {

        @C09CT("default_diamond")
        public Diamond defaultDiamond;

        @C09CT("first_charge_gift_style")
        public int firstChargeGiftStyle;

        @C09CT("guide_effect_rule")
        public FirstChargeGuideEffectRule guideEffectRule;

        @C09CT("is_first_charge")
        public boolean isFirstCharge;

        @C09CT("is_guide_m2_account")
        public boolean isGuideM2Account;

        @C09CT("package_entrance_image")
        public ImageModel packageEntranceImage;
    }

    /* JADX INFO: loaded from: classes28.dex */
    public static final class FirstRechargeCampaignV2 {

        @C09CT("expire_time")
        public long expireTime;

        @C09CT("first_cash_recharge_ts")
        public long firstCashRechargeTs;

        @C09CT("frozen_coins_for_large_packages")
        public int frozenCoinsForLargePackages;

        @C09CT("frozen_coins_for_small_packages")
        public int frozenCoinsForSmallPackages;

        @C09CT("gift_id")
        public long giftId;

        @C09CT("is_cash_first_charge")
        public boolean isCashFirstCharge;

        @C09CT("is_first_active_consumption")
        public boolean isFirstActiveConsumption;

        @C09CT("is_show_countdown")
        public boolean isShowCountdown;

        @C09CT("minimum_number_of_coins_to_unlock_frozen_coins")
        public int minimumNumberOfCoinsToUnlockFrozenCoins;

        @C09CT("recharge_coins_for_large_packages")
        public int rechargeCoinsForLargePackages;

        @C09CT("recharge_coins_for_small_packages")
        public int rechargeCoinsForSmallPackages;

        @C09CT("remaining_frozen_coins")
        public int remainingFrozenCoins;

        @C09CT("total_frozen_coins")
        public int totalFrozenCoins;
    }

    public static final class RewardProcess {

        @C09CT("reward_amount")
        public long rewardAmount;

        @C09CT("reward_expire")
        public long rewardExpire;

        @C09CT("reward_icon")
        public ImageModel rewardIcon;

        @C09CT("reward_id")
        public long rewardId;

        @C09CT("reward_order")
        public int rewardOrder;

        @C09CT("reward_scene")
        public int rewardScene;
    }
}
