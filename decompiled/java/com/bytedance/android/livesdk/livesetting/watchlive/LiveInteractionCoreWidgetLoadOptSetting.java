package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C2097608Jq;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_interaction_core_widget_load_opt")
public final class LiveInteractionCoreWidgetLoadOptSetting {
    public static final LiveInteractionCoreWidgetLoadOptSetting INSTANCE = new LiveInteractionCoreWidgetLoadOptSetting();
    public static final WidgetsLoadConfig DEFAULT = new WidgetsLoadConfig(C2097608Jq.LJ(), false);

    public static final WidgetsLoadConfig widgetLoadConfig() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        WidgetsLoadConfig widgetsLoadConfig = DEFAULT;
        WidgetsLoadConfig widgetsLoadConfig2 = (WidgetsLoadConfig) settingsManager.getValueSafely("live_interaction_core_widget_load_opt", widgetsLoadConfig);
        return widgetsLoadConfig2 != null ? widgetsLoadConfig2 : widgetsLoadConfig;
    }
}
