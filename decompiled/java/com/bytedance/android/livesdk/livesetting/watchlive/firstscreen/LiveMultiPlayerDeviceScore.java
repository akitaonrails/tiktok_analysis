package com.bytedance.android.livesdk.livesetting.watchlive.firstscreen;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.linkmic.TTliveAnchorDeviceScoreSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.TTliveAudienceDeviceScoreSetting;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("multi_player_device_score")
public final class LiveMultiPlayerDeviceScore {
    public static final LiveMultiPlayerDeviceScore INSTANCE = new LiveMultiPlayerDeviceScore();
    public static final MultiPlayerScoreLimit DEFAULT = new MultiPlayerScoreLimit(-1.0f, -1.0f);

    public final boolean isEnable() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        MultiPlayerScoreLimit multiPlayerScoreLimit = DEFAULT;
        MultiPlayerScoreLimit multiPlayerScoreLimit2 = (MultiPlayerScoreLimit) settingsManager.getValueSafely("multi_player_device_score", multiPlayerScoreLimit);
        if (multiPlayerScoreLimit2 != null) {
            multiPlayerScoreLimit = multiPlayerScoreLimit2;
        }
        float value = LiveMultiPlayerDeviceScoreType.INSTANCE.enable() ? TTliveAudienceDeviceScoreSetting.INSTANCE.getValue() : TTliveAnchorDeviceScoreSetting.INSTANCE.getValue();
        return value >= multiPlayerScoreLimit.scoreLow && value < multiPlayerScoreLimit.scoreHigh;
    }

    public final MultiPlayerScoreLimit getDEFAULT() {
        return DEFAULT;
    }
}
