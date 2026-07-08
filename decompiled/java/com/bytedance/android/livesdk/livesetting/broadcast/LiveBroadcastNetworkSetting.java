package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_broadcast_network_setting")
public final class LiveBroadcastNetworkSetting {
    public static final int DEFAULT = 0;
    public static final LiveBroadcastNetworkSetting INSTANCE = new LiveBroadcastNetworkSetting();

    public final boolean useLiveCoreNetwork() {
        return SettingsManager.INSTANCE.getIntValue("live_broadcast_network_setting", DEFAULT) == 1;
    }
}
