package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _NewAnchorEffectParams_ProtoDecoder implements C0IMD<NewAnchorEffectParams> {
    public static NewAnchorEffectParams LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        NewAnchorEffectParams newAnchorEffectParams = new NewAnchorEffectParams();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                C1516700pZU.LJ(c1516680pZS);
                            } else {
                                newAnchorEffectParams.tabKey = C1516700pZU.LIZLLL(c1516680pZS);
                            }
                        } else {
                            newAnchorEffectParams.categoryId = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        newAnchorEffectParams.resourceId = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    newAnchorEffectParams.effectPanel = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return newAnchorEffectParams;
            }
        }
    }

    @Override // X.C0IMD
    public final NewAnchorEffectParams LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(NewAnchorEffectParams newAnchorEffectParams) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, NewAnchorEffectParams newAnchorEffectParams, List list) {
    }
}
