package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class GameInfo implements Serializable {

    @C09CT("game_score")
    public int gameScore;

    @C09CT("game_type")
    public int gameType;

    public int getGameScore() {
        return this.gameScore;
    }

    public int getGameType() {
        return this.gameType;
    }

    public void setGameScore(int i) {
        this.gameScore = i;
    }

    public void setGameType(int i) {
        this.gameType = i;
    }
}
