package com.ss.android.ugc.aweme.comment.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes22.dex */
public final class CmtUserBadgeInfoStruct implements Serializable {

    @C09CT("activity_id")
    public final Long activityId;

    @C09CT("badge_id")
    public Long badgeId;

    @C09CT("end_time")
    public Long endTime;

    @C09CT("level")
    public Integer level;

    @C09CT("url")
    public String url;

    public CmtUserBadgeInfoStruct() {
        this(null, null, null, null, null);
    }

    public final void setBadgeId(Long l) {
        this.badgeId = l;
    }

    public final void setEndTime(Long l) {
        this.endTime = l;
    }

    public final void setLevel(Integer num) {
        this.level = num;
    }

    public final void setUrl(String str) {
        this.url = str;
    }

    public CmtUserBadgeInfoStruct(Long l, String str, Integer num, Long l2, Long l3) {
        this.activityId = l;
        this.url = str;
        this.level = num;
        this.badgeId = l2;
        this.endTime = l3;
    }
}
