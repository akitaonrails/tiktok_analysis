package com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.live;

import X.C09CT;
import com.bytedance.android.livesdk.game.model.GameDetailLiveInfo;
import com.bytedance.android.livesdk.game.model.GameStationGameInfo;

/* JADX INFO: loaded from: classes29.dex */
public final class GameLiveCardModel {

    @C09CT("game_info")
    public GameStationGameInfo gameInfo;

    @C09CT("live_info")
    public GameDetailLiveInfo liveInfo;

    public GameLiveCardModel() {
        this(null, null);
    }

    public GameLiveCardModel(GameStationGameInfo gameStationGameInfo, GameDetailLiveInfo gameDetailLiveInfo) {
        this.gameInfo = gameStationGameInfo;
        this.liveInfo = gameDetailLiveInfo;
    }
}
