package com.bytedance.android.livesdk.replay.proto;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _SpecialEffectConfig_ProtoDecoder implements C0IMD<SpecialEffectConfig> {
    public static SpecialEffectConfig LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        SpecialEffectConfig specialEffectConfig = new SpecialEffectConfig();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    specialEffectConfig.effectId = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return specialEffectConfig;
            }
        }
    }

    @Override // X.C0IMD
    public final SpecialEffectConfig LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(SpecialEffectConfig specialEffectConfig) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, SpecialEffectConfig specialEffectConfig, List list) {
    }
}
