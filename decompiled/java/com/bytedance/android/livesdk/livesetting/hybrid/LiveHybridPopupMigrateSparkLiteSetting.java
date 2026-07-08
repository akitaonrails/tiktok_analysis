package com.bytedance.android.livesdk.livesetting.hybrid;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_hybrid_popup_migrate_spark_lite")
public final class LiveHybridPopupMigrateSparkLiteSetting {
    public static final LiveHybridPopupMigrateSparkLiteSetting INSTANCE = new LiveHybridPopupMigrateSparkLiteSetting();
    public static final MigrateConfig DEFAULT = new MigrateConfig(false, false, false);

    private final MigrateConfig getConfig() {
        return (MigrateConfig) SettingsManager.INSTANCE.getValueSafely("live_hybrid_popup_migrate_spark_lite", DEFAULT);
    }

    public final boolean enable() {
        MigrateConfig config = getConfig();
        if (config != null) {
            return config.enable;
        }
        return false;
    }

    public final boolean enableStrictPluginMode() {
        MigrateConfig config = getConfig();
        if (config != null && config.enable) {
            return config.enableStrictPluginMode;
        }
        return false;
    }

    public final boolean preloadAndDecodeResource() {
        MigrateConfig config = getConfig();
        if (config != null && config.enable) {
            return config.preloadAndDecodeResourceDeferred;
        }
        return false;
    }

    public static final class MigrateConfig {
        public static final TypeAdapter ADAPTER = new LiveHybridPopupMigrateSparkLiteSetting_MigrateConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("enable")
        public boolean enable;

        @C09CT("enable_strict_plugin_mode")
        public boolean enableStrictPluginMode;

        @C09CT("preload_and_decode_resource_deferred")
        public boolean preloadAndDecodeResourceDeferred;

        public MigrateConfig() {
            this(false, false, false);
        }

        public MigrateConfig(boolean z, boolean z2, boolean z3) {
            this.enable = z;
            this.enableStrictPluginMode = z2;
            this.preloadAndDecodeResourceDeferred = z3;
        }
    }
}
