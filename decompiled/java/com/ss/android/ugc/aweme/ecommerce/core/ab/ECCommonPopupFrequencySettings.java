package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;
import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: loaded from: classes2.dex */
public final class ECCommonPopupFrequencySettings {
    public static final ECCommonPopupFrequencyConfig LIZ;

    static {
        new ECCommonPopupFrequencySettings();
        LIZ = new ECCommonPopupFrequencyConfig(null, null, null, null);
    }

    public static final ECCommonPopupFrequencyConfig LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        ECCommonPopupFrequencyConfig eCCommonPopupFrequencyConfig = LIZ;
        ECCommonPopupFrequencyConfig eCCommonPopupFrequencyConfig2 = (ECCommonPopupFrequencyConfig) settingsManagerLIZLLL.LJIIIIZZ("ecom_osp_retention_popup_frequency", ECCommonPopupFrequencyConfig.class, eCCommonPopupFrequencyConfig);
        return eCCommonPopupFrequencyConfig2 != null ? eCCommonPopupFrequencyConfig2 : eCCommonPopupFrequencyConfig;
    }

    public static final class ECCommonPopupFrequencyConfig {

        @C09CT("ccdc_add_card_page_popup_limit")
        public final Integer addCCDCPagePopupLimit;

        @C09CT("address_edit_page_popup_limit")
        public final Integer addressEditPagePopupLimit;

        @C09CT("order_summary_page_popup_limit")
        public final Integer orderSummaryPagePopupLimit;

        @C09CT("total_popup_limit")
        public final Integer totalPopupLimit;

        public ECCommonPopupFrequencyConfig() {
            this(null, null, null, null);
        }

        public ECCommonPopupFrequencyConfig(Integer num, Integer num2, Integer num3, Integer num4) {
            this.addressEditPagePopupLimit = num;
            this.orderSummaryPagePopupLimit = num2;
            this.totalPopupLimit = num3;
            this.addCCDCPagePopupLimit = num4;
        }
    }
}
