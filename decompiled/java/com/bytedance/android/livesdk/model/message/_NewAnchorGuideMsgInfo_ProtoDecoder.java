package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _NewAnchorGuideMsgInfo_ProtoDecoder implements C0IMD<NewAnchorGuideMsgInfo> {
    public static NewAnchorGuideMsgInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        NewAnchorGuideMsgInfo newAnchorGuideMsgInfo = new NewAnchorGuideMsgInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        newAnchorGuideMsgInfo.guideConfig = _NewAnchorGuideConfig_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    newAnchorGuideMsgInfo.messageKey = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return newAnchorGuideMsgInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(NewAnchorGuideMsgInfo newAnchorGuideMsgInfo) {
        NewAnchorGuideConfig newAnchorGuideConfig = newAnchorGuideMsgInfo.guideConfig;
        if (newAnchorGuideConfig != null) {
            _NewAnchorGuideConfig_ProtoDecoder.LJ(newAnchorGuideConfig);
        }
    }

    @Override // X.C0IMD
    public final NewAnchorGuideMsgInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, NewAnchorGuideMsgInfo newAnchorGuideMsgInfo, List list) {
    }
}
