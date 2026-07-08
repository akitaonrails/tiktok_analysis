package com.ss.android.ugc.nearby.roaming;

import X.C09CT;
import X.C1164160gOs;
import X.C2188811AlT;
import com.ss.android.ugc.tiktok.location_api.service.LocationRegion;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class NearbyRegionListV1Response extends C1164160gOs {

    @C09CT("all_regions")
    public final List<LocationRegion> allRegions;

    @C09CT("current_region")
    public final LocationRegion currentRegion;

    @C09CT("current_region_l0_code")
    public final String currentRegionL0Code;

    @C09CT("current_region_l0_name")
    public final String currentRegionL0Name;

    @C09CT("current_region_source")
    public final String currentRegionSource;

    @C09CT("popular_regions")
    public final List<LocationRegion> popularRegions;

    public NearbyRegionListV1Response() {
        this(null, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NearbyRegionListV1Response)) {
            return false;
        }
        NearbyRegionListV1Response nearbyRegionListV1Response = (NearbyRegionListV1Response) obj;
        return Intrinsics.LJFF(this.currentRegionSource, nearbyRegionListV1Response.currentRegionSource) && Intrinsics.LJFF(this.currentRegion, nearbyRegionListV1Response.currentRegion) && Intrinsics.LJFF(this.currentRegionL0Code, nearbyRegionListV1Response.currentRegionL0Code) && Intrinsics.LJFF(this.currentRegionL0Name, nearbyRegionListV1Response.currentRegionL0Name) && Intrinsics.LJFF(this.popularRegions, nearbyRegionListV1Response.popularRegions) && Intrinsics.LJFF(this.allRegions, nearbyRegionListV1Response.allRegions);
    }

    public final int hashCode() {
        String str = this.currentRegionSource;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        LocationRegion locationRegion = this.currentRegion;
        int iHashCode2 = (iHashCode + (locationRegion == null ? 0 : locationRegion.hashCode())) * 31;
        String str2 = this.currentRegionL0Code;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.currentRegionL0Name;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<LocationRegion> list = this.popularRegions;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List<LocationRegion> list2 = this.allRegions;
        return iHashCode5 + (list2 != null ? list2.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NearbyRegionListV1Response(currentRegionSource=");
        sbLIZ.append(this.currentRegionSource);
        sbLIZ.append(", currentRegion=");
        sbLIZ.append(this.currentRegion);
        sbLIZ.append(", currentRegionL0Code=");
        sbLIZ.append(this.currentRegionL0Code);
        sbLIZ.append(", currentRegionL0Name=");
        sbLIZ.append(this.currentRegionL0Name);
        sbLIZ.append(", popularRegions=");
        sbLIZ.append(this.popularRegions);
        sbLIZ.append(", allRegions=");
        sbLIZ.append(this.allRegions);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public NearbyRegionListV1Response(String str, LocationRegion locationRegion, String str2, String str3, List<LocationRegion> list, List<LocationRegion> list2) {
        this.currentRegionSource = str;
        this.currentRegion = locationRegion;
        this.currentRegionL0Code = str2;
        this.currentRegionL0Name = str3;
        this.popularRegions = list;
        this.allRegions = list2;
    }
}
