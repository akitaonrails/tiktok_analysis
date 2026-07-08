package com.bytedance.android.livesdk.gift.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CalmDownInfo_ProtoDecoder implements C0IMD<CalmDownInfo> {
    public static CalmDownInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CalmDownInfo calmDownInfo = new CalmDownInfo();
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
                                calmDownInfo.mShowPopup = (int) c1516680pZS.LJIIJJI();
                            }
                        } else {
                            calmDownInfo.mThresholdValue = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        calmDownInfo.mTotalTime = (int) c1516680pZS.LJIIJJI();
                    }
                } else {
                    calmDownInfo.mRemainTime = (int) c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return calmDownInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final CalmDownInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(CalmDownInfo calmDownInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CalmDownInfo calmDownInfo, List list) {
    }
}
