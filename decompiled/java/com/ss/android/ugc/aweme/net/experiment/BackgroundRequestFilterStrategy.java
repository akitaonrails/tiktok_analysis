package com.ss.android.ugc.aweme.net.experiment;

import X.C08CX;
import X.C09CT;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class BackgroundRequestFilterStrategy {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("strategy")
    public final Set<Strategy> strategy;

    public BackgroundRequestFilterStrategy() {
        this(false, null, 3, null);
    }

    public BackgroundRequestFilterStrategy(boolean z, Set<Strategy> set) {
        this.enable = z;
        this.strategy = set;
    }

    public BackgroundRequestFilterStrategy(boolean z, Set set, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? C08CX.INSTANCE : set);
    }
}
