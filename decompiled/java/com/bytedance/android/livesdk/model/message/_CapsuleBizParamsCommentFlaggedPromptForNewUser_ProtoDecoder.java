package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CapsuleBizParamsCommentFlaggedPromptForNewUser_ProtoDecoder implements C0IMD<CapsuleBizParamsCommentFlaggedPromptForNewUser> {
    public static CapsuleBizParamsCommentFlaggedPromptForNewUser LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CapsuleBizParamsCommentFlaggedPromptForNewUser capsuleBizParamsCommentFlaggedPromptForNewUser = new CapsuleBizParamsCommentFlaggedPromptForNewUser();
        capsuleBizParamsCommentFlaggedPromptForNewUser.commentIds = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        capsuleBizParamsCommentFlaggedPromptForNewUser.commentIds.add(Long.valueOf(c1516680pZS.LJIIJJI()));
                    }
                } else {
                    capsuleBizParamsCommentFlaggedPromptForNewUser.trigger = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return capsuleBizParamsCommentFlaggedPromptForNewUser;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(CapsuleBizParamsCommentFlaggedPromptForNewUser capsuleBizParamsCommentFlaggedPromptForNewUser) {
        CapsuleBizParamsCommentFlaggedPromptForNewUser capsuleBizParamsCommentFlaggedPromptForNewUser2 = capsuleBizParamsCommentFlaggedPromptForNewUser;
        if (capsuleBizParamsCommentFlaggedPromptForNewUser2.commentIds == null) {
            capsuleBizParamsCommentFlaggedPromptForNewUser2.commentIds = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final CapsuleBizParamsCommentFlaggedPromptForNewUser LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CapsuleBizParamsCommentFlaggedPromptForNewUser capsuleBizParamsCommentFlaggedPromptForNewUser, List list) {
    }
}
