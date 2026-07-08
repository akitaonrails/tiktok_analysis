package com.bytedance.android.livesdk.model.message.battle;

import X.C09CT;
import X.C2188811AlT;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleUserInfo;

/* JADX INFO: loaded from: classes.dex */
public final class BattleUserInfoWrapper {

    @C09CT("key")
    public Long userId;

    @C09CT("value")
    public BattleUserInfo userInfo;

    public BattleUserInfoWrapper() {
        this(null, null);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BattleUserInfoWrapper(userId=");
        sbLIZ.append(this.userId);
        sbLIZ.append(", userInfo=");
        sbLIZ.append(this.userInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BattleUserInfoWrapper(Long l, BattleUserInfo battleUserInfo) {
        this.userId = l;
        this.userInfo = battleUserInfo;
    }
}
