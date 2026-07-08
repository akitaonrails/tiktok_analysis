package com.bytedance.android.livesdk.livesetting.barrage;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("barrage_privilege_tracking_enabled")
public final class BarragePrivilegeTrackingEnabled {
    public static final boolean DEFAULT = false;
    public static final BarragePrivilegeTrackingEnabled INSTANCE = new BarragePrivilegeTrackingEnabled();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("barrage_privilege_tracking_enabled", DEFAULT);
    }
}
