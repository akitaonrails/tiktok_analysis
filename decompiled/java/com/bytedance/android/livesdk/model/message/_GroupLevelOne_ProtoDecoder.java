package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GroupLevelOne_ProtoDecoder implements C0IMD<GroupLevelOne> {
    public static GroupLevelOne LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GroupLevelOne groupLevelOne = new GroupLevelOne();
        groupLevelOne.groupTwoList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            groupLevelOne.groupTwoList.add(_GroupLevelTwo_ProtoDecoder.LIZLLL(c1516680pZS));
                        }
                    } else {
                        groupLevelOne.type = c1516680pZS.LJIIJ();
                    }
                } else {
                    groupLevelOne.title = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return groupLevelOne;
            }
        }
    }

    public static void LJ(GroupLevelOne groupLevelOne) {
        List<GroupLevelTwo> list = groupLevelOne.groupTwoList;
        if (list == null) {
            groupLevelOne.groupTwoList = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (GroupLevelTwo groupLevelTwo : groupLevelOne.groupTwoList) {
            if (groupLevelTwo != null) {
                _GroupLevelTwo_ProtoDecoder.LJ(groupLevelTwo);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GroupLevelOne groupLevelOne) {
        LJ(groupLevelOne);
    }

    @Override // X.C0IMD
    public final GroupLevelOne LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GroupLevelOne groupLevelOne, List list) {
    }
}
