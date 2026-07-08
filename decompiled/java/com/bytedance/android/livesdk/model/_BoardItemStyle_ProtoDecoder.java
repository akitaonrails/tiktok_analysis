package com.bytedance.android.livesdk.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BoardItemStyle_ProtoDecoder implements C0IMD<BoardItemStyle> {
    public static BoardItemStyle LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BoardItemStyle boardItemStyle = new BoardItemStyle();
        boardItemStyle.fonts = new ArrayList();
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
                                boardItemStyle.colorTheme = C1516700pZU.LIZLLL(c1516680pZS);
                            }
                        } else {
                            boardItemStyle.fonts.add(C1516700pZU.LIZLLL(c1516680pZS));
                        }
                    } else {
                        boardItemStyle.alignment = c1516680pZS.LJIIJ();
                    }
                } else {
                    boardItemStyle.styleType = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return boardItemStyle;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(BoardItemStyle boardItemStyle) {
        BoardItemStyle boardItemStyle2 = boardItemStyle;
        if (boardItemStyle2.fonts == null) {
            boardItemStyle2.fonts = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final BoardItemStyle LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BoardItemStyle boardItemStyle, List list) {
    }
}
