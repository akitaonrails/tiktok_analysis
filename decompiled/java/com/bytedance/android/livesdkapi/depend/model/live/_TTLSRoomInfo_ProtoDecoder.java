package com.bytedance.android.livesdkapi.depend.model.live;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _TTLSRoomInfo_ProtoDecoder implements C0IMD<TTLSRoomInfo> {
    public static TTLSRoomInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        TTLSRoomInfo tTLSRoomInfo = new TTLSRoomInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            tTLSRoomInfo.pinProductId = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        tTLSRoomInfo.productCount = c1516680pZS.LJIIJ();
                    }
                } else {
                    tTLSRoomInfo.cartLink = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return tTLSRoomInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final TTLSRoomInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(TTLSRoomInfo tTLSRoomInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, TTLSRoomInfo tTLSRoomInfo, List list) {
    }
}
