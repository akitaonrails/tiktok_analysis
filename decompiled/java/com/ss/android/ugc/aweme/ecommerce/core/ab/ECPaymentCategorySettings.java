package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;
import X.C2097608Jq;
import com.bytedance.ies.abmock.SettingsManager;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class ECPaymentCategorySettings {
    public static final EcPaymentCategoryModel LIZ = new EcPaymentCategoryModel(C2097608Jq.LJ());

    public static final class EcPaymentCategoryModel {

        @C09CT("pay_category_mapping")
        public final Map<String, List<String>> payCategoryMapping;

        public EcPaymentCategoryModel() {
            this(C2097608Jq.LJ());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public EcPaymentCategoryModel(Map<String, ? extends List<String>> map) {
            this.payCategoryMapping = map;
        }
    }

    public static final Map<String, List<String>> LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        EcPaymentCategoryModel ecPaymentCategoryModel = LIZ;
        EcPaymentCategoryModel ecPaymentCategoryModel2 = (EcPaymentCategoryModel) settingsManagerLIZLLL.LJIIIIZZ("ec_payment_category", EcPaymentCategoryModel.class, ecPaymentCategoryModel);
        if (ecPaymentCategoryModel2 != null) {
            ecPaymentCategoryModel = ecPaymentCategoryModel2;
        }
        Map<String, List<String>> map = ecPaymentCategoryModel.payCategoryMapping;
        return map == null ? C2097608Jq.LJ() : map;
    }
}
