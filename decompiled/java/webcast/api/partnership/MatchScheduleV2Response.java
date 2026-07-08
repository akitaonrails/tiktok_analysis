package webcast.api.partnership;

import X.C09CT;
import com.bytedance.android.livesdk.game.model.EsportsMatchGroup;
import com.bytedance.android.livesdk.game.model.EsportsParticipant;
import com.bytedance.android.livesdk.game.model.EsportsTimeRange;
import com.bytedance.android.livesdk.game.model.EsportsTournamentBaseInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class MatchScheduleV2Response {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("match_group_type")
        public int matchGroupType;

        @C09CT("tournament_info")
        public EsportsTournamentBaseInfo tournamentInfo;

        @C09CT("match_groups")
        public List<EsportsMatchGroup> matchGroups = new ArrayList();

        @C09CT("all_match_time_ranges")
        public List<EsportsTimeRange> allMatchTimeRanges = new ArrayList();

        @C09CT("participant_infos")
        public List<EsportsParticipant> participantInfos = new ArrayList();
    }
}
