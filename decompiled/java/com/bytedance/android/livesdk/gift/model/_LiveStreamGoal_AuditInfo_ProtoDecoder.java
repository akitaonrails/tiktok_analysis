package com.bytedance.android.livesdk.gift.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.gift.model.LiveStreamGoal;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LiveStreamGoal_AuditInfo_ProtoDecoder implements C0IMD<LiveStreamGoal.AuditInfo> {
    public static LiveStreamGoal.AuditInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LiveStreamGoal.AuditInfo auditInfo = new LiveStreamGoal.AuditInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        auditInfo.taskType = c1516680pZS.LJIIJ();
                    }
                } else {
                    auditInfo.violationId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return auditInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final LiveStreamGoal.AuditInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(LiveStreamGoal.AuditInfo auditInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LiveStreamGoal.AuditInfo auditInfo, List list) {
    }
}
