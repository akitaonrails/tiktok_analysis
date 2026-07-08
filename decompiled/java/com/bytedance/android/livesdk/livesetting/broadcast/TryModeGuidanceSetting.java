package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "try_mode_guidance")
public final class TryModeGuidanceSetting {
    public static final int DEFAULT = 0;
    public static final TryModeGuidanceSetting INSTANCE = new TryModeGuidanceSetting();

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("try_mode_guidance", DEFAULT);
    }

    public final boolean hasEnhanceBubble() {
        return getValue() == 2 || getValue() == 3;
    }

    public final boolean inExperiment() {
        return getValue() > 0;
    }

    public final boolean isV1() {
        return getValue() == 1;
    }

    public final boolean isV2() {
        return getValue() == 2 || getValue() == 4;
    }

    public final boolean isV2EnhancedBubble() {
        return getValue() == 2;
    }

    public final boolean isV2NormalBubble() {
        return getValue() == 4;
    }

    public final boolean isV3() {
        return getValue() == 3 || getValue() == 5;
    }

    public final boolean isV3EnhancedBubble() {
        return getValue() == 3;
    }

    public final boolean isV3NormalBubble() {
        return getValue() == 5;
    }
}
