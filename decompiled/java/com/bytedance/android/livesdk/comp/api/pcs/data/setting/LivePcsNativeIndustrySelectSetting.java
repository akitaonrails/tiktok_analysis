package com.bytedance.android.livesdk.comp.api.pcs.data.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_smb_industry_verification")
public final class LivePcsNativeIndustrySelectSetting {
    public static final boolean DEFAULT = false;
    public static final LivePcsNativeIndustrySelectSetting INSTANCE = new LivePcsNativeIndustrySelectSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_smb_industry_verification", DEFAULT);
    }
}
