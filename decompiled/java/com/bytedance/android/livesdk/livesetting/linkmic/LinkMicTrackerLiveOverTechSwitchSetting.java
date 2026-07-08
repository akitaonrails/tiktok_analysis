package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("linkmic_tracker_live_over_tech_swtich")
public final class LinkMicTrackerLiveOverTechSwitchSetting {
    public static final int DEFAULT = 0;
    public static final LinkMicTrackerLiveOverTechSwitchSetting INSTANCE = new LinkMicTrackerLiveOverTechSwitchSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("linkmic_tracker_live_over_tech_swtich", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue() == 1;
    }
}
