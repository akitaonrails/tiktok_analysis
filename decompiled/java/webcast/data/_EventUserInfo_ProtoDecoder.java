package webcast.data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _EventUserInfo_ProtoDecoder implements C0IMD<EventUserInfo> {
    public static EventUserInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        EventUserInfo eventUserInfo = new EventUserInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        eventUserInfo.avatarUri = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    eventUserInfo.userId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return eventUserInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final EventUserInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(EventUserInfo eventUserInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, EventUserInfo eventUserInfo, List list) {
    }
}
