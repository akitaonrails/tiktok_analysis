package com.bytedance.android.livesdkapi.depend.model.live;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _SecondaryPageInfo_ProtoDecoder implements C0IMD<SecondaryPageInfo> {
    public static SecondaryPageInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        SecondaryPageInfo secondaryPageInfo = new SecondaryPageInfo();
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
                                secondaryPageInfo.introduction = C1516700pZU.LIZLLL(c1516680pZS);
                            }
                        } else {
                            secondaryPageInfo.link = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        secondaryPageInfo.logo = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    secondaryPageInfo.title = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return secondaryPageInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final SecondaryPageInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(SecondaryPageInfo secondaryPageInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, SecondaryPageInfo secondaryPageInfo, List list) {
    }
}
