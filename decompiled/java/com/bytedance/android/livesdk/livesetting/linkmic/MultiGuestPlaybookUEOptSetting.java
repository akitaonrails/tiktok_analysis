package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes32.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_multiguest_playbook_opt")
public final class MultiGuestPlaybookUEOptSetting {
    public static final boolean DEFAULT = false;
    public static final MultiGuestPlaybookUEOptSetting INSTANCE = new MultiGuestPlaybookUEOptSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_multiguest_playbook_opt", DEFAULT);
    }
}
