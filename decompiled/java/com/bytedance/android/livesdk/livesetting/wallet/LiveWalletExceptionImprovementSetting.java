package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_wallet_exception_improvement")
public final class LiveWalletExceptionImprovementSetting {
    public static final boolean DEFAULT = true;
    public static final LiveWalletExceptionImprovementSetting INSTANCE = new LiveWalletExceptionImprovementSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_wallet_exception_improvement", DEFAULT);
    }
}
