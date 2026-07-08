package com.bytedance.android.livesdk.livesetting.hybrid;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_hybrid_cpu_boost")
public final class LiveHybridCpuBoostSetting {
    public static final LiveHybridCpuBoostSetting INSTANCE = new LiveHybridCpuBoostSetting();
    public static final LiveHybridCpuBoostConfig DEFAULT = new LiveHybridCpuBoostConfig(false, false);

    private final LiveHybridCpuBoostConfig getValue() {
        return (LiveHybridCpuBoostConfig) SettingsManager.INSTANCE.getValueSafely("live_hybrid_cpu_boost", DEFAULT);
    }

    public final boolean lynxEnable() {
        LiveHybridCpuBoostConfig value = getValue();
        if (value != null) {
            return value.lynxEnable;
        }
        return false;
    }

    public final boolean webviewEnable() {
        LiveHybridCpuBoostConfig value = getValue();
        if (value != null) {
            return value.webviewEnable;
        }
        return false;
    }

    public static final class LiveHybridCpuBoostConfig {
        public static final TypeAdapter ADAPTER = new LiveHybridCpuBoostSetting_LiveHybridCpuBoostConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("lynx_enable")
        public boolean lynxEnable;

        @C09CT("webview_enable")
        public boolean webviewEnable;

        public LiveHybridCpuBoostConfig() {
            this(false, false);
        }

        public LiveHybridCpuBoostConfig(boolean z, boolean z2) {
            this.webviewEnable = z;
            this.lynxEnable = z2;
        }
    }
}
