package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_widget_recyable_setting")
public final class LiveWidgetRecyableSetting {
    public static final LiveWidgetRecyableSetting INSTANCE = new LiveWidgetRecyableSetting();
    public static final boolean DEFAULT = false;
    public static final boolean value = SettingsManager.INSTANCE.getBooleanValue("live_widget_recyable_setting", DEFAULT);

    public final boolean enable() {
        return value;
    }
}
