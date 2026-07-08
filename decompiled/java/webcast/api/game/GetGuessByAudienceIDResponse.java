package webcast.api.game;

import X.C09CT;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class GetGuessByAudienceIDResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("guess_rounds")
        public Map<Long, GuessRoundListWithBet> guessRounds = new LinkedHashMap();

        @C09CT("points")
        public long points;
    }
}
