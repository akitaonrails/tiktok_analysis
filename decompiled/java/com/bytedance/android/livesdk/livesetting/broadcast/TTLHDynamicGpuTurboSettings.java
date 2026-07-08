package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("ttlh_dynamic_gputurbo_settings")
public final class TTLHDynamicGpuTurboSettings {
    public static final TTLHDynamicGpuTurboSettings INSTANCE = new TTLHDynamicGpuTurboSettings();
    public static final TTLHDynamicGpuTurboConfig DEFAULT = new TTLHDynamicGpuTurboConfig();

    public static final class TTLHDynamicGpuTurboConfig implements Serializable {
        public static final TypeAdapter ADAPTER = new TTLHDynamicGpuTurboSettings_TTLHDynamicGpuTurboConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("configs")
        public List<String> configs;

        @C09CT("enable_gpu_turbo")
        public int enable;

        @C09CT("factor")
        public float factor = 1.5f;

        public final boolean enabled() {
            return this.enable == 1;
        }

        public final List<String> getConfigs() {
            return this.configs;
        }

        public final int getEnable() {
            return this.enable;
        }

        public final float getFactor() {
            return this.factor;
        }

        public final void setConfigs(List<String> list) {
            this.configs = list;
        }

        public final void setEnable(int i) {
            this.enable = i;
        }

        public final void setFactor(float f) {
            this.factor = f;
        }
    }

    public final TTLHDynamicGpuTurboConfig getConfigs() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        TTLHDynamicGpuTurboConfig tTLHDynamicGpuTurboConfig = DEFAULT;
        TTLHDynamicGpuTurboConfig tTLHDynamicGpuTurboConfig2 = (TTLHDynamicGpuTurboConfig) settingsManager.getValueSafely("ttlh_dynamic_gputurbo_settings", tTLHDynamicGpuTurboConfig);
        return tTLHDynamicGpuTurboConfig2 != null ? tTLHDynamicGpuTurboConfig2 : tTLHDynamicGpuTurboConfig;
    }
}
