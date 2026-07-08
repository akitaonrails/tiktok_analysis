package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_sdk_pre_forward_stream_config")
public final class LinkMicPreForwardStreamConfig {
    public static final LinkMicPreForwardStreamConfig INSTANCE = new LinkMicPreForwardStreamConfig();
    public static final PreForwardStreamConfig DEFAULT = new PreForwardStreamConfig(true, true, true);

    public final PreForwardStreamConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        PreForwardStreamConfig preForwardStreamConfig = DEFAULT;
        PreForwardStreamConfig preForwardStreamConfig2 = (PreForwardStreamConfig) settingsManager.getValueSafely("linkmic_sdk_pre_forward_stream_config", preForwardStreamConfig);
        return preForwardStreamConfig2 != null ? preForwardStreamConfig2 : preForwardStreamConfig;
    }

    public final boolean isEnableForwardRefact() {
        return getValue().enableForwardRefact;
    }

    public final boolean isEnableOptSubscrip() {
        return getValue().enableOptSubscrip;
    }

    public final boolean isEnablePreForward() {
        return getValue().enablePreForward;
    }
}
