package com.bytedance.android.livesdk.broadcast.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("broadcast_e2e_protect")
public final class BroadcastE2EProtectSetting {
    public static final boolean DEFAULT = true;
    public static final BroadcastE2EProtectSetting INSTANCE = new BroadcastE2EProtectSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("broadcast_e2e_protect", DEFAULT);
    }
}
