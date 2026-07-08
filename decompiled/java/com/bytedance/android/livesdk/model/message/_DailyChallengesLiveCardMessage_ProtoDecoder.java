package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _DailyChallengesLiveCardMessage_ProtoDecoder implements C0IMD<DailyChallengesLiveCardMessage> {
    @Override // X.C0IMD
    public final void LIZ(DailyChallengesLiveCardMessage dailyChallengesLiveCardMessage) {
        CommonMessageData commonMessageData = dailyChallengesLiveCardMessage.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
    }

    @Override // X.C0IMD
    public final DailyChallengesLiveCardMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        DailyChallengesLiveCardMessage dailyChallengesLiveCardMessage = new DailyChallengesLiveCardMessage();
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
                                dailyChallengesLiveCardMessage.message = C1516700pZU.LIZLLL(c1516680pZS);
                            }
                        } else {
                            dailyChallengesLiveCardMessage.status = c1516680pZS.LJIIJ();
                        }
                    } else {
                        dailyChallengesLiveCardMessage.season = c1516680pZS.LJIIJJI();
                    }
                } else {
                    dailyChallengesLiveCardMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return dailyChallengesLiveCardMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, DailyChallengesLiveCardMessage dailyChallengesLiveCardMessage, List list) {
    }
}
