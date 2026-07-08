package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("ttlh_disable_network_notify")
public final class TTLHDisableNetworkNotify {
    public static final int DEFAULT = 0;
    public static final TTLHDisableNetworkNotify INSTANCE = new TTLHDisableNetworkNotify();

    public final boolean disableTTLHNetworkNotify() {
        return SettingsManager.INSTANCE.getIntValue("ttlh_disable_network_notify", DEFAULT) == 1;
    }
}
