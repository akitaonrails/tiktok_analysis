package com.bytedance.android.livesdk.chatroom.api;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.chatroom.api.TimerDetail;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _TimerDetail_AuditInfo_ProtoDecoder implements C0IMD<TimerDetail.AuditInfo> {
    public static TimerDetail.AuditInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        TimerDetail.AuditInfo auditInfo = new TimerDetail.AuditInfo();
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
    public final TimerDetail.AuditInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(TimerDetail.AuditInfo auditInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, TimerDetail.AuditInfo auditInfo, List list) {
    }
}
