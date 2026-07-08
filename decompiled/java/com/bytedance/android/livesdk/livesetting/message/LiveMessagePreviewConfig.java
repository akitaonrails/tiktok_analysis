package com.bytedance.android.livesdk.livesetting.message;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes19.dex */
public final class LiveMessagePreviewConfig {
    public static final TypeAdapter ADAPTER = new LiveMessagePreviewConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enable_message")
    public boolean enableMessage;

    @C09CT("start_message_instant")
    public boolean startMessageInstant;

    @C09CT("stop_disconnect_ws_delay")
    public long stopDisconnectWsDelay;

    public LiveMessagePreviewConfig() {
        this(true, false, 10000L);
    }

    public final boolean getEnableMessage() {
        return this.enableMessage;
    }

    public final boolean getStartMessageInstant() {
        return this.startMessageInstant;
    }

    public final long getStopDisconnectWsDelay() {
        return this.stopDisconnectWsDelay;
    }

    public final void setEnableMessage(boolean z) {
        this.enableMessage = z;
    }

    public final void setStartMessageInstant(boolean z) {
        this.startMessageInstant = z;
    }

    public final void setStopDisconnectWsDelay(long j) {
        this.stopDisconnectWsDelay = j;
    }

    public LiveMessagePreviewConfig(boolean z, boolean z2, long j) {
        this.enableMessage = z;
        this.startMessageInstant = z2;
        this.stopDisconnectWsDelay = j;
    }
}
