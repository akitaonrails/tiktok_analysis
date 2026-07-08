package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "enable_multi_guest_playbook")
public final class MultiGuestPlaybookEnableSetting {
    public static final boolean DEFAULT = false;
    public static final MultiGuestPlaybookEnableSetting INSTANCE = new MultiGuestPlaybookEnableSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("enable_multi_guest_playbook", DEFAULT);
    }
}
