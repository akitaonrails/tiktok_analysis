package tikcast.linkmic.common;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;

/* JADX INFO: loaded from: classes34.dex */
public final class _SocialGameUserSpotExtra_ProtoEncoder implements InterfaceC1132110fZB<SocialGameUserSpotExtra> {
    public static int LIZJ(SocialGameUserSpotExtra socialGameUserSpotExtra) {
        return C1142340fpg.LJIIIZ(1, socialGameUserSpotExtra.gameJustDanceUserStatus) + C1142340fpg.LJI(2) + C1142340fpg.LJI(3);
    }

    public static void LIZIZ(C1142350fph c1142350fph, SocialGameUserSpotExtra socialGameUserSpotExtra) {
        int i = socialGameUserSpotExtra.gameJustDanceUserStatus;
        c1142350fph.LIZLLL(1, 0);
        c1142350fph.LIZJ(i);
        boolean z = socialGameUserSpotExtra.isEnlarged;
        c1142350fph.LIZLLL(2, 0);
        c1142350fph.LJ(z ? 1 : 0);
        boolean z2 = socialGameUserSpotExtra.isMainContent;
        c1142350fph.LIZLLL(3, 0);
        c1142350fph.LJ(z2 ? 1 : 0);
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, SocialGameUserSpotExtra socialGameUserSpotExtra) {
        LIZIZ(c1142350fph, socialGameUserSpotExtra);
    }
}
