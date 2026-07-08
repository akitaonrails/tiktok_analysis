package com.ss.android.ugc.aweme.notice.api.bean;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class EntranceCount {

    @C09CT("count")
    public int count;

    @C09CT("entrance_id")
    public final int entranceId;

    @C09CT("sub_entrance_key")
    public final String entranceKey;

    @C09CT("is_archived")
    public int isArchived;

    @C09CT("is_mute")
    public int muteStatus;

    @C09CT("need_calculate")
    public int needCalculate;

    @C09CT("show_type")
    public Integer showType;

    public EntranceCount() {
        this(0, null, 0, null, 0, 0, 0);
    }

    public final int isArchived() {
        return this.isArchived;
    }

    public final void setArchived(int i) {
        this.isArchived = i;
    }

    public final void setCount(int i) {
        this.count = i;
    }

    public final void setMuteStatus(int i) {
        this.muteStatus = i;
    }

    public final void setNeedCalculate(int i) {
        this.needCalculate = i;
    }

    public final void setShowType(Integer num) {
        this.showType = num;
    }

    public EntranceCount(int i, String str, int i2, Integer num, int i3, int i4, int i5) {
        this.entranceId = i;
        this.entranceKey = str;
        this.count = i2;
        this.showType = num;
        this.muteStatus = i3;
        this.isArchived = i4;
        this.needCalculate = i5;
    }
}
