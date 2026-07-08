package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_guide_bubble_duration")
public final class LiveGuideBubbleDurationSetting {
    public static final int DEFAULT = 10;
    public static final LiveGuideBubbleDurationSetting INSTANCE = new LiveGuideBubbleDurationSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_guide_bubble_duration", DEFAULT);
    }
}
