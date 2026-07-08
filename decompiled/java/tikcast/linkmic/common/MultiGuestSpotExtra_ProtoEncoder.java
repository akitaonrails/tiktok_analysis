package tikcast.linkmic.common;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;

/* JADX INFO: loaded from: classes34.dex */
public final class MultiGuestSpotExtra_ProtoEncoder implements InterfaceC1132110fZB<MultiGuestSpotExtra> {
    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, MultiGuestSpotExtra multiGuestSpotExtra) {
        MultiGuestSpotExtra multiGuestSpotExtra2 = multiGuestSpotExtra;
        boolean z = multiGuestSpotExtra2.isEnlarged;
        c1142350fph.LIZLLL(1, 0);
        c1142350fph.LJ(z ? 1 : 0);
        boolean z2 = multiGuestSpotExtra2.isSingleZoomEnabled;
        c1142350fph.LIZLLL(2, 0);
        c1142350fph.LJ(z2 ? 1 : 0);
        boolean z3 = multiGuestSpotExtra2.isDoubleZoomEnabled;
        c1142350fph.LIZLLL(3, 0);
        c1142350fph.LJ(z3 ? 1 : 0);
        boolean z4 = multiGuestSpotExtra2.isSwitchSpotEnabled;
        c1142350fph.LIZLLL(4, 0);
        c1142350fph.LJ(z4 ? 1 : 0);
        int i = multiGuestSpotExtra2.spotRank;
        c1142350fph.LIZLLL(5, 0);
        c1142350fph.LIZJ(i);
        int i2 = multiGuestSpotExtra2.contentPositionType;
        c1142350fph.LIZLLL(6, 0);
        c1142350fph.LIZJ(i2);
        SocialGameUserSpotExtra socialGameUserSpotExtra = multiGuestSpotExtra2.socialGameUser;
        if (socialGameUserSpotExtra != null) {
            c1142350fph.LIZLLL(7, 2);
            c1142350fph.LJ(C1142340fpg.LJIIIZ(1, socialGameUserSpotExtra.gameJustDanceUserStatus) + C1142340fpg.LJI(2) + C1142340fpg.LJI(3));
            SocialGameUserSpotExtra_ProtoEncoder.LIZIZ(c1142350fph, socialGameUserSpotExtra);
        }
    }
}
