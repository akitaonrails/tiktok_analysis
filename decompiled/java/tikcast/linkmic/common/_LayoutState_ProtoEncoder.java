package tikcast.linkmic.common;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;

/* JADX INFO: loaded from: classes18.dex */
public final class _LayoutState_ProtoEncoder implements InterfaceC1132110fZB<LayoutState> {
    public static void LIZIZ(C1142350fph c1142350fph, LayoutState layoutState) {
        int iLIZIZ;
        C1142340fpg.LJFF(c1142350fph, 1, layoutState.layoutId);
        C1142340fpg.LJFF(c1142350fph, 2, layoutState.layoutKey);
        MultiGuestLayoutExtra multiGuestLayoutExtra = layoutState.multiGuestLayoutExtra;
        if (multiGuestLayoutExtra != null) {
            c1142350fph.LIZLLL(3, 2);
            c1142350fph.LJ(_MultiGuestLayoutExtra_ProtoEncoder.LIZJ(multiGuestLayoutExtra));
            _MultiGuestLayoutExtra_ProtoEncoder.LIZIZ(c1142350fph, multiGuestLayoutExtra);
        }
        MultiGuestLayoutNonSeiExtra multiGuestLayoutNonSeiExtra = layoutState.multiGuestLayoutNonSeiExtra;
        if (multiGuestLayoutNonSeiExtra != null) {
            c1142350fph.LIZLLL(4, 2);
            SocialGameLayoutNonSeiExtra socialGameLayoutNonSeiExtra = multiGuestLayoutNonSeiExtra.socialGame;
            if (socialGameLayoutNonSeiExtra == null) {
                iLIZIZ = 0;
            } else {
                int iLJIILL = C1142340fpg.LJIILL(1, socialGameLayoutNonSeiExtra.justDanceSongTitle);
                iLIZIZ = iLJIILL + C1142350fph.LIZIZ(iLJIILL) + C1142350fph.LIZ(1);
            }
            c1142350fph.LJ(iLIZIZ);
            SocialGameLayoutNonSeiExtra socialGameLayoutNonSeiExtra2 = multiGuestLayoutNonSeiExtra.socialGame;
            if (socialGameLayoutNonSeiExtra2 != null) {
                c1142350fph.LIZLLL(1, 2);
                c1142350fph.LJ(C1142340fpg.LJIILL(1, socialGameLayoutNonSeiExtra2.justDanceSongTitle));
                C1142340fpg.LJFF(c1142350fph, 1, socialGameLayoutNonSeiExtra2.justDanceSongTitle);
            }
        }
        CohostTypeLayoutExtra cohostTypeLayoutExtra = layoutState.cohostLayoutExtra;
        if (cohostTypeLayoutExtra != null) {
            c1142350fph.LIZLLL(5, 2);
            c1142350fph.LJ(_CohostTypeLayoutExtra_ProtoEncoder.LIZJ(cohostTypeLayoutExtra));
            _CohostTypeLayoutExtra_ProtoEncoder.LIZIZ(c1142350fph, cohostTypeLayoutExtra);
        }
        if (layoutState.cohostLayoutNonSeiExtra != null) {
            c1142350fph.LIZLLL(6, 2);
            c1142350fph.LJ(0);
        }
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, LayoutState layoutState) {
        LIZIZ(c1142350fph, layoutState);
    }
}
