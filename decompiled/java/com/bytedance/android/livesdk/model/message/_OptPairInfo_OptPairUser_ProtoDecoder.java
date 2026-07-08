package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.OptPairInfo;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _OptPairInfo_OptPairUser_ProtoDecoder implements C0IMD<OptPairInfo.OptPairUser> {
    public static OptPairInfo.OptPairUser LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        OptPairInfo.OptPairUser optPairUser = new OptPairInfo.OptPairUser();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        optPairUser.roomId = c1516680pZS.LJIIJJI();
                    }
                } else {
                    optPairUser.user = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return optPairUser;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(OptPairInfo.OptPairUser optPairUser) {
        User user = optPairUser.user;
        if (user != null) {
            _User_ProtoDecoder.LJ(user);
        }
    }

    @Override // X.C0IMD
    public final OptPairInfo.OptPairUser LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, OptPairInfo.OptPairUser optPairUser, List list) {
    }
}
