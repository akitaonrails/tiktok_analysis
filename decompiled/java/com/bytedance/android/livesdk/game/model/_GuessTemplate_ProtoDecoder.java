package com.bytedance.android.livesdk.game.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GuessTemplate_ProtoDecoder implements C0IMD<GuessTemplate> {
    public static GuessTemplate LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GuessTemplate guessTemplate = new GuessTemplate();
        guessTemplate.guessOptions = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        guessTemplate.templateIdStr = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        guessTemplate.title = _GuessText_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        guessTemplate.guessOptions.add(_GuessOptions_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 4:
                        guessTemplate.gameTypeName = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        guessTemplate.auditStatus = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        guessTemplate.auditDetail = c1516680pZS.LJIIJJI();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return guessTemplate;
            }
        }
    }

    public static void LJ(GuessTemplate guessTemplate) {
        GuessText guessText;
        GuessText guessText2 = guessTemplate.title;
        if (guessText2 != null) {
            _GuessText_ProtoDecoder.LJ(guessText2);
        }
        List<GuessOptions> list = guessTemplate.guessOptions;
        if (list == null) {
            guessTemplate.guessOptions = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (GuessOptions guessOptions : guessTemplate.guessOptions) {
            if (guessOptions != null && (guessText = guessOptions.text) != null) {
                _GuessText_ProtoDecoder.LJ(guessText);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GuessTemplate guessTemplate) {
        LJ(guessTemplate);
    }

    @Override // X.C0IMD
    public final GuessTemplate LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GuessTemplate guessTemplate, List list) {
    }
}
