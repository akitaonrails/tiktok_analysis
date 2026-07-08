package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_interact_match_timeout")
public final class LiveMatchTimeOutSetting {
    public static final LiveMatchTimeOutSetting INSTANCE = new LiveMatchTimeOutSetting();
    public static final LiveMatchTimeOutData DEFAULT = new LiveMatchTimeOutData(40, 50, 60, 70, 10);

    public final LiveMatchTimeOutData getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveMatchTimeOutData liveMatchTimeOutData = DEFAULT;
        LiveMatchTimeOutData liveMatchTimeOutData2 = (LiveMatchTimeOutData) settingsManager.getValueSafely("live_interact_match_timeout", liveMatchTimeOutData);
        return liveMatchTimeOutData2 != null ? liveMatchTimeOutData2 : liveMatchTimeOutData;
    }

    public final LiveMatchTimeOutData getDEFAULT() {
        return DEFAULT;
    }
}
