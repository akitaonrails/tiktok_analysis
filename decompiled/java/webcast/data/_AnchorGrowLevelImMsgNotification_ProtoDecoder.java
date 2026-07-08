package webcast.data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _AnchorGrowLevelImMsgNotification_ProtoDecoder implements C0IMD<AnchorGrowLevelImMsgNotification> {
    public static AnchorGrowLevelImMsgNotification LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        AnchorGrowLevelImMsgNotification anchorGrowLevelImMsgNotification = new AnchorGrowLevelImMsgNotification();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        anchorGrowLevelImMsgNotification.level = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        anchorGrowLevelImMsgNotification.isFinalLevel = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 3:
                        anchorGrowLevelImMsgNotification.isCompleteLevel = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 4:
                        anchorGrowLevelImMsgNotification.taskId = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        anchorGrowLevelImMsgNotification.content = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        anchorGrowLevelImMsgNotification.starlingKey = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return anchorGrowLevelImMsgNotification;
            }
        }
    }

    @Override // X.C0IMD
    public final AnchorGrowLevelImMsgNotification LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(AnchorGrowLevelImMsgNotification anchorGrowLevelImMsgNotification) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AnchorGrowLevelImMsgNotification anchorGrowLevelImMsgNotification, List list) {
    }
}
