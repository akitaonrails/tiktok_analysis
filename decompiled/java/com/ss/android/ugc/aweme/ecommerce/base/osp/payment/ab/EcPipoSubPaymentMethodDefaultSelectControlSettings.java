package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab;

import X.C09CT;
import X.C1697810uHb;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class EcPipoSubPaymentMethodDefaultSelectControlSettings {
    public static final EcPipoSubPaymentMethodDefaultSelectControlModel LIZ = new EcPipoSubPaymentMethodDefaultSelectControlModel(C1697810uHb.LJIIJJI("pm_pi_ccdc_all", "pm_pi_cci_all", "pm_pi_ccdc_hsafsa_all", "pm_pi_ccdc_bancontact_all"));

    public static final class EcPipoSubPaymentMethodDefaultSelectControlModel {

        @C09CT("not_allowed_list")
        public final List<String> notAllowedList;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof EcPipoSubPaymentMethodDefaultSelectControlModel) && Intrinsics.LJFF(this.notAllowedList, ((EcPipoSubPaymentMethodDefaultSelectControlModel) obj).notAllowedList);
        }

        public final int hashCode() {
            return this.notAllowedList.hashCode();
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("EcPipoSubPaymentMethodDefaultSelectControlModel(notAllowedList=");
            sbLIZ.append(this.notAllowedList);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public EcPipoSubPaymentMethodDefaultSelectControlModel() {
            this(C1697810uHb.LJIIJJI("pm_pi_ccdc_all", "pm_pi_cci_all", "pm_pi_ccdc_hsafsa_all", "pm_pi_ccdc_bancontact_all"));
        }

        public EcPipoSubPaymentMethodDefaultSelectControlModel(List<String> list) {
            this.notAllowedList = list;
        }
    }
}
