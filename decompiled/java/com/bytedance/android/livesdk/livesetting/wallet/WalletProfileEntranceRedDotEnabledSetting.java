package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("wallet_setting_red_dot_enabled")
public final class WalletProfileEntranceRedDotEnabledSetting {
    public static final boolean DEFAULT = false;
    public static final WalletProfileEntranceRedDotEnabledSetting INSTANCE = new WalletProfileEntranceRedDotEnabledSetting();
    public static final boolean EXPERIMENT = true;

    public final boolean getValue() {
        try {
            return SettingsManager.INSTANCE.getBooleanValue("wallet_setting_red_dot_enabled", DEFAULT);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return DEFAULT;
        }
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }

    public final boolean getEXPERIMENT() {
        return EXPERIMENT;
    }
}
