package com.bytedance.android.livesdk.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.Gift;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _Gift_LynxCrossScreenEffectInfo_ProtoDecoder implements C0IMD<Gift.LynxCrossScreenEffectInfo> {
    public static Gift.LynxCrossScreenEffectInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        Gift.LynxCrossScreenEffectInfo lynxCrossScreenEffectInfo = new Gift.LynxCrossScreenEffectInfo();
        lynxCrossScreenEffectInfo.effectIds = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 4) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    lynxCrossScreenEffectInfo.effectIds.add(Long.valueOf(c1516680pZS.LJIIJJI()));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return lynxCrossScreenEffectInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(Gift.LynxCrossScreenEffectInfo lynxCrossScreenEffectInfo) {
        Gift.LynxCrossScreenEffectInfo lynxCrossScreenEffectInfo2 = lynxCrossScreenEffectInfo;
        if (lynxCrossScreenEffectInfo2.effectIds == null) {
            lynxCrossScreenEffectInfo2.effectIds = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final Gift.LynxCrossScreenEffectInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, Gift.LynxCrossScreenEffectInfo lynxCrossScreenEffectInfo, List list) {
    }
}
