package com.ss.android.ugc.feed.platform.ab;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
public final class FeedComponentsMarginBugFixConfig implements Serializable {
    public static final int $stable = 0;

    @C09CT("state_control_margin_fix")
    public final boolean stateControlMarginFix;

    @C09CT("tv_cast_bug_fix_enable")
    public final boolean tvCastBugfix;

    public FeedComponentsMarginBugFixConfig() {
        this(false, false);
    }

    public FeedComponentsMarginBugFixConfig(boolean z, boolean z2) {
        this.tvCastBugfix = z;
        this.stateControlMarginFix = z2;
    }
}
