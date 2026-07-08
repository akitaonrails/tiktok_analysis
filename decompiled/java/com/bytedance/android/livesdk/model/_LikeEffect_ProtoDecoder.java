package com.bytedance.android.livesdk.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LikeEffect_ProtoDecoder implements C0IMD<LikeEffect> {
    public static LikeEffect LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LikeEffect likeEffect = new LikeEffect();
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
                                likeEffect.level = c1516680pZS.LJIIJJI();
                            }
                        } else {
                            likeEffect.effectIntervalMs = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        likeEffect.effectCnt = c1516680pZS.LJIIJJI();
                    }
                } else {
                    likeEffect.version = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return likeEffect;
            }
        }
    }

    @Override // X.C0IMD
    public final LikeEffect LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(LikeEffect likeEffect) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LikeEffect likeEffect, List list) {
    }
}
