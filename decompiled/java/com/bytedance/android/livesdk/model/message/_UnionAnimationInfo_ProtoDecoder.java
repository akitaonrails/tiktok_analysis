package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _UnionAnimationInfo_ProtoDecoder implements C0IMD<UnionAnimationInfo> {
    public static UnionAnimationInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        UnionAnimationInfo unionAnimationInfo = new UnionAnimationInfo();
        unionAnimationInfo.rankTypeArray = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            unionAnimationInfo.supportedVersion = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        unionAnimationInfo.rankTypeArray.add(Integer.valueOf(c1516680pZS.LJIIJ()));
                    }
                } else {
                    unionAnimationInfo.unionType = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return unionAnimationInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(UnionAnimationInfo unionAnimationInfo) {
        UnionAnimationInfo unionAnimationInfo2 = unionAnimationInfo;
        if (unionAnimationInfo2.rankTypeArray == null) {
            unionAnimationInfo2.rankTypeArray = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final UnionAnimationInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, UnionAnimationInfo unionAnimationInfo, List list) {
    }
}
