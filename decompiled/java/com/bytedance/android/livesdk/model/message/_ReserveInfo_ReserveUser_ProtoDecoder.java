package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.ReserveInfo;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ReserveInfo_ReserveUser_ProtoDecoder implements C0IMD<ReserveInfo.ReserveUser> {
    public static ReserveInfo.ReserveUser LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        ReserveInfo.ReserveUser reserveUser = new ReserveInfo.ReserveUser();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        reserveUser.roomId = c1516680pZS.LJIIJJI();
                    }
                } else {
                    reserveUser.user = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return reserveUser;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(ReserveInfo.ReserveUser reserveUser) {
        User user = reserveUser.user;
        if (user != null) {
            _User_ProtoDecoder.LJ(user);
        }
    }

    @Override // X.C0IMD
    public final ReserveInfo.ReserveUser LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ReserveInfo.ReserveUser reserveUser, List list) {
    }
}
