package com.bytedance.android.livesdk.chatroom.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _UserAttrSwitch_ProtoDecoder implements C0IMD<UserAttrSwitch> {
    public static UserAttrSwitch LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        UserAttrSwitch userAttrSwitch = new UserAttrSwitch();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        userAttrSwitch.status = c1516680pZS.LJIIJJI();
                    }
                } else {
                    userAttrSwitch.attrType = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return userAttrSwitch;
            }
        }
    }

    @Override // X.C0IMD
    public final UserAttrSwitch LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(UserAttrSwitch userAttrSwitch) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, UserAttrSwitch userAttrSwitch, List list) {
    }
}
