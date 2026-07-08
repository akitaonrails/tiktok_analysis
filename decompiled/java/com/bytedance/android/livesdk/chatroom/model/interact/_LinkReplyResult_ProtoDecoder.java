package com.bytedance.android.livesdk.chatroom.model.interact;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LinkReplyResult_ProtoDecoder implements C0IMD<LinkReplyResult> {
    @Override // X.C0IMD
    public final LinkReplyResult LIZJ(C1516680pZS c1516680pZS) throws IOException {
        LinkReplyResult linkReplyResult = new LinkReplyResult();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 3) {
                    if (iLJI != 4) {
                        if (iLJI != 5) {
                            if (iLJI != 15) {
                                if (iLJI != 17) {
                                    C1516700pZU.LJ(c1516680pZS);
                                } else {
                                    linkReplyResult.rivalLinkmicIdStr = C1516700pZU.LIZLLL(c1516680pZS);
                                }
                            } else {
                                linkReplyResult.linkMicIdStr = C1516700pZU.LIZLLL(c1516680pZS);
                            }
                        } else {
                            linkReplyResult.rtcExtInfo = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        linkReplyResult.confluenceType = c1516680pZS.LJIIJ();
                    }
                } else {
                    linkReplyResult.canJoinChannelDirectly = C1516700pZU.LIZ(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return linkReplyResult;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(LinkReplyResult linkReplyResult) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LinkReplyResult linkReplyResult, List list) {
    }
}
