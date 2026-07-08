package com.ss.android.ugc.profile.business.ur.school.datasource;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public final class GroupSectionInfo implements Serializable {
    public static final int $stable = 8;

    @C09CT("my_cnt")
    public Integer myCnt;

    @C09CT("others_cnt")
    public Integer othersCnt;

    public GroupSectionInfo() {
        this(null, null);
    }

    public final void setMyCnt(Integer num) {
        this.myCnt = num;
    }

    public final void setOthersCnt(Integer num) {
        this.othersCnt = num;
    }

    public GroupSectionInfo(Integer num, Integer num2) {
        this.myCnt = num;
        this.othersCnt = num2;
    }
}
