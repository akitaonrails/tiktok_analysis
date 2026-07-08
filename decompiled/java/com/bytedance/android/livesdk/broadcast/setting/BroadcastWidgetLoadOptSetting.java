package com.bytedance.android.livesdk.broadcast.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("broadcast_widget_load_opt")
public final class BroadcastWidgetLoadOptSetting {
    public static final boolean DEFAULT = false;
    public static final BroadcastWidgetLoadOptSetting INSTANCE = new BroadcastWidgetLoadOptSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("broadcast_widget_load_opt", DEFAULT);
    }
}
