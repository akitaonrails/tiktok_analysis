package webcast.api.partnership;

import X.C09CT;
import com.bytedance.android.livesdk.game.model.EsportsParticipant;
import com.bytedance.android.livesdk.game.model.EsportsParticipantMatchScoreHeader;
import com.bytedance.android.livesdk.game.model.EsportsTournamentBaseInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class EsportsScoreBoardResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("participant_list")
        public List<EsportsParticipant> participantList = new ArrayList();

        @C09CT("score_header")
        public List<EsportsParticipantMatchScoreHeader> scoreHeader = new ArrayList();

        @C09CT("tournament_info")
        public EsportsTournamentBaseInfo tournamentInfo;
    }
}
