package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("truth_or_dare_audience_visible")
public final class TruthOrDareForAudienceAbTestSetting {
    public static final int DEFAULT = 1;
    public static final TruthOrDareForAudienceAbTestSetting INSTANCE = new TruthOrDareForAudienceAbTestSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("truth_or_dare_audience_visible", DEFAULT);
    }
}
