package com.ss.android.ugc.aweme.verify;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class FavoriteFakeWriteExpV2SettingModel {

    @C09CT("retry_count")
    public final int retryCount;

    @C09CT("retry_interval")
    public final long retryInterval;

    @C09CT("rollback_disable")
    public final boolean rollbackDisable;

    @C09CT("toast_enable")
    public final boolean toastEnable;

    @C09CT("toast_interval")
    public final long toastInterval;

    public FavoriteFakeWriteExpV2SettingModel() {
        this(2, 300000L, 600000L, false, false);
    }

    public FavoriteFakeWriteExpV2SettingModel(int i, long j, long j2, boolean z, boolean z2) {
        this.retryCount = i;
        this.retryInterval = j;
        this.toastInterval = j2;
        this.toastEnable = z;
        this.rollbackDisable = z2;
    }
}
