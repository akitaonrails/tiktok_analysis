package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_short_touch_widget_recycle")
public final class LiveShortTouchWidgetRecycleSetting {
    public static final LiveShortTouchWidgetRecycleSetting INSTANCE = new LiveShortTouchWidgetRecycleSetting();
    public static final ShortTouchWidgetRecycleConfig DEFAULT = new ShortTouchWidgetRecycleConfig(true, true);

    public final boolean getPreviewWidgetRecycle() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        ShortTouchWidgetRecycleConfig shortTouchWidgetRecycleConfig = DEFAULT;
        ShortTouchWidgetRecycleConfig shortTouchWidgetRecycleConfig2 = (ShortTouchWidgetRecycleConfig) settingsManager.getValueSafely("live_short_touch_widget_recycle", shortTouchWidgetRecycleConfig);
        return shortTouchWidgetRecycleConfig2 != null ? shortTouchWidgetRecycleConfig2.previewWidgetRecycle : shortTouchWidgetRecycleConfig.previewWidgetRecycle;
    }

    public final boolean getViewWidgetRecycle() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        ShortTouchWidgetRecycleConfig shortTouchWidgetRecycleConfig = DEFAULT;
        ShortTouchWidgetRecycleConfig shortTouchWidgetRecycleConfig2 = (ShortTouchWidgetRecycleConfig) settingsManager.getValueSafely("live_short_touch_widget_recycle", shortTouchWidgetRecycleConfig);
        return shortTouchWidgetRecycleConfig2 != null ? shortTouchWidgetRecycleConfig2.viewWidgetRecycle : shortTouchWidgetRecycleConfig.viewWidgetRecycle;
    }
}
