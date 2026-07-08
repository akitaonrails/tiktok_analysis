package webcast.api.game;

import X.C09CT;
import com.bytedance.android.livesdk.game.model.GuessRound;
import com.bytedance.android.livesdk.game.model.GuessWidget;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class GetGuessByAnchorIDResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("guess_round")
        public List<GuessRound> guessRound = new ArrayList();

        @C09CT("allow_edit_result_map")
        public Map<Long, Boolean> allowEditResultMap = new LinkedHashMap();

        @C09CT("allow_edit_result_endtime_map")
        public Map<Long, Long> allowEditResultEndtimeMap = new LinkedHashMap();

        @C09CT("guess_widget")
        public List<GuessWidget> guessWidget = new ArrayList();
    }
}
