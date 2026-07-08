package com.bytedance.android.livesdk.gift.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GiftComboInfo_ProtoDecoder implements C0IMD<GiftComboInfo> {
    public static GiftComboInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GiftComboInfo giftComboInfo = new GiftComboInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        giftComboInfo.comboEffectImg = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    giftComboInfo.comboCount = Integer.valueOf(c1516680pZS.LJIIJ());
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return giftComboInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GiftComboInfo giftComboInfo) {
        ImageModel imageModel = giftComboInfo.comboEffectImg;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final GiftComboInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftComboInfo giftComboInfo, List list) {
    }
}
