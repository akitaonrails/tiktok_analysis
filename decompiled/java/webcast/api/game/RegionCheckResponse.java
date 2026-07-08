package webcast.api.game;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class RegionCheckResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("ttp_region_type")
        public long ttpRegionType;

        @C09CT("store_region")
        public String storeRegion = "";

        @C09CT("priority_region")
        public String priorityRegion = "";
    }
}
