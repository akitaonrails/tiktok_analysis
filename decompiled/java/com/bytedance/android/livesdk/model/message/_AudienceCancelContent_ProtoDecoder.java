package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _AudienceCancelContent_ProtoDecoder implements C0IMD<AudienceCancelContent> {
    public static AudienceCancelContent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        AudienceCancelContent audienceCancelContent = new AudienceCancelContent();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        audienceCancelContent.user = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    audienceCancelContent.fromUserId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return audienceCancelContent;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(AudienceCancelContent audienceCancelContent) {
        User user = audienceCancelContent.user;
        if (user != null) {
            _User_ProtoDecoder.LJ(user);
        }
    }

    @Override // X.C0IMD
    public final AudienceCancelContent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AudienceCancelContent audienceCancelContent, List list) {
    }
}
