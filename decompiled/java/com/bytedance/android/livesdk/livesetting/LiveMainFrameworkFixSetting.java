package com.bytedance.android.livesdk.livesetting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_main_framework_fix_config")
public final class LiveMainFrameworkFixSetting {
    public static final LiveMainFrameworkFixSetting INSTANCE = new LiveMainFrameworkFixSetting();
    public static final int DEFAULT = 15;
    public static final int value = SettingsManager.INSTANCE.getIntValue("live_main_framework_fix_config", 15);

    public final boolean enableUpdateViewerWhenFollowChange() {
        return (value & 1) == 1;
    }
}
