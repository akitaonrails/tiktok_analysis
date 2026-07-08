package webcast.api.game_revenue;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class SendScoreVoteRequest {

    @C09CT("data")
    public RequestData data;

    public static final class RequestData {

        @C09CT("anchor_id")
        public String anchorId = "";

        @C09CT("room_id")
        public String roomId = "";

        @C09CT("score")
        public String score = "";

        @C09CT("transaction_id")
        public String transactionId = "";

        @C09CT("type")
        public int type;
    }
}
