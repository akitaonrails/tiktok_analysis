package webcast.data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.LiveEventInfo;
import com.bytedance.android.livesdk.model._LiveEventInfo_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _EventCard_ProtoDecoder implements C0IMD<EventCard> {
    public static EventCard LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        EventCard eventCard = new EventCard();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            eventCard.cardIconUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        eventCard.cardStartTime = c1516680pZS.LJIIJJI();
                    }
                } else {
                    eventCard.event = _LiveEventInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return eventCard;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(EventCard eventCard) {
        LiveEventInfo liveEventInfo = eventCard.event;
        if (liveEventInfo != null) {
            _LiveEventInfo_ProtoDecoder.LJ(liveEventInfo);
        }
    }

    @Override // X.C0IMD
    public final EventCard LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, EventCard eventCard, List list) {
    }
}
