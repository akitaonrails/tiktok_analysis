package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_iap_restore_refactor")
public final class LiveIAPRefactorPaymentRestoreSetting {
    public static final boolean DEFAULT = false;
    public static final LiveIAPRefactorPaymentRestoreSetting INSTANCE = new LiveIAPRefactorPaymentRestoreSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_iap_restore_refactor", DEFAULT);
    }
}
