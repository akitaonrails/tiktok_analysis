package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class BattleTeamResult {

    @C09CT("result")
    public int result;

    @C09CT("team_id")
    public Long teamId;

    @C09CT("team_user")
    public List<BattleTeamUser> teamUsers;

    @C09CT("total_enigma_score")
    public long totalEnigmaScore;

    @C09CT("total_enigma_uv")
    public long totalEnigmaUv;

    @C09CT("total_score")
    public long totalScore;

    public BattleTeamResult() {
        this(null, 0L, 0, null);
    }

    public BattleTeamResult(Long l, long j, int i, List<BattleTeamUser> list) {
        this.teamId = l;
        this.totalScore = j;
        this.result = i;
        this.teamUsers = list;
    }
}
