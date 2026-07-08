package com.bytedance.android.livesdk.game.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class GuessWidget {

    @C09CT("bet_stats")
    public List<BetStats> betStats = new ArrayList();

    @C09CT("edit_result_endtime")
    public long editResultEndtime;

    @C09CT("guess_round")
    public GuessRound guessRound;

    @C09CT("result_submit_times")
    public int resultSubmitTimes;

    @C09CT("total_bet_members")
    public long totalBetMembers;

    @C09CT("version_id")
    public long versionId;
}
