package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_draw_guess_lose_exit_message_countdown")
public final class LiveDrawGuessExitMessageCountdownSetting {
    public static final LiveDrawGuessExitMessageCountdownSetting INSTANCE = new LiveDrawGuessExitMessageCountdownSetting();
    public static final long DEFAULT = 300000;

    public final long getCountdownTime() {
        return SettingsManager.INSTANCE.getLongValue("live_draw_guess_lose_exit_message_countdown", DEFAULT);
    }
}
