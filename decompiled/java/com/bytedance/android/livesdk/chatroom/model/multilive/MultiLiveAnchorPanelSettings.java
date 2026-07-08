package com.bytedance.android.livesdk.chatroom.model.multilive;

import X.C09CT;
import X.C786410Ut5;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class MultiLiveAnchorPanelSettings {
    public int LIZ;
    public int LIZIZ;
    public boolean LIZJ;
    public int LIZLLL;

    @C09CT("allow_request_from_followers")
    public int allowRequestFromFollowers;

    @C09CT("allow_request_from_friends")
    public int allowRequestFromFriends;

    @C09CT("allow_request_from_others")
    public int allowRequestFromOthers;

    @C09CT("allow_request_from_user")
    public int allowViewerReq;

    @C09CT("applier_sort_gift_score_threshold")
    public long applierSortGiftScoreThreshold;

    @C09CT("applier_sort_setting")
    public int applierSortSetting;

    @C09CT("disable_guest_open_camera")
    public int disableGuestOpenCamera;

    @C09CT("disable_video_linkmic")
    public int disableVideoLinkmic;

    @C09CT("enable_show_multi_guest_layout")
    public int enableShowMultiGuestLayout;

    @C09CT("fix_mic_num")
    public int fixMicNumAction;

    @C09CT("layout")
    public int layoutType;

    @C09CT("multi_guest_allow_cohost_invitation")
    public int multiGuestAllowCohostInvitation;

    @C09CT("multi_guest_allow_cohost_invitation_once")
    public int multiGuestAllowCohostInvitationOnce;

    @C09CT("multi_guest_apply_auto_approve")
    public int multiGuestApplyAutoApprove;

    @C09CT("multi_guest_share_revenue_info_version")
    public long multiGuestShareRevenueInfoVersion;

    @C09CT("allow_request_from_follower_only")
    public int onlyAllowFollowerReq;

    @C09CT("save_as_default_layout")
    public int saveAsDefaultLayout;

    @C09CT("show_available_spot")
    public int showAvailableSpot;

    @C09CT("user_id")
    public Long userId;

    public MultiLiveAnchorPanelSettings() {
        this(0, 0, 0, 0, null, 0, 0L, 0, 0, false, 0, 0, 0, 0, 0, 0, 0, 0L, 0, 0, 0, 0, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultiLiveAnchorPanelSettings)) {
            return false;
        }
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings = (MultiLiveAnchorPanelSettings) obj;
        return this.layoutType == multiLiveAnchorPanelSettings.layoutType && this.fixMicNumAction == multiLiveAnchorPanelSettings.fixMicNumAction && this.allowViewerReq == multiLiveAnchorPanelSettings.allowViewerReq && this.onlyAllowFollowerReq == multiLiveAnchorPanelSettings.onlyAllowFollowerReq && Intrinsics.LJFF(this.userId, multiLiveAnchorPanelSettings.userId) && this.applierSortSetting == multiLiveAnchorPanelSettings.applierSortSetting && this.applierSortGiftScoreThreshold == multiLiveAnchorPanelSettings.applierSortGiftScoreThreshold && this.LIZ == multiLiveAnchorPanelSettings.LIZ && this.LIZIZ == multiLiveAnchorPanelSettings.LIZIZ && this.LIZJ == multiLiveAnchorPanelSettings.LIZJ && this.allowRequestFromFriends == multiLiveAnchorPanelSettings.allowRequestFromFriends && this.allowRequestFromFollowers == multiLiveAnchorPanelSettings.allowRequestFromFollowers && this.allowRequestFromOthers == multiLiveAnchorPanelSettings.allowRequestFromOthers && this.LIZLLL == multiLiveAnchorPanelSettings.LIZLLL && this.enableShowMultiGuestLayout == multiLiveAnchorPanelSettings.enableShowMultiGuestLayout && this.disableVideoLinkmic == multiLiveAnchorPanelSettings.disableVideoLinkmic && this.multiGuestApplyAutoApprove == multiLiveAnchorPanelSettings.multiGuestApplyAutoApprove && this.multiGuestShareRevenueInfoVersion == multiLiveAnchorPanelSettings.multiGuestShareRevenueInfoVersion && this.showAvailableSpot == multiLiveAnchorPanelSettings.showAvailableSpot && this.saveAsDefaultLayout == multiLiveAnchorPanelSettings.saveAsDefaultLayout && this.multiGuestAllowCohostInvitation == multiLiveAnchorPanelSettings.multiGuestAllowCohostInvitation && this.multiGuestAllowCohostInvitationOnce == multiLiveAnchorPanelSettings.multiGuestAllowCohostInvitationOnce && this.disableGuestOpenCamera == multiLiveAnchorPanelSettings.disableGuestOpenCamera;
    }

    public final int hashCode() {
        int i = ((((((this.layoutType * 31) + this.fixMicNumAction) * 31) + this.allowViewerReq) * 31) + this.onlyAllowFollowerReq) * 31;
        Long l = this.userId;
        return ((((((((((((((((((((((((((((((((((((i + (l == null ? 0 : l.hashCode())) * 31) + this.applierSortSetting) * 31) + C786410Ut5.Y2(this.applierSortGiftScoreThreshold)) * 31) + this.LIZ) * 31) + this.LIZIZ) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + this.allowRequestFromFriends) * 31) + this.allowRequestFromFollowers) * 31) + this.allowRequestFromOthers) * 31) + this.LIZLLL) * 31) + this.enableShowMultiGuestLayout) * 31) + this.disableVideoLinkmic) * 31) + this.multiGuestApplyAutoApprove) * 31) + C786410Ut5.Y2(this.multiGuestShareRevenueInfoVersion)) * 31) + this.showAvailableSpot) * 31) + this.saveAsDefaultLayout) * 31) + this.multiGuestAllowCohostInvitation) * 31) + this.multiGuestAllowCohostInvitationOnce) * 31) + this.disableGuestOpenCamera;
    }

    public final String toString() {
        return "MultiLiveAnchorPanelSettings(layoutType=" + this.layoutType + ", fixMicNumAction=" + this.fixMicNumAction + ", allowViewerReq=" + this.allowViewerReq + ", onlyAllowFollowerReq=" + this.onlyAllowFollowerReq + ", userId=" + this.userId + ", applierSortSetting=" + this.applierSortSetting + ", applierSortGiftScoreThreshold=" + this.applierSortGiftScoreThreshold + ", revenueShare=" + this.LIZ + ", revenueShareRatio=" + this.LIZIZ + ", enableSettingRatio=" + this.LIZJ + ", allowRequestFromFriends=" + this.allowRequestFromFriends + ", allowRequestFromFollowers=" + this.allowRequestFromFollowers + ", allowRequestFromOthers=" + this.allowRequestFromOthers + ", displayEmptySeat=" + this.LIZLLL + ", enableShowMultiGuestLayout=" + this.enableShowMultiGuestLayout + ", disableVideoLinkmic=" + this.disableVideoLinkmic + ", multiGuestApplyAutoApprove=" + this.multiGuestApplyAutoApprove + ", multiGuestShareRevenueInfoVersion=" + this.multiGuestShareRevenueInfoVersion + ", showAvailableSpot=" + this.showAvailableSpot + ", saveAsDefaultLayout=" + this.saveAsDefaultLayout + ", multiGuestAllowCohostInvitation=" + this.multiGuestAllowCohostInvitation + ", multiGuestAllowCohostInvitationOnce=" + this.multiGuestAllowCohostInvitationOnce + ", disableGuestOpenCamera=" + this.disableGuestOpenCamera + ')';
    }

    public static MultiLiveAnchorPanelSettings LIZ(MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        Long l;
        int i7;
        long j;
        int i8;
        int i9;
        boolean z;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21 = i3;
        int i22 = i2;
        int i23 = i;
        if ((i4 & 1) != 0) {
            i23 = multiLiveAnchorPanelSettings.layoutType;
        }
        if ((i4 & 2) != 0) {
            i22 = multiLiveAnchorPanelSettings.fixMicNumAction;
        }
        if ((i4 & 4) != 0) {
            i5 = multiLiveAnchorPanelSettings.allowViewerReq;
        } else {
            i5 = 0;
        }
        if ((i4 & 8) != 0) {
            i6 = multiLiveAnchorPanelSettings.onlyAllowFollowerReq;
        } else {
            i6 = 0;
        }
        if ((i4 & 16) != 0) {
            l = multiLiveAnchorPanelSettings.userId;
        } else {
            l = null;
        }
        if ((i4 & 32) != 0) {
            i7 = multiLiveAnchorPanelSettings.applierSortSetting;
        } else {
            i7 = 0;
        }
        long j2 = 0;
        if ((i4 & 64) != 0) {
            j = multiLiveAnchorPanelSettings.applierSortGiftScoreThreshold;
        } else {
            j = 0;
        }
        if ((i4 & 128) != 0) {
            i8 = multiLiveAnchorPanelSettings.LIZ;
        } else {
            i8 = 0;
        }
        if ((i4 & 256) != 0) {
            i9 = multiLiveAnchorPanelSettings.LIZIZ;
        } else {
            i9 = 0;
        }
        if ((i4 & 512) != 0) {
            z = multiLiveAnchorPanelSettings.LIZJ;
        } else {
            z = false;
        }
        if ((i4 & 1024) != 0) {
            i10 = multiLiveAnchorPanelSettings.allowRequestFromFriends;
        } else {
            i10 = 0;
        }
        if ((i4 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            i11 = multiLiveAnchorPanelSettings.allowRequestFromFollowers;
        } else {
            i11 = 0;
        }
        if ((i4 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            i12 = multiLiveAnchorPanelSettings.allowRequestFromOthers;
        } else {
            i12 = 0;
        }
        if ((i4 & 8192) != 0) {
            i13 = multiLiveAnchorPanelSettings.LIZLLL;
        } else {
            i13 = 0;
        }
        if ((i4 & 16384) != 0) {
            i14 = multiLiveAnchorPanelSettings.enableShowMultiGuestLayout;
        } else {
            i14 = 0;
        }
        if ((32768 & i4) != 0) {
            i15 = multiLiveAnchorPanelSettings.disableVideoLinkmic;
        } else {
            i15 = 0;
        }
        if ((65536 & i4) != 0) {
            i21 = multiLiveAnchorPanelSettings.multiGuestApplyAutoApprove;
        }
        if ((131072 & i4) != 0) {
            j2 = multiLiveAnchorPanelSettings.multiGuestShareRevenueInfoVersion;
        }
        if ((262144 & i4) != 0) {
            i16 = multiLiveAnchorPanelSettings.showAvailableSpot;
        } else {
            i16 = 0;
        }
        if ((524288 & i4) != 0) {
            i17 = multiLiveAnchorPanelSettings.saveAsDefaultLayout;
        } else {
            i17 = 0;
        }
        if ((1048576 & i4) != 0) {
            i18 = multiLiveAnchorPanelSettings.multiGuestAllowCohostInvitation;
        } else {
            i18 = 0;
        }
        if ((2097152 & i4) != 0) {
            i19 = multiLiveAnchorPanelSettings.multiGuestAllowCohostInvitationOnce;
        } else {
            i19 = 0;
        }
        if ((i4 & 4194304) != 0) {
            i20 = multiLiveAnchorPanelSettings.disableGuestOpenCamera;
        } else {
            i20 = 0;
        }
        multiLiveAnchorPanelSettings.getClass();
        return new MultiLiveAnchorPanelSettings(i23, i22, i5, i6, l, i7, j, i8, i9, z, i10, i11, i12, i13, i14, i15, i21, j2, i16, i17, i18, i19, i20);
    }

    public MultiLiveAnchorPanelSettings(int i, int i2, int i3, int i4, Long l, int i5, long j, int i6, int i7, boolean z, int i8, int i9, int i10, int i11, int i12, int i13, int i14, long j2, int i15, int i16, int i17, int i18, int i19) {
        this.layoutType = i;
        this.fixMicNumAction = i2;
        this.allowViewerReq = i3;
        this.onlyAllowFollowerReq = i4;
        this.userId = l;
        this.applierSortSetting = i5;
        this.applierSortGiftScoreThreshold = j;
        this.LIZ = i6;
        this.LIZIZ = i7;
        this.LIZJ = z;
        this.allowRequestFromFriends = i8;
        this.allowRequestFromFollowers = i9;
        this.allowRequestFromOthers = i10;
        this.LIZLLL = i11;
        this.enableShowMultiGuestLayout = i12;
        this.disableVideoLinkmic = i13;
        this.multiGuestApplyAutoApprove = i14;
        this.multiGuestShareRevenueInfoVersion = j2;
        this.showAvailableSpot = i15;
        this.saveAsDefaultLayout = i16;
        this.multiGuestAllowCohostInvitation = i17;
        this.multiGuestAllowCohostInvitationOnce = i18;
        this.disableGuestOpenCamera = i19;
    }
}
