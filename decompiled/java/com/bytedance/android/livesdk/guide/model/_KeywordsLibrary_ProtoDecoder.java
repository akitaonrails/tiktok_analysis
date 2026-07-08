package com.bytedance.android.livesdk.guide.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _KeywordsLibrary_ProtoDecoder implements C0IMD<KeywordsLibrary> {
    public static KeywordsLibrary LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        KeywordsLibrary keywordsLibrary = new KeywordsLibrary();
        keywordsLibrary.giftKeywords = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            keywordsLibrary.hasSpace = C1516700pZU.LIZ(c1516680pZS);
                        }
                    } else {
                        keywordsLibrary.giftKeywords.add(_GiftKeywords_ProtoDecoder.LIZLLL(c1516680pZS));
                    }
                } else {
                    keywordsLibrary.locale = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return keywordsLibrary;
            }
        }
    }

    public static void LJ(KeywordsLibrary keywordsLibrary) {
        List<GiftKeywords> list = keywordsLibrary.giftKeywords;
        if (list == null) {
            keywordsLibrary.giftKeywords = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (GiftKeywords giftKeywords : keywordsLibrary.giftKeywords) {
            if (giftKeywords != null && giftKeywords.keywords == null) {
                giftKeywords.keywords = new ArrayList();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(KeywordsLibrary keywordsLibrary) {
        LJ(keywordsLibrary);
    }

    @Override // X.C0IMD
    public final KeywordsLibrary LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, KeywordsLibrary keywordsLibrary, List list) {
    }
}
