package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_draw_guess_request_summary_delay")
public final class LiveDrawGuessRequestSummaryDelaySetting {
    public static final LiveDrawGuessRequestSummaryDelaySetting INSTANCE = new LiveDrawGuessRequestSummaryDelaySetting();
    public static final long DEFAULT = 3000;

    public final long getDelayTime() {
        return SettingsManager.INSTANCE.getLongValue("live_draw_guess_request_summary_delay", DEFAULT);
    }
}
