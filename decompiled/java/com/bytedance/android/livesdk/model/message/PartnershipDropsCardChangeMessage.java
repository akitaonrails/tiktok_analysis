package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class PartnershipDropsCardChangeMessage extends AbstractC1136060ffY {

    @C09CT("card_show_duration")
    public long cardShowDuration;

    @C09CT("change_mode")
    public int changeMode;

    @C09CT("drops_id")
    public String dropsId;

    @C09CT("game_id")
    public String gameId;

    @C09CT("game_name")
    public String gameName;

    public PartnershipDropsCardChangeMessage() {
        this.type = C001A.PARTNERSHIP_DROPS_CARD_CHANGE_MESSAGE;
        this.dropsId = "";
        this.gameId = "";
        this.gameName = "";
    }
}
