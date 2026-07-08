package com.bytedance.geckox.statistic.model;

import X.C09CT;
import X.C1551530qTf;
import com.ss.android.ugc.bytex.pthread.base.BuildConfig;

/* JADX INFO: loaded from: classes24.dex */
public class SyncEventModel {

    @C09CT("aid")
    public long aid;

    @C09CT("os")
    public int os;

    @C09CT("region")
    public String region;

    @C09CT("sync_stats_type")
    public int syncStatsType;

    @C09CT("sync_task_id")
    public int syncTaskId;

    @C09CT("sync_task_type")
    public int syncTaskType;

    @C09CT("params_for_special")
    public String params = "gecko";

    @C09CT("sdk_version")
    public String sdkVersion = BuildConfig.VERSION_NAME;

    public SyncEventModel(C1551530qTf c1551530qTf) {
        this.aid = c1551530qTf.LJII.longValue();
        this.region = c1551530qTf.LJIIJJI;
    }

    public void setSyncStatsType(int i) {
        this.syncStatsType = i;
    }

    public void setSyncTaskId(int i) {
        this.syncTaskId = i;
    }

    public void setSyncTaskType(int i) {
        this.syncTaskType = i;
    }
}
