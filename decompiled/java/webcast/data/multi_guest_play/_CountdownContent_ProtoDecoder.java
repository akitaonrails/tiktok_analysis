package webcast.data.multi_guest_play;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CountdownContent_ProtoDecoder implements C0IMD<CountdownContent> {
    public static CountdownContent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CountdownContent countdownContent = new CountdownContent();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        countdownContent.roomId = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        countdownContent.channelId = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        countdownContent.countdownId = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        countdownContent.status = c1516680pZS.LJIIJ();
                        break;
                    case 5:
                        countdownContent.startTime = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        countdownContent.endTime = c1516680pZS.LJIIJJI();
                        break;
                    case 7:
                        countdownContent.countdownConfig = _CountdownConfig_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        countdownContent.countdownUser = _CountdownUser_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return countdownContent;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(CountdownContent countdownContent) {
    }

    @Override // X.C0IMD
    public final CountdownContent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CountdownContent countdownContent, List list) {
    }
}
