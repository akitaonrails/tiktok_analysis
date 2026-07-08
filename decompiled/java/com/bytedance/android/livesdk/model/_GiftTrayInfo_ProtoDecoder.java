package com.bytedance.android.livesdk.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class _GiftTrayInfo_ProtoDecoder implements C0IMD<GiftTrayInfo> {
    public static GiftTrayInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GiftTrayInfo giftTrayInfo = new GiftTrayInfo();
        giftTrayInfo.trayNormalBgColor = new ArrayList();
        giftTrayInfo.rightTagBgColor = new ArrayList();
        giftTrayInfo.traySmallBgColor = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        giftTrayInfo.mDynamicImg = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        giftTrayInfo.canMirror = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 3:
                        giftTrayInfo.trayNormalBgImg = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        giftTrayInfo.trayNormalBgColor.add(C1516700pZU.LIZLLL(c1516680pZS));
                        break;
                    case 5:
                        giftTrayInfo.traySmallBgImg = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        giftTrayInfo.traySmallBgColor.add(C1516700pZU.LIZLLL(c1516680pZS));
                        break;
                    case 7:
                        giftTrayInfo.rightTagText = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        giftTrayInfo.rightTagBgImg = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        giftTrayInfo.rightTagBgColor.add(C1516700pZU.LIZLLL(c1516680pZS));
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        giftTrayInfo.trayNameTextColor = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        giftTrayInfo.trayDescTextColor = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        giftTrayInfo.rightTagJumpSchema = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        giftTrayInfo.giftTrayJumpSchema = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return giftTrayInfo;
            }
        }
    }

    public static void LJ(GiftTrayInfo giftTrayInfo) {
        ImageModel imageModel = giftTrayInfo.mDynamicImg;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        ImageModel imageModel2 = giftTrayInfo.trayNormalBgImg;
        if (imageModel2 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel2);
        }
        if (giftTrayInfo.trayNormalBgColor == null) {
            giftTrayInfo.trayNormalBgColor = new ArrayList();
        }
        ImageModel imageModel3 = giftTrayInfo.traySmallBgImg;
        if (imageModel3 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel3);
        }
        if (giftTrayInfo.traySmallBgColor == null) {
            giftTrayInfo.traySmallBgColor = new ArrayList();
        }
        Text text = giftTrayInfo.rightTagText;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
        ImageModel imageModel4 = giftTrayInfo.rightTagBgImg;
        if (imageModel4 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel4);
        }
        if (giftTrayInfo.rightTagBgColor == null) {
            giftTrayInfo.rightTagBgColor = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GiftTrayInfo giftTrayInfo) {
        LJ(giftTrayInfo);
    }

    @Override // X.C0IMD
    public final GiftTrayInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftTrayInfo giftTrayInfo, List list) {
    }
}
