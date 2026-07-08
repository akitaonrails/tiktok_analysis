package com.bytedance.android.livesdk.gift.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GiftPage_GiftDynamicField_GiftPanelBanner_ProtoDecoder implements C0IMD<GiftPage.GiftDynamicField.GiftPanelBanner> {
    public static GiftPage.GiftDynamicField.GiftPanelBanner LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GiftPage.GiftDynamicField.GiftPanelBanner giftPanelBanner = new GiftPage.GiftDynamicField.GiftPanelBanner();
        giftPanelBanner.bgColorValues = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        giftPanelBanner.displayText = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        giftPanelBanner.leftIcon = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        giftPanelBanner.schemaUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                    case 5:
                        giftPanelBanner.bgColorValues.add(C1516700pZU.LIZLLL(c1516680pZS));
                        break;
                    case 6:
                        giftPanelBanner.bannerLynxUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        giftPanelBanner.bannerPriority = c1516680pZS.LJIIJ();
                        break;
                    case 8:
                        giftPanelBanner.bannerLynxExtra = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        giftPanelBanner.bgImage = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return giftPanelBanner;
            }
        }
    }

    public static void LJ(GiftPage.GiftDynamicField.GiftPanelBanner giftPanelBanner) {
        Text text = giftPanelBanner.displayText;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
        ImageModel imageModel = giftPanelBanner.leftIcon;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        if (giftPanelBanner.bgColorValues == null) {
            giftPanelBanner.bgColorValues = new ArrayList();
        }
        ImageModel imageModel2 = giftPanelBanner.bgImage;
        if (imageModel2 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel2);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GiftPage.GiftDynamicField.GiftPanelBanner giftPanelBanner) {
        LJ(giftPanelBanner);
    }

    @Override // X.C0IMD
    public final GiftPage.GiftDynamicField.GiftPanelBanner LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftPage.GiftDynamicField.GiftPanelBanner giftPanelBanner, List list) {
    }
}
