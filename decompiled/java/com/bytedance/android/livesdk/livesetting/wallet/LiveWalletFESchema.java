package com.bytedance.android.livesdk.livesetting.wallet;

import X.C2188811AlT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes28.dex */
@SettingsKey("live_wallet_schema")
public final class LiveWalletFESchema {
    public static final LiveWalletFESchema INSTANCE = new LiveWalletFESchema();
    public static final LiveWalletRechargeSchema DEFAULT = new LiveWalletRechargeSchema();

    public final LiveWalletRechargeSchema getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        LiveWalletRechargeSchema liveWalletRechargeSchema = DEFAULT;
        LiveWalletRechargeSchema liveWalletRechargeSchema2 = (LiveWalletRechargeSchema) settingsManager.getValueSafely("live_wallet_schema", liveWalletRechargeSchema);
        return liveWalletRechargeSchema2 != null ? liveWalletRechargeSchema2 : liveWalletRechargeSchema;
    }

    public final String getCancelRetentionPopUpSchema() {
        return getValue().cancelRetentionPopup;
    }

    public final String getCashbackInfo() {
        return getValue().cashbackInfo;
    }

    public final String getCoinHistoryScheme() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getTransactionHistoryScheme());
        sbLIZ.append("&transaction_type=coin");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getEmailNotificationScheme() {
        return getValue().emailNotificationPopup;
    }

    public final String getRechargePaymentSuccess() {
        return getValue().rechargePaymentSuccess;
    }

    public final String getRetentionPopupSchema() {
        return getValue().exchangeRetentionPopup;
    }

    public final String getTransactionHistoryScheme() {
        return getValue().transactionHistory;
    }
}
