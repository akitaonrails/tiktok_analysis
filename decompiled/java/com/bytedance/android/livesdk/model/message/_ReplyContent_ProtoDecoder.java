package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ReplyContent_ProtoDecoder implements C0IMD<ReplyContent> {
    public static ReplyContent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        ReplyContent replyContent = new ReplyContent();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            replyContent.replyStatus = c1516680pZS.LJIIJ();
                        }
                    } else {
                        replyContent.replierRoomId = c1516680pZS.LJIIJJI();
                    }
                } else {
                    replyContent.replier = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return replyContent;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(ReplyContent replyContent) {
        User user = replyContent.replier;
        if (user != null) {
            _User_ProtoDecoder.LJ(user);
        }
    }

    @Override // X.C0IMD
    public final ReplyContent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ReplyContent replyContent, List list) {
    }
}
