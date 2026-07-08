package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _Top3CardInfo_ProtoDecoder implements C0IMD<Top3CardInfo> {
    public static Top3CardInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        Top3CardInfo top3CardInfo = new Top3CardInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    top3CardInfo.common = _CommonCardInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return top3CardInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(Top3CardInfo top3CardInfo) {
        CommonCardInfo commonCardInfo = top3CardInfo.common;
        if (commonCardInfo != null) {
            _CommonCardInfo_ProtoDecoder.LJ(commonCardInfo);
        }
    }

    @Override // X.C0IMD
    public final Top3CardInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, Top3CardInfo top3CardInfo, List list) {
    }
}
