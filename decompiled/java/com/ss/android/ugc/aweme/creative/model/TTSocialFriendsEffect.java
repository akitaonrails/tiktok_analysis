package com.ss.android.ugc.aweme.creative.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;

/* JADX INFO: loaded from: classes30.dex */
public final class TTSocialFriendsEffect implements Serializable {

    @C09CT("duration")
    public long duration;

    @C09CT("end_time")
    public Long endTime;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String id;

    @C09CT("start_time")
    public Long startTime;

    @C09CT("ts")
    public Long timestamp;

    @C09CT("uid")
    public final String uid;

    @C09CT("visible")
    public Boolean visible;

    public TTSocialFriendsEffect() {
        this(null, null, null, null, null, null, 0L);
    }

    public final TTSocialFriendsEffect copy(Boolean bool, Long l, String str, String str2, Long l2, Long l3, long j) {
        return new TTSocialFriendsEffect(bool, l, str, str2, l2, l3, j);
    }

    public final void setDuration(long j) {
        this.duration = j;
    }

    public final void setEndTime(Long l) {
        this.endTime = l;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final void setStartTime(Long l) {
        this.startTime = l;
    }

    public final void setTimestamp(Long l) {
        this.timestamp = l;
    }

    public final void setVisible(Boolean bool) {
        this.visible = bool;
    }

    public TTSocialFriendsEffect(Boolean bool, Long l, String str, String str2, Long l2, Long l3, long j) {
        this.visible = bool;
        this.timestamp = l;
        this.id = str;
        this.uid = str2;
        this.startTime = l2;
        this.endTime = l3;
        this.duration = j;
    }
}
