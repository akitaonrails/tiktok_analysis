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
public final class _CommonToastMessage_ProtoDecoder implements C0IMD<CommonToastMessage> {
    @Override // X.C0IMD
    public final void LIZ(CommonToastMessage commonToastMessage) {
        CommonToastMessage commonToastMessage2 = commonToastMessage;
        CommonMessageData commonMessageData = commonToastMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        ImageModel imageModel = commonToastMessage2.topImage;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final CommonToastMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        CommonToastMessage commonToastMessage = new CommonToastMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        commonToastMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        commonToastMessage.discardable = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 3:
                        commonToastMessage.immediate = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 4:
                        commonToastMessage.duration = (int) c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        commonToastMessage.textColor = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        commonToastMessage.backgroundColorStart = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        commonToastMessage.backgroundColorEnd = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        commonToastMessage.position = (int) c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        commonToastMessage.topImage = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        commonToastMessage.imageWidth = (int) c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        commonToastMessage.imageHeight = (int) c1516680pZS.LJIIJJI();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        commonToastMessage.showMongoliaLayer = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return commonToastMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CommonToastMessage commonToastMessage, List list) {
    }
}
