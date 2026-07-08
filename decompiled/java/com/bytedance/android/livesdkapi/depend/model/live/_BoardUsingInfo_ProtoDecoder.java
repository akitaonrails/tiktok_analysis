package com.bytedance.android.livesdkapi.depend.model.live;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BoardUsingInfo_ProtoDecoder implements C0IMD<BoardUsingInfo> {
    public static BoardUsingInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BoardUsingInfo boardUsingInfo = new BoardUsingInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        boardUsingInfo.recommendSource = c1516680pZS.LJIIJ();
                    }
                } else {
                    boardUsingInfo.usingBoard = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return boardUsingInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final BoardUsingInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(BoardUsingInfo boardUsingInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BoardUsingInfo boardUsingInfo, List list) {
    }
}
