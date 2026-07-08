package com.bytedance.android.livesdk.chatroom.model.multiguestv3;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ReplyBizContent_ProtoDecoder implements C0IMD<ReplyBizContent> {
    public static ReplyBizContent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        ReplyBizContent replyBizContent = new ReplyBizContent();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                C1516700pZU.LJ(c1516680pZS);
                            } else {
                                replyBizContent.isFullPositionPreApproved = C1516700pZU.LIZ(c1516680pZS);
                            }
                        } else {
                            replyBizContent.replyUserInfo = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        replyBizContent.isTurnOffInvitation = c1516680pZS.LJIIJ();
                    }
                } else {
                    replyBizContent.linkType = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return replyBizContent;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(ReplyBizContent replyBizContent) {
        User user = replyBizContent.replyUserInfo;
        if (user != null) {
            _User_ProtoDecoder.LJ(user);
        }
    }

    @Override // X.C0IMD
    public final ReplyBizContent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ReplyBizContent replyBizContent, List list) {
    }
}
