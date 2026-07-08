package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GiveawayInfo_ProtoDecoder implements C0IMD<GiveawayInfo> {
    public static GiveawayInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GiveawayInfo giveawayInfo = new GiveawayInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        giveawayInfo.product = _Product_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    giveawayInfo.winner = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return giveawayInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GiveawayInfo giveawayInfo) {
        ImageModel imageModel;
        GiveawayInfo giveawayInfo2 = giveawayInfo;
        User user = giveawayInfo2.winner;
        if (user != null) {
            _User_ProtoDecoder.LJ(user);
        }
        Product product = giveawayInfo2.product;
        if (product != null && (imageModel = product.cover) != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final GiveawayInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiveawayInfo giveawayInfo, List list) {
    }
}
