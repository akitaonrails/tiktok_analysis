package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "enable_multi_guest_playbook_header")
public final class MultiGuestPlaybookHeaderTestSetting {
    public static final boolean DEFAULT = true;
    public static final MultiGuestPlaybookHeaderTestSetting INSTANCE = new MultiGuestPlaybookHeaderTestSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("enable_multi_guest_playbook_header", DEFAULT);
    }
}
