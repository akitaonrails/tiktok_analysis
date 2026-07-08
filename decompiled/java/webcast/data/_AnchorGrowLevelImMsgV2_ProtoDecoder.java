package webcast.data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _AnchorGrowLevelImMsgV2_ProtoDecoder implements C0IMD<AnchorGrowLevelImMsgV2> {
    public static AnchorGrowLevelImMsgV2 LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        AnchorGrowLevelImMsgV2 anchorGrowLevelImMsgV2 = new AnchorGrowLevelImMsgV2();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        anchorGrowLevelImMsgV2.notificationData = _AnchorGrowLevelImMsgNotification_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    anchorGrowLevelImMsgV2.msgType = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return anchorGrowLevelImMsgV2;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(AnchorGrowLevelImMsgV2 anchorGrowLevelImMsgV2) {
    }

    @Override // X.C0IMD
    public final AnchorGrowLevelImMsgV2 LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AnchorGrowLevelImMsgV2 anchorGrowLevelImMsgV2, List list) {
    }
}
