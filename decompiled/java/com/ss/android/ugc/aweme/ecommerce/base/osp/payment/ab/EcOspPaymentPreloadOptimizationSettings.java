package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab;

import X.C09CT;
import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: loaded from: classes2.dex */
public final class EcOspPaymentPreloadOptimizationSettings {
    public static final EcOspPaymentPreloadOptimizationModel LIZ;

    static {
        Boolean bool = Boolean.FALSE;
        LIZ = new EcOspPaymentPreloadOptimizationModel(bool, bool);
    }

    public static final EcOspPaymentPreloadOptimizationModel LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        EcOspPaymentPreloadOptimizationModel ecOspPaymentPreloadOptimizationModel = LIZ;
        EcOspPaymentPreloadOptimizationModel ecOspPaymentPreloadOptimizationModel2 = (EcOspPaymentPreloadOptimizationModel) settingsManagerLIZLLL.LJIIIIZZ("ec_osp_payment_preload_optimization", EcOspPaymentPreloadOptimizationModel.class, ecOspPaymentPreloadOptimizationModel);
        return ecOspPaymentPreloadOptimizationModel2 != null ? ecOspPaymentPreloadOptimizationModel2 : ecOspPaymentPreloadOptimizationModel;
    }

    public static final class EcOspPaymentPreloadOptimizationModel {

        @C09CT("pre_init_gp")
        public final Boolean enableGPPreInit;

        @C09CT("view_all_opti")
        public final Boolean enableViewAllOpti;

        public EcOspPaymentPreloadOptimizationModel(Boolean bool, Boolean bool2) {
            this.enableGPPreInit = bool;
            this.enableViewAllOpti = bool2;
        }
    }
}
