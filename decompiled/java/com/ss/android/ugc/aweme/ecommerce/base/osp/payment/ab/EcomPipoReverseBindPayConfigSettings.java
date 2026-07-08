package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab;

import X.C09CT;
import X.C13BV;
import X.C13LP;
import X.C1533950q1J;
import com.bytedance.ies.abmock.SettingsManager;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class EcomPipoReverseBindPayConfigSettings {
    public static final EcomPipoReverseBindPayConfigModel LIZ = new EcomPipoReverseBindPayConfigModel(null, null, false, 7, null);

    public static final EcomPipoReverseBindPayConfigModel LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        EcomPipoReverseBindPayConfigModel ecomPipoReverseBindPayConfigModel = LIZ;
        EcomPipoReverseBindPayConfigModel ecomPipoReverseBindPayConfigModel2 = (EcomPipoReverseBindPayConfigModel) settingsManagerLIZLLL.LJIIIIZZ("ecom_pipo_reverse_bind_pay_config", EcomPipoReverseBindPayConfigModel.class, ecomPipoReverseBindPayConfigModel);
        return ecomPipoReverseBindPayConfigModel2 != null ? ecomPipoReverseBindPayConfigModel2 : ecomPipoReverseBindPayConfigModel;
    }

    public static boolean LIZIZ(String str) {
        if (C1533950q1J.LJ(str) && C13LP.LJJJJ(str, LIZ().paymentMethods)) {
            return true;
        }
        return false;
    }

    public static final class EcomPipoReverseBindPayConfigModel {

        @C09CT("default_choose")
        public final boolean defaultChoose;

        @C09CT("filter_summary_payment_methods")
        public final List<String> filterSummaryPaymentMethods;

        @C09CT("payment_methods")
        public final List<String> paymentMethods;

        public EcomPipoReverseBindPayConfigModel() {
            this(null, null, false, 7, null);
        }

        public EcomPipoReverseBindPayConfigModel(List<String> list, List<String> list2, boolean z) {
            this.paymentMethods = list;
            this.filterSummaryPaymentMethods = list2;
            this.defaultChoose = z;
        }

        public EcomPipoReverseBindPayConfigModel(List list, List list2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? C13BV.INSTANCE : list2, (i & 4) != 0 ? true : z);
        }
    }
}
