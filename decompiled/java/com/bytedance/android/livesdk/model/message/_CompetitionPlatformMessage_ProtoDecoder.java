package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.CompetitionPlatformMessage;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CompetitionPlatformMessage_ProtoDecoder implements C0IMD<CompetitionPlatformMessage> {
    @Override // X.C0IMD
    public final void LIZ(CompetitionPlatformMessage competitionPlatformMessage) {
        CompetitionPlatformMessage competitionPlatformMessage2 = competitionPlatformMessage;
        CommonMessageData commonMessageData = competitionPlatformMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        CompetitionPlatformMessage.CompetitionInitiateInfo competitionInitiateInfo = competitionPlatformMessage2.initiateInfo;
        if (competitionInitiateInfo != null) {
            if (competitionInitiateInfo.performanceOrder == null) {
                competitionInitiateInfo.performanceOrder = new ArrayList();
            }
            Text text = competitionInitiateInfo.inviterPrompt;
            if (text != null) {
                _Text_ProtoDecoder.LJ(text);
            }
        }
    }

    @Override // X.C0IMD
    public final CompetitionPlatformMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        CompetitionPlatformMessage competitionPlatformMessage = new CompetitionPlatformMessage();
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
                                    competitionPlatformMessage.rotateInfo = _CompetitionPlatformMessage_CompetitionRotateInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                }
                            } else {
                                competitionPlatformMessage.initiateInfo = _CompetitionPlatformMessage_CompetitionInitiateInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            competitionPlatformMessage.actionType = c1516680pZS.LJIIJ();
                        }
                    } else {
                        competitionPlatformMessage.battleType = c1516680pZS.LJIIJ();
                    }
                } else {
                    competitionPlatformMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return competitionPlatformMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CompetitionPlatformMessage competitionPlatformMessage, List list) {
    }
}
