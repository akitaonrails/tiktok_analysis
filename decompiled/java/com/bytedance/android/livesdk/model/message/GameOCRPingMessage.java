package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class GameOCRPingMessage extends AbstractC1136060ffY {

    @C09CT("confidence")
    public double confidence;

    @C09CT("game_fusion_label")
    public String gameFusionLabel;

    @C09CT("is_game")
    public boolean isGame;

    @C09CT("ping_timestamp")
    public long pingTimestamp;

    @C09CT("ping_value")
    public long pingValue;

    public GameOCRPingMessage() {
        this.type = C001A.GAME_O_C_R_PING_MESSAGE;
        this.gameFusionLabel = "";
    }
}
