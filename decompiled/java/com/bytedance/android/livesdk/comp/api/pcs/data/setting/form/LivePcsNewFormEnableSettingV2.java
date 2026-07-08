package com.bytedance.android.livesdk.comp.api.pcs.data.setting.form;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_pcs_new_form_enable_v2")
public final class LivePcsNewFormEnableSettingV2 {
    public static final boolean DEFAULT = false;
    public static final LivePcsNewFormEnableSettingV2 INSTANCE = new LivePcsNewFormEnableSettingV2();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_pcs_new_form_enable_v2", DEFAULT);
    }
}
