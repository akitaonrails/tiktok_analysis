package com.bytedance.android.livesdk.livesetting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_privilege_check_logger")
public final class LivePrivilegeCheckLoggerSetting {
    public static final LivePrivilegeCheckLoggerSetting INSTANCE = new LivePrivilegeCheckLoggerSetting();
    public static final boolean DEFAULT = true;
    public static final boolean value = SettingsManager.INSTANCE.getBooleanValue("live_privilege_check_logger", true);

    public final boolean enableLogger() {
        return value;
    }
}
