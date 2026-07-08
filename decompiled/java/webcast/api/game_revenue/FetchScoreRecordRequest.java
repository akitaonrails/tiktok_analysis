package webcast.api.game_revenue;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class FetchScoreRecordRequest {

    @C09CT("data")
    public RequestData data;

    public static final class RequestData {

        @C09CT("count")
        public long count;

        @C09CT("offset")
        public long offset;

        @C09CT("type")
        public int type;
    }
}
