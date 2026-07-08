package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C1697810uHb;
import X.C2097908Jt;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import kotlin.Pair;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_tab_core_widget_load_opt")
public final class LiveTabCoreWidgetLoadOptSetting {
    public static final WidgetsLoadConfig DEFAULT;
    public static final LiveTabCoreWidgetLoadOptSetting INSTANCE;

    static {
        LiveTabCoreWidgetLoadOptSetting liveTabCoreWidgetLoadOptSetting = new LiveTabCoreWidgetLoadOptSetting();
        INSTANCE = liveTabCoreWidgetLoadOptSetting;
        DEFAULT = liveTabCoreWidgetLoadOptSetting.defaultValue();
    }

    public static final WidgetsLoadConfig widgetLoadConfig() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        WidgetsLoadConfig widgetsLoadConfig = DEFAULT;
        WidgetsLoadConfig widgetsLoadConfig2 = (WidgetsLoadConfig) settingsManager.getValueSafely("live_tab_core_widget_load_opt", widgetsLoadConfig);
        return widgetsLoadConfig2 != null ? widgetsLoadConfig2 : widgetsLoadConfig;
    }

    public final WidgetsLoadConfig defaultValue() {
        return new WidgetsLoadConfig(C2097908Jt.LIZJ(new Pair("default", new WidgetLoadStrategy(C2097908Jt.LIZJ(new Pair("Core", C1697810uHb.LJIILJJIL(new WidgetInfo("all", C1697810uHb.LJIILJJIL("public_screen", "toolbar", "comment", "anchor_info", "skylight_switch", "subscribe_icon", "ec_shop_icon", "full_window", "group_end"))))), false, C2097908Jt.LIZJ(new Pair("P0", 2000L)), C2097908Jt.LIZJ(new Pair("P0", "Core"))))), true);
    }
}
