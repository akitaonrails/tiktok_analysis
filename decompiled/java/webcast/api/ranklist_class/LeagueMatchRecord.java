package webcast.api.ranklist_class;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.rank.model.LeagueMatchScoreDetail;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class LeagueMatchRecord {

    @C09CT("description")
    public Text description;

    @C09CT("league_match_teams")
    public List<LeagueMatchTeam> leagueMatchTeams = new ArrayList();

    @C09CT("match_end_timestamp_sec")
    public long matchEndTimestampSec;

    @C09CT("owner_match_result")
    public long ownerMatchResult;

    @C09CT("score")
    public long score;

    @C09CT("score_detail")
    public LeagueMatchScoreDetail scoreDetail;
}
