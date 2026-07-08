package webcast.data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _AnchorGrowLevelImMsg_ProtoDecoder implements C0IMD<AnchorGrowLevelImMsg> {
    public static AnchorGrowLevelImMsg LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        AnchorGrowLevelImMsg anchorGrowLevelImMsg = new AnchorGrowLevelImMsg();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        anchorGrowLevelImMsg.taskDoneData = _AnchorGrowLevelImMsgTaskDone_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    anchorGrowLevelImMsg.msgType = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return anchorGrowLevelImMsg;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(AnchorGrowLevelImMsg anchorGrowLevelImMsg) {
    }

    @Override // X.C0IMD
    public final AnchorGrowLevelImMsg LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AnchorGrowLevelImMsg anchorGrowLevelImMsg, List list) {
    }
}
