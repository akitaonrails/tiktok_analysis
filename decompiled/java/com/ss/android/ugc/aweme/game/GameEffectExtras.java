package com.ss.android.ugc.aweme.game;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public final class GameEffectExtras implements Serializable {
    public static final int $stable = 0;

    @C09CT("cover_color")
    public final String coverColor;

    @C09CT("cover_img")
    public final String coverImg;

    @C09CT("is_challenge_game")
    public final boolean isChallengeGame;

    @C09CT("require_mic")
    public final boolean requireMic;

    public GameEffectExtras() {
        this("", false, null, false);
    }

    public final boolean isChallengeGame() {
        return this.isChallengeGame;
    }

    public GameEffectExtras(String str, boolean z, String str2, boolean z2) {
        this.coverImg = str;
        this.requireMic = z;
        this.coverColor = str2;
        this.isChallengeGame = z2;
    }
}
