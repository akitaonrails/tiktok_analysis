package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_replay_banner_fluency_down_number")
public final class LiveIsReplayBannerFluencyDownNumber {
    public static final int DEFAULT = 1;
    public static final LiveIsReplayBannerFluencyDownNumber INSTANCE = new LiveIsReplayBannerFluencyDownNumber();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_replay_banner_fluency_down_number", DEFAULT);
    }
}
