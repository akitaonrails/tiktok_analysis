package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GroupLevelThree_ProtoDecoder implements C0IMD<GroupLevelThree> {
    public static GroupLevelThree LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GroupLevelThree groupLevelThree = new GroupLevelThree();
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
                                groupLevelThree.chosen = C1516700pZU.LIZ(c1516680pZS);
                            }
                        } else {
                            groupLevelThree.type = c1516680pZS.LJIIJ();
                        }
                    } else {
                        groupLevelThree.desc = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    groupLevelThree.title = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return groupLevelThree;
            }
        }
    }

    @Override // X.C0IMD
    public final GroupLevelThree LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(GroupLevelThree groupLevelThree) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GroupLevelThree groupLevelThree, List list) {
    }
}
