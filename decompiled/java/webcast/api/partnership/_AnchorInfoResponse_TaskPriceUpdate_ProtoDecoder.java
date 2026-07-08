package webcast.api.partnership;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;
import webcast.api.partnership.AnchorInfoResponse;

/* JADX INFO: loaded from: classes.dex */
public final class _AnchorInfoResponse_TaskPriceUpdate_ProtoDecoder implements C0IMD<AnchorInfoResponse.TaskPriceUpdate> {
    public static AnchorInfoResponse.TaskPriceUpdate LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        AnchorInfoResponse.TaskPriceUpdate taskPriceUpdate = new AnchorInfoResponse.TaskPriceUpdate();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        taskPriceUpdate.priceUpdateTimestamp = c1516680pZS.LJIIJJI();
                    }
                } else {
                    taskPriceUpdate.taskId = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return taskPriceUpdate;
            }
        }
    }

    @Override // X.C0IMD
    public final AnchorInfoResponse.TaskPriceUpdate LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(AnchorInfoResponse.TaskPriceUpdate taskPriceUpdate) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AnchorInfoResponse.TaskPriceUpdate taskPriceUpdate, List list) {
    }
}
