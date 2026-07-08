package com.bytedance.android.livesdk.chatroom.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _FragmentTypeCount_ProtoDecoder implements C0IMD<FragmentTypeCount> {
    public static FragmentTypeCount LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        FragmentTypeCount fragmentTypeCount = new FragmentTypeCount();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        fragmentTypeCount.count = c1516680pZS.LJIIJJI();
                    }
                } else {
                    fragmentTypeCount.fragmentType = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return fragmentTypeCount;
            }
        }
    }

    @Override // X.C0IMD
    public final FragmentTypeCount LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(FragmentTypeCount fragmentTypeCount) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, FragmentTypeCount fragmentTypeCount, List list) {
    }
}
