package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _EventTracking_ProtoDecoder implements C0IMD<EventTracking> {
    public static EventTracking LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        EventTracking eventTracking = new EventTracking();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                C1516700pZU.LJ(c1516680pZS);
                            } else {
                                eventTracking.giftSubOrderCreateTime = c1516680pZS.LJIIJJI();
                            }
                        } else {
                            eventTracking.anchorId = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        eventTracking.giftSubReceiverId = c1516680pZS.LJIIJJI();
                    }
                } else {
                    eventTracking.giftSubSenderId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return eventTracking;
            }
        }
    }

    @Override // X.C0IMD
    public final EventTracking LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(EventTracking eventTracking) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, EventTracking eventTracking, List list) {
    }
}
