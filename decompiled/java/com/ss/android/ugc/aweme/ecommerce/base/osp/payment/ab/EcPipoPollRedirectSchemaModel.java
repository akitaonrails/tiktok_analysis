package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class EcPipoPollRedirectSchemaModel {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("payment_methods")
    public final List<String> paymentMethods;

    public EcPipoPollRedirectSchemaModel() {
        this(null, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EcPipoPollRedirectSchemaModel)) {
            return false;
        }
        EcPipoPollRedirectSchemaModel ecPipoPollRedirectSchemaModel = (EcPipoPollRedirectSchemaModel) obj;
        return Intrinsics.LJFF(this.paymentMethods, ecPipoPollRedirectSchemaModel.paymentMethods) && this.enable == ecPipoPollRedirectSchemaModel.enable;
    }

    public final int hashCode() {
        List<String> list = this.paymentMethods;
        return ((list == null ? 0 : list.hashCode()) * 31) + C786410Ut5.Z2(this.enable);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EcPipoPollRedirectSchemaModel(paymentMethods=");
        sbLIZ.append(this.paymentMethods);
        sbLIZ.append(", enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public EcPipoPollRedirectSchemaModel(List<String> list, boolean z) {
        this.paymentMethods = list;
        this.enable = z;
    }
}
