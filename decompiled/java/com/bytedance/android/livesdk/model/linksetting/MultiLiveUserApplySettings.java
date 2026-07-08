package com.bytedance.android.livesdk.model.linksetting;

import X.C09CT;
import com.bytedance.android.live.liveinteract.multilive.model.RoomHostMultiGuestPermissionInfo;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import webcast.data.AllLinkedUserData;
import webcast.data.AnchorSettingInfo;
import webcast.data.CardTag;
import webcast.data.FeedCard;
import webcast.data.GuestApplicationInfo;
import webcast.data.GuestInvitedInfo;
import webcast.data.MGEnterActionInfo;
import webcast.data.MultiGuestLayoutInfo;
import webcast.data.MultiGuestPlayInfo;
import webcast.data.MultiGuestShareRevenueSettingInfo;
import webcast.data.RandomMatchInfo;
import webcast.data.RoomMultiGuestLinkmicInfo;

/* JADX INFO: loaded from: classes.dex */
public final class MultiLiveUserApplySettings {

    @C09CT("ai_summary")
    public String aiSummary;

    @C09CT("all_linked_user_data")
    public AllLinkedUserData allLinkedUserData;

    @C09CT("anchor_setting_info")
    public AnchorSettingInfo anchorSettingInfo;

    @C09CT("audience_send_gifts_to_all_enum")
    public long audienceSendGiftsToAllEnum;

    @C09CT("audience_shared_invitee_panel_type")
    public long audienceSharedInviteePanelType;

    @C09CT("background_sticker_id")
    public String backgroundStickerId;

    @C09CT("extra_info")
    public Map<String, String> extraInfo;

    @C09CT("feed_card")
    public FeedCard feedCard;

    @C09CT("guest_application_info")
    public GuestApplicationInfo guestApplicationInfo;

    @C09CT("guest_invited_info")
    public GuestInvitedInfo guestInvitedInfo;

    @C09CT("hangout_card_tag_list")
    public List<CardTag> hangoutCardTagList;

    @C09CT("host_gifter_linkmic_enum")
    public long hostGifterLinkmicEnum;

    @C09CT("host_multi_guest_dev_mode")
    public long hostMultiGuestDevMode;

    @C09CT("host_send_gifts_to_all_enum")
    public long hostSendGiftsToAllEnum;

    @C09CT("is_eligible_for_apply_auto_approve")
    public boolean isEligibleForApplyAutoApprove;

    @C09CT("linkmic_service_version")
    public Integer linkMicServiceVersion;

    @C09CT("mg_enter_action_info")
    public MGEnterActionInfo mgEnterActionInfo;

    @C09CT("multi_guest_enable_revenue_ratio")
    public long multiGuestEnableRevenueRatio;

    @C09CT("multi_guest_layout_info")
    public MultiGuestLayoutInfo multiGuestLayoutInfo;

    @C09CT("multi_guest_play_info")
    public MultiGuestPlayInfo multiGuestPlayInfo;

    @C09CT("multi_guest_share_revenue_setting_info")
    public MultiGuestShareRevenueSettingInfo multiGuestShareRevenueSettingInfo;

    @C09CT("user_settings")
    public MultiLiveUserApplyPermission multiLiveUserApplyPermission;

    @C09CT("play_label_tag")
    public CardTag playLabelTag;

    @C09CT("random_match_info")
    public RandomMatchInfo randomMatchInfo;

    @C09CT("room_audience_multi_guest_permission_info")
    public RoomAudienceMultiGuestPermissionInfo roomAudienceMultiGuestPermissionInfo;

    @C09CT("room_host_multi_guest_permission_info")
    public RoomHostMultiGuestPermissionInfo roomHostMultiGuestPermissionInfo;

    @C09CT("room_multi_guest_linkmic_info")
    public RoomMultiGuestLinkmicInfo roomMultiGuestLinkmicInfo;

    @C09CT("top_live_guide")
    public String topLiveGuide;

    @C09CT("top_live_title")
    public String topLiveTitle;

    @C09CT("trigger_guide_time")
    public long triggerGuideTime;

    @C09CT("try_open_multi_guest_when_create_room")
    public boolean tryOpenMultiGuest;

    @C09CT("viewer_gifter_linkmic_enum")
    public long viewerGifterLinkmicEnum;

    public MultiLiveUserApplySettings() {
        this(null, null, null, false, null, null, 0L, 0L, 0L, 0L, null, 0L, 0L, null, null, null, false, "", null, null, "", "", null, new LinkedHashMap(), null, 0L, null, new ArrayList(), "", null, null, 0L);
    }

    public MultiLiveUserApplySettings(MultiLiveUserApplyPermission multiLiveUserApplyPermission, Integer num, RoomHostMultiGuestPermissionInfo roomHostMultiGuestPermissionInfo, boolean z, RoomAudienceMultiGuestPermissionInfo roomAudienceMultiGuestPermissionInfo, RoomMultiGuestLinkmicInfo roomMultiGuestLinkmicInfo, long j, long j2, long j3, long j4, AnchorSettingInfo anchorSettingInfo, long j5, long j6, MultiGuestPlayInfo multiGuestPlayInfo, MultiGuestLayoutInfo multiGuestLayoutInfo, FeedCard feedCard, boolean z2, String str, CardTag cardTag, AllLinkedUserData allLinkedUserData, String str2, String str3, GuestApplicationInfo guestApplicationInfo, Map<String, String> map, RandomMatchInfo randomMatchInfo, long j7, GuestInvitedInfo guestInvitedInfo, List<CardTag> list, String str4, MGEnterActionInfo mGEnterActionInfo, MultiGuestShareRevenueSettingInfo multiGuestShareRevenueSettingInfo, long j8) {
        this.multiLiveUserApplyPermission = multiLiveUserApplyPermission;
        this.linkMicServiceVersion = num;
        this.roomHostMultiGuestPermissionInfo = roomHostMultiGuestPermissionInfo;
        this.tryOpenMultiGuest = z;
        this.roomAudienceMultiGuestPermissionInfo = roomAudienceMultiGuestPermissionInfo;
        this.roomMultiGuestLinkmicInfo = roomMultiGuestLinkmicInfo;
        this.hostMultiGuestDevMode = j;
        this.audienceSharedInviteePanelType = j2;
        this.hostGifterLinkmicEnum = j3;
        this.viewerGifterLinkmicEnum = j4;
        this.anchorSettingInfo = anchorSettingInfo;
        this.hostSendGiftsToAllEnum = j5;
        this.audienceSendGiftsToAllEnum = j6;
        this.multiGuestPlayInfo = multiGuestPlayInfo;
        this.multiGuestLayoutInfo = multiGuestLayoutInfo;
        this.feedCard = feedCard;
        this.isEligibleForApplyAutoApprove = z2;
        this.topLiveTitle = str;
        this.playLabelTag = cardTag;
        this.allLinkedUserData = allLinkedUserData;
        this.topLiveGuide = str2;
        this.aiSummary = str3;
        this.guestApplicationInfo = guestApplicationInfo;
        this.extraInfo = map;
        this.randomMatchInfo = randomMatchInfo;
        this.triggerGuideTime = j7;
        this.guestInvitedInfo = guestInvitedInfo;
        this.hangoutCardTagList = list;
        this.backgroundStickerId = str4;
        this.mgEnterActionInfo = mGEnterActionInfo;
        this.multiGuestShareRevenueSettingInfo = multiGuestShareRevenueSettingInfo;
        this.multiGuestEnableRevenueRatio = j8;
    }
}
