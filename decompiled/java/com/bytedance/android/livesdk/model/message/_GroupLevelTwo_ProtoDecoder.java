package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GroupLevelTwo_ProtoDecoder implements C0IMD<GroupLevelTwo> {
    public static GroupLevelTwo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GroupLevelTwo groupLevelTwo = new GroupLevelTwo();
        groupLevelTwo.groupThreeList = new ArrayList();
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
                                    groupLevelTwo.groupThreeList.add(_GroupLevelThree_ProtoDecoder.LIZLLL(c1516680pZS));
                                }
                            } else {
                                groupLevelTwo.chosen = C1516700pZU.LIZ(c1516680pZS);
                            }
                        } else {
                            groupLevelTwo.type = c1516680pZS.LJIIJ();
                        }
                    } else {
                        groupLevelTwo.desc = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    groupLevelTwo.title = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return groupLevelTwo;
            }
        }
    }

    public static void LJ(GroupLevelTwo groupLevelTwo) {
        List<GroupLevelThree> list = groupLevelTwo.groupThreeList;
        if (list == null) {
            groupLevelTwo.groupThreeList = new ArrayList();
        } else {
            if (list.isEmpty()) {
                return;
            }
            Iterator<GroupLevelThree> it2 = groupLevelTwo.groupThreeList.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GroupLevelTwo groupLevelTwo) {
        LJ(groupLevelTwo);
    }

    @Override // X.C0IMD
    public final GroupLevelTwo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GroupLevelTwo groupLevelTwo, List list) {
    }
}
