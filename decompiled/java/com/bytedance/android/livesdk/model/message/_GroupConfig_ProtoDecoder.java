package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GroupConfig_ProtoDecoder implements C0IMD<GroupConfig> {
    public static GroupConfig LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GroupConfig groupConfig = new GroupConfig();
        groupConfig.groupOneList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    groupConfig.groupOneList.add(_GroupLevelOne_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return groupConfig;
            }
        }
    }

    public static void LJ(GroupConfig groupConfig) {
        List<GroupLevelOne> list = groupConfig.groupOneList;
        if (list == null) {
            groupConfig.groupOneList = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (GroupLevelOne groupLevelOne : groupConfig.groupOneList) {
            if (groupLevelOne != null) {
                _GroupLevelOne_ProtoDecoder.LJ(groupLevelOne);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GroupConfig groupConfig) {
        LJ(groupConfig);
    }

    @Override // X.C0IMD
    public final GroupConfig LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GroupConfig groupConfig, List list) {
    }
}
