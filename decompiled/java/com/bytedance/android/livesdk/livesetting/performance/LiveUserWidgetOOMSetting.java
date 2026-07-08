package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_user_widget_oom")
public final class LiveUserWidgetOOMSetting {
    public static final LiveUserWidgetOOMSetting INSTANCE = new LiveUserWidgetOOMSetting();
    public static final boolean DEFAULT = true;
    public static final boolean value = SettingsManager.INSTANCE.getBooleanValue("live_user_widget_oom", true);

    public final boolean enable() {
        return value;
    }
}
