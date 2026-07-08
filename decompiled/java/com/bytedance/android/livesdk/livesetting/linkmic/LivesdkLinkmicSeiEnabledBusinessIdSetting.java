package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C13LQ;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("livesdk_linkmic_sei_enabled_business_id")
public final class LivesdkLinkmicSeiEnabledBusinessIdSetting {
    public static final LivesdkLinkmicSeiEnabledBusinessIdSetting INSTANCE = new LivesdkLinkmicSeiEnabledBusinessIdSetting();
    public static final String[] DEFAULT = new String[0];

    public final String[] getValue() {
        return SettingsManager.INSTANCE.getStringArrayValue("livesdk_linkmic_sei_enabled_business_id", DEFAULT);
    }

    public final boolean isDisableAll() {
        return getValue().length == 0;
    }

    public final boolean isEnable(String str) {
        return C13LQ.LJIILLIIL(str, getValue());
    }
}
