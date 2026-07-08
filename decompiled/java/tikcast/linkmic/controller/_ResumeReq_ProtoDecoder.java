package tikcast.linkmic.controller;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.linkcore.LinkCommon;
import com.bytedance.android.livesdk.model.message.linkcore._LinkCommon_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.linkcore._Player_ProtoDecoder;
import java.io.IOException;
import java.util.List;
import webcast.data.multilive_biz._BizResumeParams_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _ResumeReq_ProtoDecoder implements C0IMD<ResumeReq> {
    @Override // X.C0IMD
    public final void LIZ(ResumeReq resumeReq) {
        LinkCommon linkCommon = resumeReq.common;
        if (linkCommon != null) {
            _LinkCommon_ProtoDecoder.LJ(linkCommon);
        }
    }

    @Override // X.C0IMD
    public final ResumeReq LIZJ(C1516680pZS c1516680pZS) throws IOException {
        ResumeReq resumeReq = new ResumeReq();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 9527) {
                                C1516700pZU.LJ(c1516680pZS);
                            } else {
                                resumeReq.multiGuestReqExtra = _BizResumeParams_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            resumeReq.channelId = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        resumeReq.myself = _Player_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    resumeReq.common = _LinkCommon_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return resumeReq;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ResumeReq resumeReq, List list) {
    }
}
