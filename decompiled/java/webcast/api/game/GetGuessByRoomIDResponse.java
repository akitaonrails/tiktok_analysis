package webcast.api.game;

import X.C09CT;
import com.bytedance.android.livesdk.game.model.GuessRoundWithBet;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class GetGuessByRoomIDResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("bet_limit_in_day")
        public long betLimitInDay;

        @C09CT("bet_num_today")
        public long betNumToday;

        @C09CT("guess_round")
        public List<GuessRoundWithBet> guessRound = new ArrayList();

        @C09CT("max_bet_points")
        public long maxBetPoints;

        @C09CT("max_bet_times")
        public long maxBetTimes;

        @C09CT("SplitRate")
        public float splitrate;
    }
}
