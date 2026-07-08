package com.ss.android.ugc.aweme.im.common.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes15.dex */
public final class MessageListPreloadData {

    @C09CT("async_diff")
    public final boolean asyncDiff;

    @C09CT("preload_size")
    public final int preloadSize;

    public MessageListPreloadData() {
        this(0, false);
    }

    public MessageListPreloadData(int i, boolean z) {
        this.preloadSize = i;
        this.asyncDiff = z;
    }
}
