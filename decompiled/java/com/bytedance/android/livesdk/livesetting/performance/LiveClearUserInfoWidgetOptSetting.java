package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_clear_user_info_widget_opt")
public final class LiveClearUserInfoWidgetOptSetting {
    public static final LiveClearUserInfoWidgetOptSetting INSTANCE = new LiveClearUserInfoWidgetOptSetting();
    public static final boolean DEFAULT = true;
    public static final boolean value = SettingsManager.INSTANCE.getBooleanValue("live_clear_user_info_widget_opt", DEFAULT);

    public final boolean enable() {
        return value;
    }
}
