package com.ss.android.ugc.aweme.search.performance.core.config;

import X.C09CT;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchPreloadLayoutOptConfig {

    @C09CT("enable_async_create")
    public final boolean enableAsyncCreate;

    @C09CT("enable_create_delay")
    public final boolean enableCreateDelay;

    @C09CT("enable_preload")
    public final boolean enablePreload;

    @C09CT("enable_view_stub_preload")
    public final boolean enableViewStubPreload;

    public SearchPreloadLayoutOptConfig() {
        this(false, false, false, false);
    }

    public SearchPreloadLayoutOptConfig(boolean z, boolean z2, boolean z3, boolean z4) {
        this.enablePreload = z;
        this.enableAsyncCreate = z2;
        this.enableCreateDelay = z3;
        this.enableViewStubPreload = z4;
    }
}
