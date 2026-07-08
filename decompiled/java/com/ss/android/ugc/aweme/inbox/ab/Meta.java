package com.ss.android.ugc.aweme.inbox.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes25.dex */
public final class Meta {

    @C09CT("delay")
    public final long delay;

    @C09CT("fixed")
    public final boolean fixed;

    public Meta() {
        this(false, 80L);
    }

    public Meta(boolean z, long j) {
        this.fixed = z;
        this.delay = j;
    }
}
