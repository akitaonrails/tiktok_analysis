package com.bytedance.android.livesdkapi.depend.model.live;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _EcommerceRoomHeadTag_ProtoDecoder implements C0IMD<EcommerceRoomHeadTag> {
    public static EcommerceRoomHeadTag LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        EcommerceRoomHeadTag ecommerceRoomHeadTag = new EcommerceRoomHeadTag();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            ecommerceRoomHeadTag.daInfo = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        ecommerceRoomHeadTag.icon = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    ecommerceRoomHeadTag.text = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return ecommerceRoomHeadTag;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(EcommerceRoomHeadTag ecommerceRoomHeadTag) {
        ImageModel imageModel = ecommerceRoomHeadTag.icon;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final EcommerceRoomHeadTag LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, EcommerceRoomHeadTag ecommerceRoomHeadTag, List list) {
    }
}
