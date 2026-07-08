package com.bytedance.android.livesdk.comp.api.pcs.data.setting.form;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes27.dex */
@SettingsKey(preciseExperiment = false, value = "live_pcs_form_prefill_opt")
public final class LivePcsFormPrefillSetting {
    public static final int DEFAULT = 0;
    public static final LivePcsFormPrefillSetting INSTANCE = new LivePcsFormPrefillSetting();
    public static final int LOCAL_STORAGE_PREFILL = 2;
    public static final int PROFILE_PREFILL = 1;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_pcs_form_prefill_opt", DEFAULT);
    }

    public final boolean enableLocalStoragePrefill() {
        return getValue() == 2;
    }

    public final boolean enableProfilePrefill() {
        return getValue() >= 1;
    }
}
