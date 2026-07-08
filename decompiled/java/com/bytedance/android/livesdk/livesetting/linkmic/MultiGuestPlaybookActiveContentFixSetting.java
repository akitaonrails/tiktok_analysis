package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_playbook_active_content_fix")
public final class MultiGuestPlaybookActiveContentFixSetting {
    public static final boolean DEFAULT = true;
    public static final MultiGuestPlaybookActiveContentFixSetting INSTANCE = new MultiGuestPlaybookActiveContentFixSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_playbook_active_content_fix", DEFAULT);
    }

    public final boolean enable() {
        return getValue();
    }
}
