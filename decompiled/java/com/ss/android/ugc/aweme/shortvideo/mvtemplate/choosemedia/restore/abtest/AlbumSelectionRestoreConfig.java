package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.restore.abtest;

import X.C09CT;

/* JADX INFO: loaded from: classes9.dex */
public final class AlbumSelectionRestoreConfig {

    @C09CT("enable")
    public final Boolean enable;

    @C09CT("expired_minutes")
    public final Integer expiredMinutes;

    @C09CT("min_selection_count")
    public final Integer minSelectionCount;

    public AlbumSelectionRestoreConfig(Boolean bool, Integer num, Integer num2) {
        this.enable = bool;
        this.expiredMinutes = num;
        this.minSelectionCount = num2;
    }
}
