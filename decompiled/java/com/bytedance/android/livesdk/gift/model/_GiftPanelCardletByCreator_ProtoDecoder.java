package com.bytedance.android.livesdk.gift.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model.GiftPanelCardletByCreator;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GiftPanelCardletByCreator_ProtoDecoder implements C0IMD<GiftPanelCardletByCreator> {
    public static GiftPanelCardletByCreator LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GiftPanelCardletByCreator giftPanelCardletByCreator = new GiftPanelCardletByCreator();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        giftPanelCardletByCreator.displayText = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        giftPanelCardletByCreator.schemaUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        giftPanelCardletByCreator.cardletPriority = c1516680pZS.LJIIJ();
                        break;
                    case 4:
                        giftPanelCardletByCreator.cardletType = c1516680pZS.LJIIJ();
                        break;
                    case 5:
                        giftPanelCardletByCreator.cardletButton = _GiftPanelCardletByCreator_CardletButton_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        giftPanelCardletByCreator.cardletIcon = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        giftPanelCardletByCreator.copywritingType = c1516680pZS.LJIIJ();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return giftPanelCardletByCreator;
            }
        }
    }

    public static void LJ(GiftPanelCardletByCreator giftPanelCardletByCreator) {
        ImageModel imageModel;
        Text text = giftPanelCardletByCreator.displayText;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
        GiftPanelCardletByCreator.CardletButton cardletButton = giftPanelCardletByCreator.cardletButton;
        if (cardletButton != null && (imageModel = cardletButton.leftIcon) != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        ImageModel imageModel2 = giftPanelCardletByCreator.cardletIcon;
        if (imageModel2 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel2);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GiftPanelCardletByCreator giftPanelCardletByCreator) {
        LJ(giftPanelCardletByCreator);
    }

    @Override // X.C0IMD
    public final GiftPanelCardletByCreator LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftPanelCardletByCreator giftPanelCardletByCreator, List list) {
    }
}
