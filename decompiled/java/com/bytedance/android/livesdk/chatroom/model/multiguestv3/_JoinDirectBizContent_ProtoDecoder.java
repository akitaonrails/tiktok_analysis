package com.bytedance.android.livesdk.chatroom.model.multiguestv3;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _JoinDirectBizContent_ProtoDecoder implements C0IMD<JoinDirectBizContent> {
    public static JoinDirectBizContent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        JoinDirectBizContent joinDirectBizContent = new JoinDirectBizContent();
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
                                joinDirectBizContent.mgSourceRole = c1516680pZS.LJIIJ();
                            }
                        } else {
                            joinDirectBizContent.isFullPositionPreApproved = C1516700pZU.LIZ(c1516680pZS);
                        }
                    } else {
                        joinDirectBizContent.outsideRoomInviteSource = c1516680pZS.LJIIJ();
                    }
                } else {
                    joinDirectBizContent.replyImMsgId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return joinDirectBizContent;
            }
        }
    }

    @Override // X.C0IMD
    public final JoinDirectBizContent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(JoinDirectBizContent joinDirectBizContent) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, JoinDirectBizContent joinDirectBizContent, List list) {
    }
}
