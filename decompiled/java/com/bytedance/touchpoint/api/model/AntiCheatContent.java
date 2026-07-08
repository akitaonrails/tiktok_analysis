package com.bytedance.touchpoint.api.model;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class AntiCheatContent {

    @C09CT("auto_display_enabled")
    public final boolean autoDisplayEnabled;

    @C09CT("auto_play_seconds")
    public final long autoPlaySeconds;

    @C09CT("is_cheat_user")
    public final boolean isCheatUser;

    @C09CT("mute_enabled")
    public final boolean muteEnabled;

    @C09CT("pip_mode_enabled")
    public final boolean pipModeEnabled;

    @C09CT("risk_level")
    public final int riskLevel;

    @C09CT("watch_video_contribution_length_limited")
    public final boolean watchVideoLengthLimited;

    public AntiCheatContent() {
        this(false, 0, false, false, false, false, 0L);
    }

    public AntiCheatContent(boolean z, int i, boolean z2, boolean z3, boolean z4, boolean z5, long j) {
        this.isCheatUser = z;
        this.riskLevel = i;
        this.muteEnabled = z2;
        this.autoDisplayEnabled = z3;
        this.pipModeEnabled = z4;
        this.watchVideoLengthLimited = z5;
        this.autoPlaySeconds = j;
    }
}
