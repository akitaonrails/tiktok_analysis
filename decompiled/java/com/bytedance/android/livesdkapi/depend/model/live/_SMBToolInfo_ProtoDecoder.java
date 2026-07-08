package com.bytedance.android.livesdkapi.depend.model.live;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _SMBToolInfo_ProtoDecoder implements C0IMD<SMBToolInfo> {
    public static SMBToolInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        SMBToolInfo sMBToolInfo = new SMBToolInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 2:
                        sMBToolInfo.showDmEntrance = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 3:
                        sMBToolInfo.showFormEntrance = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 4:
                        sMBToolInfo.showCourseEntrance = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 5:
                        sMBToolInfo.showSubEntrance = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 6:
                        sMBToolInfo.showBoardEntrance = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 7:
                        sMBToolInfo.showQueueEntrance = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 8:
                        sMBToolInfo.showCalendlyEntrance = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return sMBToolInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final SMBToolInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(SMBToolInfo sMBToolInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, SMBToolInfo sMBToolInfo, List list) {
    }
}
