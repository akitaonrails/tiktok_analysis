package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes19.dex */
public final class LiveMatchEnigmaData {
    public static final TypeAdapter ADAPTER = new LiveMatchEnigmaData_OptTypeAdapter(NormalGson.singleton());

    @C09CT("is_allow_personal_score_animation")
    public boolean isAllowPersonalScoreAnimation;

    @C09CT("enabled_enigma_match")
    public boolean isEnigmaMatchEnabled;

    @C09CT("is_user_enigma")
    public boolean isUserEnigma;

    @C09CT("opponent_enigma_score")
    public int opponentEnigmaScore;

    @C09CT("self_enigma_score")
    public int selfEnigmaScore;

    public LiveMatchEnigmaData() {
        this(false, false, 0, 0, true);
    }

    public LiveMatchEnigmaData(boolean z, boolean z2, int i, int i2, boolean z3) {
        this.isEnigmaMatchEnabled = z;
        this.isUserEnigma = z2;
        this.opponentEnigmaScore = i;
        this.selfEnigmaScore = i2;
        this.isAllowPersonalScoreAnimation = z3;
    }
}
