package com.bytedance.android.livesdk.livesetting.message;

import X.C09CT;

/* JADX INFO: loaded from: classes13.dex */
public final class AsyncDispatchConfig {

    @C09CT("enable")
    public boolean enable;

    @C09CT("game_notice")
    public boolean gameNotice;

    @C09CT("link_async")
    public boolean linkAsync;

    @C09CT("public_screen")
    public boolean publicScreen;

    @C09CT("stream_goal")
    public boolean streamGoal;

    public AsyncDispatchConfig() {
        this(false, false, false, false, false);
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final boolean getGameNotice() {
        return this.gameNotice;
    }

    public final boolean getLinkAsync() {
        return this.linkAsync;
    }

    public final boolean getPublicScreen() {
        return this.publicScreen;
    }

    public final boolean getStreamGoal() {
        return this.streamGoal;
    }

    public final void setEnable(boolean z) {
        this.enable = z;
    }

    public final void setGameNotice(boolean z) {
        this.gameNotice = z;
    }

    public final void setLinkAsync(boolean z) {
        this.linkAsync = z;
    }

    public final void setPublicScreen(boolean z) {
        this.publicScreen = z;
    }

    public final void setStreamGoal(boolean z) {
        this.streamGoal = z;
    }

    public AsyncDispatchConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.enable = z;
        this.linkAsync = z2;
        this.gameNotice = z3;
        this.publicScreen = z4;
        this.streamGoal = z5;
    }
}
