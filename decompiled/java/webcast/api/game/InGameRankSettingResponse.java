package webcast.api.game;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class InGameRankSettingResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("authorized_games")
        public List<AuthorizedGame> authorizedGames = new ArrayList();

        @C09CT("in_game_rank_setting_status")
        public long inGameRankSettingStatus;
    }
}
