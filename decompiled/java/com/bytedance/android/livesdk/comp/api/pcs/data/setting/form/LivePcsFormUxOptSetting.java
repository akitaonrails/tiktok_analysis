package com.bytedance.android.livesdk.comp.api.pcs.data.setting.form;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes27.dex */
@SettingsKey(preciseExperiment = true, value = "live_pcs_form_ux_opt")
public final class LivePcsFormUxOptSetting {
    public static final int DEFAULT = 0;
    public static final LivePcsFormUxOptSetting INSTANCE = new LivePcsFormUxOptSetting();
    public static final int NO_OPT = 1;
    public static final int UX_OPT = 2;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_pcs_form_ux_opt", DEFAULT);
    }

    public final boolean isAutofillEnabled() {
        return getValue() != 1;
    }

    public final boolean isUxOptEnabled() {
        return getValue() == 2;
    }
}
