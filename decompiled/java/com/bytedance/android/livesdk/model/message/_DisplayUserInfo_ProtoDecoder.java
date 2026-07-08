package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _DisplayUserInfo_ProtoDecoder implements C0IMD<DisplayUserInfo> {
    public static DisplayUserInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        DisplayUserInfo displayUserInfo = new DisplayUserInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    displayUserInfo.userData = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return displayUserInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(DisplayUserInfo displayUserInfo) {
        User user = displayUserInfo.userData;
        if (user != null) {
            _User_ProtoDecoder.LJ(user);
        }
    }

    @Override // X.C0IMD
    public final DisplayUserInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, DisplayUserInfo displayUserInfo, List list) {
    }
}
