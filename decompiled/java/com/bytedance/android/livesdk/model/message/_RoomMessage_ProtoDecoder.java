package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _RoomMessage_ProtoDecoder implements C0IMD<RoomMessage> {
    @Override // X.C0IMD
    public final void LIZ(RoomMessage roomMessage) {
        RoomMessage roomMessage2 = roomMessage;
        CommonMessageData commonMessageData = roomMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        ImageModel imageModel = roomMessage2.icon;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        PublicAreaMessageCommon publicAreaMessageCommon = roomMessage2.publicAreaCommon;
        if (publicAreaMessageCommon != null) {
            _PublicAreaMessageCommon_ProtoDecoder.LJ(publicAreaMessageCommon);
        }
    }

    @Override // X.C0IMD
    public final RoomMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        RoomMessage roomMessage = new RoomMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        roomMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        roomMessage.content = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        roomMessage.supprotLandscape = Boolean.valueOf(C1516700pZU.LIZ(c1516680pZS));
                        break;
                    case 4:
                        roomMessage.source = (int) c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        roomMessage.icon = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        roomMessage.scene = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        roomMessage.isWelcome = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 8:
                        roomMessage.publicAreaCommon = _PublicAreaMessageCommon_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        roomMessage.showDurationMs = c1516680pZS.LJIIJJI();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        roomMessage.subScene = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        roomMessage.schema = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        roomMessage.signature = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        roomMessage.signatureVersion = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return roomMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RoomMessage roomMessage, List list) {
    }
}
