package com.bytedance.android.livesdk.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _RichTextContent_ProtoDecoder implements C0IMD<RichTextContent> {
    public static RichTextContent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        RichTextContent richTextContent = new RichTextContent();
        richTextContent.styles = new ArrayList();
        richTextContent.paragraphs = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            richTextContent.itemStyleRef = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        richTextContent.paragraphs.add(_Paragraph_ProtoDecoder.LIZLLL(c1516680pZS));
                    }
                } else {
                    richTextContent.styles.add(_RichTextStyle_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return richTextContent;
            }
        }
    }

    public static void LJ(RichTextContent richTextContent) {
        List<RichTextStyle> list = richTextContent.styles;
        if (list == null) {
            richTextContent.styles = new ArrayList();
        } else if (!list.isEmpty()) {
            for (RichTextStyle richTextStyle : richTextContent.styles) {
                if (richTextStyle != null) {
                    _RichTextStyle_ProtoDecoder.LJ(richTextStyle);
                }
            }
        }
        List<Paragraph> list2 = richTextContent.paragraphs;
        if (list2 == null) {
            richTextContent.paragraphs = new ArrayList();
            return;
        }
        if (list2.isEmpty()) {
            return;
        }
        for (Paragraph paragraph : richTextContent.paragraphs) {
            if (paragraph != null) {
                _Paragraph_ProtoDecoder.LJ(paragraph);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(RichTextContent richTextContent) {
        LJ(richTextContent);
    }

    @Override // X.C0IMD
    public final RichTextContent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RichTextContent richTextContent, List list) {
    }
}
