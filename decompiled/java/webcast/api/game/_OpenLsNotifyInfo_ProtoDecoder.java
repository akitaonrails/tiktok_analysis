package webcast.api.game;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _OpenLsNotifyInfo_ProtoDecoder implements C0IMD<OpenLsNotifyInfo> {
    public static OpenLsNotifyInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        OpenLsNotifyInfo openLsNotifyInfo = new OpenLsNotifyInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        openLsNotifyInfo.openLsNotifyWindow = C1516700pZU.LIZ(c1516680pZS);
                    }
                } else {
                    openLsNotifyInfo.fitLiveStudioRule = C1516700pZU.LIZ(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return openLsNotifyInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final OpenLsNotifyInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(OpenLsNotifyInfo openLsNotifyInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, OpenLsNotifyInfo openLsNotifyInfo, List list) {
    }
}
