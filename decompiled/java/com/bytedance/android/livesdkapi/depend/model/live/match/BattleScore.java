package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class BattleScore {

    @C09CT("score")
    public Integer score;

    @C09CT("user_id")
    public Long userId;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.score != null) {
            sb.append(", score=");
            sb.append(this.score);
        }
        if (this.userId != null) {
            sb.append(", user_id=");
            sb.append(this.userId);
        }
        sb.replace(0, 2, "BattleScore{");
        sb.append('}');
        return sb.toString();
    }
}
