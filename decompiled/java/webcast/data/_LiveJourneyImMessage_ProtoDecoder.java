package webcast.data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LiveJourneyImMessage_ProtoDecoder implements C0IMD<LiveJourneyImMessage> {
    public static LiveJourneyImMessage LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LiveJourneyImMessage liveJourneyImMessage = new LiveJourneyImMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            liveJourneyImMessage.type = c1516680pZS.LJIIJ();
                        }
                    } else {
                        liveJourneyImMessage.level = c1516680pZS.LJIIJJI();
                    }
                } else {
                    liveJourneyImMessage.msg = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return liveJourneyImMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final LiveJourneyImMessage LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(LiveJourneyImMessage liveJourneyImMessage) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LiveJourneyImMessage liveJourneyImMessage, List list) {
    }
}
