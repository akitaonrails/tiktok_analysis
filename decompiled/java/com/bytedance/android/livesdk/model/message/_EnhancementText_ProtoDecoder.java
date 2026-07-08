package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _EnhancementText_ProtoDecoder implements C0IMD<EnhancementText> {
    public static EnhancementText LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        EnhancementText enhancementText = new EnhancementText();
        enhancementText.placeholderInfo = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        enhancementText.placeholderInfo.add(_PlaceholderInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                    }
                } else {
                    enhancementText.type = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return enhancementText;
            }
        }
    }

    public static void LJ(EnhancementText enhancementText) {
        List<PlaceholderInfo> list = enhancementText.placeholderInfo;
        if (list == null) {
            enhancementText.placeholderInfo = new ArrayList();
        } else {
            if (list.isEmpty()) {
                return;
            }
            Iterator<PlaceholderInfo> it2 = enhancementText.placeholderInfo.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(EnhancementText enhancementText) {
        LJ(enhancementText);
    }

    @Override // X.C0IMD
    public final EnhancementText LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, EnhancementText enhancementText, List list) {
    }
}
