package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _EnhancementTextInfo_ProtoDecoder implements C0IMD<EnhancementTextInfo> {
    public static EnhancementTextInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        EnhancementTextInfo enhancementTextInfo = new EnhancementTextInfo();
        enhancementTextInfo.enhancementTexts = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    enhancementTextInfo.enhancementTexts.add(_EnhancementText_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return enhancementTextInfo;
            }
        }
    }

    public static void LJ(EnhancementTextInfo enhancementTextInfo) {
        List<EnhancementText> list = enhancementTextInfo.enhancementTexts;
        if (list == null) {
            enhancementTextInfo.enhancementTexts = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (EnhancementText enhancementText : enhancementTextInfo.enhancementTexts) {
            if (enhancementText != null) {
                _EnhancementText_ProtoDecoder.LJ(enhancementText);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(EnhancementTextInfo enhancementTextInfo) {
        LJ(enhancementTextInfo);
    }

    @Override // X.C0IMD
    public final EnhancementTextInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, EnhancementTextInfo enhancementTextInfo, List list) {
    }
}
