package com.ss.android.ugc.aweme.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes24.dex */
public final class Model {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("timeout")
    public final long timeout;

    public Model() {
        this(true, 3000L);
    }

    public Model(boolean z, long j) {
        this.enable = z;
        this.timeout = j;
    }
}
