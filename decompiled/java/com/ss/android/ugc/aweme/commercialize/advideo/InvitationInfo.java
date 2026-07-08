package com.ss.android.ugc.aweme.commercialize.advideo;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes30.dex */
public final class InvitationInfo implements Serializable {

    @C09CT("applied_end_time")
    public final long appliedEndTime;

    @C09CT("applied_start_time")
    public final long appliedStartTime;

    @C09CT("ba_user_id")
    public final String baUserId;

    @C09CT("ba_user_name")
    public final String baUserName;

    @C09CT("end_time")
    public final long endTime;

    @C09CT("invitation_status")
    public final InvitationStatus invitationStatus;

    @C09CT("start_time")
    public final long startTime;

    @C09CT("video_info")
    public final AdVideoInfo videoInfo;

    public InvitationInfo(AdVideoInfo adVideoInfo, String str, String str2, InvitationStatus invitationStatus, long j, long j2, long j3, long j4) {
        this.videoInfo = adVideoInfo;
        this.baUserId = str;
        this.baUserName = str2;
        this.invitationStatus = invitationStatus;
        this.startTime = j;
        this.endTime = j2;
        this.appliedStartTime = j3;
        this.appliedEndTime = j4;
    }
}
