package com.bytedance.android.livesdk.chatroom.model.interact;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LinkmicDisplayText_ProtoDecoder implements C0IMD<LinkmicDisplayText> {
    public static LinkmicDisplayText LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LinkmicDisplayText linkmicDisplayText = new LinkmicDisplayText();
        linkmicDisplayText.pieces = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    switch (iLJI) {
                        case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                            linkmicDisplayText.key = C1516700pZU.LIZLLL(c1516680pZS);
                            break;
                        case 21:
                            linkmicDisplayText.defaultPattern = C1516700pZU.LIZLLL(c1516680pZS);
                            break;
                        case 22:
                            linkmicDisplayText.pieces.add(_LinkmicDisplayTextPieces_ProtoDecoder.LIZLLL(c1516680pZS));
                            break;
                        default:
                            C1516700pZU.LJ(c1516680pZS);
                            break;
                    }
                } else {
                    linkmicDisplayText.color = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return linkmicDisplayText;
            }
        }
    }

    public static void LJ(LinkmicDisplayText linkmicDisplayText) {
        List<LinkmicDisplayTextPieces> list = linkmicDisplayText.pieces;
        if (list == null) {
            linkmicDisplayText.pieces = new ArrayList();
        } else {
            if (list.isEmpty()) {
                return;
            }
            Iterator<LinkmicDisplayTextPieces> it2 = linkmicDisplayText.pieces.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(LinkmicDisplayText linkmicDisplayText) {
        LJ(linkmicDisplayText);
    }

    @Override // X.C0IMD
    public final LinkmicDisplayText LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LinkmicDisplayText linkmicDisplayText, List list) {
    }
}
