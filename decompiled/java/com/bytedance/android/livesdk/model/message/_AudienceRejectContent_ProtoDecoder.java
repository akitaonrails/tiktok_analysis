package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _AudienceRejectContent_ProtoDecoder implements C0IMD<AudienceRejectContent> {
    public static AudienceRejectContent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        AudienceRejectContent audienceRejectContent = new AudienceRejectContent();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    audienceRejectContent.fromUserId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return audienceRejectContent;
            }
        }
    }

    @Override // X.C0IMD
    public final AudienceRejectContent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(AudienceRejectContent audienceRejectContent) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AudienceRejectContent audienceRejectContent, List list) {
    }
}
