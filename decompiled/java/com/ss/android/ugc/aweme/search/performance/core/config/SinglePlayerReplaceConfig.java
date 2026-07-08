package com.ss.android.ugc.aweme.search.performance.core.config;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class SinglePlayerReplaceConfig {

    @C09CT("enable_single_player_single_thread_mode")
    public final boolean enableSinglePlayerMultiThread;

    @C09CT("enable_single_player_replace")
    public final boolean enableSinglePlayerReplace;

    public SinglePlayerReplaceConfig() {
        this(false, false);
    }

    public SinglePlayerReplaceConfig(boolean z, boolean z2) {
        this.enableSinglePlayerReplace = z;
        this.enableSinglePlayerMultiThread = z2;
    }
}
