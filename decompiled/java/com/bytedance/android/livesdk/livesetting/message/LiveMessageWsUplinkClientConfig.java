package com.bytedance.android.livesdk.livesetting.message;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveMessageWsUplinkClientConfig {
    public static final TypeAdapter ADAPTER = new LiveMessageWsUplinkClientConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enable_ws_uplink")
    public boolean enableWsUplink;

    public LiveMessageWsUplinkClientConfig() {
        this(false);
    }

    public final boolean getEnableWsUplink() {
        return this.enableWsUplink;
    }

    public LiveMessageWsUplinkClientConfig(boolean z) {
        this.enableWsUplink = z;
    }

    public final void setEnableWsUplink(boolean z) {
        this.enableWsUplink = z;
    }
}
