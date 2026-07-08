package webcast.api.game;

import X.C09CT;
import com.bytedance.android.livesdk.game.model.GuessTemplate;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class GetGuessTemplateResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("default_bet_duration")
        public long defaultBetDuration;

        @C09CT("has_custom_question_permission")
        public boolean hasCustomQuestionPermission;

        @C09CT("last_guess_template")
        public GuessTemplate lastGuessTemplate;

        @C09CT("guess_template")
        public List<GuessTemplate> guessTemplate = new ArrayList();

        @C09CT("bet_duration_options")
        public List<Long> betDurationOptions = new ArrayList();

        @C09CT("game_type")
        public List<GuessGameType> gameType = new ArrayList();

        @C09CT("user_req_total_cnt_str")
        public String userReqTotalCntStr = "";
    }
}
