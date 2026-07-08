package webcast.api.game;

import X.C09CT;
import com.bytedance.android.livesdk.game.model.GuessRound;
import com.bytedance.android.livesdk.game.model.GuessWidget;

/* JADX INFO: loaded from: classes.dex */
public final class GetGuessInfosResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("edit_result_endtime")
        public long editResultEndtime;

        @C09CT("guess_round")
        public GuessRound guessRound;

        @C09CT("guess_widget")
        public GuessWidget guessWidget;

        @C09CT("result_submit_times")
        public int resultSubmitTimes;
    }
}
