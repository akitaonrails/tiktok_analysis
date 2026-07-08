package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_wallet_exchange_dialog_new")
public final class LiveExchangeDialogNew {
    public static final boolean DEFAULT = true;
    public static final LiveExchangeDialogNew INSTANCE = new LiveExchangeDialogNew();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_wallet_exchange_dialog_new", DEFAULT);
    }
}
