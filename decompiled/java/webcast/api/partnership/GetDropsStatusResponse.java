package webcast.api.partnership;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class GetDropsStatusResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("drops_id")
        public String dropsId = "";

        @C09CT("start_time")
        public long startTime;

        @C09CT("v_region")
        public int vRegion;
    }
}
