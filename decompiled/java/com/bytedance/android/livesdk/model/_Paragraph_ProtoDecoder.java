package com.bytedance.android.livesdk.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.Paragraph;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _Paragraph_ProtoDecoder implements C0IMD<Paragraph> {
    public static Paragraph LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        Paragraph paragraph = new Paragraph();
        paragraph.spans = new ArrayList();
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
                                    paragraph.editable = C1516700pZU.LIZ(c1516680pZS);
                                }
                            } else {
                                paragraph.styleRef = C1516700pZU.LIZLLL(c1516680pZS);
                            }
                        } else {
                            paragraph.maxCharLimit = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        paragraph.spans.add(_Paragraph_TextSpan_ProtoDecoder.LIZLLL(c1516680pZS));
                    }
                } else {
                    paragraph.paragraphId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return paragraph;
            }
        }
    }

    public static void LJ(Paragraph paragraph) {
        List<Paragraph.TextSpan> list = paragraph.spans;
        if (list == null) {
            paragraph.spans = new ArrayList();
        } else {
            if (list.isEmpty()) {
                return;
            }
            Iterator<Paragraph.TextSpan> it2 = paragraph.spans.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(Paragraph paragraph) {
        LJ(paragraph);
    }

    @Override // X.C0IMD
    public final Paragraph LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, Paragraph paragraph, List list) {
    }
}
