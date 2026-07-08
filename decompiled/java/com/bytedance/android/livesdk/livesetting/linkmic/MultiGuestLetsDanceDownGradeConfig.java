package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_lets_dance_downgrade_plan")
public final class MultiGuestLetsDanceDownGradeConfig {
    public static final boolean DEFAULT = false;
    public static final MultiGuestLetsDanceDownGradeConfig INSTANCE = new MultiGuestLetsDanceDownGradeConfig();

    public static final boolean downgradePrepareAnimation() {
        return SettingsManager.INSTANCE.getBooleanValue("multi_guest_lets_dance_downgrade_plan", DEFAULT);
    }
}
