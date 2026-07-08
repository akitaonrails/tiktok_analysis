package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_iap_precheck_refactor")
public final class LiveIapRefactorPrecheck {
    public static final boolean DEFAULT = false;
    public static final LiveIapRefactorPrecheck INSTANCE = new LiveIapRefactorPrecheck();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_iap_precheck_refactor", DEFAULT);
    }
}
