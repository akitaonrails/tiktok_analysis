package com.bytedance.android.livesdk.gift.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model.GiftRecord;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GiftRecord_Gift_ProtoDecoder implements C0IMD<GiftRecord.Gift> {
    public static GiftRecord.Gift LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GiftRecord.Gift gift = new GiftRecord.Gift();
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
                                    gift.diamonds = c1516680pZS.LJIIJJI();
                                }
                            } else {
                                gift.giftCount = c1516680pZS.LJIIJ();
                            }
                        } else {
                            gift.image = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        gift.name = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    gift.id = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return gift;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GiftRecord.Gift gift) {
        ImageModel imageModel = gift.image;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final GiftRecord.Gift LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftRecord.Gift gift, List list) {
    }
}
