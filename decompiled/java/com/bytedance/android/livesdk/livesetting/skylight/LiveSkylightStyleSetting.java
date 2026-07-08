package com.bytedance.android.livesdk.livesetting.skylight;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_skylight_style")
public final class LiveSkylightStyleSetting {
    public static final Config DEFAULT;
    public static final LiveSkylightStyleSetting INSTANCE = new LiveSkylightStyleSetting();
    public static final Config value;

    static {
        Config config = new Config(false, false, true, false);
        DEFAULT = config;
        Config config2 = (Config) SettingsManager.INSTANCE.getValueSafely("live_skylight_style", config);
        if (config2 != null) {
            config = config2;
        }
        value = config;
    }

    public final boolean enableGoLive() {
        return value.enableGoLive;
    }

    public final boolean enableStyleV2() {
        return value.enableStyleV2;
    }

    public final Config getValue() {
        return value;
    }
}
