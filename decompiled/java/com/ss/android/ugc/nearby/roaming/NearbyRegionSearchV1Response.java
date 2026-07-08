package com.ss.android.ugc.nearby.roaming;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.tiktok.location_api.service.LocationRegion;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class NearbyRegionSearchV1Response extends BaseResponse {

    @C09CT("regions")
    public final List<LocationRegion> regions;

    public NearbyRegionSearchV1Response() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NearbyRegionSearchV1Response) && Intrinsics.LJFF(this.regions, ((NearbyRegionSearchV1Response) obj).regions);
    }

    public final int hashCode() {
        List<LocationRegion> list = this.regions;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NearbyRegionSearchV1Response(regions=");
        sbLIZ.append(this.regions);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public NearbyRegionSearchV1Response(List<LocationRegion> list) {
        this.regions = list;
    }
}
