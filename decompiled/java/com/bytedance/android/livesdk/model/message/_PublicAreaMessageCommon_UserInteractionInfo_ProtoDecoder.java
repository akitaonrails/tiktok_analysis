package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _PublicAreaMessageCommon_UserInteractionInfo_ProtoDecoder implements C0IMD<PublicAreaMessageCommon.UserInteractionInfo> {
    public static PublicAreaMessageCommon.UserInteractionInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PublicAreaMessageCommon.UserInteractionInfo userInteractionInfo = new PublicAreaMessageCommon.UserInteractionInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            userInteractionInfo.shareCnt = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        userInteractionInfo.commentCnt = c1516680pZS.LJIIJJI();
                    }
                } else {
                    userInteractionInfo.likeCnt = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return userInteractionInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final PublicAreaMessageCommon.UserInteractionInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(PublicAreaMessageCommon.UserInteractionInfo userInteractionInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PublicAreaMessageCommon.UserInteractionInfo userInteractionInfo, List list) {
    }
}
