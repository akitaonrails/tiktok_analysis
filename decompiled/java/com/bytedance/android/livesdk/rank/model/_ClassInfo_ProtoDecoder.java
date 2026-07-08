package com.bytedance.android.livesdk.rank.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ClassInfo_ProtoDecoder implements C0IMD<ClassInfo> {
    public static ClassInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        ClassInfo classInfo = new ClassInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        classInfo.starCount = c1516680pZS.LJIIJJI();
                    }
                } else {
                    classInfo.classType = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return classInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final ClassInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(ClassInfo classInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ClassInfo classInfo, List list) {
    }
}
