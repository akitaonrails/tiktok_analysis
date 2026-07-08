package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("linkmic_feed_corner_tech_swtich")
public final class LinkMicFeedCornerTechSwitchSetting {
    public static final int DEFAULT = 1;
    public static final LinkMicFeedCornerTechSwitchSetting INSTANCE = new LinkMicFeedCornerTechSwitchSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("linkmic_feed_corner_tech_swtich", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue() == 1;
    }
}
