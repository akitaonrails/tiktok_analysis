package webcast.data;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class TeamRankBonusInfo {

    @C09CT("bonus_end_ts")
    public long bonusEndTs;

    @C09CT("bonus_feature_enabled")
    public boolean bonusFeatureEnabled;

    @C09CT("bonus_gift_team_score")
    public long bonusGiftTeamScore;

    @C09CT("bonus_start_ts")
    public long bonusStartTs;

    @C09CT("team_rank_rules")
    public List<TeamRankRule> teamRankRules = new ArrayList();

    @C09CT("gifts")
    public List<FansGiftInfo> gifts = new ArrayList();
}
