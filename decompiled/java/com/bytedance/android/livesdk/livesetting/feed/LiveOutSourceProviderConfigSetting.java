package com.bytedance.android.livesdk.livesetting.feed;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_out_source_provider_config")
public final class LiveOutSourceProviderConfigSetting {
    public static final LiveOutSourceProviderConfigSetting INSTANCE = new LiveOutSourceProviderConfigSetting();
    public static final LiveOutSourceConfig DEFAULT = new LiveOutSourceConfig(true, true, true);

    public static final boolean fixDeleteCard() {
        return INSTANCE.getValue().getFixDeleteCard();
    }

    public static final boolean fixGetItemPos() {
        return INSTANCE.getValue().getFixGetItemPos();
    }

    public static final boolean fixPreviewStream() {
        return INSTANCE.getValue().getFixPreviewStream();
    }

    private final LiveOutSourceConfig getValue() {
        LiveOutSourceConfig liveOutSourceConfig = (LiveOutSourceConfig) SettingsManager.INSTANCE.getValueSafely(LiveOutSourceProviderConfigSetting.class);
        return liveOutSourceConfig == null ? DEFAULT : liveOutSourceConfig;
    }
}
