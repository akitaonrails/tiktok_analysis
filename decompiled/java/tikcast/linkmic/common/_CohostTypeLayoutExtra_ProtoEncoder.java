package tikcast.linkmic.common;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;

/* JADX INFO: loaded from: classes18.dex */
public final class _CohostTypeLayoutExtra_ProtoEncoder implements InterfaceC1132110fZB<CohostTypeLayoutExtra> {
    public static int LIZJ(CohostTypeLayoutExtra cohostTypeLayoutExtra) {
        return C1142340fpg.LJIIIZ(1, cohostTypeLayoutExtra.isZoomLayout) + C1142340fpg.LJIIIZ(2, cohostTypeLayoutExtra.offsetY) + C1142340fpg.LJIIIZ(3, cohostTypeLayoutExtra.scene) + C1142340fpg.LJI(4) + C1142340fpg.LJIIIZ(5, cohostTypeLayoutExtra.isEnlargeMode) + C1142340fpg.LJI(6) + C1142340fpg.LJIIIZ(7, cohostTypeLayoutExtra.rematchSpotId);
    }

    public static void LIZIZ(C1142350fph c1142350fph, CohostTypeLayoutExtra cohostTypeLayoutExtra) {
        int i = cohostTypeLayoutExtra.isZoomLayout;
        c1142350fph.LIZLLL(1, 0);
        c1142350fph.LIZJ(i);
        int i2 = cohostTypeLayoutExtra.offsetY;
        c1142350fph.LIZLLL(2, 0);
        c1142350fph.LIZJ(i2);
        int i3 = cohostTypeLayoutExtra.scene;
        c1142350fph.LIZLLL(3, 0);
        c1142350fph.LIZJ(i3);
        boolean z = cohostTypeLayoutExtra.localLayoutOnly;
        c1142350fph.LIZLLL(4, 0);
        c1142350fph.LJ(z ? 1 : 0);
        int i4 = cohostTypeLayoutExtra.isEnlargeMode;
        c1142350fph.LIZLLL(5, 0);
        c1142350fph.LIZJ(i4);
        boolean z2 = cohostTypeLayoutExtra.disableMatchComponent;
        c1142350fph.LIZLLL(6, 0);
        c1142350fph.LJ(z2 ? 1 : 0);
        int i5 = cohostTypeLayoutExtra.rematchSpotId;
        c1142350fph.LIZLLL(7, 0);
        c1142350fph.LIZJ(i5);
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, CohostTypeLayoutExtra cohostTypeLayoutExtra) {
        LIZIZ(c1142350fph, cohostTypeLayoutExtra);
    }
}
