package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_iap_error_handling_refactor")
public final class LiveIAPRefactorErrorHandling {
    public static final boolean DEFAULT = false;
    public static final LiveIAPRefactorErrorHandling INSTANCE = new LiveIAPRefactorErrorHandling();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_iap_error_handling_refactor", DEFAULT);
    }
}
