package tikcast.api.anchor;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class LiveInformationQueryResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("live_anchor_interest_all")
        public LiveAnchorInterestAll liveAnchorInterestAll;

        @C09CT("live_history")
        public LiveHistory liveHistory;

        @C09CT("live_information_basic")
        public LiveInformationBasic liveInformationBasic;
    }
}
