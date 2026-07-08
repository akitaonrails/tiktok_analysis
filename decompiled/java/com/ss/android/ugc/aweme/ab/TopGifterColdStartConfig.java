package com.ss.android.ugc.aweme.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes8.dex */
public final class TopGifterColdStartConfig {

    @C09CT("gap0_check")
    public boolean gap0Check;

    @C09CT("main_enable")
    public boolean mainEnable;

    @C09CT("pre_pull_stream")
    public boolean prePullStream;

    @C09CT("repeat_check")
    public boolean repeatCheck;

    @C09CT("timeout")
    public long timeout;

    public TopGifterColdStartConfig() {
        this(true, 3000L, true, true, false);
    }

    public TopGifterColdStartConfig(boolean z, long j, boolean z2, boolean z3, boolean z4) {
        this.mainEnable = z;
        this.timeout = j;
        this.gap0Check = z2;
        this.repeatCheck = z3;
        this.prePullStream = z4;
    }
}
