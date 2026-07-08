package com.ss.android.ugc.aweme.im.chatlist.impl.feature.sessionrefactor.processor.vosnapshot;

import X.C09CT;

/* JADX INFO: loaded from: classes36.dex */
public final class DMCellSnapshotConfig {

    @C09CT("feature_flag")
    public final int featureFlag;

    @C09CT("longer_schedule_save_duration")
    public final long longerScheduleSaveDuration;

    @C09CT("normal_schedule_save_duration")
    public final long normalScheduleSaveDuration;

    @C09CT("vo_list_debounce_duration")
    public final long voListDebounceDuration;

    @C09CT("vo_list_size")
    public final int voListSize;

    public DMCellSnapshotConfig() {
        this(0, 50, 10000L, 600000L, 300000L);
    }

    public DMCellSnapshotConfig(int i, int i2, long j, long j2, long j3) {
        this.featureFlag = i;
        this.voListSize = i2;
        this.voListDebounceDuration = j;
        this.longerScheduleSaveDuration = j2;
        this.normalScheduleSaveDuration = j3;
    }
}
