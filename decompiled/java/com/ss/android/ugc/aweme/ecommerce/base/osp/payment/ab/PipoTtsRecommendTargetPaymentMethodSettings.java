package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab;

import X.C09CT;
import X.C13LP;
import X.C1533950q1J;
import com.bytedance.ies.abmock.SettingsManager;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class PipoTtsRecommendTargetPaymentMethodSettings {
    public static final PipoTtsRecommendTargetPaymentMethodModel LIZ = new PipoTtsRecommendTargetPaymentMethodModel(null);

    public static final PipoTtsRecommendTargetPaymentMethodModel LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        PipoTtsRecommendTargetPaymentMethodModel pipoTtsRecommendTargetPaymentMethodModel = LIZ;
        PipoTtsRecommendTargetPaymentMethodModel pipoTtsRecommendTargetPaymentMethodModel2 = (PipoTtsRecommendTargetPaymentMethodModel) settingsManagerLIZLLL.LJIIIIZZ("pipo_tts_recommend_target_payment_method", PipoTtsRecommendTargetPaymentMethodModel.class, pipoTtsRecommendTargetPaymentMethodModel);
        return pipoTtsRecommendTargetPaymentMethodModel2 != null ? pipoTtsRecommendTargetPaymentMethodModel2 : pipoTtsRecommendTargetPaymentMethodModel;
    }

    public static final class PipoTtsRecommendTargetPaymentMethodModel {

        @C09CT("target_pm_list")
        public final List<String> targetPaymentMethods;

        public PipoTtsRecommendTargetPaymentMethodModel() {
            this(null);
        }

        public PipoTtsRecommendTargetPaymentMethodModel(List<String> list) {
            this.targetPaymentMethods = list;
        }
    }

    public static boolean LIZIZ(String str) {
        List<String> list;
        if (!C1533950q1J.LJ(str) || (list = LIZ().targetPaymentMethods) == null || !C13LP.LJJJJ(str, list)) {
            return false;
        }
        return true;
    }
}
