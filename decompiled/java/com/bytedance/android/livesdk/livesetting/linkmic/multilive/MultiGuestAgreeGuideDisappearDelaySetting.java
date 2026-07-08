package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "apply_guide_disappear_delay_for_test")
public final class MultiGuestAgreeGuideDisappearDelaySetting {
    public static final long DEFAULT = 0;
    public static final MultiGuestAgreeGuideDisappearDelaySetting INSTANCE = new MultiGuestAgreeGuideDisappearDelaySetting();

    public final long delayValueMills() {
        return SettingsManager.INSTANCE.getLongValue("apply_guide_disappear_delay_for_test", DEFAULT);
    }
}
