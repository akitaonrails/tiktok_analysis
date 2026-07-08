package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class _RemindMessage_ProtoDecoder implements C0IMD<RemindMessage> {
    @Override // X.C0IMD
    public final void LIZ(RemindMessage remindMessage) {
        RemindMessage remindMessage2 = remindMessage;
        CommonMessageData commonMessageData = remindMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        Text text = remindMessage2.title;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
        Text text2 = remindMessage2.violationReason;
        if (text2 != null) {
            _Text_ProtoDecoder.LJ(text2);
        }
        Text text3 = remindMessage2.illegalText;
        if (text3 != null) {
            _Text_ProtoDecoder.LJ(text3);
        }
        Text text4 = remindMessage2.bottomTip;
        if (text4 != null) {
            _Text_ProtoDecoder.LJ(text4);
        }
        Text text5 = remindMessage2.noticeTitle;
        if (text5 != null) {
            _Text_ProtoDecoder.LJ(text5);
        }
        Text text6 = remindMessage2.noticeContent;
        if (text6 != null) {
            _Text_ProtoDecoder.LJ(text6);
        }
    }

    @Override // X.C0IMD
    public final RemindMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        RemindMessage remindMessage = new RemindMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        remindMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        remindMessage.content = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        remindMessage.noticeType = (int) c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        remindMessage.style = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        remindMessage.title = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        remindMessage.violationReason = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        remindMessage.illegalText = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        remindMessage.bottomTip = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        remindMessage.tipUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        remindMessage.noticeTitle = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        remindMessage.noticeContent = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        remindMessage.scene = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return remindMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RemindMessage remindMessage, List list) {
    }
}
