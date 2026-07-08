package com.bytedance.android.livesdk.chatroom.ui.widgetload.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("enter_gradual_widget_load_config")
public final class EnterGradualModelConfigSetting {
    public static final WidgetLoadOptConfig DEFAULT;
    public static final EnterGradualModelConfigSetting INSTANCE = new EnterGradualModelConfigSetting();
    public static final WidgetLoadOptConfig value;

    static {
        WidgetLoadOptConfig widgetLoadOptConfig = new WidgetLoadOptConfig();
        DEFAULT = widgetLoadOptConfig;
        WidgetLoadOptConfig widgetLoadOptConfig2 = (WidgetLoadOptConfig) SettingsManager.INSTANCE.getValueSafely("enter_gradual_widget_load_config", widgetLoadOptConfig);
        if (widgetLoadOptConfig2 != null) {
            widgetLoadOptConfig = widgetLoadOptConfig2;
        }
        value = widgetLoadOptConfig;
    }

    public final Map<String, WidgetPhaseInfo> config() {
        return value.phaseConfig;
    }

    public final boolean enable() {
        return WidgetLoadEnableSetting.INSTANCE.enable() && (value.phaseConfig.isEmpty() ^ true);
    }
}
