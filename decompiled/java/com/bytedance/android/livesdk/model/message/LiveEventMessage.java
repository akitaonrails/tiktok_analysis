package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import X.C2188811AlT;
import com.bytedance.android.livesdk.model.LiveEventInfo;
import webcast.data.EventCard;

/* JADX INFO: loaded from: classes.dex */
public final class LiveEventMessage extends AbstractC1136060ffY {

    @C09CT("action_type")
    public int actionType;

    @C09CT("card")
    public EventCard card;

    public LiveEventMessage() {
        this.type = C001A.LIVE_EVENT_MESSAGE;
    }

    public final String toString() {
        LiveEventInfo liveEventInfo;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("event id: ");
        EventCard eventCard = this.card;
        sbLIZ.append((eventCard == null || (liveEventInfo = eventCard.event) == null) ? null : liveEventInfo.eventId);
        sbLIZ.append(",is pin:");
        sbLIZ.append(this.actionType == 1);
        sbLIZ.append(", isUnpin:");
        sbLIZ.append(this.actionType == 2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
