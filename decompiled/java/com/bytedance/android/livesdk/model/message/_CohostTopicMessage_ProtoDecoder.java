package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.chatroom.model.interact.CohostTopic;
import com.bytedance.android.livesdk.chatroom.model.interact._CohostTopic_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.interact._TopicSessionStatus_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CohostTopicMessage_ProtoDecoder implements C0IMD<CohostTopicMessage> {
    @Override // X.C0IMD
    public final void LIZ(CohostTopicMessage cohostTopicMessage) {
        CohostTopicMessage cohostTopicMessage2 = cohostTopicMessage;
        CommonMessageData commonMessageData = cohostTopicMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        CohostTopic cohostTopic = cohostTopicMessage2.topic;
        if (cohostTopic != null) {
            _CohostTopic_ProtoDecoder.LJ(cohostTopic);
        }
    }

    @Override // X.C0IMD
    public final CohostTopicMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        CohostTopicMessage cohostTopicMessage = new CohostTopicMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 5) {
                                if (iLJI != 6) {
                                    if (iLJI != 21) {
                                        C1516700pZU.LJ(c1516680pZS);
                                    } else {
                                        cohostTopicMessage.sessionStatus = _TopicSessionStatus_ProtoDecoder.LIZLLL(c1516680pZS);
                                    }
                                } else {
                                    cohostTopicMessage.heatUpdateContent = _HeatUpdateContent_ProtoDecoder.LIZLLL(c1516680pZS);
                                }
                            } else {
                                cohostTopicMessage.topicSetContent = _TopicSetContent_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            cohostTopicMessage.topic = _CohostTopic_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        cohostTopicMessage.action = c1516680pZS.LJIIJ();
                    }
                } else {
                    cohostTopicMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return cohostTopicMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CohostTopicMessage cohostTopicMessage, List list) {
    }
}
