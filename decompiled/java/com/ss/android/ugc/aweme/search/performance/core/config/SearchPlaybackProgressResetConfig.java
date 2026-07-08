package com.ss.android.ugc.aweme.search.performance.core.config;

import X.C09CT;

/* JADX INFO: loaded from: classes5.dex */
public final class SearchPlaybackProgressResetConfig {

    @C09CT("enable_playback_progress_reset")
    public final int enablePlaybackProgressReset;

    @C09CT("enable_show_cover_when_pause")
    public final int enableShowCoverWhenPause;

    public SearchPlaybackProgressResetConfig() {
        this(0, 0);
    }

    public SearchPlaybackProgressResetConfig(int i, int i2) {
        this.enablePlaybackProgressReset = i;
        this.enableShowCoverWhenPause = i2;
    }
}
