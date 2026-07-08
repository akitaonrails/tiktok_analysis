package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _Top2CardInfo_ProtoDecoder implements C0IMD<Top2CardInfo> {
    public static Top2CardInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        Top2CardInfo top2CardInfo = new Top2CardInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    top2CardInfo.common = _CommonCardInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return top2CardInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(Top2CardInfo top2CardInfo) {
        CommonCardInfo commonCardInfo = top2CardInfo.common;
        if (commonCardInfo != null) {
            _CommonCardInfo_ProtoDecoder.LJ(commonCardInfo);
        }
    }

    @Override // X.C0IMD
    public final Top2CardInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, Top2CardInfo top2CardInfo, List list) {
    }
}
