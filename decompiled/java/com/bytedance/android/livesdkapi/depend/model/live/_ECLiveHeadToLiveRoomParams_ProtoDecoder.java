package com.bytedance.android.livesdkapi.depend.model.live;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ECLiveHeadToLiveRoomParams_ProtoDecoder implements C0IMD<ECLiveHeadToLiveRoomParams> {
    public static ECLiveHeadToLiveRoomParams LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        ECLiveHeadToLiveRoomParams eCLiveHeadToLiveRoomParams = new ECLiveHeadToLiveRoomParams();
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
                                eCLiveHeadToLiveRoomParams.bagLogExtra = C1516700pZU.LIZLLL(c1516680pZS);
                            }
                        } else {
                            eCLiveHeadToLiveRoomParams.bagAutoRoute = c1516680pZS.LJIIJ();
                        }
                    } else {
                        eCLiveHeadToLiveRoomParams.autoRouteSchema = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    eCLiveHeadToLiveRoomParams.productBagPageParams = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return eCLiveHeadToLiveRoomParams;
            }
        }
    }

    @Override // X.C0IMD
    public final ECLiveHeadToLiveRoomParams LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(ECLiveHeadToLiveRoomParams eCLiveHeadToLiveRoomParams) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ECLiveHeadToLiveRoomParams eCLiveHeadToLiveRoomParams, List list) {
    }
}
