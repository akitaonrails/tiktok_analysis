package com.bytedance.android.livesdk.chatroom.model;

import X.C09CT;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.anchor_certification.model.GuideEntrance;
import com.bytedance.android.livesdk.message.proto.CppAgeVerificationInfo;
import com.bytedance.android.livesdk.message.proto.CppTaskInfo;
import com.bytedance.android.livesdk.message.proto.WebcastLSAccessStatus;
import com.bytedance.android.livesdk.model.CommentsInfo;
import com.bytedance.android.livesdk.model.MultiHostGroupChatInfo;
import com.bytedance.android.livesdk.model.RoomStats;
import java.util.ArrayList;
import java.util.List;
import tikcast.api.anchor.MilestoneTasksData;
import webcast.data.AnchorLiveJourneyGuideInfo;
import webcast.data.EndLiveLiveAchievementInfo;
import webcast.data.ExcellentHighLightUser;
import webcast.data.GroupChatInfo;
import webcast.data.HostResourceCard;
import webcast.data.LiveJourneyLevelInfo;
import webcast.data.LiveJourneySeasonInfo;
import webcast.data.LiveJourneyTaskRecordInfo;
import webcast.data.NewAnchorIncentiveInfo;
import webcast.data.RoomShortVideoStats;
import webcast.data.RoomShortVideoStatsWithDate;
import webcast.data.TargetPromotionLiveAnchorInfo;

/* JADX INFO: loaded from: classes.dex */
public final class AnchorFinishInfoData {

    @C09CT("academy_info")
    public LiveAcademyInfo academyInfo;

    @C09CT("achievement_overview")
    public AchievementOverview achievementOverview;

    @C09CT("achievement_status")
    public AchievementStatus achievementStatus;

    @C09CT("advanced_live_ban_status")
    public BanStatus advancedLiveBanStatus;

    @C09CT("anchor_grow_level_info")
    public LiveCenterDetailAnchorGrowLevelInfo anchorGrowLevelInfo;

    @C09CT("anchor_survey_container")
    public AnchorSurveyContainer anchorSurveyContainer;

    @C09CT("anchor_target_promotion_live_info")
    public AnchorTargetPromotionLiveInfo anchorTargetPromotionLiveInfo;

    @C09CT("ba_leads_gen_info")
    public BaLeadsGenInfo baLeadsGenInfo;

    @C09CT("ban_status")
    public BanStatus banStatus;

    @C09CT("bulletin_board")
    public BulletinBoard bulletinBoard;

    @C09CT("campaign_center")
    public CampaignCenter campaignCenter;

    @C09CT("comments_info")
    public CommentsInfo commentsInfo;

    @C09CT("comments_safety_tools")
    public CommentsSafetyTools commentsSafetyTools;

    @C09CT("cpp_age_verification_info")
    public CppAgeVerificationInfo cppAgeVerificationInfo;

    @C09CT("cpp_task_info")
    public CppTaskInfo cppTaskInfo;

    @C09CT("duration")
    public long duration;

    @C09CT("end_page_temp_guide_module")
    public EndPageTempGuideModule endPageTempGuideModule;

    @C09CT("eventInfo")
    public LiveEventInfo eventinfo;

    @C09CT("exam_status")
    public int examStatus;

    @C09CT("excellent_highlight_user")
    public ExcellentHighLightUser excellentHighlightUser;

    @C09CT("fan_club_info")
    public FanClubInfo fanClubInfo;

    @C09CT("finish_reason_container")
    public FinishReasonContainer finishReasonContainer;

    @C09CT("group_chat_info")
    public GroupChatInfo groupChatInfo;

    @C09CT("guide_entrance")
    public GuideEntrance guideEntrance;

    @C09CT("has_commerce_goods")
    public boolean hasCommerceGoods;

    @C09CT("has_new_viewer_recap")
    public boolean hasNewViewerRecap;

    @C09CT("hide_diamond")
    public boolean hideDiamond;

    @C09CT("highlight_container")
    public HighlightContainer highlightContainer;

    @C09CT("host_ending_page_dm_group_info")
    public HostEndingPageDMGroupInfo hostEndingPageDmGroupInfo;

    @C09CT("incentive_info")
    public IncentiveInfo incentiveInfo;

    @C09CT("is_first_live")
    public boolean isFirstLive;

    @C09CT("is_service_plus_room")
    public boolean isServicePlusRoom;

    @C09CT("IsSocialLive")
    public boolean issociallive;

    @C09CT("live_achievement")
    public EndLiveLiveAchievementInfo liveAchievement;

    @C09CT("live_assist_info")
    public LiveAssistantInfo liveAssistInfo;

    @C09CT("live_journey_info")
    public LiveJourneyInfo liveJourneyInfo;

    @C09CT("mentorship_info")
    public MentorshipInfo mentorshipInfo;

    @C09CT("milestone_task_data")
    public MilestoneTasksData milestoneTaskData;

    @C09CT("multi_host_group_chat_info")
    public MultiHostGroupChatInfo multiHostGroupChatInfo;

    @C09CT("multi_tier_package_count")
    public long multiTierPackageCount;

    @C09CT("new_anchor_incentive_info")
    public NewAnchorIncentiveInfo newAnchorIncentiveInfo;

    @C09CT("new_subscriber_uv")
    public long newSubscriberUv;

    @C09CT("operation_container")
    public FinishOperationContainer operationContainer;

    @C09CT("owner")
    public User owner;

    @C09CT("period_stats")
    public PeriodStatsContainer periodStats;

    @C09CT("permission_level_info")
    public PermissionLevelInfo permissionLevelInfo;

    @C09CT("promote_container")
    public FinishPromoteContainer promoteContainer;

    @C09CT("rank_container")
    public FinishRankContainer rankContainer;

    @C09CT("recap_container")
    public RecapContainer recapContainer;

    @C09CT("recommend_anchor")
    public RecommendAnchor recommendAnchor;

    @C09CT("replay_container")
    public FinishReplayContainer replayContainer;

    @C09CT("restriction_info")
    public RestrictionInfo restrictionInfo;

    @C09CT("room_ec_stat_container")
    public RoomECStatContainer roomEcStatContainer;

    @C09CT("room_short_video_stats")
    public RoomShortVideoStats roomShortVideoStats;

    @C09CT("room_stat_container")
    public RoomStatContainer roomStatContainer;

    @C09CT("room_stat_show")
    public RoomStatShow roomStatShow;

    @C09CT("schedule_container")
    public AnchorScheduledTimeContainer scheduleContainer;

    @C09CT("shop_data")
    public ShopData shopData;

    @C09CT("show_achievement_swith")
    public boolean showAchievementSwith;

    @C09CT("show_no_sub_prompt")
    public boolean showNoSubPrompt;

    @C09CT("show_subscription")
    public boolean showSubscription;

    @C09CT("stats")
    public RoomStats stats;

    @C09CT("stats_type")
    public long statsType;

    @C09CT("sub_business_info")
    public SubBusinessInfo subBusinessInfo;

    @C09CT("sub_upsell_info")
    public SubUpsellInfo subUpsellInfo;

    @C09CT("wallet_rewards_container_info")
    public WalletRewardsContainerInfo walletRewardsContainerInfo;

    @C09CT("watch_rank_container")
    public FinishRankContainer watchRankContainer;

    @C09CT("webcast_ls_access_status")
    public WebcastLSAccessStatus webcastLsAccessStatus;

    @C09CT("last_room_id")
    public String lastRoomId = "";

    @C09CT("faq_info_json")
    public String faqInfoJson = "";

    @C09CT("room_short_video_stats_with_date")
    public List<RoomShortVideoStatsWithDate> roomShortVideoStatsWithDate = new ArrayList();

    @C09CT("host_resource_card_list")
    public List<HostResourceCard> hostResourceCardList = new ArrayList();

    public static final class AnchorTargetPromotionLiveInfo {

        @C09CT("anchor_info")
        public TargetPromotionLiveAnchorInfo anchorInfo;

        @C09CT("title")
        public String title = "";
    }

    public static final class BanStatus {

        @C09CT("end_time")
        public long endTime;

        @C09CT("is_ban")
        public boolean isBan;
    }

    public static final class BulletinBoard {

        @C09CT("title")
        public String title = "";

        @C09CT("content")
        public String content = "";

        @C09CT("schema")
        public String schema = "";

        @C09CT("channel_id")
        public String channelId = "";
    }

    public static final class CampaignCenter {

        @C09CT("campaign_pack_data")
        public String campaignPackData = "";
    }

    /* JADX INFO: loaded from: classes29.dex */
    public static final class LiveJourneyInfo {

        @C09CT("current_level_info")
        public LiveJourneyLevelInfo currentLevelInfo;

        @C09CT("guide_info")
        public AnchorLiveJourneyGuideInfo guideInfo;

        @C09CT("season_info")
        public LiveJourneySeasonInfo seasonInfo;

        @C09CT("finished_weekly_task_list")
        public List<LiveJourneyTaskRecordInfo> finishedWeeklyTaskList = new ArrayList();

        @C09CT("finished_challenge_task_list")
        public List<LiveJourneyTaskRecordInfo> finishedChallengeTaskList = new ArrayList();

        @C09CT("reached_level_list")
        public List<LiveJourneyLevelInfo> reachedLevelList = new ArrayList();

        @C09CT("can_claim_level_list")
        public List<LiveJourneyLevelInfo> canClaimLevelList = new ArrayList();
    }

    public static final class PermissionLevelInfo {

        @C09CT("cpp_version")
        public int cppVersion;

        @C09CT("current_room_upgrade_level")
        public boolean currentRoomUpgradeLevel;

        @C09CT("not_finish_task_num")
        public int notFinishTaskNum;

        @C09CT("permission_level")
        public int permissionLevel;

        @C09CT("permission_level_status")
        public int permissionLevelStatus;

        @C09CT("stage")
        public int stage;
    }

    public static final class WalletRewardsContainerInfo {

        @C09CT("schema")
        public String schema = "";
    }
}
