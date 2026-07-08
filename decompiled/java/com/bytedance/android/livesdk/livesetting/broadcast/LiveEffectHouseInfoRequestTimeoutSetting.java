package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_report_delay_time")
public final class LiveEffectHouseInfoRequestTimeoutSetting {
    public static final LiveEffectHouseInfoRequestTimeoutSetting INSTANCE = new LiveEffectHouseInfoRequestTimeoutSetting();
    public static final float DEFAULT = 1.5f;
    public static final float settingValue = SettingsManager.INSTANCE.getFloatValue("live_report_delay_time", DEFAULT);

    public final long getTimeoutMs() {
        return (long) (settingValue * LSPassThroughRecordSizeConfig.DEFAULT);
    }
}
