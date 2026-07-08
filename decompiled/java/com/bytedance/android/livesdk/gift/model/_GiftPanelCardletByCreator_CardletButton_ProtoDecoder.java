package com.bytedance.android.livesdk.gift.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model.GiftPanelCardletByCreator;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GiftPanelCardletByCreator_CardletButton_ProtoDecoder implements C0IMD<GiftPanelCardletByCreator.CardletButton> {
    public static GiftPanelCardletByCreator.CardletButton LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GiftPanelCardletByCreator.CardletButton cardletButton = new GiftPanelCardletByCreator.CardletButton();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                if (iLJI != 5) {
                                    C1516700pZU.LJ(c1516680pZS);
                                } else {
                                    cardletButton.buttonPriority = c1516680pZS.LJIIJ();
                                }
                            } else {
                                cardletButton.buttonType = c1516680pZS.LJIIJ();
                            }
                        } else {
                            cardletButton.schema = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        cardletButton.text = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    cardletButton.leftIcon = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return cardletButton;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GiftPanelCardletByCreator.CardletButton cardletButton) {
        ImageModel imageModel = cardletButton.leftIcon;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final GiftPanelCardletByCreator.CardletButton LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftPanelCardletByCreator.CardletButton cardletButton, List list) {
    }
}
