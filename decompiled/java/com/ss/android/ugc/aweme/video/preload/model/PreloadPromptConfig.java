package com.ss.android.ugc.aweme.video.preload.model;

import X.C09CT;

/* JADX INFO: loaded from: classes5.dex */
public final class PreloadPromptConfig {

    @C09CT("fix_miss_callback_click")
    public final boolean fixClickPlayMissCallback;

    @C09CT("fix_miss_callback_splash_feed_ad")
    public final boolean fixSplashFeedAdMissCallback;

    @C09CT("add_callback_when_play_complete")
    public final boolean preloadWhenPlayComplete;

    public PreloadPromptConfig() {
        this(false, false, false);
    }

    public PreloadPromptConfig(boolean z, boolean z2, boolean z3) {
        this.fixSplashFeedAdMissCallback = z;
        this.fixClickPlayMissCallback = z2;
        this.preloadWhenPlayComplete = z3;
    }
}
