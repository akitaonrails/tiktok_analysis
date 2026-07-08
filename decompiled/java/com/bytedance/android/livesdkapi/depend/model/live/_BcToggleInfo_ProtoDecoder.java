package com.bytedance.android.livesdkapi.depend.model.live;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BcToggleInfo_ProtoDecoder implements C0IMD<BcToggleInfo> {
    public static BcToggleInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BcToggleInfo bcToggleInfo = new BcToggleInfo();
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
                                bcToggleInfo.position = c1516680pZS.LJIIJ();
                            }
                        } else {
                            bcToggleInfo.showInterval = (int) c1516680pZS.LJIIJJI();
                        }
                    } else {
                        bcToggleInfo.toggleText = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    bcToggleInfo.status = (int) c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return bcToggleInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final BcToggleInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(BcToggleInfo bcToggleInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BcToggleInfo bcToggleInfo, List list) {
    }
}
