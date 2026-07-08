package com.ss.android.ugc.aweme.inbox.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes25.dex */
public final class LiveEventExitFc {

    @C09CT("display_limit")
    public final long displayLimit;

    @C09CT("enable")
    public final boolean enable;

    public LiveEventExitFc() {
        this(true, 7L);
    }

    public LiveEventExitFc(boolean z, long j) {
        this.enable = z;
        this.displayLimit = j;
    }
}
