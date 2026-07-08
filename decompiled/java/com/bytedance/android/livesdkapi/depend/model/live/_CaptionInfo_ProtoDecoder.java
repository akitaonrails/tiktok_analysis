package com.bytedance.android.livesdkapi.depend.model.live;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CaptionInfo_ProtoDecoder implements C0IMD<CaptionInfo> {
    public static CaptionInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CaptionInfo captionInfo = new CaptionInfo();
        captionInfo.supportLang = new ArrayList();
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
                                    captionInfo.showType = c1516680pZS.LJIIJ();
                                }
                            } else {
                                captionInfo.location = c1516680pZS.LJIIJ();
                            }
                        } else {
                            captionInfo.supportLang.add(C1516700pZU.LIZLLL(c1516680pZS));
                        }
                    } else {
                        captionInfo.alignStream = C1516700pZU.LIZ(c1516680pZS);
                    }
                } else {
                    captionInfo.open = C1516700pZU.LIZ(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return captionInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(CaptionInfo captionInfo) {
        CaptionInfo captionInfo2 = captionInfo;
        if (captionInfo2.supportLang == null) {
            captionInfo2.supportLang = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final CaptionInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CaptionInfo captionInfo, List list) {
    }
}
