package com.ss.android.ugc.aweme.interactive.task.game;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class GameEffectChallengeEntry implements Serializable {
    public static final int $stable = 0;

    @C09CT("rank")
    public final Integer rank;

    @C09CT("score")
    public final Double score;

    @C09CT("user_id")
    public final Long userId;

    public GameEffectChallengeEntry() {
        this(null, null, null);
    }

    public GameEffectChallengeEntry(Double d, Long l, Integer num) {
        this.score = d;
        this.userId = l;
        this.rank = num;
    }
}
