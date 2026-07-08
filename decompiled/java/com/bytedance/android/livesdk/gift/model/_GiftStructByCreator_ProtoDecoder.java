package com.bytedance.android.livesdk.gift.model;

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
public final class _GiftStructByCreator_ProtoDecoder implements C0IMD<GiftStructByCreator> {
    public static GiftStructByCreator LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GiftStructByCreator giftStructByCreator = new GiftStructByCreator();
        giftStructByCreator.giftPanelCardlets = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        giftStructByCreator.name = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        giftStructByCreator.id = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        giftStructByCreator.type = c1516680pZS.LJIIJ();
                        break;
                    case 4:
                        giftStructByCreator.diamondCount = c1516680pZS.LJIIJ();
                        break;
                    case 5:
                        giftStructByCreator.image = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        giftStructByCreator.previewImage = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        giftStructByCreator.giftPanelCardlets.add(_GiftPanelCardletByCreator_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 8:
                        giftStructByCreator.giftLabelIcon = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        giftStructByCreator.isBoxGift = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        giftStructByCreator.coinsText = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        giftStructByCreator.schemeInfo = _GiftStructByCreatorSchemeInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return giftStructByCreator;
            }
        }
    }

    public static void LJ(GiftStructByCreator giftStructByCreator) {
        ImageModel imageModel = giftStructByCreator.image;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        ImageModel imageModel2 = giftStructByCreator.previewImage;
        if (imageModel2 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel2);
        }
        List<GiftPanelCardletByCreator> list = giftStructByCreator.giftPanelCardlets;
        if (list == null) {
            giftStructByCreator.giftPanelCardlets = new ArrayList();
        } else if (!list.isEmpty()) {
            for (GiftPanelCardletByCreator giftPanelCardletByCreator : giftStructByCreator.giftPanelCardlets) {
                if (giftPanelCardletByCreator != null) {
                    _GiftPanelCardletByCreator_ProtoDecoder.LJ(giftPanelCardletByCreator);
                }
            }
        }
        ImageModel imageModel3 = giftStructByCreator.giftLabelIcon;
        if (imageModel3 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel3);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GiftStructByCreator giftStructByCreator) {
        LJ(giftStructByCreator);
    }

    @Override // X.C0IMD
    public final GiftStructByCreator LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftStructByCreator giftStructByCreator, List list) {
    }
}
