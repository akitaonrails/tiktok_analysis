package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _AgreeApplyGuideMessage_ProtoDecoder implements C0IMD<AgreeApplyGuideMessage> {
    @Override // X.C0IMD
    public final void LIZ(AgreeApplyGuideMessage agreeApplyGuideMessage) {
        AgreeApplyGuideMessage agreeApplyGuideMessage2 = agreeApplyGuideMessage;
        CommonMessageData commonMessageData = agreeApplyGuideMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        User user = agreeApplyGuideMessage2.user;
        if (user != null) {
            _User_ProtoDecoder.LJ(user);
        }
    }

    @Override // X.C0IMD
    public final AgreeApplyGuideMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        AgreeApplyGuideMessage agreeApplyGuideMessage = new AgreeApplyGuideMessage();
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
                                    agreeApplyGuideMessage.requestId = C1516700pZU.LIZLLL(c1516680pZS);
                                }
                            } else {
                                agreeApplyGuideMessage.triggerType = C1516700pZU.LIZLLL(c1516680pZS);
                            }
                        } else {
                            agreeApplyGuideMessage.displayPosition = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        agreeApplyGuideMessage.user = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    agreeApplyGuideMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return agreeApplyGuideMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AgreeApplyGuideMessage agreeApplyGuideMessage, List list) {
    }
}
