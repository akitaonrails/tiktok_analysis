package com.ss.android.ugc.profile.business.ur.socialavatar.network;

import X.C09CT;

/* JADX INFO: loaded from: classes7.dex */
public final class SocialAvatarTaskProgress {

    @C09CT("complete_percentage")
    public final Float completePercentage;

    @C09CT("create_time")
    public final Long createTimeMs;

    @C09CT("end_time")
    public final Long endTimeMs;

    @C09CT("start_time")
    public final Long startTimeMs;

    @C09CT("task_status")
    public final Integer status;

    @C09CT("status_message")
    public final String statusMessage;

    @C09CT("task_id")
    public final String taskId;

    @C09CT("waiting_time")
    public final Long waitingTimeMs;

    public SocialAvatarTaskProgress() {
        this(null, null, null, null, null, null, null, null);
    }

    public SocialAvatarTaskProgress(String str, Integer num, String str2, Float f, Long l, Long l2, Long l3, Long l4) {
        this.taskId = str;
        this.status = num;
        this.statusMessage = str2;
        this.completePercentage = f;
        this.waitingTimeMs = l;
        this.createTimeMs = l2;
        this.startTimeMs = l3;
        this.endTimeMs = l4;
    }
}
