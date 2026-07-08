package com.ss.android.ugc.feed.platform.popup.exp;

import X.C09CT;

/* JADX INFO: loaded from: classes32.dex */
public final class FeedDynamicBugfixConfig {

    @C09CT("enable_immersive_mode")
    public final boolean enableImmersiveMode;

    @C09CT("enable_player_panel")
    public final boolean enablePlayerPanel;

    public FeedDynamicBugfixConfig() {
        this(true, true);
    }

    public FeedDynamicBugfixConfig(boolean z, boolean z2) {
        this.enablePlayerPanel = z;
        this.enableImmersiveMode = z2;
    }
}
