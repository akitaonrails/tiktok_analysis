package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_broadcast_widget_batch_load")
public final class LiveBroadcastWidgetBatchLoad {
    public static final LiveBroadcastWidgetBatchLoad INSTANCE = new LiveBroadcastWidgetBatchLoad();
    public static final WidgetBatchLoadConfig DEFAULT = new WidgetBatchLoadConfig(0, 500, 1000, 10);

    private final WidgetBatchLoadConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        WidgetBatchLoadConfig widgetBatchLoadConfig = DEFAULT;
        WidgetBatchLoadConfig widgetBatchLoadConfig2 = (WidgetBatchLoadConfig) settingsManager.getValueSafely("live_broadcast_widget_batch_load", widgetBatchLoadConfig);
        return widgetBatchLoadConfig2 != null ? widgetBatchLoadConfig2 : widgetBatchLoadConfig;
    }

    public final boolean enable() {
        return getValue().enableLiveEndOpt == 1;
    }

    public final int getCount() {
        return getValue().count;
    }

    public final long getDelayDuration() {
        return getValue().delayDuration;
    }

    public final long getIntervalDuration() {
        return getValue().intervalDuration;
    }
}
