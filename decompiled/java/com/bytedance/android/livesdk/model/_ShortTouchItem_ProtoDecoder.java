package com.bytedance.android.livesdk.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ShortTouchItem_ProtoDecoder implements C0IMD<ShortTouchItem> {
    public static ShortTouchItem LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        ShortTouchItem shortTouchItem = new ShortTouchItem();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        shortTouchItem.schema = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        shortTouchItem.width = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        shortTouchItem.height = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        shortTouchItem.topMargin = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        shortTouchItem.leftMargin = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        shortTouchItem.fcSecond = c1516680pZS.LJIIJJI();
                        break;
                    case 7:
                        shortTouchItem.name = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        shortTouchItem.previewSetting = _ShortTouchPreviewSetting_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        shortTouchItem.animeType = c1516680pZS.LJIIJ();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        shortTouchItem.iconSkin = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        shortTouchItem.activityId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return shortTouchItem;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(ShortTouchItem shortTouchItem) {
        ImageModel imageModel;
        ShortTouchPreviewSetting shortTouchPreviewSetting = shortTouchItem.previewSetting;
        if (shortTouchPreviewSetting != null && (imageModel = shortTouchPreviewSetting.previewImage) != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final ShortTouchItem LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ShortTouchItem shortTouchItem, List list) {
    }
}
