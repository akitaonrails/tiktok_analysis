package com.bytedance.android.livesdk.gift.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _SecondaryEffectInfo_ProtoDecoder implements C0IMD<SecondaryEffectInfo> {
    public static SecondaryEffectInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        SecondaryEffectInfo secondaryEffectInfo = new SecondaryEffectInfo();
        secondaryEffectInfo.effectIds = new ArrayList();
        secondaryEffectInfo.builtinStrings = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            secondaryEffectInfo.minuteGameGameplayId = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        secondaryEffectInfo.builtinStrings.add(C1516700pZU.LIZLLL(c1516680pZS));
                    }
                } else {
                    secondaryEffectInfo.effectIds.add(Long.valueOf(c1516680pZS.LJIIJJI()));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return secondaryEffectInfo;
            }
        }
    }

    public static void LJ(SecondaryEffectInfo secondaryEffectInfo) {
        if (secondaryEffectInfo.effectIds == null) {
            secondaryEffectInfo.effectIds = new ArrayList();
        }
        if (secondaryEffectInfo.builtinStrings == null) {
            secondaryEffectInfo.builtinStrings = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final void LIZ(SecondaryEffectInfo secondaryEffectInfo) {
        LJ(secondaryEffectInfo);
    }

    @Override // X.C0IMD
    public final SecondaryEffectInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, SecondaryEffectInfo secondaryEffectInfo, List list) {
    }
}
