package com.bytedance.android.livesdk.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.model.Gift;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _Gift_GiftSkin_ProtoDecoder implements C0IMD<Gift.GiftSkin> {
    public static Gift.GiftSkin LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        Gift.GiftSkin giftSkin = new Gift.GiftSkin();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                C1516700pZU.LJ(c1516680pZS);
                            } else {
                                giftSkin.animatedImage = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            giftSkin.staticImage = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        giftSkin.giftSkinName = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    giftSkin.giftSkinId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return giftSkin;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(Gift.GiftSkin giftSkin) {
        Gift.GiftSkin giftSkin2 = giftSkin;
        ImageModel imageModel = giftSkin2.staticImage;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        ImageModel imageModel2 = giftSkin2.animatedImage;
        if (imageModel2 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel2);
        }
    }

    @Override // X.C0IMD
    public final Gift.GiftSkin LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, Gift.GiftSkin giftSkin, List list) {
    }
}
