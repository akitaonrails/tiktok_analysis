package com.bytedance.android.livesdk.game.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _PinCardView_ProtoDecoder implements C0IMD<PinCardView> {
    public static PinCardView LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PinCardView pinCardView = new PinCardView();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        pinCardView.duration = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        pinCardView.endTimestampStr = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        pinCardView.minDurationTime = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        pinCardView.versionCodeStr = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        pinCardView.guessTitle = _GuessText_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        pinCardView.roundIdStr = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        pinCardView.pinCardType = c1516680pZS.LJIIJ();
                        break;
                    case 8:
                        pinCardView.isAutoPin = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return pinCardView;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(PinCardView pinCardView) {
        GuessText guessText = pinCardView.guessTitle;
        if (guessText != null) {
            _GuessText_ProtoDecoder.LJ(guessText);
        }
    }

    @Override // X.C0IMD
    public final PinCardView LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PinCardView pinCardView, List list) {
    }
}
