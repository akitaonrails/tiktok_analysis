package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _AnimationData_ProtoDecoder implements C0IMD<AnimationData> {
    public static AnimationData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        AnimationData animationData = new AnimationData();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                if (iLJI != 5) {
                                    C1516700pZU.LJ(c1516680pZS);
                                } else {
                                    animationData.rightOffset = c1516680pZS.LJIIJJI();
                                }
                            } else {
                                animationData.width = c1516680pZS.LJIIJJI();
                            }
                        } else {
                            animationData.height = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        animationData.fileName = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    animationData.geckoChannelName = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return animationData;
            }
        }
    }

    @Override // X.C0IMD
    public final AnimationData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(AnimationData animationData) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AnimationData animationData, List list) {
    }
}
