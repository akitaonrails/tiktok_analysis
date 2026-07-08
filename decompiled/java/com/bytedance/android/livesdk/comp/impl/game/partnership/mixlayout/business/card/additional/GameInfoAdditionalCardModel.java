package com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.additional;

import X.C09CT;
import com.bytedance.android.livesdk.game.model.GameStationGameInfo;
import com.bytedance.android.livesdk.game.model.GameStationGameOfficialAccount;

/* JADX INFO: loaded from: classes29.dex */
public final class GameInfoAdditionalCardModel {

    @C09CT("game_info")
    public GameStationGameInfo gameInfo;

    @C09CT("official_account")
    public GameStationGameOfficialAccount officialAccount;

    public GameInfoAdditionalCardModel() {
        this(null, null);
    }

    public GameInfoAdditionalCardModel(GameStationGameOfficialAccount gameStationGameOfficialAccount, GameStationGameInfo gameStationGameInfo) {
        this.officialAccount = gameStationGameOfficialAccount;
        this.gameInfo = gameStationGameInfo;
    }
}
