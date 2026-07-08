package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class BattleGameConfig {

    @C09CT("extra")
    public String extra;

    @C09CT("game_id")
    public Long gameId;

    @C09CT("prop_id")
    public Long propId;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.gameId != null) {
            sb.append(", game_id=");
            sb.append(this.gameId);
        }
        if (this.propId != null) {
            sb.append(", prop_id=");
            sb.append(this.propId);
        }
        if (this.extra != null) {
            sb.append(", extra=");
            sb.append(this.extra);
        }
        sb.replace(0, 2, "BattleGameConfig{");
        sb.append('}');
        return sb.toString();
    }
}
