package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("wallet_entrance_kill_switch")
public final class WalletEntranceKillswitch {
    public static final boolean EXPERIMENT = false;
    public static final WalletEntranceKillswitch INSTANCE = new WalletEntranceKillswitch();
    public static final boolean DEFAULT = true;

    public final boolean isWalletEntranceKillswitchEnabled() {
        try {
            return SettingsManager.INSTANCE.getBooleanValue("wallet_entrance_kill_switch", DEFAULT);
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
