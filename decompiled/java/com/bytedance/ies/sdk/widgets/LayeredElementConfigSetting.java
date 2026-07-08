package com.bytedance.ies.sdk.widgets;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("layered_element_config")
public final class LayeredElementConfigSetting {
    public static final LayeredElementConfigSetting INSTANCE = new LayeredElementConfigSetting();
    public static final LayeredElementConfig DEFAULT = LayeredElementConfig.createDefault();

    public static final LayeredElementConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LayeredElementConfig layeredElementConfig = DEFAULT;
        LayeredElementConfig layeredElementConfig2 = (LayeredElementConfig) settingsManager.getValueSafely("layered_element_config", layeredElementConfig);
        return layeredElementConfig2 != null ? layeredElementConfig2 : layeredElementConfig;
    }
}
