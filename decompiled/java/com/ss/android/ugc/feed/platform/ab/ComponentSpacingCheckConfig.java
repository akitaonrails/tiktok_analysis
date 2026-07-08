package com.ss.android.ugc.feed.platform.ab;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes12.dex */
public final class ComponentSpacingCheckConfig implements Serializable {
    public static final int $stable = 0;

    @C09CT("enable_check")
    public final boolean enableCheck;

    @C09CT("only_check_for_spacing_ab")
    public final boolean onlyCheckForAB;

    public ComponentSpacingCheckConfig() {
        this(false, true);
    }

    public ComponentSpacingCheckConfig(boolean z, boolean z2) {
        this.enableCheck = z;
        this.onlyCheckForAB = z2;
    }
}
