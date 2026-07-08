package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.chatroom.interact.model.ReportRivalsImpressionsResponse;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ReportRivalsImpressionsResponse_ReportRivalsImpressionsExtra_ProtoDecoder implements C0IMD<ReportRivalsImpressionsResponse.ReportRivalsImpressionsExtra> {
    @Override // X.C0IMD
    public final ReportRivalsImpressionsResponse.ReportRivalsImpressionsExtra LIZJ(C1516680pZS c1516680pZS) throws IOException {
        ReportRivalsImpressionsResponse.ReportRivalsImpressionsExtra reportRivalsImpressionsExtra = new ReportRivalsImpressionsResponse.ReportRivalsImpressionsExtra();
        long jLIZJ = c1516680pZS.LIZJ();
        while (c1516680pZS.LJI() != -1) {
            C1516700pZU.LJ(c1516680pZS);
        }
        c1516680pZS.LJ(jLIZJ);
        return reportRivalsImpressionsExtra;
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(ReportRivalsImpressionsResponse.ReportRivalsImpressionsExtra reportRivalsImpressionsExtra) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ReportRivalsImpressionsResponse.ReportRivalsImpressionsExtra reportRivalsImpressionsExtra, List list) {
    }
}
