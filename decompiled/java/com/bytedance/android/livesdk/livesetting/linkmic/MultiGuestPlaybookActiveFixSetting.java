package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "live_playbook_active_fix")
public final class MultiGuestPlaybookActiveFixSetting {
    public static final boolean DEFAULT = true;
    public static final MultiGuestPlaybookActiveFixSetting INSTANCE = new MultiGuestPlaybookActiveFixSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_playbook_active_fix", DEFAULT);
    }

    public final boolean enable() {
        return getValue();
    }
}
