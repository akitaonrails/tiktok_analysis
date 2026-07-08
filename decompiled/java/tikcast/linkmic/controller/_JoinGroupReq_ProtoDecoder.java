package tikcast.linkmic.controller;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.linkcore.LinkCommon;
import com.bytedance.android.livesdk.model.message.linkcore._LinkCommon_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tikcast.linkmic.common.ContentPositionMessage;
import tikcast.linkmic.common._ContentPositionMessage_ProtoDecoder;
import tikcast.linkmic.common._GroupPlayer_ProtoDecoder;
import webcast.data.cohost_biz._BizJoinGroupParams_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _JoinGroupReq_ProtoDecoder implements C0IMD<JoinGroupReq> {
    @Override // X.C0IMD
    public final void LIZ(JoinGroupReq joinGroupReq) {
        JoinGroupReq joinGroupReq2 = joinGroupReq;
        LinkCommon linkCommon = joinGroupReq2.common;
        if (linkCommon != null) {
            _LinkCommon_ProtoDecoder.LJ(linkCommon);
        }
        List<ContentPositionMessage> list = joinGroupReq2.contentPositionMessage;
        if (list == null) {
            joinGroupReq2.contentPositionMessage = new ArrayList();
        } else {
            if (list.isEmpty()) {
                return;
            }
            Iterator<ContentPositionMessage> it2 = joinGroupReq2.contentPositionMessage.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final JoinGroupReq LIZJ(C1516680pZS c1516680pZS) throws IOException {
        JoinGroupReq joinGroupReq = new JoinGroupReq();
        joinGroupReq.contentPositionMessage = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 100) {
                    if (iLJI != 9527) {
                        switch (iLJI) {
                            case 1:
                                joinGroupReq.common = _LinkCommon_ProtoDecoder.LIZLLL(c1516680pZS);
                                break;
                            case 2:
                                joinGroupReq.myself = _GroupPlayer_ProtoDecoder.LIZLLL(c1516680pZS);
                                break;
                            case 3:
                                joinGroupReq.target = _GroupPlayer_ProtoDecoder.LIZLLL(c1516680pZS);
                                break;
                            case 4:
                                joinGroupReq.type = c1516680pZS.LJIIJ();
                                break;
                            case 5:
                                joinGroupReq.groupChannelId = c1516680pZS.LJIIJJI();
                                break;
                            case 6:
                                joinGroupReq.contentPositionMessage.add(_ContentPositionMessage_ProtoDecoder.LIZLLL(c1516680pZS));
                                break;
                            default:
                                C1516700pZU.LJ(c1516680pZS);
                                break;
                        }
                    } else {
                        joinGroupReq.cohostReqExtra = _BizJoinGroupParams_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    joinGroupReq.extendExtra = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return joinGroupReq;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, JoinGroupReq joinGroupReq, List list) {
    }
}
