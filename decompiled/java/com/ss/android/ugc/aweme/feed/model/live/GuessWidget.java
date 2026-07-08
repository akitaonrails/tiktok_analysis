package com.ss.android.ugc.aweme.feed.model.live;

import X.C09CT;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class GuessWidget implements Serializable {

    @C09CT("bet_stats")
    public List<BetStats> betStats = new ArrayList();

    @C09CT("guess_round")
    public GuessRound guessRound;

    @C09CT("total_bet_members")
    public long totalBetMembers;

    @C09CT("version_id")
    public long versionId;
}
