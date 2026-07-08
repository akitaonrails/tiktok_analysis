package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("linkmic_rtc_ab_params_game")
public final class GameRtcAbParams {
    public static final GameRtcAbParams INSTANCE = new GameRtcAbParams();
    public static final String DEFAULT = "";

    public final String value() {
        return SettingsManager.INSTANCE.getStringValue("linkmic_rtc_ab_params_game", DEFAULT);
    }
}
