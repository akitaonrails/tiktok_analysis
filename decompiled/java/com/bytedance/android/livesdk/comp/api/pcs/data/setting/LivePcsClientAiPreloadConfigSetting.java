package com.bytedance.android.livesdk.comp.api.pcs.data.setting;

import X.C2097608Jq;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_client_ai_preload_config")
public final class LivePcsClientAiPreloadConfigSetting {
    public static final LivePcsClientAiPreloadConfigSetting INSTANCE = new LivePcsClientAiPreloadConfigSetting();
    public static final PreloadSceneMapConfig DEFAULT = new PreloadSceneMapConfig(C2097608Jq.LJ());

    public final PreloadSceneMapConfig config() {
        return (PreloadSceneMapConfig) SettingsManager.INSTANCE.getValueSafely("live_client_ai_preload_config", DEFAULT);
    }
}
