package tikcast.linkmic.common;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;

/* JADX INFO: loaded from: classes18.dex */
public final class _MultiGuestSpotNonSeiExtra_ProtoEncoder implements InterfaceC1132110fZB<MultiGuestSpotNonSeiExtra> {
    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, MultiGuestSpotNonSeiExtra multiGuestSpotNonSeiExtra) {
        SocialGameUserSpotNonSeiExtra socialGameUserSpotNonSeiExtra = multiGuestSpotNonSeiExtra.socialGameUser;
        if (socialGameUserSpotNonSeiExtra != null) {
            c1142350fph.LIZLLL(1, 2);
            c1142350fph.LJ(C1142340fpg.LJIIIZ(1, socialGameUserSpotNonSeiExtra.gameScore));
            int i = socialGameUserSpotNonSeiExtra.gameScore;
            c1142350fph.LIZLLL(1, 0);
            c1142350fph.LIZJ(i);
        }
    }
}
