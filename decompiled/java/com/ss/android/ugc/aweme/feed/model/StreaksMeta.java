package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class StreaksMeta implements Serializable {

    @C09CT("streaks_level")
    public int streaksLevel;

    public StreaksMeta() {
        this(-1);
    }

    public StreaksMeta(int i) {
        this.streaksLevel = i;
    }
}
