package com.bytedance.android.livesdk.comp.api.pcs.data.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_pcs_client_ai_event_driven_config")
public final class LivePcsClientAiEventDrivenConfigSetting {
    public static final LivePcsClientAiEventDrivenConfigSetting INSTANCE = new LivePcsClientAiEventDrivenConfigSetting();
    public static final ClientAiEventDrivenConfig DEFAULT = new ClientAiEventDrivenConfig(null, null, 3, null);

    public final ClientAiEventDrivenConfig getValue() {
        return (ClientAiEventDrivenConfig) SettingsManager.INSTANCE.getValueSafely("live_pcs_client_ai_event_driven_config", DEFAULT);
    }
}
