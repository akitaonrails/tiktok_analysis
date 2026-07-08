package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("rtc_ab_label_game")
public final class GameRtcAbLabel {
    public static final GameRtcAbLabel INSTANCE = new GameRtcAbLabel();
    public static final String DEFAULT = "";

    public final String value() {
        return SettingsManager.INSTANCE.getStringValue("rtc_ab_label_game", DEFAULT);
    }
}
