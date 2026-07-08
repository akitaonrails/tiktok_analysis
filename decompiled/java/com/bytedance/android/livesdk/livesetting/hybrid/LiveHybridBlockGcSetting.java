package com.bytedance.android.livesdk.livesetting.hybrid;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_hybrid_block_gc")
public final class LiveHybridBlockGcSetting {
    public static final LiveHybridBlockGcSetting INSTANCE = new LiveHybridBlockGcSetting();
    public static final LiveHybridBlockGCConfig DEFAULT = new LiveHybridBlockGCConfig(false, false);

    private final LiveHybridBlockGCConfig getValue() {
        return (LiveHybridBlockGCConfig) SettingsManager.INSTANCE.getValueSafely("live_hybrid_block_gc", DEFAULT);
    }

    public final boolean lynxEnable() {
        LiveHybridBlockGCConfig value = getValue();
        if (value != null) {
            return value.lynxEnable;
        }
        return false;
    }

    public final boolean webviewEnable() {
        LiveHybridBlockGCConfig value = getValue();
        if (value != null) {
            return value.webviewEnable;
        }
        return false;
    }

    public static final class LiveHybridBlockGCConfig {
        public static final TypeAdapter ADAPTER = new LiveHybridBlockGcSetting_LiveHybridBlockGCConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("lynx_enable")
        public boolean lynxEnable;

        @C09CT("webview_enable")
        public boolean webviewEnable;

        public LiveHybridBlockGCConfig() {
            this(false, false);
        }

        public LiveHybridBlockGCConfig(boolean z, boolean z2) {
            this.webviewEnable = z;
            this.lynxEnable = z2;
        }
    }
}
