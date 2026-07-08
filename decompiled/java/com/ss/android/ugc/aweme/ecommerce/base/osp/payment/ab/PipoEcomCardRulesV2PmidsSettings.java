package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab;

import X.C09CT;
import X.C13BV;
import X.C1697810uHb;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class PipoEcomCardRulesV2PmidsSettings {
    public static final CardRulesV2Model LIZ;

    static {
        new PipoEcomCardRulesV2PmidsSettings();
        LIZ = new CardRulesV2Model(C1697810uHb.LJIIJJI("pm_pi_ccdc_bancontact_all", "pm_pi_ccdc_bancontact_c_d", "pm_pi_ccdc_hsafsa_all", "pm_pi_ccdc_visahsafsa_c_d", "pm_pi_ccdc_mastercardhsafsa_c_d"));
    }

    public static final class CardRulesV2Model {

        @C09CT("enabled_pm_ids")
        public final List<String> enabledPaymentMethodIds;

        public CardRulesV2Model() {
            this(null, 1, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CardRulesV2Model) && Intrinsics.LJFF(this.enabledPaymentMethodIds, ((CardRulesV2Model) obj).enabledPaymentMethodIds);
        }

        public final int hashCode() {
            return this.enabledPaymentMethodIds.hashCode();
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("CardRulesV2Model(enabledPaymentMethodIds=");
            sbLIZ.append(this.enabledPaymentMethodIds);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public CardRulesV2Model(List<String> list) {
            this.enabledPaymentMethodIds = list;
        }

        public CardRulesV2Model(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? C13BV.INSTANCE : list);
        }
    }
}
