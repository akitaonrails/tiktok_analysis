package com.bytedance.android.livesdk.livesetting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_interaction_mask_config")
public final class LiveInteractionMaskConfigSetting {
    public static final LiveInteractionMaskConfigSetting INSTANCE = new LiveInteractionMaskConfigSetting();
    public static final LiveInteractionMaskConfig DEFAULT = new LiveInteractionMaskConfig(false, false, false, 140);

    private final LiveInteractionMaskConfig getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveInteractionMaskConfig liveInteractionMaskConfig = DEFAULT;
        LiveInteractionMaskConfig liveInteractionMaskConfig2 = (LiveInteractionMaskConfig) settingsManager.getValueSafely("live_interaction_mask_config", liveInteractionMaskConfig);
        return liveInteractionMaskConfig2 != null ? liveInteractionMaskConfig2 : liveInteractionMaskConfig;
    }

    public final boolean enableClearScreenMaskRespectAnim() {
        return getValue().respectClearScreenAnim;
    }

    public final boolean enableMaskShowAfterFirstFrame() {
        return getValue().maskShowAfterFirstFrame;
    }

    public final boolean enablePreviewCardEnterMaskSync() {
        return getValue().previewCardEnterMaskSync;
    }

    public final int getTopMaskHeightDp() {
        Integer numValueOf = Integer.valueOf(getValue().topMaskHeight);
        return numValueOf.intValue() > 0 ? numValueOf.intValue() : DEFAULT.topMaskHeight;
    }
}
