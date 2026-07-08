package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_match_icy_clash_finish_delay_duration")
public final class LiveMatchIcyClashLynxDelayFinishDuration {
    public static final long DEFAULT = 3000;
    public static final LiveMatchIcyClashLynxDelayFinishDuration INSTANCE = new LiveMatchIcyClashLynxDelayFinishDuration();

    public final long value() {
        return SettingsManager.INSTANCE.getLongValue("live_match_icy_clash_finish_delay_duration", DEFAULT);
    }
}
