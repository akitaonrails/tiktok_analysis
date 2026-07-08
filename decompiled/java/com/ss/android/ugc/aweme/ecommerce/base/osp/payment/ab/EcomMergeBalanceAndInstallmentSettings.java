package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab;

import X.C09CT;
import com.bytedance.ies.abmock.SettingsManager;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class EcomMergeBalanceAndInstallmentSettings {
    public static final EcomMergeBalanceAndInstallmentModel LIZ = new EcomMergeBalanceAndInstallmentModel(null);

    public static final class EcomMergeBalanceAndInstallmentModel {

        @C09CT("merge_payment_method")
        public final List<String> mergePaymentMethod;

        public EcomMergeBalanceAndInstallmentModel() {
            this(null);
        }

        public EcomMergeBalanceAndInstallmentModel(List<String> list) {
            this.mergePaymentMethod = list;
        }
    }

    public static boolean LIZ(String str) {
        if (str == null) {
            return false;
        }
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        EcomMergeBalanceAndInstallmentModel ecomMergeBalanceAndInstallmentModel = LIZ;
        EcomMergeBalanceAndInstallmentModel ecomMergeBalanceAndInstallmentModel2 = (EcomMergeBalanceAndInstallmentModel) settingsManagerLIZLLL.LJIIIIZZ("ecom_merge_balance_and_installment", EcomMergeBalanceAndInstallmentModel.class, ecomMergeBalanceAndInstallmentModel);
        if (ecomMergeBalanceAndInstallmentModel2 != null) {
            ecomMergeBalanceAndInstallmentModel = ecomMergeBalanceAndInstallmentModel2;
        }
        List<String> list = ecomMergeBalanceAndInstallmentModel.mergePaymentMethod;
        if (list == null || !list.contains(str)) {
            return false;
        }
        return true;
    }
}
