package com.ss.android.ugc.aweme.localservice.live.common.api.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class BCSwitchStatusResponse extends BaseResponse {

    @C09CT("bc_switch_on")
    public final Boolean bcSwitchOn;

    @C09CT("bc_switch_read_only")
    public final Boolean bcSwitchReadOnly;

    public BCSwitchStatusResponse() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BCSwitchStatusResponse)) {
            return false;
        }
        BCSwitchStatusResponse bCSwitchStatusResponse = (BCSwitchStatusResponse) obj;
        return Intrinsics.LJFF(this.bcSwitchOn, bCSwitchStatusResponse.bcSwitchOn) && Intrinsics.LJFF(this.bcSwitchReadOnly, bCSwitchStatusResponse.bcSwitchReadOnly);
    }

    public final int hashCode() {
        Boolean bool = this.bcSwitchOn;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.bcSwitchReadOnly;
        return iHashCode + (bool2 != null ? bool2.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BCSwitchStatusResponse(bcSwitchOn=");
        sbLIZ.append(this.bcSwitchOn);
        sbLIZ.append(", bcSwitchReadOnly=");
        sbLIZ.append(this.bcSwitchReadOnly);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BCSwitchStatusResponse(Boolean bool, Boolean bool2) {
        this.bcSwitchOn = bool;
        this.bcSwitchReadOnly = bool2;
    }
}
