package webcast.data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;
import webcast.data.RealtimeLiveCenterLopInfo;

/* JADX INFO: loaded from: classes.dex */
public final class _RealtimeLiveCenterLopInfo_Task_ProtoDecoder implements C0IMD<RealtimeLiveCenterLopInfo.Task> {
    public static RealtimeLiveCenterLopInfo.Task LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        RealtimeLiveCenterLopInfo.Task task = new RealtimeLiveCenterLopInfo.Task();
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
                                task.targetNum = c1516680pZS.LJIIJJI();
                            }
                        } else {
                            task.currentNum = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        task.title = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    task.key = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return task;
            }
        }
    }

    @Override // X.C0IMD
    public final RealtimeLiveCenterLopInfo.Task LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(RealtimeLiveCenterLopInfo.Task task) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RealtimeLiveCenterLopInfo.Task task, List list) {
    }
}
