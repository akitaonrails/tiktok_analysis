package com.bytedance.android.livesdk.livesetting.revenuestrategy;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_incentive_widget_bubble_show_max_times")
public final class LiveCoinIncentiveGuideRemindMaxTimesSettings {
    public static final LiveCoinIncentiveGuideRemindMaxTimesSettings INSTANCE = new LiveCoinIncentiveGuideRemindMaxTimesSettings();
    public static final int DEFAULT = LSPassThroughRecordSizeConfig.DEFAULT;

    public final int getTimes() {
        return SettingsManager.INSTANCE.getIntValue("live_incentive_widget_bubble_show_max_times", DEFAULT);
    }
}
