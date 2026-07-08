package tikcast.linkmic.controller;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.linkcore.LinkCommon;
import com.bytedance.android.livesdk.model.message.linkcore._LinkCommon_ProtoDecoder;
import java.io.IOException;
import java.util.List;
import tikcast.linkmic.common._GroupPlayer_ProtoDecoder;
import webcast.data.cohost_biz._BizLeaveJoinGroupParams_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _LeaveJoinGroupReq_ProtoDecoder implements C0IMD<LeaveJoinGroupReq> {
    @Override // X.C0IMD
    public final void LIZ(LeaveJoinGroupReq leaveJoinGroupReq) {
        LinkCommon linkCommon = leaveJoinGroupReq.common;
        if (linkCommon != null) {
            _LinkCommon_ProtoDecoder.LJ(linkCommon);
        }
    }

    @Override // X.C0IMD
    public final LeaveJoinGroupReq LIZJ(C1516680pZS c1516680pZS) throws IOException {
        LeaveJoinGroupReq leaveJoinGroupReq = new LeaveJoinGroupReq();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                if (iLJI != 5) {
                                    if (iLJI != 100) {
                                        if (iLJI != 9527) {
                                            C1516700pZU.LJ(c1516680pZS);
                                        } else {
                                            leaveJoinGroupReq.cohostReqExtra = _BizLeaveJoinGroupParams_ProtoDecoder.LIZLLL(c1516680pZS);
                                        }
                                    } else {
                                        leaveJoinGroupReq.extendExtra = C1516700pZU.LIZLLL(c1516680pZS);
                                    }
                                } else {
                                    leaveJoinGroupReq.curGroupChannelId = c1516680pZS.LJIIJJI();
                                }
                            } else {
                                leaveJoinGroupReq.groupChannelId = c1516680pZS.LJIIJJI();
                            }
                        } else {
                            leaveJoinGroupReq.leaver = _GroupPlayer_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        leaveJoinGroupReq.myself = _GroupPlayer_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    leaveJoinGroupReq.common = _LinkCommon_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return leaveJoinGroupReq;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LeaveJoinGroupReq leaveJoinGroupReq, List list) {
    }
}
