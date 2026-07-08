package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.interact.model.CohostPanelBanner;
import com.bytedance.android.livesdk.chatroom.model.interact._CohostPanelBannerExtra_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CohostPanelBanner_ProtoDecoder implements C0IMD<CohostPanelBanner> {
    public static CohostPanelBanner LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CohostPanelBanner cohostPanelBanner = new CohostPanelBanner();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        cohostPanelBanner.bannerStyle = c1516680pZS.LJIIJ();
                        break;
                    case 2:
                        cohostPanelBanner.angle = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        cohostPanelBanner.startColor = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        cohostPanelBanner.endColor = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        cohostPanelBanner.schemaJumpUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        cohostPanelBanner.bannerTitle = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        cohostPanelBanner.arrowImage = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        cohostPanelBanner.rightImage = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        cohostPanelBanner.backgroundImage = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        cohostPanelBanner.rightImageRtl = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        cohostPanelBanner.countdownInfo = _CohostPanelBanner_CountdownInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        cohostPanelBanner.extra = _CohostPanelBannerExtra_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return cohostPanelBanner;
            }
        }
    }

    public static void LJ(CohostPanelBanner cohostPanelBanner) {
        Text text;
        Text text2 = cohostPanelBanner.bannerTitle;
        if (text2 != null) {
            _Text_ProtoDecoder.LJ(text2);
        }
        ImageModel imageModel = cohostPanelBanner.arrowImage;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        ImageModel imageModel2 = cohostPanelBanner.rightImage;
        if (imageModel2 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel2);
        }
        ImageModel imageModel3 = cohostPanelBanner.backgroundImage;
        if (imageModel3 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel3);
        }
        ImageModel imageModel4 = cohostPanelBanner.rightImageRtl;
        if (imageModel4 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel4);
        }
        CohostPanelBanner.CountdownInfo countdownInfo = cohostPanelBanner.countdownInfo;
        if (countdownInfo != null && (text = countdownInfo.descText) != null) {
            _Text_ProtoDecoder.LJ(text);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(CohostPanelBanner cohostPanelBanner) {
        LJ(cohostPanelBanner);
    }

    @Override // X.C0IMD
    public final CohostPanelBanner LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CohostPanelBanner cohostPanelBanner, List list) {
    }
}
