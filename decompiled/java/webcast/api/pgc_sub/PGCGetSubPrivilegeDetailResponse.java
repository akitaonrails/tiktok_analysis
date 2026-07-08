package webcast.api.pgc_sub;

import X.C09CT;
import com.bytedance.android.live.base.model.emoji.EmoteConfig;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.api.Badge;
import com.bytedance.android.livesdk.chatroom.api.BadgeConfig;
import com.bytedance.android.livesdk.chatroom.api.BadgeDetail;
import com.bytedance.android.livesdk.chatroom.api.BenefitView;
import com.bytedance.android.livesdk.chatroom.api.CommunityDetail;
import com.bytedance.android.livesdk.chatroom.api.NoteDetail;
import com.bytedance.android.livesdk.chatroom.api.SpotlightInfo;
import com.bytedance.android.livesdk.chatroom.api.SubAdminPermission;
import com.bytedance.android.livesdk.chatroom.api.SubBenefit;
import com.bytedance.android.livesdk.chatroom.api.SubCreatorChatRoomsInfo;
import com.bytedance.android.livesdk.chatroom.api.SubCustomizedBenefit;
import com.bytedance.android.livesdk.chatroom.api.SubInfo;
import com.bytedance.android.livesdk.chatroom.api.SubLevel;
import com.bytedance.android.livesdk.chatroom.api.SubOnlyVideosBriefInfo;
import com.bytedance.android.livesdk.chatroom.api.SubPackagePrivilege;
import com.bytedance.android.livesdk.chatroom.api.SubTaskInfo;
import com.bytedance.android.livesdk.gift.model.LiveStreamGoal;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.pgcsdk.subscribe.model.PGCSubInfoPopup;
import com.bytedance.android.pgcsdk.subscribe.model.PGCSubLiveBanner;
import com.bytedance.android.pgcsdk.subscribe.model.PGCSubOptOutStatusInfo;
import com.bytedance.android.pgcsdk.subscribe.model.PGCSubsTransitionPeriodInfo;
import com.bytedance.android.pgcsdk.subscribe.model.PGCTipsInfo;
import com.bytedance.android.pgcsdk.subscribe.model.SubOnlyPlaylistsBriefInfo;
import com.bytedance.android.pgcsdk.subscribe.model.SubOnlyPostsBriefInfo;
import emotes.model.EmoteListResult;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class PGCGetSubPrivilegeDetailResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("admin_permission")
        public SubAdminPermission adminPermission;

        @C09CT("anchor_detail")
        public User anchorDetail;

        @C09CT("auto_renewal_cancellation_status")
        public int autoRenewalCancellationStatus;

        @C09CT("badge")
        public Badge badge;

        @C09CT("badge_config")
        public BadgeConfig badgeConfig;

        @C09CT("banner")
        public PGCSubLiveBanner banner;

        @C09CT("can_set_multi_emoji_badges")
        public boolean canSetMultiEmojiBadges;

        @C09CT("community_detail")
        public CommunityDetail communityDetail;

        @C09CT("community_identity")
        public PGCCommunityIdentity communityIdentity;

        @C09CT("current_badge_detail")
        public BadgeDetail currentBadgeDetail;

        @C09CT("display_strategy")
        public int displayStrategy;

        @C09CT("emote_config")
        public EmoteConfig emoteConfig;

        @C09CT("emote_detail")
        public EmoteListResult emoteDetail;

        @C09CT("enable_package_change")
        public boolean enablePackageChange;

        @C09CT("exclusive_content")
        public PGCExclusiveContent exclusiveContent;

        @C09CT("gift_subscribe_permission")
        public GiftSubscribePermission giftSubscribePermission;

        @C09CT("goal")
        public LiveStreamGoal goal;

        @C09CT("m2_param")
        public PGCM2Param m2Param;

        @C09CT("past_sub")
        public boolean pastSub;

        @C09CT("payment_redirect")
        public boolean paymentRedirect;

        @C09CT("perks_count")
        public int perksCount;

        @C09CT("pgc_tips_info")
        public PGCTipsInfo pgcTipsInfo;

        @C09CT("relation_summary")
        public PGCRelationSummary relationSummary;

        @C09CT("should_show_gift_sub")
        public boolean shouldShowGiftSub;

        @C09CT("show_customized_benefit")
        public boolean showCustomizedBenefit;

        @C09CT("show_gift_sub_progress")
        public boolean showGiftSubProgress;

        @C09CT("show_wear_subscription_badge")
        public boolean showWearSubscriptionBadge;

        @C09CT("space_info")
        public PGCSubSpaceInfo spaceInfo;

        @C09CT("spotlight_info")
        public SpotlightInfo spotlightInfo;

        @C09CT("sub_creator_chat_rooms_info")
        public SubCreatorChatRoomsInfo subCreatorChatRoomsInfo;

        @C09CT("sub_eligibility")
        public int subEligibility;

        @C09CT("sub_info")
        public SubInfo subInfo;

        @C09CT("sub_note_info")
        public SubNoteInfo subNoteInfo;

        @C09CT("sub_only_playlists_brief_info")
        public SubOnlyPlaylistsBriefInfo subOnlyPlaylistsBriefInfo;

        @C09CT("sub_only_posts_brief_info")
        public SubOnlyPostsBriefInfo subOnlyPostsBriefInfo;

        @C09CT("sub_only_story_info")
        public PGCSubOnlyStoryInfo subOnlyStoryInfo;

        @C09CT("sub_only_videos_brief_info")
        public SubOnlyVideosBriefInfo subOnlyVideosBriefInfo;

        @C09CT("sub_opt_out_status_info")
        public PGCSubOptOutStatusInfo subOptOutStatusInfo;

        @C09CT("sub_scenario")
        public int subScenario;

        @C09CT("sub_task_status")
        public int subTaskStatus;

        @C09CT("subscribe_permission")
        public SubscribePermission subscribePermission;

        @C09CT("subscriber_count")
        public int subscriberCount;

        @C09CT("suggest_emotes_switch")
        public int suggestEmotesSwitch;

        @C09CT("transition_period_info")
        public PGCSubsTransitionPeriodInfo transitionPeriodInfo;

        @C09CT("user_buy_gift_sub_auth")
        public boolean userBuyGiftSubAuth;

        @C09CT("webapp_payment")
        public boolean webappPayment;

        @C09CT("benefit_list")
        public List<SubBenefit> benefitList = new ArrayList();

        @C09CT("gift_detail")
        public List<Gift> giftDetail = new ArrayList();

        @C09CT("sub_wave_strike_emotes")
        public List<EmoteModel> subWaveStrikeEmotes = new ArrayList();

        @C09CT("task_info_list")
        public List<SubTaskInfo> taskInfoList = new ArrayList();

        @C09CT("all_levels")
        public List<SubLevel> allLevels = new ArrayList();

        @C09CT("scenario_text")
        public String scenarioText = "";

        @C09CT("customized_benefits")
        public List<SubCustomizedBenefit> customizedBenefits = new ArrayList();

        @C09CT("benefits")
        public List<BenefitView> benefits = new ArrayList();

        @C09CT("package_privilege_list")
        public List<SubPackagePrivilege> packagePrivilegeList = new ArrayList();

        @C09CT("tag_list")
        public List<PGCPrivilegeTag> tagList = new ArrayList();

        @C09CT("template_list")
        public List<PGCTemplateInfo> templateList = new ArrayList();

        @C09CT("popup")
        public List<PGCSubInfoPopup> popup = new ArrayList();

        @C09CT("purchase_schema")
        public String purchaseSchema = "";

        public static final class GiftSubscribePermission {

            @C09CT("can_send_gift_sub")
            public boolean canSendGiftSub;

            @C09CT("forbidden_toast")
            public String forbiddenToast = "";

            @C09CT("gift_sub_status")
            public int giftSubStatus;
        }

        public static final class SubNoteInfo {

            @C09CT("note_detail")
            public NoteDetail noteDetail;

            @C09CT("show_note_detail")
            public boolean showNoteDetail;
        }

        public static final class SubscribePermission {

            @C09CT("can_subscribe")
            public boolean canSubscribe;

            @C09CT("forbidden_toast")
            public String forbiddenToast = "";

            @C09CT("forbidden_type")
            public int forbiddenType;
        }
    }
}
