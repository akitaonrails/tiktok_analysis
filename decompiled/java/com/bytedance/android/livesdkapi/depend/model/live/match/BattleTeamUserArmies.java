package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.battle.BattleUserArmies;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class BattleTeamUserArmies {

    @C09CT("host_rank")
    public long hostRank;

    @C09CT("host_visible_rank_from_team_id")
    public Map<Long, Long> hostVisibleRankFromTeamId;

    @C09CT("team_id")
    public Long teamId;

    @C09CT("team_total_enigma_score")
    public long teamTotalEnigmaScore;

    @C09CT("team_total_enigma_uv")
    public long teamTotalEnigmaUv;

    @C09CT("team_total_score")
    public long teamTotalScore;

    @C09CT("team_user")
    public List<BattleTeamUser> teamUsers;

    @C09CT("user_armies")
    public BattleUserArmies userArmies;

    public BattleTeamUserArmies() {
        this(null, 0L, null, null);
    }

    public BattleTeamUserArmies(Long l, long j, List<BattleTeamUser> list, BattleUserArmies battleUserArmies) {
        this.teamId = l;
        this.teamTotalScore = j;
        this.teamUsers = list;
        this.userArmies = battleUserArmies;
        this.hostVisibleRankFromTeamId = new LinkedHashMap();
    }
}
