package tikcast.linkmic.common;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;

/* JADX INFO: loaded from: classes34.dex */
public final class _MultiGuestSpotExtra_ProtoEncoder implements InterfaceC1132110fZB<MultiGuestSpotExtra> {
    public static int LIZJ(MultiGuestSpotExtra multiGuestSpotExtra) {
        int iLIZ = 0;
        int iLJI = C1142340fpg.LJI(1) + C1142340fpg.LJI(2) + C1142340fpg.LJI(3) + C1142340fpg.LJI(4) + C1142340fpg.LJIIIZ(5, multiGuestSpotExtra.spotRank) + C1142340fpg.LJIIIZ(6, multiGuestSpotExtra.contentPositionType);
        SocialGameUserSpotExtra socialGameUserSpotExtra = multiGuestSpotExtra.socialGameUser;
        if (socialGameUserSpotExtra != null) {
            int iLIZJ = _SocialGameUserSpotExtra_ProtoEncoder.LIZJ(socialGameUserSpotExtra);
            iLIZ = C1142350fph.LIZ(7) + iLIZJ + C1142350fph.LIZIZ(iLIZJ);
        }
        return iLJI + iLIZ;
    }

    public static void LIZIZ(C1142350fph c1142350fph, MultiGuestSpotExtra multiGuestSpotExtra) {
        boolean z = multiGuestSpotExtra.isEnlarged;
        c1142350fph.LIZLLL(1, 0);
        c1142350fph.LJ(z ? 1 : 0);
        boolean z2 = multiGuestSpotExtra.isSingleZoomEnabled;
        c1142350fph.LIZLLL(2, 0);
        c1142350fph.LJ(z2 ? 1 : 0);
        boolean z3 = multiGuestSpotExtra.isDoubleZoomEnabled;
        c1142350fph.LIZLLL(3, 0);
        c1142350fph.LJ(z3 ? 1 : 0);
        boolean z4 = multiGuestSpotExtra.isSwitchSpotEnabled;
        c1142350fph.LIZLLL(4, 0);
        c1142350fph.LJ(z4 ? 1 : 0);
        int i = multiGuestSpotExtra.spotRank;
        c1142350fph.LIZLLL(5, 0);
        c1142350fph.LIZJ(i);
        int i2 = multiGuestSpotExtra.contentPositionType;
        c1142350fph.LIZLLL(6, 0);
        c1142350fph.LIZJ(i2);
        SocialGameUserSpotExtra socialGameUserSpotExtra = multiGuestSpotExtra.socialGameUser;
        if (socialGameUserSpotExtra != null) {
            c1142350fph.LIZLLL(7, 2);
            c1142350fph.LJ(_SocialGameUserSpotExtra_ProtoEncoder.LIZJ(socialGameUserSpotExtra));
            _SocialGameUserSpotExtra_ProtoEncoder.LIZIZ(c1142350fph, socialGameUserSpotExtra);
        }
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, MultiGuestSpotExtra multiGuestSpotExtra) {
        LIZIZ(c1142350fph, multiGuestSpotExtra);
    }
}
