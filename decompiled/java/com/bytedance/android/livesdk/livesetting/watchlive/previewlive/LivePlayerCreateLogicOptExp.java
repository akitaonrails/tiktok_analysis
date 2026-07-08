package com.bytedance.android.livesdk.livesetting.watchlive.previewlive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_player_create_logic_opt_exp")
public final class LivePlayerCreateLogicOptExp {
    public static final int DEFAULT = 0;
    public static final LivePlayerCreateLogicOptExp INSTANCE = new LivePlayerCreateLogicOptExp();

    public static final boolean isForbidCreate() {
        return SettingsManager.INSTANCE.getIntValue("live_player_create_logic_opt_exp", DEFAULT) != 1;
    }

    public final boolean isDisable() {
        return !isForbidCreate();
    }

    public final int getDEFAULT() {
        return DEFAULT;
    }
}
