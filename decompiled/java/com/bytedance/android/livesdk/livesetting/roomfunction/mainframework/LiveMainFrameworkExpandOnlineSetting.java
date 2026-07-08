package com.bytedance.android.livesdk.livesetting.roomfunction.mainframework;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_main_framework_expand_online")
public final class LiveMainFrameworkExpandOnlineSetting {
    public static final LiveMainFrameworkExpandOnlineSetting INSTANCE = new LiveMainFrameworkExpandOnlineSetting();
    public static final boolean DEFAULT = true;
    public static final boolean value = SettingsManager.INSTANCE.getBooleanValue("live_main_framework_expand_online", true);

    public final boolean enable() {
        return value;
    }
}
