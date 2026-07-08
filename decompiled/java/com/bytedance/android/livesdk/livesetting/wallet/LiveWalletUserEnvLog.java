package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("wallet_user_google_env_check")
public final class LiveWalletUserEnvLog {
    public static final LiveWalletUserEnvLog INSTANCE = new LiveWalletUserEnvLog();
    public static final boolean DEFAULT = true;

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("wallet_user_google_env_check", DEFAULT);
    }
}
