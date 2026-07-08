package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _Common_ProtoDecoder implements C0IMD<Common> {
    public static Common LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        Common common = new Common();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        common.method = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        common.msgId = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        common.logId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        common.createTime = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        common.fromIdc = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        common.monitor = c1516680pZS.LJIIJ();
                        break;
                    case 7:
                        common.isShowMsg = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 8:
                        common.priorityScore = c1516680pZS.LJIIJJI();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return common;
            }
        }
    }

    @Override // X.C0IMD
    public final Common LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(Common common) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, Common common, List list) {
    }
}
