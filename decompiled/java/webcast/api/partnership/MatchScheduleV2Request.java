package webcast.api.partnership;

import X.C09CT;
import com.bytedance.scene.Scene;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class MatchScheduleV2Request {

    @C09CT("end_ts")
    public long endTs;

    @C09CT("enter_entrance")
    public int enterEntrance;

    @C09CT("min_match_days_limit")
    public int minMatchDaysLimit;

    @C09CT("need_match_time_group")
    public boolean needMatchTimeGroup;

    @C09CT("need_team")
    public boolean needTeam;

    @C09CT("need_tournament")
    public boolean needTournament;

    @C09CT("refresh_match_days")
    public int refreshMatchDays;

    @C09CT("refresh_min_match_limit")
    public int refreshMinMatchLimit;

    @C09CT("request_type")
    public int requestType;

    @C09CT(Scene.SCENE_SERVICE)
    public int scene;

    @C09CT("start_ts")
    public long startTs;

    @C09CT("utc_timeszone_offset_seconds")
    public long utcTimeszoneOffsetSeconds;

    @C09CT("game_id")
    public String gameId = "";

    @C09CT("room_id")
    public String roomId = "";

    @C09CT("item_id")
    public String itemId = "";

    @C09CT("author_id")
    public String authorId = "";

    @C09CT("team_ids")
    public List<String> teamIds = new ArrayList();

    @C09CT("tournament_id")
    public String tournamentId = "";
}
