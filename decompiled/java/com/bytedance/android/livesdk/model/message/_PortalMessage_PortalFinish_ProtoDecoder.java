package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.PortalMessage;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _PortalMessage_PortalFinish_ProtoDecoder implements C0IMD<PortalMessage.PortalFinish> {
    public static PortalMessage.PortalFinish LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PortalMessage.PortalFinish portalFinish = new PortalMessage.PortalFinish();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    portalFinish.luckyPerson = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return portalFinish;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(PortalMessage.PortalFinish portalFinish) {
        User user = portalFinish.luckyPerson;
        if (user != null) {
            _User_ProtoDecoder.LJ(user);
        }
    }

    @Override // X.C0IMD
    public final PortalMessage.PortalFinish LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PortalMessage.PortalFinish portalFinish, List list) {
    }
}
