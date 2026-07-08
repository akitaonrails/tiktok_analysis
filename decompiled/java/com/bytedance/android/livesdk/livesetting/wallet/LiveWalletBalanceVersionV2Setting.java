package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("wallet_use_version_v2")
public final class LiveWalletBalanceVersionV2Setting {
    public static final boolean DEFAULT = false;
    public static final LiveWalletBalanceVersionV2Setting INSTANCE = new LiveWalletBalanceVersionV2Setting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("wallet_use_version_v2", DEFAULT);
    }
}
