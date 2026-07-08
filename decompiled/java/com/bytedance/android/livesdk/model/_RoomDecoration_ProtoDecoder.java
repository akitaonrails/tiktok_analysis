package com.bytedance.android.livesdk.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _RoomDecoration_ProtoDecoder implements C0IMD<RoomDecoration> {
    public static RoomDecoration LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        RoomDecoration roomDecoration = new RoomDecoration();
        roomDecoration.inputRect = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        roomDecoration.id = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        roomDecoration.image = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        roomDecoration.type = (int) c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        roomDecoration.inputRect.add(Long.valueOf(c1516680pZS.LJIIJJI()));
                        break;
                    case 5:
                        roomDecoration.textSize = (int) c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        roomDecoration.textColor = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        roomDecoration.content = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        roomDecoration.maxLength = c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        roomDecoration.status = c1516680pZS.LJIIJJI();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        roomDecoration.screenHeight = (int) c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        roomDecoration.xPosition = (int) c1516680pZS.LJIIJJI();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        roomDecoration.screenWidth = (int) c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        roomDecoration.yPosition = (int) c1516680pZS.LJIIJJI();
                        break;
                    case 14:
                        roomDecoration.kind = c1516680pZS.LJIIJJI();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return roomDecoration;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(RoomDecoration roomDecoration) {
        RoomDecoration roomDecoration2 = roomDecoration;
        ImageModel imageModel = roomDecoration2.image;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        if (roomDecoration2.inputRect == null) {
            roomDecoration2.inputRect = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final RoomDecoration LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RoomDecoration roomDecoration, List list) {
    }
}
