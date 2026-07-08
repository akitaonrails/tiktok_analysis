package com.bytedance.android.livesdk.livesetting.roomfunction.mainframework;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_main_framework_expand_skylight")
public final class LiveMainFrameworkExpandSkylightSetting {
    public static final LiveMainFrameworkExpandSkylightSetting INSTANCE = new LiveMainFrameworkExpandSkylightSetting();
    public static final boolean DEFAULT = true;
    public static final boolean value = SettingsManager.INSTANCE.getBooleanValue("live_main_framework_expand_skylight", true);

    public final boolean enable() {
        return value;
    }
}
