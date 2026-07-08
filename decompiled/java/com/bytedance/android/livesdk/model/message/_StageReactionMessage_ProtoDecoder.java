package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _StageReactionMessage_ProtoDecoder implements C0IMD<StageReactionMessage> {
    @Override // X.C0IMD
    public final void LIZ(StageReactionMessage stageReactionMessage) {
        StageReactionMessage stageReactionMessage2 = stageReactionMessage;
        CommonMessageData commonMessageData = stageReactionMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        if (stageReactionMessage2.toUserId == null) {
            stageReactionMessage2.toUserId = new ArrayList();
        }
        if (stageReactionMessage2.reactionId == null) {
            stageReactionMessage2.reactionId = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final StageReactionMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        StageReactionMessage stageReactionMessage = new StageReactionMessage();
        stageReactionMessage.reactionId = new ArrayList();
        stageReactionMessage.toUserId = new ArrayList();
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
                                    stageReactionMessage.showTimeMs = c1516680pZS.LJIIJJI();
                                }
                            } else {
                                stageReactionMessage.reactionId.add(C1516700pZU.LIZLLL(c1516680pZS));
                            }
                        } else {
                            stageReactionMessage.toUserId.add(Long.valueOf(c1516680pZS.LJIIJJI()));
                        }
                    } else {
                        stageReactionMessage.senderUserId = c1516680pZS.LJIIJJI();
                    }
                } else {
                    stageReactionMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return stageReactionMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, StageReactionMessage stageReactionMessage, List list) {
    }
}
