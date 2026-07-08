package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("linkmic_playbook_auto_run_tech_switch")
public final class LinkMicPlaybookAutoRunTechSwitchSetting {
    public static final int DEFAULT = 1;
    public static final LinkMicPlaybookAutoRunTechSwitchSetting INSTANCE = new LinkMicPlaybookAutoRunTechSwitchSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("linkmic_playbook_auto_run_tech_switch", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue() == 1;
    }
}
