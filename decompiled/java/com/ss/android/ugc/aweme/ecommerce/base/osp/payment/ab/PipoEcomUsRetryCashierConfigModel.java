package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes2.dex */
public final class PipoEcomUsRetryCashierConfigModel {

    @C09CT("us_retry_cashier_one_step_checkout")
    public final boolean usRetryCashierOneStepCheckout;

    @C09CT("us_retry_cashier_repeatedly_shown")
    public final boolean usRetryCashierRepeatedlyShown;

    public PipoEcomUsRetryCashierConfigModel() {
        this(false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PipoEcomUsRetryCashierConfigModel)) {
            return false;
        }
        PipoEcomUsRetryCashierConfigModel pipoEcomUsRetryCashierConfigModel = (PipoEcomUsRetryCashierConfigModel) obj;
        return this.usRetryCashierOneStepCheckout == pipoEcomUsRetryCashierConfigModel.usRetryCashierOneStepCheckout && this.usRetryCashierRepeatedlyShown == pipoEcomUsRetryCashierConfigModel.usRetryCashierRepeatedlyShown;
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.usRetryCashierOneStepCheckout) * 31) + C786410Ut5.Z2(this.usRetryCashierRepeatedlyShown);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PipoEcomUsRetryCashierConfigModel(usRetryCashierOneStepCheckout=");
        sbLIZ.append(this.usRetryCashierOneStepCheckout);
        sbLIZ.append(", usRetryCashierRepeatedlyShown=");
        sbLIZ.append(this.usRetryCashierRepeatedlyShown);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PipoEcomUsRetryCashierConfigModel(boolean z, boolean z2) {
        this.usRetryCashierOneStepCheckout = z;
        this.usRetryCashierRepeatedlyShown = z2;
    }
}
