package com.bytedance.android.livesdk.livesetting.privilege;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_enigma_merchant_id")
public final class LiveEnigmaMerchantIdSetting {
    public static final LiveEnigmaMerchantIdSetting INSTANCE = new LiveEnigmaMerchantIdSetting();
    public static final String DEFAULT = "80XKE9623701";

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("live_enigma_merchant_id", DEFAULT);
    }
}
