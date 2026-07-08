package com.bytedance.android.livesdk.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BoardItemLayout_ProtoDecoder implements C0IMD<BoardItemLayout> {
    public static BoardItemLayout LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BoardItemLayout boardItemLayout = new BoardItemLayout();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        boardItemLayout.forceLayout = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 2:
                        boardItemLayout.layoutOrder = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        boardItemLayout.verticalAnchor = c1516680pZS.LJIIJ();
                        break;
                    case 4:
                        boardItemLayout.horizontalAnchor = c1516680pZS.LJIIJ();
                        break;
                    case 5:
                        boardItemLayout.offsetX = Float.intBitsToFloat(c1516680pZS.LJIIIIZZ());
                        break;
                    case 6:
                        boardItemLayout.offsetY = Float.intBitsToFloat(c1516680pZS.LJIIIIZZ());
                        break;
                    case 7:
                        boardItemLayout.defaultXSpacing = Float.intBitsToFloat(c1516680pZS.LJIIIIZZ());
                        break;
                    case 8:
                        boardItemLayout.defaultYSpacing = Float.intBitsToFloat(c1516680pZS.LJIIIIZZ());
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        boardItemLayout.collisionResolve = c1516680pZS.LJIIJ();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        boardItemLayout.isValid = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return boardItemLayout;
            }
        }
    }

    @Override // X.C0IMD
    public final BoardItemLayout LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(BoardItemLayout boardItemLayout) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BoardItemLayout boardItemLayout, List list) {
    }
}
