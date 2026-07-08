package com.bytedance.android.livesdkapi.depend.model.live;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _EnlargeViewInfo_ProtoDecoder implements C0IMD<EnlargeViewInfo> {
    public static EnlargeViewInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        EnlargeViewInfo enlargeViewInfo = new EnlargeViewInfo();
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
                                    enlargeViewInfo.abResult = C1516700pZU.LIZ(c1516680pZS);
                                }
                            } else {
                                enlargeViewInfo.inEnlargeBlacklist = C1516700pZU.LIZ(c1516680pZS);
                            }
                        } else {
                            enlargeViewInfo.portraitView = c1516680pZS.LJIIJ();
                        }
                    } else {
                        enlargeViewInfo.landscapeView = c1516680pZS.LJIIJ();
                    }
                } else {
                    enlargeViewInfo.enablerEnlargeView = C1516700pZU.LIZ(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return enlargeViewInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final EnlargeViewInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(EnlargeViewInfo enlargeViewInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, EnlargeViewInfo enlargeViewInfo, List list) {
    }
}
