package tikcast.linkmic.common;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;

/* JADX INFO: loaded from: classes18.dex */
public final class _MultiGuestLayoutNonSeiExtra_ProtoEncoder implements InterfaceC1132110fZB<MultiGuestLayoutNonSeiExtra> {
    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, MultiGuestLayoutNonSeiExtra multiGuestLayoutNonSeiExtra) {
        SocialGameLayoutNonSeiExtra socialGameLayoutNonSeiExtra = multiGuestLayoutNonSeiExtra.socialGame;
        if (socialGameLayoutNonSeiExtra != null) {
            c1142350fph.LIZLLL(1, 2);
            c1142350fph.LJ(C1142340fpg.LJIILL(1, socialGameLayoutNonSeiExtra.justDanceSongTitle));
            C1142340fpg.LJFF(c1142350fph, 1, socialGameLayoutNonSeiExtra.justDanceSongTitle);
        }
    }
}
