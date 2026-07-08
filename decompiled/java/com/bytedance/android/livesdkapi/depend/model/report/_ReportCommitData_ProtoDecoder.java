package com.bytedance.android.livesdkapi.depend.model.report;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ReportCommitData_ProtoDecoder implements C0IMD<ReportCommitData> {
    @Override // X.C0IMD
    public final ReportCommitData LIZJ(C1516680pZS c1516680pZS) throws IOException {
        ReportCommitData reportCommitData = new ReportCommitData();
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
                                reportCommitData.recordId = c1516680pZS.LJIIJJI();
                            }
                        } else {
                            reportCommitData.reportId = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        reportCommitData.desc = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    reportCommitData.status = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return reportCommitData;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(ReportCommitData reportCommitData) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ReportCommitData reportCommitData, List list) {
    }
}
