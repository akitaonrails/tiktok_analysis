package com.ss.android.ugc.nearby.roaming;

import X.C11NZ;
import X.C1201860hNg;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;

/* JADX INFO: loaded from: classes19.dex */
public interface RegionListApi {
    public static final C1201860hNg LIZ = C1201860hNg.LIZ;

    @InterfaceC1501170pAR("/tiktok/nearby/region/list/v1/")
    C11NZ<NearbyRegionListV1Response> fetchNearbyRegionList(@InterfaceC1485405rg NearbyRegionListV1Request nearbyRegionListV1Request);

    @InterfaceC1501170pAR("/tiktok/nearby/region/search/v1/")
    C11NZ<NearbyRegionSearchV1Response> searchRegions(@InterfaceC1485405rg NearbyRegionSearchV1Request nearbyRegionSearchV1Request);
}
