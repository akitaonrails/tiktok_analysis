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
import webcast.data.cohost_biz._BizPermitJoinGroupParams_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _PermitJoinGroupReq_ProtoDecoder implements C0IMD<PermitJoinGroupReq> {
    @Override // X.C0IMD
    public final void LIZ(PermitJoinGroupReq permitJoinGroupReq) {
        PermitJoinGroupReq permitJoinGroupReq2 = permitJoinGroupReq;
        LinkCommon linkCommon = permitJoinGroupReq2.common;
        if (linkCommon != null) {
            _LinkCommon_ProtoDecoder.LJ(linkCommon);
        }
        List<ContentPositionMessage> list = permitJoinGroupReq2.contentPositionMessage;
        if (list == null) {
            permitJoinGroupReq2.contentPositionMessage = new ArrayList();
        } else {
            if (list.isEmpty()) {
                return;
            }
            Iterator<ContentPositionMessage> it2 = permitJoinGroupReq2.contentPositionMessage.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final PermitJoinGroupReq LIZJ(C1516680pZS c1516680pZS) throws IOException {
        PermitJoinGroupReq permitJoinGroupReq = new PermitJoinGroupReq();
        permitJoinGroupReq.contentPositionMessage = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 9527) {
                    switch (iLJI) {
                        case 1:
                            permitJoinGroupReq.common = _LinkCommon_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 2:
                            permitJoinGroupReq.type = c1516680pZS.LJIIJ();
                            break;
                        case 3:
                            permitJoinGroupReq.myself = _GroupPlayer_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 4:
                            permitJoinGroupReq.joinUser = _GroupPlayer_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 5:
                            permitJoinGroupReq.status = c1516680pZS.LJIIJ();
                            break;
                        case 6:
                            permitJoinGroupReq.groupChannelId = c1516680pZS.LJIIJJI();
                            break;
                        case 7:
                            permitJoinGroupReq.contentPositionMessage.add(_ContentPositionMessage_ProtoDecoder.LIZLLL(c1516680pZS));
                            break;
                        default:
                            C1516700pZU.LJ(c1516680pZS);
                            break;
                    }
                } else {
                    permitJoinGroupReq.cohostReqExtra = _BizPermitJoinGroupParams_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return permitJoinGroupReq;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PermitJoinGroupReq permitJoinGroupReq, List list) {
    }
}
