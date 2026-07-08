package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CapsuleMessage_ProtoDecoder implements C0IMD<CapsuleMessage> {
    @Override // X.C0IMD
    public final void LIZ(CapsuleMessage capsuleMessage) {
        CapsuleMessage capsuleMessage2 = capsuleMessage;
        CommonMessageData commonMessageData = capsuleMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        ImageModel imageModel = capsuleMessage2.icon;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        Text text = capsuleMessage2.desc;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
        Text text2 = capsuleMessage2.buttonText;
        if (text2 != null) {
            _Text_ProtoDecoder.LJ(text2);
        }
        CapsuleBizParams capsuleBizParams = capsuleMessage2.bizParams;
        if (capsuleBizParams != null) {
            _CapsuleBizParams_ProtoDecoder.LJ(capsuleBizParams);
        }
        PublicAreaMessageCommon publicAreaMessageCommon = capsuleMessage2.publicAreaMessageCommon;
        if (publicAreaMessageCommon != null) {
            _PublicAreaMessageCommon_ProtoDecoder.LJ(publicAreaMessageCommon);
        }
    }

    @Override // X.C0IMD
    public final CapsuleMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        CapsuleMessage capsuleMessage = new CapsuleMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        capsuleMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        capsuleMessage.icon = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        capsuleMessage.desc = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        capsuleMessage.buttonText = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        capsuleMessage.schema = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        capsuleMessage.capsuleType = c1516680pZS.LJIIJ();
                        break;
                    case 7:
                        capsuleMessage.scene = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        capsuleMessage.bizParams = _CapsuleBizParams_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        capsuleMessage.subScene = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        capsuleMessage.style = c1516680pZS.LJIIJ();
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        capsuleMessage.skipFc = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        capsuleMessage.publicAreaMessageCommon = _PublicAreaMessageCommon_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        capsuleMessage.reportAction = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return capsuleMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CapsuleMessage capsuleMessage, List list) {
    }
}
