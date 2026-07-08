package com.bytedance.android.livesdkapi.depend.model.live;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class AgeRestricted {

    @C09CT("AgeInterval")
    public int ageInterval;

    @C09CT("restricted")
    public boolean restricted;

    @C09CT("source")
    public int source;

    public AgeRestricted() {
        this(false, 0);
    }

    public AgeRestricted(boolean z, int i) {
        this.restricted = z;
        this.ageInterval = i;
    }
}
