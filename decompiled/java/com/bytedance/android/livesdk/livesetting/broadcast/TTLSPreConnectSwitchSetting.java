package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("ttls_pre_connect_switch")
public final class TTLSPreConnectSwitchSetting {
    public static final int DEFAULT = 0;
    public static final TTLSPreConnectSwitchSetting INSTANCE = new TTLSPreConnectSwitchSetting();

    public final boolean enablePreConnectSwitch() {
        return SettingsManager.INSTANCE.getIntValue("ttls_pre_connect_switch", DEFAULT) == 1;
    }
}
