package com.bytedance.android.livesdk.livesetting.roomfunction.mainframework;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_main_framework_expand_show_time")
public final class LiveMainFrameworkExpandShowSetting {
    public static final LiveMainFrameworkExpandShowSetting INSTANCE = new LiveMainFrameworkExpandShowSetting();
    public static final int DEFAULT = 15000;
    public static final int value = SettingsManager.INSTANCE.getIntValue("live_main_framework_expand_show_time", 15000);

    public final long value() {
        return value;
    }
}
