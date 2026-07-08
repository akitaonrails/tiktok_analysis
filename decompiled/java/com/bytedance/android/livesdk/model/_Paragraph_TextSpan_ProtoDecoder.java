package com.bytedance.android.livesdk.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.Paragraph;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _Paragraph_TextSpan_ProtoDecoder implements C0IMD<Paragraph.TextSpan> {
    public static Paragraph.TextSpan LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        Paragraph.TextSpan textSpan = new Paragraph.TextSpan();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        textSpan.styleRef = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    textSpan.text = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return textSpan;
            }
        }
    }

    @Override // X.C0IMD
    public final Paragraph.TextSpan LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(Paragraph.TextSpan textSpan) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, Paragraph.TextSpan textSpan, List list) {
    }
}
