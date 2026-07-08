package com.bytedance.android.livesdk.game.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GuessText_ProtoDecoder implements C0IMD<GuessText> {
    public static GuessText LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GuessText guessText = new GuessText();
        guessText.starlingParams = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                if (iLJI != 5) {
                                    C1516700pZU.LJ(c1516680pZS);
                                } else {
                                    long jLIZJ2 = c1516680pZS.LIZJ();
                                    String strLIZLLL = null;
                                    String strLIZLLL2 = null;
                                    while (true) {
                                        int iLJI2 = c1516680pZS.LJI();
                                        if (iLJI2 == -1) {
                                            break;
                                        }
                                        if (iLJI2 != 1) {
                                            if (iLJI2 == 2) {
                                                strLIZLLL2 = C1516700pZU.LIZLLL(c1516680pZS);
                                            }
                                        } else {
                                            strLIZLLL = C1516700pZU.LIZLLL(c1516680pZS);
                                        }
                                    }
                                    c1516680pZS.LJ(jLIZJ2);
                                    if (strLIZLLL != null) {
                                        if (strLIZLLL2 != null) {
                                            guessText.starlingParams.put(strLIZLLL, strLIZLLL2);
                                        } else {
                                            throw new IllegalStateException("Map value must not be null!");
                                        }
                                    } else {
                                        throw new IllegalStateException("Map key must not be null!");
                                    }
                                }
                            } else {
                                guessText.displayText = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            guessText.type = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        guessText.desc = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    guessText.key = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return guessText;
            }
        }
    }

    public static void LJ(GuessText guessText) {
        Text text = guessText.displayText;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
        if (guessText.starlingParams == null) {
            guessText.starlingParams = new HashMap();
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GuessText guessText) {
        LJ(guessText);
    }

    @Override // X.C0IMD
    public final GuessText LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GuessText guessText, List list) {
    }
}
