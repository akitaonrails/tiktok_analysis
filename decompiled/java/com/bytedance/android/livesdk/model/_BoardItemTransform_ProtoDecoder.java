package com.bytedance.android.livesdk.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BoardItemTransform_ProtoDecoder implements C0IMD<BoardItemTransform> {
    public static BoardItemTransform LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BoardItemTransform boardItemTransform = new BoardItemTransform();
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
                                boardItemTransform.anchorY = Float.intBitsToFloat(c1516680pZS.LJIIIIZZ());
                            }
                        } else {
                            boardItemTransform.anchorX = Float.intBitsToFloat(c1516680pZS.LJIIIIZZ());
                        }
                    } else {
                        boardItemTransform.rotation = Float.intBitsToFloat(c1516680pZS.LJIIIIZZ());
                    }
                } else {
                    boardItemTransform.scale = Float.intBitsToFloat(c1516680pZS.LJIIIIZZ());
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return boardItemTransform;
            }
        }
    }

    @Override // X.C0IMD
    public final BoardItemTransform LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(BoardItemTransform boardItemTransform) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BoardItemTransform boardItemTransform, List list) {
    }
}
