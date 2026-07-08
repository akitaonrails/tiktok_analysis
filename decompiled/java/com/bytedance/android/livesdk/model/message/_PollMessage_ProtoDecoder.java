package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model._Gift_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _PollMessage_ProtoDecoder implements C0IMD<PollMessage> {
    @Override // X.C0IMD
    public final void LIZ(PollMessage pollMessage) {
        Gift gift;
        PollMessage pollMessage2 = pollMessage;
        CommonMessageData commonMessageData = pollMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        PollStartContent pollStartContent = pollMessage2.startContent;
        if (pollStartContent != null) {
            _PollStartContent_ProtoDecoder.LJ(pollStartContent);
        }
        PollEndContent pollEndContent = pollMessage2.endContent;
        if (pollEndContent != null) {
            _PollEndContent_ProtoDecoder.LJ(pollEndContent);
        }
        PollUpdateVotesContent pollUpdateVotesContent = pollMessage2.updateContent;
        if (pollUpdateVotesContent != null) {
            _PollUpdateVotesContent_ProtoDecoder.LJ(pollUpdateVotesContent);
        }
        PollBasicInfo pollBasicInfo = pollMessage2.pollBasicInfo;
        if (pollBasicInfo != null && (gift = pollBasicInfo.gift) != null) {
            _Gift_ProtoDecoder.LJ(gift);
        }
    }

    @Override // X.C0IMD
    public final PollMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        PollMessage pollMessage = new PollMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        pollMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        pollMessage.messageType = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        pollMessage.pollId = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        pollMessage.startContent = _PollStartContent_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        pollMessage.endContent = _PollEndContent_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        pollMessage.updateContent = _PollUpdateVotesContent_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        pollMessage.pollKind = Integer.valueOf(c1516680pZS.LJIIJ());
                        break;
                    case 8:
                        pollMessage.pollBasicInfo = _PollBasicInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        pollMessage.templateContent = _TemplateContent_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return pollMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PollMessage pollMessage, List list) {
    }
}
