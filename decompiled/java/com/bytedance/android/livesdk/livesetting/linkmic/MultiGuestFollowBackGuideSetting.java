package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_follow_opt_config")
public final class MultiGuestFollowBackGuideSetting {
    public static final MultiGuestFollowBackGuideSetting INSTANCE = new MultiGuestFollowBackGuideSetting();
    public static final MultiGuestFollowBackGuideConfig DEFAULT = new MultiGuestFollowBackGuideConfig(false, 0);

    private final MultiGuestFollowBackGuideConfig value() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        MultiGuestFollowBackGuideConfig multiGuestFollowBackGuideConfig = DEFAULT;
        MultiGuestFollowBackGuideConfig multiGuestFollowBackGuideConfig2 = (MultiGuestFollowBackGuideConfig) settingsManager.getValueSafely("multi_guest_follow_opt_config", multiGuestFollowBackGuideConfig);
        return multiGuestFollowBackGuideConfig2 != null ? multiGuestFollowBackGuideConfig2 : multiGuestFollowBackGuideConfig;
    }

    public final boolean enableAnchorListPanelFollow() {
        return redfollowButtonStyle() || whiteFollowButtonStyle();
    }

    public final boolean enableManagePanelFollowOpt() {
        return value().enableManagePanelFollowOpt;
    }

    public final boolean redfollowButtonStyle() {
        return value().followButtonStyle == 1;
    }

    public final boolean whiteFollowButtonStyle() {
        return value().followButtonStyle == 2;
    }
}
