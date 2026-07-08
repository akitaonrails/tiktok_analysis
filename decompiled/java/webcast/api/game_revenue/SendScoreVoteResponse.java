package webcast.api.game_revenue;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class SendScoreVoteResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("result")
        public int result;

        @C09CT("total_score")
        public String totalScore = "";
    }
}
