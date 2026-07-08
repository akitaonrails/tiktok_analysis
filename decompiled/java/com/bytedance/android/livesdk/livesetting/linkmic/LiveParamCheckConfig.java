package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes16.dex */
public final class LiveParamCheckConfig {
    public static final TypeAdapter ADAPTER = new LiveParamCheckConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("debug_config")
    public LiveParamCheckDebugConfig debugConfig;

    @C09CT("enable")
    public boolean enable;

    public LiveParamCheckConfig() {
        this(true, new LiveParamCheckDebugConfig(false, null, 3, null));
    }

    public final LiveParamCheckDebugConfig getDebugConfig() {
        return this.debugConfig;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final void setDebugConfig(LiveParamCheckDebugConfig liveParamCheckDebugConfig) {
        this.debugConfig = liveParamCheckDebugConfig;
    }

    public final void setEnable(boolean z) {
        this.enable = z;
    }

    public LiveParamCheckConfig(boolean z, LiveParamCheckDebugConfig liveParamCheckDebugConfig) {
        this.enable = z;
        this.debugConfig = liveParamCheckDebugConfig;
    }
}
