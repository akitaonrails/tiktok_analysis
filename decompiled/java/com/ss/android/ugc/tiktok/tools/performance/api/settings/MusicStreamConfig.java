package com.ss.android.ugc.tiktok.tools.performance.api.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes26.dex */
public final class MusicStreamConfig {

    @C09CT("is_enable")
    public final boolean isEnable;

    @C09CT("net_level_threshold")
    public final int netLevelThreshold;

    @C09CT("start_play_progress")
    public final float startPlayProgress;

    public MusicStreamConfig() {
        this(false, 1000.0f, 100);
    }

    public MusicStreamConfig(boolean z, float f, int i) {
        this.isEnable = z;
        this.startPlayProgress = f;
        this.netLevelThreshold = i;
    }
}
