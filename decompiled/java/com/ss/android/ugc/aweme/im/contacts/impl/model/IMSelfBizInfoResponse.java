package com.ss.android.ugc.aweme.im.contacts.impl.model;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class IMSelfBizInfoResponse {

    @C09CT("im_feature_capability")
    public final IMFeatureCapability imFeatureCapability;

    public IMSelfBizInfoResponse() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof IMSelfBizInfoResponse) && Intrinsics.LJFF(this.imFeatureCapability, ((IMSelfBizInfoResponse) obj).imFeatureCapability);
    }

    public final int hashCode() {
        IMFeatureCapability iMFeatureCapability = this.imFeatureCapability;
        if (iMFeatureCapability == null) {
            return 0;
        }
        return iMFeatureCapability.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMSelfBizInfoResponse(imFeatureCapability=");
        sbLIZ.append(this.imFeatureCapability);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public IMSelfBizInfoResponse(IMFeatureCapability iMFeatureCapability) {
        this.imFeatureCapability = iMFeatureCapability;
    }
}
