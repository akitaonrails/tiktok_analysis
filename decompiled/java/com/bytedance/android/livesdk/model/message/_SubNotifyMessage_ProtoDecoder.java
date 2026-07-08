package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _SubNotifyMessage_ProtoDecoder implements C0IMD<SubNotifyMessage> {
    @Override // X.C0IMD
    public final void LIZ(SubNotifyMessage subNotifyMessage) {
        SubNotifyMessage subNotifyMessage2 = subNotifyMessage;
        CommonMessageData commonMessageData = subNotifyMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        User user = subNotifyMessage2.user;
        if (user != null) {
            _User_ProtoDecoder.LJ(user);
        }
        PublicAreaMessageCommon publicAreaMessageCommon = subNotifyMessage2.publicAreaMessageCommon;
        if (publicAreaMessageCommon != null) {
            _PublicAreaMessageCommon_ProtoDecoder.LJ(publicAreaMessageCommon);
        }
    }

    @Override // X.C0IMD
    public final SubNotifyMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        SubNotifyMessage subNotifyMessage = new SubNotifyMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        subNotifyMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        subNotifyMessage.user = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        subNotifyMessage.exhibitionType = c1516680pZS.LJIIJ();
                        break;
                    case 4:
                        subNotifyMessage.subMonth = Long.valueOf(c1516680pZS.LJIIJJI());
                        break;
                    case 5:
                        subNotifyMessage.subscribeType = c1516680pZS.LJIIJ();
                        break;
                    case 6:
                        subNotifyMessage.oldSubscribeStatus = c1516680pZS.LJIIJ();
                        break;
                    case 7:
                        subNotifyMessage.subscribeMessageType = c1516680pZS.LJIIJ();
                        break;
                    case 8:
                        subNotifyMessage.subscribingStatus = c1516680pZS.LJIIJ();
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        subNotifyMessage.isSend = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        subNotifyMessage.isCustom = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        subNotifyMessage.giftSource = c1516680pZS.LJIIJ();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        subNotifyMessage.messageDisplayStyle = c1516680pZS.LJIIJ();
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        subNotifyMessage.publicAreaMessageCommon = _PublicAreaMessageCommon_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 14:
                        subNotifyMessage.packageId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 15:
                        subNotifyMessage.eventTracking = _EventTracking_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return subNotifyMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, SubNotifyMessage subNotifyMessage, List list) {
    }
}
