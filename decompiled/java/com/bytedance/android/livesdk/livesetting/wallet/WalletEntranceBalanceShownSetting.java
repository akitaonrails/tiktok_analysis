package com.bytedance.android.livesdk.livesetting.wallet;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes28.dex */
@SettingsKey("wallet_entrance_balance_override")
public final class WalletEntranceBalanceShownSetting {
    public static final WalletEntranceBalanceShownSetting INSTANCE = new WalletEntranceBalanceShownSetting();
    public static final WalletEntranceConfig DEFAULT = new WalletEntranceConfig(false, false, false);
    public static final WalletEntranceConfig CONTROL = new WalletEntranceConfig(true, false, false);
    public static final WalletEntranceConfig EXPERIMENT = new WalletEntranceConfig(true, true, false);

    private final WalletEntranceConfig getWalletEntranceConfig() {
        return (WalletEntranceConfig) SettingsManager.INSTANCE.getValueSafely("wallet_entrance_balance_override", DEFAULT);
    }

    public final boolean shouldShowBAccountBalance() {
        try {
            WalletEntranceConfig walletEntranceConfig = getWalletEntranceConfig();
            if (walletEntranceConfig == null) {
                walletEntranceConfig = DEFAULT;
            }
            return walletEntranceConfig.getShowBAccountBalance();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return DEFAULT.getShowBAccountBalance();
        }
    }

    public final boolean shouldShowBalance() {
        try {
            WalletEntranceConfig walletEntranceConfig = getWalletEntranceConfig();
            if (walletEntranceConfig == null) {
                walletEntranceConfig = DEFAULT;
            }
            return walletEntranceConfig.getShowBalance();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return DEFAULT.getShowBalance();
        }
    }

    public final boolean shouldShowWalletEntrance() {
        try {
            WalletEntranceConfig walletEntranceConfig = getWalletEntranceConfig();
            if (walletEntranceConfig == null) {
                walletEntranceConfig = DEFAULT;
            }
            return walletEntranceConfig.getShowInNavBar();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return DEFAULT.getShowInNavBar();
        }
    }

    public static final class WalletEntranceConfig {
        public static final TypeAdapter ADAPTER = new WalletEntranceBalanceShownSetting_WalletEntranceConfig_OptTypeAdapter(NormalGson.singleton());

        @C09CT("show_b_account_balance")
        public boolean showBAccountBalance;

        @C09CT("show_balance")
        public boolean showBalance;

        @C09CT("show_entrance")
        public boolean showInNavBar;

        public WalletEntranceConfig() {
            this(false, false, false);
        }

        public final boolean getShowBAccountBalance() {
            return this.showBAccountBalance;
        }

        public final boolean getShowBalance() {
            return this.showBalance;
        }

        public final boolean getShowInNavBar() {
            return this.showInNavBar;
        }

        public final void setShowBAccountBalance(boolean z) {
            this.showBAccountBalance = z;
        }

        public final void setShowBalance(boolean z) {
            this.showBalance = z;
        }

        public final void setShowInNavBar(boolean z) {
            this.showInNavBar = z;
        }

        public WalletEntranceConfig(boolean z, boolean z2, boolean z3) {
            this.showInNavBar = z;
            this.showBalance = z2;
            this.showBAccountBalance = z3;
        }
    }

    public final WalletEntranceConfig getCONTROL() {
        return CONTROL;
    }

    public final WalletEntranceConfig getDEFAULT() {
        return DEFAULT;
    }

    public final WalletEntranceConfig getEXPERIMENT() {
        return EXPERIMENT;
    }
}
