package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LiveInfoAuditNoticeMessage_ProtoDecoder implements C0IMD<LiveInfoAuditNoticeMessage> {
    @Override // X.C0IMD
    public final void LIZ(LiveInfoAuditNoticeMessage liveInfoAuditNoticeMessage) {
        CommonMessageData commonMessageData = liveInfoAuditNoticeMessage.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
    }

    @Override // X.C0IMD
    public final LiveInfoAuditNoticeMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        LiveInfoAuditNoticeMessage liveInfoAuditNoticeMessage = new LiveInfoAuditNoticeMessage();
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
                                liveInfoAuditNoticeMessage.textStarlingKey = C1516700pZU.LIZLLL(c1516680pZS);
                            }
                        } else {
                            liveInfoAuditNoticeMessage.auditStatus = c1516680pZS.LJIIJ();
                        }
                    } else {
                        liveInfoAuditNoticeMessage.auditContentType = c1516680pZS.LJIIJ();
                    }
                } else {
                    liveInfoAuditNoticeMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return liveInfoAuditNoticeMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LiveInfoAuditNoticeMessage liveInfoAuditNoticeMessage, List list) {
    }
}
