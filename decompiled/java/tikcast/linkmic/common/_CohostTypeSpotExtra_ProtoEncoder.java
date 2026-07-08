package tikcast.linkmic.common;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;

/* JADX INFO: loaded from: classes18.dex */
public final class _CohostTypeSpotExtra_ProtoEncoder implements InterfaceC1132110fZB<CohostTypeSpotExtra> {
    public static int LIZJ(CohostTypeSpotExtra cohostTypeSpotExtra) {
        return C1142340fpg.LJI(1) + C1142340fpg.LJIIIZ(2, cohostTypeSpotExtra.contentType) + C1142340fpg.LJIIIZ(3, cohostTypeSpotExtra.preEnlargeSpotId);
    }

    public static void LIZIZ(C1142350fph c1142350fph, CohostTypeSpotExtra cohostTypeSpotExtra) {
        boolean z = cohostTypeSpotExtra.isEnlarged;
        c1142350fph.LIZLLL(1, 0);
        c1142350fph.LJ(z ? 1 : 0);
        int i = cohostTypeSpotExtra.contentType;
        c1142350fph.LIZLLL(2, 0);
        c1142350fph.LIZJ(i);
        int i2 = cohostTypeSpotExtra.preEnlargeSpotId;
        c1142350fph.LIZLLL(3, 0);
        c1142350fph.LIZJ(i2);
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, CohostTypeSpotExtra cohostTypeSpotExtra) {
        LIZIZ(c1142350fph, cohostTypeSpotExtra);
    }
}
