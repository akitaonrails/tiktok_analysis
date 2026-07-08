package com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.common.model;

import X.C09CT;
import com.bytedance.android.livesdk.game.model.GameStationGameInfo;
import com.bytedance.android.livesdk.game.model.GameStationGameOfficialAccount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class GameInfoCardModel {

    @C09CT("game_info")
    public GameStationGameInfo gameInfo;

    @C09CT("official_account")
    public GameStationGameOfficialAccount officialAccount;

    public GameInfoCardModel() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GameInfoCardModel)) {
            return false;
        }
        GameInfoCardModel gameInfoCardModel = (GameInfoCardModel) obj;
        return Intrinsics.LJFF(this.gameInfo, gameInfoCardModel.gameInfo) && Intrinsics.LJFF(this.officialAccount, gameInfoCardModel.officialAccount);
    }

    public GameInfoCardModel(GameStationGameInfo gameStationGameInfo, GameStationGameOfficialAccount gameStationGameOfficialAccount) {
        this.gameInfo = gameStationGameInfo;
        this.officialAccount = gameStationGameOfficialAccount;
    }
}
