package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_audience_linkmic_lowest_age")
public final class LiveAudienceLinkmicLowestAgeSetting {
    public static final int DEFAULT = 16;
    public static final LiveAudienceLinkmicLowestAgeSetting INSTANCE = new LiveAudienceLinkmicLowestAgeSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_audience_linkmic_lowest_age", DEFAULT);
    }
}
