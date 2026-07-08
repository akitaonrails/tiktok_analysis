package com.bytedance.android.livesdk.viewer_picks.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GiftPickExtraGameInteractionExternal_ProtoDecoder implements C0IMD<GiftPickExtraGameInteractionExternal> {
    @Override // X.C0IMD
    public final GiftPickExtraGameInteractionExternal LIZJ(C1516680pZS c1516680pZS) throws IOException {
        GiftPickExtraGameInteractionExternal giftPickExtraGameInteractionExternal = new GiftPickExtraGameInteractionExternal();
        long jLIZJ = c1516680pZS.LIZJ();
        while (c1516680pZS.LJI() != -1) {
            C1516700pZU.LJ(c1516680pZS);
        }
        c1516680pZS.LJ(jLIZJ);
        return giftPickExtraGameInteractionExternal;
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(GiftPickExtraGameInteractionExternal giftPickExtraGameInteractionExternal) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftPickExtraGameInteractionExternal giftPickExtraGameInteractionExternal, List list) {
    }
}
