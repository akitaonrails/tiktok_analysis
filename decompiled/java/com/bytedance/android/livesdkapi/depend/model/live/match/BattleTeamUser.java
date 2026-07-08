package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class BattleTeamUser {

    @C09CT("enigma_score")
    public long enigmaScore;

    @C09CT("score")
    public Long score;

    @C09CT("user_id")
    public Long userId;

    @C09CT("user_id_str")
    public String userIdStr;

    public BattleTeamUser() {
        this(null, 0L);
    }

    public BattleTeamUser(Long l, Long l2) {
        this.userId = l;
        this.score = l2;
        this.userIdStr = "";
    }
}
