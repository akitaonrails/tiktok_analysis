package com.ss.android.ugc.aweme.discover.hitrank;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class HitTaskInfo implements Serializable {

    @C09CT("compeleted_task_cnt")
    public int compeletedTaskCnt;

    @C09CT("total_task_cnt")
    public int totalTaskCnt;

    public final void setCompeletedTaskCnt(int i) {
        this.compeletedTaskCnt = i;
    }

    public final void setTotalTaskCnt(int i) {
        this.totalTaskCnt = i;
    }

    public HitTaskInfo(int i, int i2) {
        this.compeletedTaskCnt = i;
        this.totalTaskCnt = i2;
    }
}
