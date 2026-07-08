package com.bytedance.android.livesdk.chatroom.model.multilive;

import X.C09CT;
import tikcast.linkmic.common.MgTraceInfo;

/* JADX INFO: loaded from: classes16.dex */
public final class UpdateSettingParams {

    @C09CT("allow_request_from_followers")
    public int allowRequestFromFollowers;

    @C09CT("allow_request_from_friends")
    public int allowRequestFromFriends;

    @C09CT("allow_request_from_others")
    public int allowRequestFromOthers;

    @C09CT("channel_id")
    public Long channelId;

    @C09CT("disable_guest_open_camera")
    public int disableGuestOpenCamera;

    @C09CT("disable_video_linkmic")
    public int disableVideoLinkmic;

    @C09CT("display_empty_seat")
    public int displayEmptySeat;

    @C09CT("enable_show_multi_guest_layout")
    public int enableShowMultiGuestLayout;

    @C09CT("live_id")
    public Long liveId;

    @C09CT("mg_trace_info")
    public MgTraceInfo mgTraceInfo;

    @C09CT("multi_guest_allow_cohost_invitation")
    public int multiGuestAllowCohostInvitation;

    @C09CT("multi_guest_allow_cohost_invitation_once")
    public int multiGuestAllowCohostInvitationOnce;

    @C09CT("multi_guest_apply_auto_approve")
    public int multiGuestApplyAutoApprove;

    @C09CT("new_allow_request_from_follower_only")
    public int newAllowRequestFromFollowerOnly;

    @C09CT("new_allow_request_from_user")
    public int newAllowRequestFromUser;

    @C09CT("new_applier_sort_gift_score_threshold")
    public long newApplierSortGiftScoreThreshold;

    @C09CT("new_applier_sort_setting")
    public int newApplierSortSetting;

    @C09CT("new_fix_mic_num")
    public int newFixMicNum;

    @C09CT("new_layout")
    public int newLayout;

    @C09CT("reset_point_after_leave")
    public int resetPointAfterLeave;

    @C09CT("room_id")
    public Long roomId;

    @C09CT("save_as_default_layout")
    public int saveAsDefaultLayout;

    @C09CT("share_revenue_setting")
    public int shareRevenueSetting;

    @C09CT("share_revenue_setting_ratio")
    public int shareRevenueSettingRatio;

    @C09CT("show_available_spot")
    public int showAvailableSpot;

    @C09CT("update_scene")
    public int updateScene;

    @C09CT("new_layout_id")
    public String newLayoutId = "";

    @C09CT("background_sticker_id")
    public String backgroundStickerId = "";

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", new_layout=");
        sb.append(this.newLayout);
        sb.append(", new_fix_mic_num=");
        sb.append(this.newFixMicNum);
        sb.append(", new_allow_request_from_user=");
        sb.append(this.newAllowRequestFromUser);
        sb.append(", new_allow_request_from_follower_only=");
        sb.append(this.newAllowRequestFromFollowerOnly);
        if (this.channelId != null) {
            sb.append(", channel_id=");
            sb.append(this.channelId);
        }
        if (this.roomId != null) {
            sb.append(", room_id=");
            sb.append(this.roomId);
        }
        if (this.liveId != null) {
            sb.append(", live_id=");
            sb.append(this.liveId);
        }
        sb.replace(0, 2, "UpdateSettingParams{");
        sb.append('}');
        return sb.toString();
    }
}
