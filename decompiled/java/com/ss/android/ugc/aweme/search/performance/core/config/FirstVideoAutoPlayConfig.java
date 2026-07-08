package com.ss.android.ugc.aweme.search.performance.core.config;

import X.C09CT;

/* JADX INFO: loaded from: classes11.dex */
public final class FirstVideoAutoPlayConfig {

    @C09CT("enable_auto_play_logic_run_in_first_chunk")
    public final boolean enableAutoPlayLogicRunInFirstChunk;

    @C09CT("enable_auto_play_logic_run_once")
    public final boolean enableAutoPlayLogicRunOnce;

    public FirstVideoAutoPlayConfig() {
        this(false, false);
    }

    public FirstVideoAutoPlayConfig(boolean z, boolean z2) {
        this.enableAutoPlayLogicRunOnce = z;
        this.enableAutoPlayLogicRunInFirstChunk = z2;
    }
}
