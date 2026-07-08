package com.bytedance.android.livesdk.guide.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.guide.model.GuideReportResponse;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GuideReportResponse_Data_ProtoDecoder implements C0IMD<GuideReportResponse.Data> {
    @Override // X.C0IMD
    public final GuideReportResponse.Data LIZJ(C1516680pZS c1516680pZS) throws IOException {
        GuideReportResponse.Data data = new GuideReportResponse.Data();
        long jLIZJ = c1516680pZS.LIZJ();
        while (c1516680pZS.LJI() != -1) {
            C1516700pZU.LJ(c1516680pZS);
        }
        c1516680pZS.LJ(jLIZJ);
        return data;
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(GuideReportResponse.Data data) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GuideReportResponse.Data data, List list) {
    }
}
