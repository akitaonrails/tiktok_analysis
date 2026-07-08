package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_guide_watting_duration")
public final class LiveGuideWattingDurationSetting {
    public static final int DEFAULT = 30;
    public static final LiveGuideWattingDurationSetting INSTANCE = new LiveGuideWattingDurationSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_guide_watting_duration", DEFAULT);
    }
}
