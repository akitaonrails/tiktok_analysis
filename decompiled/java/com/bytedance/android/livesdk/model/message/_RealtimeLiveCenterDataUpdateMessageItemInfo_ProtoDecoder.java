package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _RealtimeLiveCenterDataUpdateMessageItemInfo_ProtoDecoder implements C0IMD<RealtimeLiveCenterDataUpdateMessageItemInfo> {
    public static RealtimeLiveCenterDataUpdateMessageItemInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        RealtimeLiveCenterDataUpdateMessageItemInfo realtimeLiveCenterDataUpdateMessageItemInfo = new RealtimeLiveCenterDataUpdateMessageItemInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        realtimeLiveCenterDataUpdateMessageItemInfo.updateData = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    realtimeLiveCenterDataUpdateMessageItemInfo.layoutName = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return realtimeLiveCenterDataUpdateMessageItemInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final RealtimeLiveCenterDataUpdateMessageItemInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(RealtimeLiveCenterDataUpdateMessageItemInfo realtimeLiveCenterDataUpdateMessageItemInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RealtimeLiveCenterDataUpdateMessageItemInfo realtimeLiveCenterDataUpdateMessageItemInfo, List list) {
    }
}
