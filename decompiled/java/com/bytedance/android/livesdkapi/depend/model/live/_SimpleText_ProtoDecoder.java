package com.bytedance.android.livesdkapi.depend.model.live;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _SimpleText_ProtoDecoder implements C0IMD<SimpleText> {
    public static SimpleText LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        SimpleText simpleText = new SimpleText();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        simpleText.highlightText = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    simpleText.text = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return simpleText;
            }
        }
    }

    @Override // X.C0IMD
    public final SimpleText LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(SimpleText simpleText) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, SimpleText simpleText, List list) {
    }
}
