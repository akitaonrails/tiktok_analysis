package com.ss.android.ugc.aweme.changeregion.api;

import X.C09CT;
import X.C11NZ;
import X.C1726210v1P;
import X.InterfaceC1501160pAQ;
import com.ss.android.ugc.aweme.changeregion.sdk.model.Country;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public interface RegionListAPI {
    public static final C1726210v1P LIZ = C1726210v1P.LIZ;

    @InterfaceC1501160pAQ("/passport/app/region/register_region_list/")
    C11NZ<RegionListAPIResponse> getRegionList();

    public static final class RegionList {

        @C09CT("description")
        public final String description;

        @C09CT("region_list")
        public final List<Country> regionList;

        public RegionList(List<Country> list, String str) {
            this.regionList = list;
            this.description = str;
        }
    }

    public static final class RegionListAPIResponse {

        @C09CT("data")
        public final RegionList data;

        @C09CT("message")
        public final String message;

        public RegionListAPIResponse(RegionList regionList, String str) {
            this.data = regionList;
            this.message = str;
        }
    }
}
