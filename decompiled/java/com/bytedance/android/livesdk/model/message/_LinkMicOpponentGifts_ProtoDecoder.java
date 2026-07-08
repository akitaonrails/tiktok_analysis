package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._EnigmaBattleExtraInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LinkMicOpponentGifts_ProtoDecoder implements C0IMD<LinkMicOpponentGifts> {
    @Override // X.C0IMD
    public final void LIZ(LinkMicOpponentGifts linkMicOpponentGifts) {
        LinkMicOpponentGifts linkMicOpponentGifts2 = linkMicOpponentGifts;
        CommonMessageData commonMessageData = linkMicOpponentGifts2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        ImageModel imageModel = linkMicOpponentGifts2.giftIconImage;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final LinkMicOpponentGifts LIZJ(C1516680pZS c1516680pZS) throws IOException {
        LinkMicOpponentGifts linkMicOpponentGifts = new LinkMicOpponentGifts();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        linkMicOpponentGifts.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        linkMicOpponentGifts.battleId = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        linkMicOpponentGifts.channelId = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        linkMicOpponentGifts.fromUserId = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        linkMicOpponentGifts.giftToUserId = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        linkMicOpponentGifts.giftId = c1516680pZS.LJIIJJI();
                        break;
                    case 7:
                        linkMicOpponentGifts.giftCount = c1516680pZS.LJIIJJI();
                        break;
                    case 8:
                        linkMicOpponentGifts.giftPrice = c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        linkMicOpponentGifts.giftIconImage = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        linkMicOpponentGifts.repeatCount = c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        linkMicOpponentGifts.sendGiftSuccessTime = c1516680pZS.LJIIJJI();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        linkMicOpponentGifts.updateBattleScoreTime = c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        linkMicOpponentGifts.logId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 14:
                        linkMicOpponentGifts.enigmaBattleExtraInfo = _EnigmaBattleExtraInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return linkMicOpponentGifts;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LinkMicOpponentGifts linkMicOpponentGifts, List list) {
    }
}
