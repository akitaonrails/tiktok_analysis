package com.bytedance.android.livesdk.comp.api.pcs.data.setting.onboarding;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_pcs_optin_page_ui_style")
public final class LivePcsOptinPageUIStyleSetting {
    public static final int DEFAULT = 0;
    public static final LivePcsOptinPageUIStyleSetting INSTANCE = new LivePcsOptinPageUIStyleSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_pcs_optin_page_ui_style", DEFAULT);
    }

    public final boolean isEnabled() {
        return getValue() == 1;
    }
}
