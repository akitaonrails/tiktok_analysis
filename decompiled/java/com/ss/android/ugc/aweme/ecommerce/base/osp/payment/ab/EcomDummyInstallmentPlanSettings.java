package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes2.dex */
public final class EcomDummyInstallmentPlanSettings {
    public static final EcomDummyInstallmentPlanModel LIZ = new EcomDummyInstallmentPlanModel(true, true);

    public static final class EcomDummyInstallmentPlanModel {

        @C09CT("enable_pay_frag_button")
        public final boolean enablePayFragButton;

        @C09CT("update_installment_on_separate_page")
        public final boolean updateInstallmentOnSeparatePage;

        public EcomDummyInstallmentPlanModel() {
            this(true, true);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EcomDummyInstallmentPlanModel)) {
                return false;
            }
            EcomDummyInstallmentPlanModel ecomDummyInstallmentPlanModel = (EcomDummyInstallmentPlanModel) obj;
            return this.enablePayFragButton == ecomDummyInstallmentPlanModel.enablePayFragButton && this.updateInstallmentOnSeparatePage == ecomDummyInstallmentPlanModel.updateInstallmentOnSeparatePage;
        }

        public final int hashCode() {
            return (C786410Ut5.Z2(this.enablePayFragButton) * 31) + C786410Ut5.Z2(this.updateInstallmentOnSeparatePage);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("EcomDummyInstallmentPlanModel(enablePayFragButton=");
            sbLIZ.append(this.enablePayFragButton);
            sbLIZ.append(", updateInstallmentOnSeparatePage=");
            sbLIZ.append(this.updateInstallmentOnSeparatePage);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public EcomDummyInstallmentPlanModel(boolean z, boolean z2) {
            this.enablePayFragButton = z;
            this.updateInstallmentOnSeparatePage = z2;
        }
    }
}
