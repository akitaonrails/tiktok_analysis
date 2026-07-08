package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes19.dex */
public final class HostBackToInnerConfig {
    public static final TypeAdapter ADAPTER = new HostBackToInnerConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("auto_draw_delay")
    public long autoDrawDelay;

    @C09CT("enable_auto_draw")
    public boolean enableAutoDraw;

    @C09CT("enable")
    public boolean enableOpt;

    public HostBackToInnerConfig() {
        this(false, false, 1000L);
    }

    public final long getAutoDrawDelay() {
        return this.autoDrawDelay;
    }

    public final boolean getEnableAutoDraw() {
        return this.enableAutoDraw;
    }

    public final boolean getEnableOpt() {
        return this.enableOpt;
    }

    public final void setAutoDrawDelay(long j) {
        this.autoDrawDelay = j;
    }

    public final void setEnableAutoDraw(boolean z) {
        this.enableAutoDraw = z;
    }

    public final void setEnableOpt(boolean z) {
        this.enableOpt = z;
    }

    public HostBackToInnerConfig(boolean z, boolean z2, long j) {
        this.enableOpt = z;
        this.enableAutoDraw = z2;
        this.autoDrawDelay = j;
    }
}
