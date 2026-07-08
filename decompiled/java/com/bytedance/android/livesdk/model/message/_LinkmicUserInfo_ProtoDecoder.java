package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LinkmicUserInfo_ProtoDecoder implements C0IMD<LinkmicUserInfo> {
    public static LinkmicUserInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LinkmicUserInfo linkmicUserInfo = new LinkmicUserInfo();
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
                                linkmicUserInfo.linkedTime = c1516680pZS.LJIIJJI();
                            }
                        } else {
                            linkmicUserInfo.roomId = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        linkmicUserInfo.linkmicIdStr = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    linkmicUserInfo.userId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return linkmicUserInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final LinkmicUserInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(LinkmicUserInfo linkmicUserInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LinkmicUserInfo linkmicUserInfo, List list) {
    }
}
