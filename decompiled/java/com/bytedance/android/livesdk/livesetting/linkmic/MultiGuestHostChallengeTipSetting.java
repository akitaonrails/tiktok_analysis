package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_host_challenge_tip")
public final class MultiGuestHostChallengeTipSetting {
    public static final int DEFAULT = 0;
    public static final MultiGuestHostChallengeTipSetting INSTANCE = new MultiGuestHostChallengeTipSetting();

    public final boolean isRedDot() {
        return SettingsManager.INSTANCE.getIntValue("multi_guest_host_challenge_tip", DEFAULT) == 1;
    }

    public final boolean isToolTip() {
        return SettingsManager.INSTANCE.getIntValue("multi_guest_host_challenge_tip", DEFAULT) == 2;
    }
}
