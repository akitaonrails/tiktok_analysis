package com.bytedance.android.livesdk.model.message.redenvelope;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.envelope.model._EnvelopeEnigmaInfo_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class _MessageRedEnvelopInfo_ProtoDecoder implements C0IMD<MessageRedEnvelopInfo> {
    public static MessageRedEnvelopInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        MessageRedEnvelopInfo messageRedEnvelopInfo = new MessageRedEnvelopInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        messageRedEnvelopInfo.envelopeId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        messageRedEnvelopInfo.businessType = Integer.valueOf(c1516680pZS.LJIIJ());
                        break;
                    case 3:
                        messageRedEnvelopInfo.envelopeIdc = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        messageRedEnvelopInfo.sendUserName = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        messageRedEnvelopInfo.diamondCount = Integer.valueOf(c1516680pZS.LJIIJ());
                        break;
                    case 6:
                        messageRedEnvelopInfo.peopleCount = Integer.valueOf(c1516680pZS.LJIIJ());
                        break;
                    case 7:
                        messageRedEnvelopInfo.unpackAt = Integer.valueOf(c1516680pZS.LJIIJ());
                        break;
                    case 8:
                        messageRedEnvelopInfo.sendUserId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        messageRedEnvelopInfo.sendUserAvatar = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        messageRedEnvelopInfo.createTime = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        messageRedEnvelopInfo.followStatusShow = c1516680pZS.LJIIJ();
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        messageRedEnvelopInfo.skinId = c1516680pZS.LJIIJ();
                        break;
                    case 14:
                        messageRedEnvelopInfo.voteCount = c1516680pZS.LJIIJ();
                        break;
                    case 15:
                        messageRedEnvelopInfo.senderEnigmaInfo = _EnvelopeEnigmaInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 16:
                        messageRedEnvelopInfo.superFanCount = c1516680pZS.LJIIJ();
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return messageRedEnvelopInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(MessageRedEnvelopInfo messageRedEnvelopInfo) {
        ImageModel imageModel = messageRedEnvelopInfo.sendUserAvatar;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final MessageRedEnvelopInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, MessageRedEnvelopInfo messageRedEnvelopInfo, List list) {
    }
}
