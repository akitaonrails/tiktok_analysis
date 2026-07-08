package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_opt_precreate_player_setting")
public final class LiveOptPrecreatePlayerSetting {
    public static final int DEFAULT = -1;
    public static final int ENABLE = 1;
    public static final LiveOptPrecreatePlayerSetting INSTANCE = new LiveOptPrecreatePlayerSetting();

    public static final boolean isEnable() {
        return SettingsManager.INSTANCE.getIntValue("live_opt_precreate_player_setting", DEFAULT) == 1;
    }

    public static final boolean isDisable() {
        return !isEnable();
    }
}
