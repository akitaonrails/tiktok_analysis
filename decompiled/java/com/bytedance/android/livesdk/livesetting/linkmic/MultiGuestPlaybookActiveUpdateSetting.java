package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_playbook_active_update_auto_for_match")
public final class MultiGuestPlaybookActiveUpdateSetting {
    public static final boolean DEFAULT = false;
    public static final MultiGuestPlaybookActiveUpdateSetting INSTANCE = new MultiGuestPlaybookActiveUpdateSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_playbook_active_update_auto_for_match", DEFAULT);
    }

    public final boolean enable() {
        return getValue();
    }
}
