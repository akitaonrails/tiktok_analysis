package com.bytedance.android.livesdk.chatroom.model.multiguestv3;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.PerceptionMessage;
import com.bytedance.android.livesdk.model.message._PerceptionMessage_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BizReplyResponseData_ProtoDecoder implements C0IMD<BizReplyResponseData> {
    public static BizReplyResponseData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BizReplyResponseData bizReplyResponseData = new BizReplyResponseData();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 5) {
                                C1516700pZU.LJ(c1516680pZS);
                            } else {
                                bizReplyResponseData.hostPerceptionInfo = _PerceptionMessage_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            bizReplyResponseData.fixMicNumAction = c1516680pZS.LJIIJ();
                        }
                    } else {
                        bizReplyResponseData.layoutTypeAction = c1516680pZS.LJIIJ();
                    }
                } else {
                    bizReplyResponseData.linkTypePermission = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return bizReplyResponseData;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(BizReplyResponseData bizReplyResponseData) {
        PerceptionMessage perceptionMessage = bizReplyResponseData.hostPerceptionInfo;
        if (perceptionMessage != null) {
            _PerceptionMessage_ProtoDecoder.LJ(perceptionMessage);
        }
    }

    @Override // X.C0IMD
    public final BizReplyResponseData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BizReplyResponseData bizReplyResponseData, List list) {
    }
}
