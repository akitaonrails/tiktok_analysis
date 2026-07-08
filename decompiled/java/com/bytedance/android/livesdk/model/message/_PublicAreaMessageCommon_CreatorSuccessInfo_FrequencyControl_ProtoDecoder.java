package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _PublicAreaMessageCommon_CreatorSuccessInfo_FrequencyControl_ProtoDecoder implements C0IMD<PublicAreaMessageCommon.CreatorSuccessInfo.FrequencyControl> {
    public static PublicAreaMessageCommon.CreatorSuccessInfo.FrequencyControl LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PublicAreaMessageCommon.CreatorSuccessInfo.FrequencyControl frequencyControl = new PublicAreaMessageCommon.CreatorSuccessInfo.FrequencyControl();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            frequencyControl.limitInWindow = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        frequencyControl.windowSize = c1516680pZS.LJIIJJI();
                    }
                } else {
                    frequencyControl.frequencyControlKey = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return frequencyControl;
            }
        }
    }

    @Override // X.C0IMD
    public final PublicAreaMessageCommon.CreatorSuccessInfo.FrequencyControl LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(PublicAreaMessageCommon.CreatorSuccessInfo.FrequencyControl frequencyControl) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PublicAreaMessageCommon.CreatorSuccessInfo.FrequencyControl frequencyControl, List list) {
    }
}
