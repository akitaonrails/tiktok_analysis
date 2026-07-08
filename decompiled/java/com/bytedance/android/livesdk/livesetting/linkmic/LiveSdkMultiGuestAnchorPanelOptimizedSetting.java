package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "live_sdk_multi_guest_anchor_panel_opt")
public final class LiveSdkMultiGuestAnchorPanelOptimizedSetting {
    public static final LiveSdkMultiGuestAnchorPanelOptimizedSetting INSTANCE = new LiveSdkMultiGuestAnchorPanelOptimizedSetting();
    public static final LinkMicNewAnchorPanelConfig DEFAULT = new LinkMicNewAnchorPanelConfig(false, 20, 20, 3, 3, 3, 3, 3, 3, false);

    public final LinkMicNewAnchorPanelConfig getConfig() {
        LinkMicNewAnchorPanelConfig linkMicNewAnchorPanelConfig = (LinkMicNewAnchorPanelConfig) SettingsManager.INSTANCE.getValueSafely(LiveSdkMultiGuestAnchorPanelOptimizedSetting.class);
        return linkMicNewAnchorPanelConfig == null ? DEFAULT : linkMicNewAnchorPanelConfig;
    }

    public final boolean isEnable() {
        return getConfig().enable;
    }
}
