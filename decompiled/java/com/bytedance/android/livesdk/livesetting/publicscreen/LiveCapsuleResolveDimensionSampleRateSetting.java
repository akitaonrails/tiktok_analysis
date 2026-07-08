package com.bytedance.android.livesdk.livesetting.publicscreen;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_capsule_resolve_dimension_sample_rate")
public final class LiveCapsuleResolveDimensionSampleRateSetting {
    public static final double DEFAULT = 0.0d;
    public static final LiveCapsuleResolveDimensionSampleRateSetting INSTANCE = new LiveCapsuleResolveDimensionSampleRateSetting();

    public static final double getValue() {
        return SettingsManager.INSTANCE.getDoubleValue("live_capsule_resolve_dimension_sample_rate", DEFAULT);
    }
}
