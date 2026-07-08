package webcast.api.game;

import X.C09CT;

/* JADX INFO: loaded from: classes5.dex */
public final class FeedResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("extra")
        public ExtraStruct extra;

        @C09CT("has_more")
        public boolean hasMore;

        @C09CT("items")
        public FeedItemList items;

        @C09CT("log_pb")
        public LogPbStruct logPb;
    }
}
