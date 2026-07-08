package com.ss.android.ugc.aweme.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes25.dex */
public final class GapFixConfig {

    @C09CT("clear_session")
    public final boolean clearSession;

    @C09CT("fix_reset_item_position")
    public final boolean fixResetItemPosition;

    @C09CT("overwrite_session_info")
    public final boolean overwriteSessionInfo;

    @C09CT("use_max_position")
    public final boolean useMaxPosition;

    public GapFixConfig() {
        this(true, false, true, true);
    }

    public GapFixConfig(boolean z, boolean z2, boolean z3, boolean z4) {
        this.fixResetItemPosition = z;
        this.clearSession = z2;
        this.useMaxPosition = z3;
        this.overwriteSessionInfo = z4;
    }
}
