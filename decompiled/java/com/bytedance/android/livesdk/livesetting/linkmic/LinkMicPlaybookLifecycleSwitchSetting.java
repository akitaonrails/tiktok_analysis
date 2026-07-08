package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey("linkmic_playbook_lifecycle_swtich")
public final class LinkMicPlaybookLifecycleSwitchSetting {
    public static final int DEFAULT = 1;
    public static final LinkMicPlaybookLifecycleSwitchSetting INSTANCE = new LinkMicPlaybookLifecycleSwitchSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("linkmic_playbook_lifecycle_swtich", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue() == 1;
    }
}
