package com.ss.android.ugc.aweme.config;

import X.C09CT;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class EcSearchRewardsCoinModel implements Serializable {

    @C09CT("pause_time")
    public final long pauseTime;

    @C09CT("pendant_append_height")
    public final int pendantAppendHeight;

    @C09CT("retry_time")
    public final int retryTime;

    @C09CT("task_key")
    public final String taskKey;

    @C09CT("use_opt_state_list")
    public final List<Integer> useOptStateList;

    public EcSearchRewardsCoinModel() {
        this(3L, 0, "mact_e_search", 2, new ArrayList());
    }

    public EcSearchRewardsCoinModel(long j, int i, String str, int i2, List<Integer> list) {
        this.pauseTime = j;
        this.pendantAppendHeight = i;
        this.taskKey = str;
        this.retryTime = i2;
        this.useOptStateList = list;
    }
}
