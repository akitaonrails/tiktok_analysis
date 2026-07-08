package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_linkmic_playbook_outer_utils_tech_switch")
public final class LinkMicPlaybookOuterUtilsTechSwitchSetting {
    public static final int DEFAULT = 1;
    public static final LinkMicPlaybookOuterUtilsTechSwitchSetting INSTANCE = new LinkMicPlaybookOuterUtilsTechSwitchSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_linkmic_playbook_outer_utils_tech_switch", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue() == 1;
    }
}
