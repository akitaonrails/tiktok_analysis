package com.bytedance.android.livesdk.game.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class GuessRoundWithBet {

    @C09CT("anchor_info")
    public AnchorInfo anchorInfo;

    @C09CT("bet_stats")
    public BetStats betStats;

    @C09CT("bet_stats_list")
    public List<BetStats> betStatsList = new ArrayList();

    @C09CT("guess_round")
    public GuessRound guessRound;

    @C09CT("max_win_points")
    public long maxWinPoints;

    @C09CT("total_members_num")
    public long totalMembersNum;
}
