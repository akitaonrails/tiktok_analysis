package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_iap_payment_refactor")
public final class LiveIAPRefactorPaymentSetting {
    public static final boolean DEFAULT = false;
    public static final LiveIAPRefactorPaymentSetting INSTANCE = new LiveIAPRefactorPaymentSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_iap_payment_refactor", DEFAULT);
    }
}
