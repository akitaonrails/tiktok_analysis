package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_linkmic_multi_guest_feature_support_tech_switch")
public final class LinkMicMultiGuestFeatureSupportTechSwitchSetting {
    public static final int DEFAULT = 1;
    public static final LinkMicMultiGuestFeatureSupportTechSwitchSetting INSTANCE = new LinkMicMultiGuestFeatureSupportTechSwitchSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_linkmic_multi_guest_feature_support_tech_switch", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue() == 1;
    }
}
