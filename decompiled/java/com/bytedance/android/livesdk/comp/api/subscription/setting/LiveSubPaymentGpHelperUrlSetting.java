package com.bytedance.android.livesdk.comp.api.subscription.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_sub_payment_gp_helper_url")
public final class LiveSubPaymentGpHelperUrlSetting {
    public static final String DEFAULT = "https://support.google.com/googleplay/answer/1267137?co=GENIE.Platform%3DAndroid";
    public static final LiveSubPaymentGpHelperUrlSetting INSTANCE = new LiveSubPaymentGpHelperUrlSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("live_sub_payment_gp_helper_url", DEFAULT);
    }
}
