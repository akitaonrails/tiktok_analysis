package com.bytedance.android.livesdk.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _RandomGiftBubble_ProtoDecoder implements C0IMD<RandomGiftBubble> {
    public static RandomGiftBubble LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        RandomGiftBubble randomGiftBubble = new RandomGiftBubble();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        randomGiftBubble.image = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    randomGiftBubble.bubbleDisplayText = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return randomGiftBubble;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(RandomGiftBubble randomGiftBubble) {
        ImageModel imageModel = randomGiftBubble.image;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final RandomGiftBubble LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RandomGiftBubble randomGiftBubble, List list) {
    }
}
