package com.bytedance.android.livesdk.model.message.battle;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes.dex */
public final class BattleResult {

    @C09CT("enigma_score")
    public long enigmaScore;

    @C09CT("enigma_uv")
    public long enigmaUv;

    @C09CT("result")
    public int result;

    @C09CT("score")
    public long score;

    @C09CT("user_id")
    public long userId;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BattleResult{userId=");
        sbLIZ.append(this.userId);
        sbLIZ.append(", result=");
        sbLIZ.append(this.result);
        sbLIZ.append(", score=");
        sbLIZ.append(this.score);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
