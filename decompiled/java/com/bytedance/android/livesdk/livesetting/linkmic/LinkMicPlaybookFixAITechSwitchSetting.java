package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("linkmic_playbook_fix_ai_tech_swtich")
public final class LinkMicPlaybookFixAITechSwitchSetting {
    public static final int DEFAULT = 1;
    public static final LinkMicPlaybookFixAITechSwitchSetting INSTANCE = new LinkMicPlaybookFixAITechSwitchSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("linkmic_playbook_fix_ai_tech_swtich", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue() == 1;
    }
}
