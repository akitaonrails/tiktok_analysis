package com.bytedance.android.livesdk.gift.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GiftPollInfo_ProtoDecoder implements C0IMD<GiftPollInfo> {
    public static GiftPollInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GiftPollInfo giftPollInfo = new GiftPollInfo();
        giftPollInfo.giftPollOptions = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    giftPollInfo.giftPollOptions.add(_GiftPollOption_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return giftPollInfo;
            }
        }
    }

    public static void LJ(GiftPollInfo giftPollInfo) {
        ImageModel imageModel;
        List<GiftPollOption> list = giftPollInfo.giftPollOptions;
        if (list == null) {
            giftPollInfo.giftPollOptions = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (GiftPollOption giftPollOption : giftPollInfo.giftPollOptions) {
            if (giftPollOption != null && (imageModel = giftPollOption.resultImage) != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GiftPollInfo giftPollInfo) {
        LJ(giftPollInfo);
    }

    @Override // X.C0IMD
    public final GiftPollInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftPollInfo giftPollInfo, List list) {
    }
}
