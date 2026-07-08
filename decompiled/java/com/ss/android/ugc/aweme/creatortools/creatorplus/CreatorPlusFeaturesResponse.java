package com.ss.android.ugc.aweme.creatortools.creatorplus;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class CreatorPlusFeaturesResponse extends BaseResponse {

    @C09CT("creator_plus_status")
    public final Integer creatorPlusStatus;

    @C09CT("features")
    public final List<CreatorPlusFeature> features;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreatorPlusFeaturesResponse)) {
            return false;
        }
        CreatorPlusFeaturesResponse creatorPlusFeaturesResponse = (CreatorPlusFeaturesResponse) obj;
        return Intrinsics.LJFF(this.creatorPlusStatus, creatorPlusFeaturesResponse.creatorPlusStatus) && Intrinsics.LJFF(this.features, creatorPlusFeaturesResponse.features);
    }

    public final int hashCode() {
        Integer num = this.creatorPlusStatus;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<CreatorPlusFeature> list = this.features;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CreatorPlusFeaturesResponse(creatorPlusStatus=");
        sbLIZ.append(this.creatorPlusStatus);
        sbLIZ.append(", features=");
        sbLIZ.append(this.features);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CreatorPlusFeaturesResponse(Integer num, List<CreatorPlusFeature> list) {
        this.creatorPlusStatus = num;
        this.features = list;
    }
}
