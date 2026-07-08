package com.bytedance.android.livesdkapi.depend.model.live;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _PartnershipGameInfo_ProtoDecoder implements C0IMD<PartnershipGameInfo> {
    public static PartnershipGameInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PartnershipGameInfo partnershipGameInfo = new PartnershipGameInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                if (iLJI != 5) {
                                    C1516700pZU.LJ(c1516680pZS);
                                } else {
                                    partnershipGameInfo.taskId = C1516700pZU.LIZLLL(c1516680pZS);
                                }
                            } else {
                                partnershipGameInfo.gameId = C1516700pZU.LIZLLL(c1516680pZS);
                            }
                        } else {
                            partnershipGameInfo.showStatus = c1516680pZS.LJIIJ();
                        }
                    } else {
                        partnershipGameInfo.pinStatus = c1516680pZS.LJIIJ();
                    }
                } else {
                    partnershipGameInfo.taskType = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return partnershipGameInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final PartnershipGameInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(PartnershipGameInfo partnershipGameInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PartnershipGameInfo partnershipGameInfo, List list) {
    }
}
