package com.bytedance.android.livesdk.subscribe.model;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.api.AnchorEmailInfo;
import com.bytedance.android.livesdk.chatroom.api.Bundle;
import com.bytedance.android.livesdk.chatroom.api.BusinessTool;
import com.bytedance.android.livesdk.chatroom.api.C2CTransformationPageInfo;
import com.bytedance.android.livesdk.chatroom.api.CommunityIDInfo;
import com.bytedance.android.livesdk.chatroom.api.Entrance;
import com.bytedance.android.livesdk.chatroom.api.FanGroupInfo;
import com.bytedance.android.livesdk.chatroom.api.GamingInfo;
import com.bytedance.android.livesdk.chatroom.api.LiveSubOnlyConfig;
import com.bytedance.android.livesdk.chatroom.api.OptInFrequencyBlockInfo;
import com.bytedance.android.livesdk.chatroom.api.PriceTierInfo;
import com.bytedance.android.livesdk.chatroom.api.RedDot;
import com.bytedance.android.livesdk.chatroom.api.ShareInfo;
import com.bytedance.android.livesdk.chatroom.api.SmbDeactivationInfo;
import com.bytedance.android.livesdk.chatroom.api.SpotlightInfo;
import com.bytedance.android.livesdk.chatroom.api.SubInfoPopup;
import com.bytedance.android.livesdk.chatroom.api.SubMilestoneInfo;
import com.bytedance.android.livesdk.chatroom.api.SubOnlyVideosBriefInfo;
import com.bytedance.android.livesdk.chatroom.api.SubPackageSummary;
import com.bytedance.android.livesdk.chatroom.api.SubscriptionTip;
import com.bytedance.android.livesdk.chatroom.api.TimerDetail;
import com.bytedance.android.livesdk.chatroom.api.ToolsInfo;
import com.bytedance.android.livesdk.chatroom.api.Tooltip;
import com.bytedance.android.livesdk.chatroom.api.Update;
import com.bytedance.android.livesdk.chatroom.api.UpsellInfo;
import com.bytedance.android.livesdk.chatroom.api.VerificationWarningInfo;
import com.bytedance.android.livesdk.subscribe.model.gift.SubGifInfo;
import com.bytedance.android.livesdk.subscribe.model.goal.SubGoalInfo;
import com.bytedance.android.livesdk.subscribe.model.invite.SubAvailable;
import com.bytedance.android.livesdk.subscribe.model.invite.SubEnable;
import com.bytedance.android.livesdk.subscribe.model.invite.SubEntrance;
import com.bytedance.android.livesdk.subscribe.model.invite.SubInvitationEntrance;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import webcast.data.SubSplitStatus;

/* JADX INFO: loaded from: classes8.dex */
public final class GetSubInfoResponse {

    @C09CT("anchor_email_info")
    public AnchorEmailInfo anchorEmailInfo;

    @C09CT("anchor_gift_sub_auth")
    public boolean anchorGiftSubAuth;

    @C09CT("anchor_send_sub_gift_auth")
    public boolean anchorSendSubGiftAuth;

    @C09CT("banner")
    public SubLiveBanner banner;

    @C09CT("bubble_info")
    public BubbleInfo bubbleInfo;

    @C09CT("c2c_period")
    public int c2cPeriod;

    @C09CT("c2c_trans_available")
    public boolean c2cTransAvailable;

    @C09CT("c2c_trans_page_info")
    public C2CTransformationPageInfo c2cTransPageInfo;

    @C09CT("c2c_trans_status")
    public long c2cTransStatus;

    @C09CT("community_id_info")
    public CommunityIDInfo communityIdInfo;

    @C09CT("congrats_figures")
    public long congratsFigures;

    @C09CT("customized_benefit_entrance")
    public CustomBenefitEntrance customBenefitEntrance;

    @C09CT("enable")
    public boolean enable;

    @C09CT("enable_wave_status")
    public boolean enableWaveStatus;

    @C09CT("enable_wave_strike_status")
    public boolean enableWaveStrikeStatus;

    @C09CT("fan_group_info")
    public FanGroupInfo fanGroupInfo;

    @C09CT("frequency_block_info")
    public OptInFrequencyBlockInfo frequencyBlockInfo;

    @C09CT("gaming_info")
    public GamingInfo gamingInfo;

    @C09CT("has_content_violation")
    public boolean hasContentViolation;

    @C09CT("has_education_adjustments")
    public boolean hasEducationAdjustments;

    @C09CT("has_go_live_permission")
    public boolean hasGoLivePermission;

    @C09CT("has_optin")
    public boolean hasOptIn;

    @C09CT("has_queue")
    public boolean hasQueue;

    @C09CT("has_space_post")
    public boolean hasSpacePost;

    @C09CT("has_sub_only_space")
    public boolean hasSubOnlySpace;

    @C09CT("hide_live_only_features")
    public boolean hideLiveOnlyFeatures;

    @C09CT("initialized")
    public boolean initialized;

    @C09CT("invitation_entrance")
    public SubInvitationEntrance invitationEntrance;

    @C09CT("is_pgc_allowlist")
    public boolean isPgcAllowlist;

    @C09CT("is_punished")
    public boolean isPunished;

    @C09CT("is_revoked")
    public boolean isRevoked;

    @C09CT("live_sub_only_config")
    public LiveSubOnlyConfig liveSubOnlyConfig;

    @C09CT("lop_level")
    public int lopLevel;

    @C09CT("lop_version")
    public int lopVersion;

    @C09CT("max_package_count")
    public int maxPackageCount;

    @C09CT("milestone_info")
    public SubMilestoneInfo milestoneInfo;

    @C09CT("paypal_bind_info")
    public PayPalBindInfo payPalBindInfo;

    @C09CT("price_tier_info")
    public PriceTierInfo priceTierInfo;

    @C09CT("qualification")
    public boolean qualification;

    @C09CT("red_dot")
    public RedDot redDot;

    @C09CT("share_info")
    public ShareInfo shareInfo;

    @C09CT("show_preview_sub_bubble")
    public boolean showPreviewSubBubble;

    @C09CT("show_sub_only_live_banner")
    public boolean showSubOnlyLiveBanner;

    @C09CT("smb_deactivation_info")
    public SmbDeactivationInfo smbDeactivationInfo;

    @C09CT("smb_display")
    public boolean smbDisplay;

    @C09CT("smb_opt_in_source")
    public int smbOptInSource;

    @C09CT("smb_opt_in_status")
    public int smbOptInStatus;

    @C09CT("smb_verification_warning_info")
    public VerificationWarningInfo smbVerificationWarningInfo;

    @C09CT("spotlight_info")
    public SpotlightInfo spotlightInfo;

    @C09CT("sub_available")
    public SubAvailable subAvailable;

    @C09CT("sub_eligibility")
    public int subEligibility;

    @C09CT("sub_enable")
    public SubEnable subEnable;

    @C09CT("sub_entrance")
    public SubEntrance subEntrance;

    @C09CT("gift_info")
    public SubGifInfo subGiftInfo;

    @C09CT("goal_info")
    public SubGoalInfo subGoalInfo;

    @C09CT("sub_only_space_new_activity_count")
    public long subOnlySpaceNewActivityCount;

    @C09CT("sub_only_videos_brief_info")
    public SubOnlyVideosBriefInfo subOnlyVideosBriefInfo;

    @C09CT("sub_opt_in_scenario")
    public int subOptInScenario;

    @C09CT("sub_opt_out_status_info")
    public SubOptOutStatusInfo subOptOutStatusInfo;

    @C09CT("sub_overview")
    public SubDataOverview subOverview;

    @C09CT("sub_split_status")
    public SubSplitStatus subSplitStatus;

    @C09CT("timer_detail")
    public TimerDetail timerDetail;

    @C09CT("tools_info")
    public ToolsInfo toolsInfo;

    @C09CT("upsell_info")
    public UpsellInfo upsellInfo;

    @C09CT("wallet_qualification")
    public int walletQualification;

    @C09CT("badge_info")
    public SubSettingStatus badgeInfo = new SubSettingStatus();

    @C09CT("emote_info")
    public SubSettingStatus emotesInfo = new SubSettingStatus();

    @C09CT("note_info")
    public SubSettingStatus noteInfo = new SubSettingStatus();

    @C09CT("community_info")
    public SubSettingStatus communityInfo = new SubSettingStatus();

    @C09CT("popup")
    public List<SubInfoPopup> popup = new ArrayList();

    @C09CT("package_list")
    public List<SubPackageSummary> packageList = new ArrayList();

    @C09CT("experiment_group_info")
    public Map<String, Integer> experimentGroupInfo = new LinkedHashMap();

    @C09CT("banners")
    public List<SubLiveBanner> banners = new ArrayList();

    @C09CT("tips")
    public List<SubscriptionTip> tips = new ArrayList();

    @C09CT("updates")
    public List<Update> updates = new ArrayList();

    @C09CT("suggestion_info")
    public List<Bundle> suggestionInfo = new ArrayList();

    @C09CT("benefit_entrances")
    public List<Entrance> benefitEntrances = new ArrayList();

    @C09CT("interaction_entrances")
    public List<Entrance> interactionEntrances = new ArrayList();

    @C09CT("business_tools")
    public List<BusinessTool> businessTools = new ArrayList();

    @C09CT("feature_triggers")
    public Map<String, String> featureTriggers = new LinkedHashMap();

    @C09CT("tooltips")
    public List<Tooltip> tooltips = new ArrayList();
}
