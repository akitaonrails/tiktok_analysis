package com.bytedance.android.livesdk.chatroom.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _UserAttrSettings_ProtoDecoder implements C0IMD<UserAttrSettings> {
    public static UserAttrSettings LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        UserAttrSettings userAttrSettings = new UserAttrSettings();
        userAttrSettings.userAttr = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    userAttrSettings.userAttr.add(_UserAttrSwitch_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return userAttrSettings;
            }
        }
    }

    public static void LJ(UserAttrSettings userAttrSettings) {
        List<UserAttrSwitch> list = userAttrSettings.userAttr;
        if (list == null) {
            userAttrSettings.userAttr = new ArrayList();
        } else {
            if (list.isEmpty()) {
                return;
            }
            Iterator<UserAttrSwitch> it2 = userAttrSettings.userAttr.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(UserAttrSettings userAttrSettings) {
        LJ(userAttrSettings);
    }

    @Override // X.C0IMD
    public final UserAttrSettings LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, UserAttrSettings userAttrSettings, List list) {
    }
}
