package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_no_permission_user_switch")
public final class LiveNoPermissionDisplaySwitch {
    public static final int DEFAULT = 1;
    public static final LiveNoPermissionDisplaySwitch INSTANCE = new LiveNoPermissionDisplaySwitch();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getIntValue("live_no_permission_user_switch", DEFAULT) > 0;
    }
}
