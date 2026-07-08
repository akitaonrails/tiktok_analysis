package com.bytedance.android.livesdk.gift.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.gift.model.GiftEffectAckResponse;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GiftEffectAckResponse_Data_ProtoDecoder implements C0IMD<GiftEffectAckResponse.Data> {
    @Override // X.C0IMD
    public final GiftEffectAckResponse.Data LIZJ(C1516680pZS c1516680pZS) throws IOException {
        GiftEffectAckResponse.Data data = new GiftEffectAckResponse.Data();
        long jLIZJ = c1516680pZS.LIZJ();
        while (c1516680pZS.LJI() != -1) {
            C1516700pZU.LJ(c1516680pZS);
        }
        c1516680pZS.LJ(jLIZJ);
        return data;
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(GiftEffectAckResponse.Data data) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftEffectAckResponse.Data data, List list) {
    }
}
