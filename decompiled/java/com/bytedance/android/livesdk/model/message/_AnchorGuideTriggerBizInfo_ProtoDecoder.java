package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _AnchorGuideTriggerBizInfo_ProtoDecoder implements C0IMD<AnchorGuideTriggerBizInfo> {
    public static AnchorGuideTriggerBizInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        AnchorGuideTriggerBizInfo anchorGuideTriggerBizInfo = new AnchorGuideTriggerBizInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        anchorGuideTriggerBizInfo.asrBizInfo = _ASRBizInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    anchorGuideTriggerBizInfo.bizName = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return anchorGuideTriggerBizInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(AnchorGuideTriggerBizInfo anchorGuideTriggerBizInfo) {
        ASRBizInfo aSRBizInfo = anchorGuideTriggerBizInfo.asrBizInfo;
        if (aSRBizInfo != null && aSRBizInfo.giftAsrConfidence == null) {
            aSRBizInfo.giftAsrConfidence = new HashMap();
        }
    }

    @Override // X.C0IMD
    public final AnchorGuideTriggerBizInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AnchorGuideTriggerBizInfo anchorGuideTriggerBizInfo, List list) {
    }
}
