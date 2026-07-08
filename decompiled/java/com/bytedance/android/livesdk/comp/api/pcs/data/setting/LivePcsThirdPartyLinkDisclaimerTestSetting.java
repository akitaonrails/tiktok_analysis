package com.bytedance.android.livesdk.comp.api.pcs.data.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_pcs_third_party_link_disclaimer_short_interval")
public final class LivePcsThirdPartyLinkDisclaimerTestSetting {
    public static final boolean DEFAULT = false;
    public static final LivePcsThirdPartyLinkDisclaimerTestSetting INSTANCE = new LivePcsThirdPartyLinkDisclaimerTestSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_pcs_third_party_link_disclaimer_short_interval", DEFAULT);
    }
}
