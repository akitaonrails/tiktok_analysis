package webcast.data.glip;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class LeaderboardDisplayConf {

    @C09CT("leaderboard_size")
    public long leaderboardSize;

    @C09CT("min_score_for_ranking")
    public long minScoreForRanking;

    @C09CT("score_metrics")
    public List<LeaderboardScoreMetricConf> scoreMetrics = new ArrayList();

    @C09CT("rank_reward_list")
    public List<LeaderboardDisplayRankRewardConf> rankRewardList = new ArrayList();
}
