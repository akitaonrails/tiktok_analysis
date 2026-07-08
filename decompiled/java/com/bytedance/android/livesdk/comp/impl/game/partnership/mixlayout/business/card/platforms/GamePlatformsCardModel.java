package com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.platforms;

import X.C09CT;
import com.bytedance.android.livesdk.game.model.GameStationGameInfo;

/* JADX INFO: loaded from: classes29.dex */
public final class GamePlatformsCardModel {

    @C09CT("game_info")
    public GameStationGameInfo gameInfo;

    public GamePlatformsCardModel() {
        this(null);
    }

    public GamePlatformsCardModel(GameStationGameInfo gameStationGameInfo) {
        this.gameInfo = gameStationGameInfo;
    }
}
