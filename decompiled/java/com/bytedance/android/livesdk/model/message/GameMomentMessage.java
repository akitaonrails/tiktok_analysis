package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class GameMomentMessage extends AbstractC1136060ffY {

    @C09CT("event_time")
    public long eventTime;

    @C09CT("max_time")
    public long maxTime;

    @C09CT("message_type")
    public int messageType;

    @C09CT("moment_effects")
    public List<Integer> momentEffects;

    @C09CT("unique_id")
    public String uniqueId;

    public GameMomentMessage() {
        this.type = C001A.GAME_MOMENT_MESSAGE;
        this.uniqueId = "";
        this.momentEffects = new ArrayList();
    }
}
