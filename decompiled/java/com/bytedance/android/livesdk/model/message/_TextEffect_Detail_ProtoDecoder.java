package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.TextEffect;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class _TextEffect_Detail_ProtoDecoder implements C0IMD<TextEffect.Detail> {
    public static TextEffect.Detail LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        TextEffect.Detail detail = new TextEffect.Detail();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        detail.text = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        detail.textFontSize = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        detail.background = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        detail.start = c1516680pZS.LJIIJ();
                        break;
                    case 5:
                        detail.duration = c1516680pZS.LJIIJ();
                        break;
                    case 6:
                        detail.x = c1516680pZS.LJIIJ();
                        break;
                    case 7:
                        detail.y = c1516680pZS.LJIIJ();
                        break;
                    case 8:
                        detail.width = c1516680pZS.LJIIJ();
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        detail.height = c1516680pZS.LJIIJ();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        detail.shadowDx = c1516680pZS.LJIIJ();
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        detail.shadowDy = c1516680pZS.LJIIJ();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        detail.shadowRadius = c1516680pZS.LJIIJ();
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        detail.shadowColor = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 14:
                        detail.strokeColor = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 15:
                        detail.strokeWidth = c1516680pZS.LJIIJ();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return detail;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(TextEffect.Detail detail) {
        TextEffect.Detail detail2 = detail;
        Text text = detail2.text;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
        ImageModel imageModel = detail2.background;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final TextEffect.Detail LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, TextEffect.Detail detail, List list) {
    }
}
