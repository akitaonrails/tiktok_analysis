package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("wallet_info_delay_in_second")
public final class LiveWalletInfoDelaySetting {
    public static final int DEFAULT = 0;
    public static final LiveWalletInfoDelaySetting INSTANCE = new LiveWalletInfoDelaySetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("wallet_info_delay_in_second", DEFAULT);
    }
}
