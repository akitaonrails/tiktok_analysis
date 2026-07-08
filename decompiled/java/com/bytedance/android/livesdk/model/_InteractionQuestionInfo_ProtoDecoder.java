package com.bytedance.android.livesdk.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _InteractionQuestionInfo_ProtoDecoder implements C0IMD<InteractionQuestionInfo> {
    public static InteractionQuestionInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        InteractionQuestionInfo interactionQuestionInfo = new InteractionQuestionInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                C1516700pZU.LJ(c1516680pZS);
                            } else {
                                interactionQuestionInfo.hasLightingStrengthen = C1516700pZU.LIZ(c1516680pZS);
                            }
                        } else {
                            interactionQuestionInfo.qaEntryType = Integer.valueOf(c1516680pZS.LJIIJ());
                        }
                    } else {
                        interactionQuestionInfo.hasQuickAnswer = C1516700pZU.LIZ(c1516680pZS);
                    }
                } else {
                    interactionQuestionInfo.hasRecommend = C1516700pZU.LIZ(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return interactionQuestionInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final InteractionQuestionInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(InteractionQuestionInfo interactionQuestionInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, InteractionQuestionInfo interactionQuestionInfo, List list) {
    }
}
