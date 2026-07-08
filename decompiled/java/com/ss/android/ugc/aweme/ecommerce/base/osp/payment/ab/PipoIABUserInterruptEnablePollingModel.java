package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class PipoIABUserInterruptEnablePollingModel {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("supported_methods")
    public final List<String> supportedMethods;

    public PipoIABUserInterruptEnablePollingModel() {
        this(false, null, 3, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PipoIABUserInterruptEnablePollingModel)) {
            return false;
        }
        PipoIABUserInterruptEnablePollingModel pipoIABUserInterruptEnablePollingModel = (PipoIABUserInterruptEnablePollingModel) obj;
        return this.enable == pipoIABUserInterruptEnablePollingModel.enable && Intrinsics.LJFF(this.supportedMethods, pipoIABUserInterruptEnablePollingModel.supportedMethods);
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.enable) * 31) + this.supportedMethods.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PipoIABUserInterruptEnablePollingModel(enable=");
        sbLIZ.append(this.enable);
        sbLIZ.append(", supportedMethods=");
        sbLIZ.append(this.supportedMethods);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PipoIABUserInterruptEnablePollingModel(boolean z, List<String> list) {
        this.enable = z;
        this.supportedMethods = list;
    }

    public PipoIABUserInterruptEnablePollingModel(boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? Collections.singletonList("pm_pi_ib_ideal_c_r") : list);
    }
}
