package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_delay_manual_end_time_setting")
public final class LiveDelayManualEndTimeSetting {
    public static final LiveDelayManualEndTimeSetting INSTANCE = new LiveDelayManualEndTimeSetting();
    public static final LiveDelayManualEndTimeData DEFAULT = new LiveDelayManualEndTimeData(false, 3000, 1000);

    public final LiveDelayManualEndTimeData getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveDelayManualEndTimeData liveDelayManualEndTimeData = DEFAULT;
        LiveDelayManualEndTimeData liveDelayManualEndTimeData2 = (LiveDelayManualEndTimeData) settingsManager.getValueSafely("live_delay_manual_end_time_setting", liveDelayManualEndTimeData);
        return liveDelayManualEndTimeData2 != null ? liveDelayManualEndTimeData2 : liveDelayManualEndTimeData;
    }

    public final LiveDelayManualEndTimeData getDEFAULT() {
        return DEFAULT;
    }
}
