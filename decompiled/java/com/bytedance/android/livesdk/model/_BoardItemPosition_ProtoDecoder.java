package com.bytedance.android.livesdk.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BoardItemPosition_ProtoDecoder implements C0IMD<BoardItemPosition> {
    public static BoardItemPosition LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BoardItemPosition boardItemPosition = new BoardItemPosition();
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
                                boardItemPosition.percentageY = c1516680pZS.LJIIJJI();
                            }
                        } else {
                            boardItemPosition.percentageX = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        boardItemPosition.y = c1516680pZS.LJIIJJI();
                    }
                } else {
                    boardItemPosition.x = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return boardItemPosition;
            }
        }
    }

    @Override // X.C0IMD
    public final BoardItemPosition LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(BoardItemPosition boardItemPosition) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BoardItemPosition boardItemPosition, List list) {
    }
}
