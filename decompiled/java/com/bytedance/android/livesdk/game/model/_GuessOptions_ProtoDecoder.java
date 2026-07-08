package com.bytedance.android.livesdk.game.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GuessOptions_ProtoDecoder implements C0IMD<GuessOptions> {
    public static GuessOptions LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GuessOptions guessOptions = new GuessOptions();
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
                                guessOptions.optionIdStr = C1516700pZU.LIZLLL(c1516680pZS);
                            }
                        } else {
                            guessOptions.serialNum = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        guessOptions.guessOptionStats = _GuessOptionStats_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    guessOptions.text = _GuessText_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return guessOptions;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GuessOptions guessOptions) {
        GuessText guessText = guessOptions.text;
        if (guessText != null) {
            _GuessText_ProtoDecoder.LJ(guessText);
        }
    }

    @Override // X.C0IMD
    public final GuessOptions LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GuessOptions guessOptions, List list) {
    }
}
