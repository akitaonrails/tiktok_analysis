package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab;

import X.C09CT;
import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: loaded from: classes2.dex */
public final class PipoPaymentEnableVnBalanceSettings {
    public static final BalanceConfig LIZ = new BalanceConfig(Boolean.FALSE, "MMM D, YYYY", Double.valueOf(0.6d));

    public static final BalanceConfig LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        BalanceConfig balanceConfig = LIZ;
        BalanceConfig balanceConfig2 = (BalanceConfig) settingsManagerLIZLLL.LJIIIIZZ("pipo_payment_enable_vn_balance", BalanceConfig.class, balanceConfig);
        return balanceConfig2 != null ? balanceConfig2 : balanceConfig;
    }

    public static final class BalanceConfig {

        @C09CT("date_format")
        public final String dateFormat;

        @C09CT("enable_vn_balance")
        public final Boolean enableVnBalance;

        @C09CT("sheet_height")
        public final Double sheetHeight;

        public BalanceConfig(Boolean bool, String str, Double d) {
            this.enableVnBalance = bool;
            this.dateFormat = str;
            this.sheetHeight = d;
        }
    }
}
