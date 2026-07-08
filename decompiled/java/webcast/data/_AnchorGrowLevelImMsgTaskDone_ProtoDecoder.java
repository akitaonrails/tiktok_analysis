package webcast.data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _AnchorGrowLevelImMsgTaskDone_ProtoDecoder implements C0IMD<AnchorGrowLevelImMsgTaskDone> {
    public static AnchorGrowLevelImMsgTaskDone LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        AnchorGrowLevelImMsgTaskDone anchorGrowLevelImMsgTaskDone = new AnchorGrowLevelImMsgTaskDone();
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
                                anchorGrowLevelImMsgTaskDone.taskid = c1516680pZS.LJIIJJI();
                            }
                        } else {
                            anchorGrowLevelImMsgTaskDone.iscompletelevel = C1516700pZU.LIZ(c1516680pZS);
                        }
                    } else {
                        anchorGrowLevelImMsgTaskDone.isfinallevel = C1516700pZU.LIZ(c1516680pZS);
                    }
                } else {
                    anchorGrowLevelImMsgTaskDone.level = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return anchorGrowLevelImMsgTaskDone;
            }
        }
    }

    @Override // X.C0IMD
    public final AnchorGrowLevelImMsgTaskDone LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(AnchorGrowLevelImMsgTaskDone anchorGrowLevelImMsgTaskDone) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AnchorGrowLevelImMsgTaskDone anchorGrowLevelImMsgTaskDone, List list) {
    }
}
