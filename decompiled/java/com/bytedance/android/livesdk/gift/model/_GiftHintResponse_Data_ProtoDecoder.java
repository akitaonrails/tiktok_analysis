package com.bytedance.android.livesdk.gift.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model.GiftHintResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GiftHintResponse_Data_ProtoDecoder implements C0IMD<GiftHintResponse.Data> {
    public static GiftHintResponse.Data LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GiftHintResponse.Data data = new GiftHintResponse.Data();
        data.hints = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    data.hints.add(_GiftHintInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return data;
            }
        }
    }

    public static void LJ(GiftHintResponse.Data data) {
        ImageModel imageModel;
        List<GiftHintInfo> list = data.hints;
        if (list == null) {
            data.hints = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (GiftHintInfo giftHintInfo : data.hints) {
            if (giftHintInfo != null && (imageModel = giftHintInfo.hintIcon) != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GiftHintResponse.Data data) {
        LJ(data);
    }

    @Override // X.C0IMD
    public final GiftHintResponse.Data LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftHintResponse.Data data, List list) {
    }
}
