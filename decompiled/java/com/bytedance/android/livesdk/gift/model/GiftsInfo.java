package com.bytedance.android.livesdk.gift.model;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.GiftPanelBanner;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class GiftsInfo {

    @C09CT("panel_gift_box_icon")
    public ImageModel bannerGiftBoxIcon;

    @C09CT("batch_gift_info")
    public BatchGiftInfo batchGiftInfo;

    @C09CT("beacon_bubble_info")
    public BeaconBubbleInfo beaconBubbleInfo;

    @C09CT("color_gift_icon_animation")
    public ImageModel colorGiftIconAnimation;

    @C09CT("combo_bar")
    public Map<Long, ComboBar> comboBar;

    @C09CT("compensation_gift_info")
    public LiveLimitedTimeDiscountGiftInfo compensationGiftInfo;

    @C09CT("default_loc_color_gift_id")
    public Long defaultLocColorGiftId;

    @C09CT("enable_first_recharge_dynamic_effect")
    public Boolean enableFirstRechargeDynamicEffect;

    @C09CT("first_recharge_gift_info")
    public LiveLimitedTimeDiscountGiftInfo firstRechargeGiftInfo;

    @C09CT("freq_limit_gift_info")
    public FreqLimitGiftInfo freqLimitGiftInfo;

    @C09CT("gift_box_scheme_url")
    public String giftBoxSchemeUrl;

    @C09CT("gift_campaign_progress")
    public GiftCampaignProgress giftCampaignProgress;

    @C09CT("gift_challenge_progress")
    public GiftChallengeProgress giftChallengeProgress;

    @C09CT("gift_combo_infos")
    public List<GiftComboInfo> giftComboInfos;

    @C09CT("gift_entrance_icon")
    public ImageModel giftEntranceIcon;

    @C09CT("gift_gallery_info")
    public GiftGalleryInfo giftGalleryInfo;

    @C09CT("gift_group_infos")
    public List<GiftGroupCount> giftGroupInfos;

    @C09CT("gift_icon_guide_infos")
    public List<GiftIconGuideInfo> giftIconGuideInfos;

    @C09CT("gift_icon_info")
    public GiftIconInfo giftIconInfo;

    @C09CT("gift_poll_info")
    public GiftPollInfo giftPollInfo;

    @C09CT("gift_words")
    public String giftWords;

    @C09CT("hide_recharge_entry")
    public boolean hideRecharge;

    @C09CT("is_display_gift_box_icon")
    public boolean isDisplayGiftBox;

    @C09CT("is_universal")
    public boolean isUniversal;

    @C09CT("is_vault_eoy_bonus_eligible")
    public boolean isVaultEoyBonusEligible;

    @C09CT("level_up_gift_info")
    public LevelUpGiftInfo levelUpGiftInfo;

    @C09CT("limited_time_reward_gift_infos")
    public List<LimitedTimeRewardGiftInfo> limitedTimeRewardGiftInfos;

    @C09CT("live_goal_banner")
    public GiftPanelBanner liveGoalBanner;

    @C09CT("live_goal_label_icon")
    public ImageModel liveGoalLabelIcon;

    @C09CT("speedy_gift_id")
    public long mFastGiftId;

    @C09CT("music_gift_moods")
    public Map<Long, MusicGiftMood> musicGiftMoods;

    @C09CT("new_gift_id")
    public Long newGiftId;

    @C09CT("panel_gift_gallery_icon")
    public ImageModel panelGiftGalleryIcon;

    @C09CT("points_gift_info")
    public UGPointsGiftInfo pointsGiftInfo;

    @C09CT("recently_sent_color_gift_id")
    public Long recentlySentColorGiftId;

    @C09CT("recommended_random_gift_id")
    public Long recommendRandomGiftId;

    @C09CT("risk_ctl_strategies")
    public RiskCtl riskCtl;

    @C09CT("server_strategy_context")
    public ServerStrategyContext serverStrategyContext;

    @C09CT("show_first_recharge_entrance")
    public Boolean showFirstRechargeEntrance;

    @C09CT("speedy_gift_default_icon")
    public ImageModel speedyGiftDefaultIcon;

    @C09CT("speedy_gift_grey_icon")
    public ImageModel speedyGiftGreyIcon;

    @C09CT("team_rank_progress")
    public TeamRankProgress teamRankProgress;

    @C09CT("viewer_picks_info")
    public ViewerPicksInfo viewerPicksInfo;

    @C09CT("gift_gallery_detail_page_scheme_url")
    public String giftGalleryDetailPageSchemeUrl = "";

    @C09CT("strategy_context")
    public String strategyContext = "";

    public static final class BatchGiftInfo {

        @C09CT("consume_limit")
        public long consumeLimit;

        @C09CT("dismiss_expire_seconds")
        public long dismissExpireSeconds;
    }

    public static final class BeaconBubbleInfo {

        @C09CT("anchor_gallery_icon")
        public ImageModel anchorGalleryIcon;

        @C09CT("live_goal_icon")
        public ImageModel liveGoalIcon;

        @C09CT("live_goal_schema_url")
        public String liveGoalSchemaUrl = "";
    }

    public static final class GiftGalleryInfo {

        @C09CT("anchor_ranking_league")
        public String anchorRankingLeague = "";

        @C09CT("gallery_ranking_league")
        public String galleryRankingLeague = "";
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class LevelUpGiftInfo {

        @C09CT("blast_end_timestamp")
        public long blastEndTimestamp;

        @C09CT("current_count")
        public long currentCount;

        @C09CT("gift_id")
        public long giftId;

        @C09CT("left_count_to_level_up")
        public long leftCountToLevelUp;

        @C09CT("level_up_count")
        public long levelUpCount;

        @C09CT("minimum_level_grade")
        public long minimumLevelGrade;

        @C09CT("num_of_upgrade_gifts_left")
        public long numOfUpgradeGiftsLeft;

        @C09CT("show_id")
        public String showId = "";

        @C09CT("user_blast_status")
        public int userBlastStatus;
    }

    public static final class LimitedTimeRewardGiftInfo {

        @C09CT("gift_id")
        public long giftId;

        @C09CT("gift_panel_banner")
        public GiftPanelBanner giftPanelBanner;

        @C09CT("valid_end")
        public long validEnd;

        @C09CT("valid_start")
        public long validStart;
    }

    public static final class ServerStrategyContext {

        @C09CT("previous_sent_gift_ids")
        public List<Long> previousSentGiftIds;
    }

    public static final class UGPointsGiftInfo {

        @C09CT("has_send_gifts_in_history")
        public boolean hasSendGiftsInHistory;

        @C09CT("max_anchor_times")
        public long maxAnchorTimes;

        @C09CT("valid_end_at")
        public long validEndAt;

        @C09CT("valid_start_at")
        public long validStartAt;
    }

    public static final class ViewerPicksInfo {

        @C09CT("enable_client_force_insertion")
        public boolean enableClientForceInsertion;
    }
}
