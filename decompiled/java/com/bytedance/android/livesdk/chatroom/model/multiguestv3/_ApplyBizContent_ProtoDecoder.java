package com.bytedance.android.livesdk.chatroom.model.multiguestv3;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ApplyBizContent_ProtoDecoder implements C0IMD<ApplyBizContent> {
    public static ApplyBizContent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        ApplyBizContent applyBizContent = new ApplyBizContent();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    applyBizContent.user = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return applyBizContent;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(ApplyBizContent applyBizContent) {
        User user = applyBizContent.user;
        if (user != null) {
            _User_ProtoDecoder.LJ(user);
        }
    }

    @Override // X.C0IMD
    public final ApplyBizContent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ApplyBizContent applyBizContent, List list) {
    }
}
