package com.ss.android.ugc.aweme.search.performance.core.config;

import X.C09CT;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchJitBlockConfig {

    @C09CT("enable_launch_jit")
    public final boolean enableLaunchJit;

    @C09CT("enable_request_jit")
    public final boolean enableRequestJit;

    @C09CT("enable_scroll_jit")
    public final boolean enableScrollJit;

    @C09CT("launch_duration")
    public final long launchDuration;

    @C09CT("request_duration")
    public final long requestDuration;

    @C09CT("scroll_duration")
    public final long scrollDuration;

    public SearchJitBlockConfig() {
        this(0L, 0L, 0L, false, false, false);
    }

    public SearchJitBlockConfig(long j, long j2, long j3, boolean z, boolean z2, boolean z3) {
        this.requestDuration = j;
        this.scrollDuration = j2;
        this.launchDuration = j3;
        this.enableRequestJit = z;
        this.enableScrollJit = z2;
        this.enableLaunchJit = z3;
    }
}
