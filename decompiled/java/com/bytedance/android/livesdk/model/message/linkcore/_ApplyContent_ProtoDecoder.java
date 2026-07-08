package com.bytedance.android.livesdk.model.message.linkcore;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ApplyContent_ProtoDecoder implements C0IMD<ApplyContent> {
    public static ApplyContent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        ApplyContent applyContent = new ApplyContent();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            applyContent.applierLinkerSessionId = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        applyContent.applicantLinkMicId = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    applyContent.applicant = _Player_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return applyContent;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(ApplyContent applyContent) {
    }

    @Override // X.C0IMD
    public final ApplyContent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ApplyContent applyContent, List list) {
    }
}
