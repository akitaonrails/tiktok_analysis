package com.bytedance.android.livesdk.model.message.battle;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class UserArmiesWrapper {

    @C09CT("value")
    public BattleUserArmies userArmies;

    @C09CT("key")
    public Long userId;

    public UserArmiesWrapper() {
        this(null, null);
    }

    public UserArmiesWrapper(Long l, BattleUserArmies battleUserArmies) {
        this.userId = l;
        this.userArmies = battleUserArmies;
    }
}
