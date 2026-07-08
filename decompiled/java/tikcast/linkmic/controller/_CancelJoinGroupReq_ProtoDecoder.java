package tikcast.linkmic.controller;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.linkcore.LinkCommon;
import com.bytedance.android.livesdk.model.message.linkcore._LinkCommon_ProtoDecoder;
import java.io.IOException;
import java.util.List;
import tikcast.linkmic.common._GroupPlayer_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _CancelJoinGroupReq_ProtoDecoder implements C0IMD<CancelJoinGroupReq> {
    @Override // X.C0IMD
    public final void LIZ(CancelJoinGroupReq cancelJoinGroupReq) {
        LinkCommon linkCommon = cancelJoinGroupReq.common;
        if (linkCommon != null) {
            _LinkCommon_ProtoDecoder.LJ(linkCommon);
        }
    }

    @Override // X.C0IMD
    public final CancelJoinGroupReq LIZJ(C1516680pZS c1516680pZS) throws IOException {
        CancelJoinGroupReq cancelJoinGroupReq = new CancelJoinGroupReq();
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
                                        C1516700pZU.LJ(c1516680pZS);
                                    } else {
                                        cancelJoinGroupReq.extendExtra = C1516700pZU.LIZLLL(c1516680pZS);
                                    }
                                } else {
                                    cancelJoinGroupReq.groupChannelId = c1516680pZS.LJIIJJI();
                                }
                            } else {
                                cancelJoinGroupReq.type = c1516680pZS.LJIIJ();
                            }
                        } else {
                            cancelJoinGroupReq.target = _GroupPlayer_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        cancelJoinGroupReq.myself = _GroupPlayer_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    cancelJoinGroupReq.common = _LinkCommon_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return cancelJoinGroupReq;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CancelJoinGroupReq cancelJoinGroupReq, List list) {
    }
}
