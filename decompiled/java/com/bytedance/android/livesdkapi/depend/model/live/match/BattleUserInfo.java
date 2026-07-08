package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class BattleUserInfo {

    @C09CT("tags")
    public List<BattleRivalTag> tags;

    @C09CT("user")
    public BattleBaseUserInfo user;

    public BattleUserInfo() {
        this(null, null, 3, null);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BattleUserInfo(user=");
        sbLIZ.append(this.user);
        sbLIZ.append(", tags=");
        sbLIZ.append(this.tags);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BattleUserInfo(BattleBaseUserInfo battleBaseUserInfo, List<BattleRivalTag> list) {
        this.user = battleBaseUserInfo;
        this.tags = list;
    }

    public BattleUserInfo(BattleBaseUserInfo battleBaseUserInfo, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : battleBaseUserInfo, (i & 2) != 0 ? C13BV.INSTANCE : list);
    }
}
