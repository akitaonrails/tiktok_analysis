package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("skip_second_exchange_confirm_popup_phase2")
public final class LiveWalletSecondPopupRemovalPhase2Setting {
    public static final boolean DEFAULT = false;
    public static final LiveWalletSecondPopupRemovalPhase2Setting INSTANCE = new LiveWalletSecondPopupRemovalPhase2Setting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveWalletSecondPopupRemovalPhase2Setting.class);
    }
}
