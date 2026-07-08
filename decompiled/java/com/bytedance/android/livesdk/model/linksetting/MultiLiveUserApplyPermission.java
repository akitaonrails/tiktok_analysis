package com.bytedance.android.livesdk.model.linksetting;

import X.C09CT;

/* JADX INFO: loaded from: classes16.dex */
public final class MultiLiveUserApplyPermission {

    @C09CT("applier_sort_gift_score_threshold")
    public long applierSortGiftScoreThreshold;

    @C09CT("applier_sort_setting")
    public long applierSortSetting;

    @C09CT("multi_guest_allow_request_from_followers")
    public long multiGuestAllowRequestFromFollowers;

    @C09CT("multi_guest_allow_request_from_friends")
    public long multiGuestAllowRequestFromFriends;

    @C09CT("multi_guest_allow_request_from_others")
    public long multiGuestAllowRequestFromOthers;

    @C09CT("multi_guest_apply_auto_approve")
    public long multiGuestApplyAutoApprove;

    @C09CT("multi_guest_disable_guest_open_camera")
    public long multiGuestDisableGuestOpenCamera;

    @C09CT("multi_guest_disable_video_linkmic")
    public long multiGuestDisableVideoLinkmic;

    @C09CT("multi_guest_reset_point_after_leave")
    public long multiGuestResetPointAfterLeave;

    @C09CT("multi_live_apply_permission")
    public int multiLiveApplyPermission;

    public MultiLiveUserApplyPermission() {
        this(0, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L);
    }

    public MultiLiveUserApplyPermission(int i, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9) {
        this.multiLiveApplyPermission = i;
        this.applierSortSetting = j;
        this.applierSortGiftScoreThreshold = j2;
        this.multiGuestAllowRequestFromFriends = j3;
        this.multiGuestAllowRequestFromFollowers = j4;
        this.multiGuestAllowRequestFromOthers = j5;
        this.multiGuestDisableVideoLinkmic = j6;
        this.multiGuestApplyAutoApprove = j7;
        this.multiGuestResetPointAfterLeave = j8;
        this.multiGuestDisableGuestOpenCamera = j9;
    }
}
