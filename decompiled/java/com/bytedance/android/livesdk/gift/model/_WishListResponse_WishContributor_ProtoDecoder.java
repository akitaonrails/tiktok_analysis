package com.bytedance.android.livesdk.gift.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model.WishListResponse;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _WishListResponse_WishContributor_ProtoDecoder implements C0IMD<WishListResponse.WishContributor> {
    public static WishListResponse.WishContributor LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        WishListResponse.WishContributor wishContributor = new WishListResponse.WishContributor();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        wishContributor.userId = Long.valueOf(c1516680pZS.LJIIJJI());
                        break;
                    case 2:
                        wishContributor.secUserId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        wishContributor.avatar = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        wishContributor.displayId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        wishContributor.score = Long.valueOf(c1516680pZS.LJIIJJI());
                        break;
                    case 6:
                        wishContributor.userIdStr = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return wishContributor;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(WishListResponse.WishContributor wishContributor) {
        ImageModel imageModel = wishContributor.avatar;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final WishListResponse.WishContributor LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, WishListResponse.WishContributor wishContributor, List list) {
    }
}
