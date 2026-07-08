package com.bytedance.android.livesdkapi.depend.model.live;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _EffectInfo_ProtoDecoder implements C0IMD<EffectInfo> {
    public static EffectInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        EffectInfo effectInfo = new EffectInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            effectInfo.userId = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        effectInfo.role = Long.valueOf(c1516680pZS.LJIIJJI());
                    }
                } else {
                    effectInfo.effectId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return effectInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final EffectInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(EffectInfo effectInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, EffectInfo effectInfo, List list) {
    }
}
