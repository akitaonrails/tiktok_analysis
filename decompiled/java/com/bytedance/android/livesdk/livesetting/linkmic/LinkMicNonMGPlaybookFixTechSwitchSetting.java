package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes32.dex */
@SettingsKey("linkmic_non_mg_playbook_fix_tech_swtich")
public final class LinkMicNonMGPlaybookFixTechSwitchSetting {
    public static final int DEFAULT = 1;
    public static final LinkMicNonMGPlaybookFixTechSwitchSetting INSTANCE = new LinkMicNonMGPlaybookFixTechSwitchSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("linkmic_non_mg_playbook_fix_tech_swtich", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue() == 1;
    }
}
