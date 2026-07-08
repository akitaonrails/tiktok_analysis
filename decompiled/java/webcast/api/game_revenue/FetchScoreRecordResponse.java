package webcast.api.game_revenue;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class FetchScoreRecordResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("records")
        public List<ScoreRecord> records = new ArrayList();

        @C09CT("total_score")
        public String totalScore = "";
    }
}
