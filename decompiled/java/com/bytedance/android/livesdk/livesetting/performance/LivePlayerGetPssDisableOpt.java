package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_player_get_pss_disable")
public final class LivePlayerGetPssDisableOpt {
    public static final boolean DEFAULT = false;
    public static final LivePlayerGetPssDisableOpt INSTANCE = new LivePlayerGetPssDisableOpt();

    public final boolean getDisable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_player_get_pss_disable", DEFAULT);
    }
}
