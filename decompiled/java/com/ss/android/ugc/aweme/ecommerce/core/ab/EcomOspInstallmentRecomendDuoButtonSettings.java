package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;
import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: loaded from: classes2.dex */
public final class EcomOspInstallmentRecomendDuoButtonSettings {
    public static final EcomOspInstallmentRecomendDuoButtonModel LIZ = new EcomOspInstallmentRecomendDuoButtonModel(false, false, false);

    public static final EcomOspInstallmentRecomendDuoButtonModel LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        EcomOspInstallmentRecomendDuoButtonModel ecomOspInstallmentRecomendDuoButtonModel = LIZ;
        EcomOspInstallmentRecomendDuoButtonModel ecomOspInstallmentRecomendDuoButtonModel2 = (EcomOspInstallmentRecomendDuoButtonModel) settingsManagerLIZLLL.LJIIIIZZ("ecom_osp_installment_recomend_duo_button", EcomOspInstallmentRecomendDuoButtonModel.class, ecomOspInstallmentRecomendDuoButtonModel);
        return ecomOspInstallmentRecomendDuoButtonModel2 != null ? ecomOspInstallmentRecomendDuoButtonModel2 : ecomOspInstallmentRecomendDuoButtonModel;
    }

    public static final class EcomOspInstallmentRecomendDuoButtonModel {

        @C09CT("choose_recommend_installment")
        public final boolean chooseRecommendInstallment;

        @C09CT("enable_duo_button")
        public final boolean enableDuoButton;

        @C09CT("enable_recommend_button_track")
        public final boolean enableRecommendButtonTrack;

        public EcomOspInstallmentRecomendDuoButtonModel() {
            this(false, false, false);
        }

        public EcomOspInstallmentRecomendDuoButtonModel(boolean z, boolean z2, boolean z3) {
            this.chooseRecommendInstallment = z;
            this.enableDuoButton = z2;
            this.enableRecommendButtonTrack = z3;
        }
    }
}
