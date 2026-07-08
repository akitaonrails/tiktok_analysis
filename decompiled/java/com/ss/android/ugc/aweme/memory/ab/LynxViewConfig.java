package com.ss.android.ugc.aweme.memory.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes4.dex */
public final class LynxViewConfig {
    public static final int $stable = 0;

    @C09CT("bid")
    public final boolean bid;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("overall")
    public final boolean overall;

    @C09CT("page")
    public final boolean page;

    public LynxViewConfig() {
        this(false, false, false, false);
    }

    public LynxViewConfig(boolean z, boolean z2, boolean z3, boolean z4) {
        this.enable = z;
        this.overall = z2;
        this.page = z3;
        this.bid = z4;
    }
}
