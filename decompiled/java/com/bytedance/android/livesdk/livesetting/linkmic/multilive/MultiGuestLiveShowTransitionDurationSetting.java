package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("multi_guest_liveshow_optimize")
public final class MultiGuestLiveShowTransitionDurationSetting {
    public static final MultiGuestLiveShowTransitionDurationSetting INSTANCE = new MultiGuestLiveShowTransitionDurationSetting();
    public static final MultiGuestLiveShowOptimizeSetting DEFAULT = new MultiGuestLiveShowOptimizeSetting(1, 1, 0);

    public final MultiGuestLiveShowOptimizeSetting getValue() {
        MultiGuestLiveShowOptimizeSetting multiGuestLiveShowOptimizeSetting = (MultiGuestLiveShowOptimizeSetting) SettingsManager.INSTANCE.getValueSafely(MultiGuestLiveShowTransitionDurationSetting.class);
        return multiGuestLiveShowOptimizeSetting == null ? DEFAULT : multiGuestLiveShowOptimizeSetting;
    }

    public final boolean isAnchorEnableTransition() {
        return getValue().anchorEnableTransition == 1;
    }

    public final boolean isCountdownLabelAnimated() {
        return getValue().countdownLabelAnimated == 1;
    }

    public final boolean isGuestShowPreview() {
        return getValue().guestShowPreview == 1;
    }
}
