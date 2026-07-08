package com.bytedance.android.livesdk.chatroom.model.multiguestv3;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.PerceptionMessage;
import com.bytedance.android.livesdk.model.message._PerceptionMessage_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BizApplyResponseData_ProtoDecoder implements C0IMD<BizApplyResponseData> {
    public static BizApplyResponseData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BizApplyResponseData bizApplyResponseData = new BizApplyResponseData();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                if (iLJI != 5) {
                                    C1516700pZU.LJ(c1516680pZS);
                                } else {
                                    bizApplyResponseData.executeLinkSource = c1516680pZS.LJIIJ();
                                }
                            } else {
                                bizApplyResponseData.executeReason = c1516680pZS.LJIIJ();
                            }
                        } else {
                            bizApplyResponseData.hostPerceptionInfo = _PerceptionMessage_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        bizApplyResponseData.perceptionInfo = _PerceptionMessage_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    bizApplyResponseData.linkTypePermission = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return bizApplyResponseData;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(BizApplyResponseData bizApplyResponseData) {
        BizApplyResponseData bizApplyResponseData2 = bizApplyResponseData;
        PerceptionMessage perceptionMessage = bizApplyResponseData2.perceptionInfo;
        if (perceptionMessage != null) {
            _PerceptionMessage_ProtoDecoder.LJ(perceptionMessage);
        }
        PerceptionMessage perceptionMessage2 = bizApplyResponseData2.hostPerceptionInfo;
        if (perceptionMessage2 != null) {
            _PerceptionMessage_ProtoDecoder.LJ(perceptionMessage2);
        }
    }

    @Override // X.C0IMD
    public final BizApplyResponseData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BizApplyResponseData bizApplyResponseData, List list) {
    }
}
