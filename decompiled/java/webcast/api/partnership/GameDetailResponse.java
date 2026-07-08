package webcast.api.partnership;

import X.C09CT;
import com.bytedance.android.livesdk.game.model.EsportsTournamentInfo;
import com.bytedance.android.livesdk.game.model.GameActivity;
import com.bytedance.android.livesdk.game.model.GameInfo;

/* JADX INFO: loaded from: classes29.dex */
public final class GameDetailResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("esports_tournament_info")
        public EsportsTournamentInfo esportsTournamentInfo;

        @C09CT("game_activity")
        public GameActivity gameActivity;

        @C09CT("game_info")
        public GameInfo gameInfo;
    }
}
