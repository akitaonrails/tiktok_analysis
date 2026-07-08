package com.ss.android.ugc.aweme.notice.api.bean;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class NoticeCount {

    @C09CT("point_show_time")
    public final Long aliveDuration;

    @C09CT("clear_occasion")
    public Integer clearOccasion;

    @C09CT("count")
    public int count;

    @C09CT("extra")
    public NoticeCountExtra extra;

    @C09CT("group")
    public int group;

    @C09CT("is_mute")
    public int muteStatus;

    @C09CT("show_type")
    public Integer showType;

    public final void setClearOccasion(Integer num) {
        this.clearOccasion = num;
    }

    public final void setCount(int i) {
        this.count = i;
    }

    public final void setExtra(NoticeCountExtra noticeCountExtra) {
        this.extra = noticeCountExtra;
    }

    public final void setGroup(int i) {
        this.group = i;
    }

    public final void setMuteStatus(int i) {
        this.muteStatus = i;
    }

    public final void setShowType(Integer num) {
        this.showType = num;
    }

    public NoticeCount(int i, int i2, Integer num, Long l, int i3, Integer num2, NoticeCountExtra noticeCountExtra) {
        this.count = i;
        this.group = i2;
        this.showType = num;
        this.aliveDuration = l;
        this.muteStatus = i3;
        this.clearOccasion = num2;
        this.extra = noticeCountExtra;
    }
}
