package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CapsuleBizParamsCommentMuteRulePrompt_ProtoDecoder implements C0IMD<CapsuleBizParamsCommentMuteRulePrompt> {
    public static CapsuleBizParamsCommentMuteRulePrompt LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CapsuleBizParamsCommentMuteRulePrompt capsuleBizParamsCommentMuteRulePrompt = new CapsuleBizParamsCommentMuteRulePrompt();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        capsuleBizParamsCommentMuteRulePrompt.userCnt = c1516680pZS.LJIIJJI();
                    }
                } else {
                    capsuleBizParamsCommentMuteRulePrompt.content = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return capsuleBizParamsCommentMuteRulePrompt;
            }
        }
    }

    @Override // X.C0IMD
    public final CapsuleBizParamsCommentMuteRulePrompt LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(CapsuleBizParamsCommentMuteRulePrompt capsuleBizParamsCommentMuteRulePrompt) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CapsuleBizParamsCommentMuteRulePrompt capsuleBizParamsCommentMuteRulePrompt, List list) {
    }
}
