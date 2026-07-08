package com.ss.android.ugc.aweme.friendstab.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes25.dex */
public final class FriendsV3LoadPreviousReqConfig {

    @C09CT("load_previous_count")
    public final int loadPreviousCount;

    @C09CT("load_previous_empty_retry_count")
    public final int loadPreviousEmptyRetry;

    @C09CT("load_previous_error_retry_count")
    public final int loadPreviousErrorRetry;

    @C09CT("load_previous_prefetch_offset")
    public final int loadPreviousPrefetchCount;

    public FriendsV3LoadPreviousReqConfig() {
        this(6, 1, 3, 3);
    }

    public FriendsV3LoadPreviousReqConfig(int i, int i2, int i3, int i4) {
        this.loadPreviousCount = i;
        this.loadPreviousPrefetchCount = i2;
        this.loadPreviousEmptyRetry = i3;
        this.loadPreviousErrorRetry = i4;
    }
}
