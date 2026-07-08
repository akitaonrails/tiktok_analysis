package com.bytedance.android.livesdkapi.depend.model.live;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _EnterNearByInfo_ProtoDecoder implements C0IMD<EnterNearByInfo> {
    public static EnterNearByInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        EnterNearByInfo enterNearByInfo = new EnterNearByInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        enterNearByInfo.showNearbyMsgTag = C1516700pZU.LIZ(c1516680pZS);
                    }
                } else {
                    enterNearByInfo.label = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return enterNearByInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final EnterNearByInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(EnterNearByInfo enterNearByInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, EnterNearByInfo enterNearByInfo, List list) {
    }
}
