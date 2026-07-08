package webcast.api.partnership;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class RewardGetDropsStatusResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("anchor_edu_group")
        public int anchorEduGroup;

        @C09CT("drops_id")
        public String dropsId = "";

        @C09CT("search_group")
        public int searchGroup;

        @C09CT("start_time")
        public long startTime;

        @C09CT("v_region")
        public int vRegion;
    }
}
