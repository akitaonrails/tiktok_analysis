package com.bytedance.pumbaa.hybrid.governance.csp;

import X.C09CT;
import X.C2188811AlT;
import com.bytedance.pumbaa.hybrid.governance.api.BaseGovernanceModel;

/* JADX INFO: loaded from: classes3.dex */
public final class PnsOfflineResComplianceModel extends BaseGovernanceModel {

    @C09CT("csp_enable")
    public final boolean cspEnable;

    public PnsOfflineResComplianceModel() {
        this(false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PnsOfflineResComplianceModel) && this.cspEnable == ((PnsOfflineResComplianceModel) obj).cspEnable;
    }

    public final int hashCode() {
        boolean z = this.cspEnable;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PnsOfflineResComplianceModel(cspEnable=");
        sbLIZ.append(this.cspEnable);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PnsOfflineResComplianceModel(boolean z) {
        super(null, false, false, false, false);
        this.cspEnable = z;
    }
}
