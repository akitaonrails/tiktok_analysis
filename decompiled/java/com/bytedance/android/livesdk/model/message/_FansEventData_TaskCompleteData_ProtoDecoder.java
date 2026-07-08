package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.FansEventData;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _FansEventData_TaskCompleteData_ProtoDecoder implements C0IMD<FansEventData.TaskCompleteData> {
    public static FansEventData.TaskCompleteData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        FansEventData.TaskCompleteData taskCompleteData = new FansEventData.TaskCompleteData();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        taskCompleteData.isClearToday = C1516700pZU.LIZ(c1516680pZS);
                    }
                } else {
                    taskCompleteData.taskType = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return taskCompleteData;
            }
        }
    }

    @Override // X.C0IMD
    public final FansEventData.TaskCompleteData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(FansEventData.TaskCompleteData taskCompleteData) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, FansEventData.TaskCompleteData taskCompleteData, List list) {
    }
}
