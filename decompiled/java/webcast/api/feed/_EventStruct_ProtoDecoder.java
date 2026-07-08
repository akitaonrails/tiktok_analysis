package webcast.api.feed;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _EventStruct_ProtoDecoder implements C0IMD<EventStruct> {
    public static EventStruct LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        EventStruct eventStruct = new EventStruct();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        eventStruct.id = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        eventStruct.startTime = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        eventStruct.duration = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        eventStruct.title = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        eventStruct.desc = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        eventStruct.status = c1516680pZS.LJIIJ();
                        break;
                    case 7:
                        eventStruct.owner = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        eventStruct.subscriberCount = c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        eventStruct.type = c1516680pZS.LJIIJ();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        eventStruct.enableUpdate = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        eventStruct.hasSubscribed = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        eventStruct.style = c1516680pZS.LJIIJ();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return eventStruct;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(EventStruct eventStruct) {
        User user = eventStruct.owner;
        if (user != null) {
            _User_ProtoDecoder.LJ(user);
        }
    }

    @Override // X.C0IMD
    public final EventStruct LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, EventStruct eventStruct, List list) {
    }
}
