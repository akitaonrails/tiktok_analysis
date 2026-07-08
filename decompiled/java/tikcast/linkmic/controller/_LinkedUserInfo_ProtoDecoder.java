package tikcast.linkmic.controller;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LinkedUserInfo_ProtoDecoder implements C0IMD<LinkedUserInfo> {
    public static LinkedUserInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LinkedUserInfo linkedUserInfo = new LinkedUserInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            linkedUserInfo.channelId = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        linkedUserInfo.userId = c1516680pZS.LJIIJJI();
                    }
                } else {
                    linkedUserInfo.layoutId = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return linkedUserInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final LinkedUserInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(LinkedUserInfo linkedUserInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LinkedUserInfo linkedUserInfo, List list) {
    }
}
