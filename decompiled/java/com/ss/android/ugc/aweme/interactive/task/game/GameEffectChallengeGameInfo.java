package com.ss.android.ugc.aweme.interactive.task.game;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class GameEffectChallengeGameInfo implements Serializable {
    public static final int $stable = 8;

    @C09CT("game_id")
    public final String gameId;

    @C09CT("game_name")
    public final String gameName;

    @C09CT("game_thumbnail")
    public final List<String> gameThumbnail;

    @C09CT("order")
    public final Integer order;

    @C09CT("rank_type")
    public final Integer rankType;

    public GameEffectChallengeGameInfo() {
        this(null, null, null, null, null);
    }

    public GameEffectChallengeGameInfo(String str, String str2, List<String> list, Integer num, Integer num2) {
        this.gameId = str;
        this.gameName = str2;
        this.gameThumbnail = list;
        this.order = num;
        this.rankType = num2;
    }
}
