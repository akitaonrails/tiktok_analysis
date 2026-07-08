package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.chatroom.interact.model.ReportRivalsImpressionsResponse;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ReportRivalsImpressionsResponse_ProtoDecoder implements C0IMD<ReportRivalsImpressionsResponse> {
    @Override // X.C0IMD
    public final void LIZ(ReportRivalsImpressionsResponse reportRivalsImpressionsResponse) {
    }

    @Override // X.C0IMD
    public final ReportRivalsImpressionsResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        ReportRivalsImpressionsResponse reportRivalsImpressionsResponse = new ReportRivalsImpressionsResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    ReportRivalsImpressionsResponse.ReportRivalsImpressionsExtra reportRivalsImpressionsExtra = new ReportRivalsImpressionsResponse.ReportRivalsImpressionsExtra();
                    long jLIZJ2 = c1516680pZS.LIZJ();
                    while (c1516680pZS.LJI() != -1) {
                        C1516700pZU.LJ(c1516680pZS);
                    }
                    c1516680pZS.LJ(jLIZJ2);
                    reportRivalsImpressionsResponse.extra = reportRivalsImpressionsExtra;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return reportRivalsImpressionsResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ReportRivalsImpressionsResponse reportRivalsImpressionsResponse, List list) {
    }
}
