package com.ss.android.ugc.aweme.socialavatar.saas.mixstudio;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class MixStudioActionBarConfigResponse implements Serializable {

    @C09CT("default_id")
    public final Integer defaultId;

    @C09CT("default_element")
    public final MixStudioActionBarConfigElementResponse element;

    @C09CT("enable_dual_id")
    public final Boolean enableDualId;

    @C09CT("valid_from_ts")
    public final Long validFromTimestamp;

    @C09CT("valid_until_ts")
    public final Long validUntilTimestamp;

    public MixStudioActionBarConfigResponse() {
        this(null, null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MixStudioActionBarConfigResponse)) {
            return false;
        }
        MixStudioActionBarConfigResponse mixStudioActionBarConfigResponse = (MixStudioActionBarConfigResponse) obj;
        return Intrinsics.LJFF(this.defaultId, mixStudioActionBarConfigResponse.defaultId) && Intrinsics.LJFF(this.enableDualId, mixStudioActionBarConfigResponse.enableDualId) && Intrinsics.LJFF(this.element, mixStudioActionBarConfigResponse.element) && Intrinsics.LJFF(this.validFromTimestamp, mixStudioActionBarConfigResponse.validFromTimestamp) && Intrinsics.LJFF(this.validUntilTimestamp, mixStudioActionBarConfigResponse.validUntilTimestamp);
    }

    public int hashCode() {
        Integer num = this.defaultId;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Boolean bool = this.enableDualId;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        MixStudioActionBarConfigElementResponse mixStudioActionBarConfigElementResponse = this.element;
        int iHashCode3 = (iHashCode2 + (mixStudioActionBarConfigElementResponse == null ? 0 : mixStudioActionBarConfigElementResponse.hashCode())) * 31;
        Long l = this.validFromTimestamp;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.validUntilTimestamp;
        return iHashCode4 + (l2 != null ? l2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MixStudioActionBarConfigResponse(defaultId=");
        sbLIZ.append(this.defaultId);
        sbLIZ.append(", enableDualId=");
        sbLIZ.append(this.enableDualId);
        sbLIZ.append(", element=");
        sbLIZ.append(this.element);
        sbLIZ.append(", validFromTimestamp=");
        sbLIZ.append(this.validFromTimestamp);
        sbLIZ.append(", validUntilTimestamp=");
        sbLIZ.append(this.validUntilTimestamp);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public MixStudioActionBarConfigResponse(Integer num, Boolean bool, MixStudioActionBarConfigElementResponse mixStudioActionBarConfigElementResponse, Long l, Long l2) {
        this.defaultId = num;
        this.enableDualId = bool;
        this.element = mixStudioActionBarConfigElementResponse;
        this.validFromTimestamp = l;
        this.validUntilTimestamp = l2;
    }
}
