package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GiftModeMeta_ProtoDecoder implements C0IMD<GiftModeMeta> {
    public static GiftModeMeta LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GiftModeMeta giftModeMeta = new GiftModeMeta();
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
                                giftModeMeta.giftModeDesc = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            giftModeMeta.giftIconImage = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        giftModeMeta.giftNameKey = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    giftModeMeta.giftId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return giftModeMeta;
            }
        }
    }

    public static void LJ(GiftModeMeta giftModeMeta) {
        ImageModel imageModel = giftModeMeta.giftIconImage;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        Text text = giftModeMeta.giftModeDesc;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GiftModeMeta giftModeMeta) {
        LJ(giftModeMeta);
    }

    @Override // X.C0IMD
    public final GiftModeMeta LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftModeMeta giftModeMeta, List list) {
    }
}
