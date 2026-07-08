package com.bytedance.android.livesdk.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.Gift;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _Gift_SchemeInfo_ProtoDecoder implements C0IMD<Gift.SchemeInfo> {
    public static Gift.SchemeInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        Gift.SchemeInfo schemeInfo = new Gift.SchemeInfo();
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
                                schemeInfo.schemeDescribeColor = C1516700pZU.LIZLLL(c1516680pZS);
                            }
                        } else {
                            schemeInfo.schemeDescribe = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        schemeInfo.schemeUrl = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    schemeInfo.schemeGiftType = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return schemeInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final Gift.SchemeInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(Gift.SchemeInfo schemeInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, Gift.SchemeInfo schemeInfo, List list) {
    }
}
