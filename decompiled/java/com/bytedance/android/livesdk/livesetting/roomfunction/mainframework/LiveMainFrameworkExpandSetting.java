package com.bytedance.android.livesdk.livesetting.roomfunction.mainframework;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_main_framework_expand_enable")
public final class LiveMainFrameworkExpandSetting {
    public static final LiveMainFrameworkExpandSetting INSTANCE = new LiveMainFrameworkExpandSetting();
    public static final boolean DEFAULT = true;
    public static final boolean value = SettingsManager.INSTANCE.getBooleanValue("live_main_framework_expand_enable", true);

    public final boolean enable() {
        return value;
    }
}
