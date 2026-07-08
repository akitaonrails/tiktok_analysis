package webcast.api.game;

import X.C09CT;
import com.bytedance.android.livesdk.game.model.GuessDraft;
import com.bytedance.android.livesdk.game.model.GuessWidgetWithPinCard;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class GetGuessManageWidgetsResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("default_bet_duration")
        public long defaultBetDuration;

        @C09CT("has_custom_question_permission")
        public boolean hasCustomQuestionPermission;

        @C09CT("guess_widget_with_pin_card")
        public List<GuessWidgetWithPinCard> guessWidgetWithPinCard = new ArrayList();

        @C09CT("guess_draft")
        public List<GuessDraft> guessDraft = new ArrayList();

        @C09CT("user_req_total_cnt_str")
        public String userReqTotalCntStr = "";
    }
}
