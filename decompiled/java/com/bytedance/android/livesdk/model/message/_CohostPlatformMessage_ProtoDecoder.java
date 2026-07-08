package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.CohostPlatformMessage;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CohostPlatformMessage_ProtoDecoder implements C0IMD<CohostPlatformMessage> {
    @Override // X.C0IMD
    public final void LIZ(CohostPlatformMessage cohostPlatformMessage) {
        CohostPlatformMessage cohostPlatformMessage2 = cohostPlatformMessage;
        CommonMessageData commonMessageData = cohostPlatformMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        CohostPlatformMessage.CohostInviteInfo cohostInviteInfo = cohostPlatformMessage2.inviteInfo;
        if (cohostInviteInfo != null) {
            _CohostPlatformMessage_CohostInviteInfo_ProtoDecoder.LJ(cohostInviteInfo);
        }
        CohostPlatformMessage.CohostWithdrawInfo cohostWithdrawInfo = cohostPlatformMessage2.withdrawInfo;
        if (cohostWithdrawInfo != null) {
            _CohostPlatformMessage_CohostWithdrawInfo_ProtoDecoder.LJ(cohostWithdrawInfo);
        }
    }

    @Override // X.C0IMD
    public final CohostPlatformMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        CohostPlatformMessage cohostPlatformMessage = new CohostPlatformMessage();
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
                                    cohostPlatformMessage.withdrawInfo = _CohostPlatformMessage_CohostWithdrawInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                }
                            } else {
                                cohostPlatformMessage.inviteInfo = _CohostPlatformMessage_CohostInviteInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            cohostPlatformMessage.actionType = c1516680pZS.LJIIJ();
                        }
                    } else {
                        cohostPlatformMessage.sourceType = c1516680pZS.LJIIJJI();
                    }
                } else {
                    cohostPlatformMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return cohostPlatformMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CohostPlatformMessage cohostPlatformMessage, List list) {
    }
}
