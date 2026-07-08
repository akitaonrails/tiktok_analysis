package com.bytedance.android.livesdk.minute_game.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _TriggerGift_ProtoDecoder implements C0IMD<TriggerGift> {
    public static TriggerGift LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        TriggerGift triggerGift = new TriggerGift();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        triggerGift.image = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    triggerGift.giftId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return triggerGift;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(TriggerGift triggerGift) {
        ImageModel imageModel = triggerGift.image;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final TriggerGift LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, TriggerGift triggerGift, List list) {
    }
}
