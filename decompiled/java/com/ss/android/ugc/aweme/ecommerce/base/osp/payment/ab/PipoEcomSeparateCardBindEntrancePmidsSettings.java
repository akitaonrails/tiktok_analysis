package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab;

import X.C09CT;
import X.C13BV;
import X.C1697810uHb;
import X.C2188811AlT;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PipoEcomSeparateCardBindEntrancePmidsSettings {
    public static final PipoEcomSeparateCardBindEntranceModel LIZ;

    static {
        new PipoEcomSeparateCardBindEntrancePmidsSettings();
        LIZ = new PipoEcomSeparateCardBindEntranceModel(C1697810uHb.LJIIJJI("pm_pi_ccdc_hsafsa_all", "pm_pi_ccdc_bancontact_all"), Collections.singletonList("pm_pi_ccdc_bancontact_all"));
    }

    public static final class PipoEcomSeparateCardBindEntranceModel {

        @C09CT("add_card_assem_one_line_pm_ids")
        public final List<String> addCardAssemOneLinePaymentMethodIds;

        @C09CT("allow_pm_ids")
        public final List<String> allowPaymentMethodIds;

        public PipoEcomSeparateCardBindEntranceModel() {
            this(null, null, 3, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PipoEcomSeparateCardBindEntranceModel)) {
                return false;
            }
            PipoEcomSeparateCardBindEntranceModel pipoEcomSeparateCardBindEntranceModel = (PipoEcomSeparateCardBindEntranceModel) obj;
            return Intrinsics.LJFF(this.allowPaymentMethodIds, pipoEcomSeparateCardBindEntranceModel.allowPaymentMethodIds) && Intrinsics.LJFF(this.addCardAssemOneLinePaymentMethodIds, pipoEcomSeparateCardBindEntranceModel.addCardAssemOneLinePaymentMethodIds);
        }

        public final int hashCode() {
            return (this.allowPaymentMethodIds.hashCode() * 31) + this.addCardAssemOneLinePaymentMethodIds.hashCode();
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PipoEcomSeparateCardBindEntranceModel(allowPaymentMethodIds=");
            sbLIZ.append(this.allowPaymentMethodIds);
            sbLIZ.append(", addCardAssemOneLinePaymentMethodIds=");
            sbLIZ.append(this.addCardAssemOneLinePaymentMethodIds);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public PipoEcomSeparateCardBindEntranceModel(List<String> list, List<String> list2) {
            this.allowPaymentMethodIds = list;
            this.addCardAssemOneLinePaymentMethodIds = list2;
        }

        public PipoEcomSeparateCardBindEntranceModel(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? C13BV.INSTANCE : list2);
        }
    }
}
