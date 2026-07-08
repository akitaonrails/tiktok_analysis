package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("wallet_panel_query_time_out")
public final class LiveWalletQueryProductTimeOut {
    public static final LiveWalletQueryProductTimeOut INSTANCE = new LiveWalletQueryProductTimeOut();
    public static final long DEFAULT = 15;

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue("wallet_panel_query_time_out", DEFAULT);
    }
}
