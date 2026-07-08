package com.ss.android.ugc.aweme.ab;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes25.dex */
public final class LivEntranceOverDrawConfig implements Serializable {

    @C09CT("followingSkyFixVersion")
    public final int followingSkyFixVersion;

    @C09CT("inboxSkyFixVersion")
    public final int inboxSkyFixVersion;

    public LivEntranceOverDrawConfig() {
        this(0, 0);
    }

    public LivEntranceOverDrawConfig(int i, int i2) {
        this.inboxSkyFixVersion = i;
        this.followingSkyFixVersion = i2;
    }
}
