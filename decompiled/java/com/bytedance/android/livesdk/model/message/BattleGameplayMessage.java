package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.livesdkapi.depend.model.live.match.IceShowdownInfo;

/* JADX INFO: loaded from: classes.dex */
public final class BattleGameplayMessage extends AbstractC1136060ffY {

    @C09CT("battle_id")
    public long battleId;

    @C09CT("gameplay_type")
    public int gameplayType;

    @C09CT("ice_showdown_info")
    public IceShowdownInfo iceShowdownInfo;

    @C09CT("update_type")
    public int updateType;

    public BattleGameplayMessage() {
        this.type = C001A.BATTLE_GAMEPLAY_MESSAGE;
    }
}
