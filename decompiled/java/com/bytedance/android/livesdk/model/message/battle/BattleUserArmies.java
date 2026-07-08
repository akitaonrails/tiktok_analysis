package com.bytedance.android.livesdk.model.message.battle;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class BattleUserArmies {

    @C09CT("anchor_id_str")
    public String anchorIdStr = "";

    @C09CT("host_enigma_score")
    public long hostEnigmaScore;

    @C09CT("host_enigma_uv")
    public long hostEnigmaUv;

    @C09CT("hostScore")
    public long hostScore;

    @C09CT("user_armies")
    public List<BattleUserArmy> userArmies;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BattleUserArmies{hostScore=");
        sbLIZ.append(this.hostScore);
        sbLIZ.append(", userArmies=");
        sbLIZ.append(this.userArmies);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
