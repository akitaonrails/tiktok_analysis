package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_broadcast_bg_governor")
public final class LiveBroadcastBgGovernorSetting {
    public static final LiveBroadcastBgGovernorSetting INSTANCE = new LiveBroadcastBgGovernorSetting();
    public static final BgGovernorConfig DEFAULT = new BgGovernorConfig();

    public final BgGovernorConfig getConfig() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        BgGovernorConfig bgGovernorConfig = DEFAULT;
        BgGovernorConfig bgGovernorConfig2 = (BgGovernorConfig) settingsManager.getValueSafely("live_broadcast_bg_governor", bgGovernorConfig);
        return bgGovernorConfig2 != null ? bgGovernorConfig2 : bgGovernorConfig;
    }
}
