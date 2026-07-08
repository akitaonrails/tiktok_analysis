package tikcast.linkmic.common;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;

/* JADX INFO: loaded from: classes18.dex */
public final class _MultiGuestLayoutExtra_ProtoEncoder implements InterfaceC1132110fZB<MultiGuestLayoutExtra> {
    public static int LIZJ(MultiGuestLayoutExtra multiGuestLayoutExtra) {
        int iLIZ = 0;
        int iLJIIIZ = C1142340fpg.LJIIIZ(1, multiGuestLayoutExtra.originLayoutStyle) + C1142340fpg.LJIIIZ(2, multiGuestLayoutExtra.currentLayoutStyle) + C1142340fpg.LJIIIZ(3, multiGuestLayoutExtra.originMaxPosition) + C1142340fpg.LJIIIZ(4, multiGuestLayoutExtra.currentMaxPosition) + C1142340fpg.LJIIIZ(5, multiGuestLayoutExtra.enlargeStatus) + C1142340fpg.LJIIIZ(6, multiGuestLayoutExtra.currentPanelLayoutType);
        SocialGameLayoutExtra socialGameLayoutExtra = multiGuestLayoutExtra.socialGame;
        if (socialGameLayoutExtra != null) {
            int iLIZJ = _SocialGameLayoutExtra_ProtoEncoder.LIZJ(socialGameLayoutExtra);
            iLIZ = C1142350fph.LIZ(7) + iLIZJ + C1142350fph.LIZIZ(iLIZJ);
        }
        return iLJIIIZ + iLIZ;
    }

    public static void LIZIZ(C1142350fph c1142350fph, MultiGuestLayoutExtra multiGuestLayoutExtra) {
        int i = multiGuestLayoutExtra.originLayoutStyle;
        c1142350fph.LIZLLL(1, 0);
        c1142350fph.LIZJ(i);
        int i2 = multiGuestLayoutExtra.currentLayoutStyle;
        c1142350fph.LIZLLL(2, 0);
        c1142350fph.LIZJ(i2);
        int i3 = multiGuestLayoutExtra.originMaxPosition;
        c1142350fph.LIZLLL(3, 0);
        c1142350fph.LIZJ(i3);
        int i4 = multiGuestLayoutExtra.currentMaxPosition;
        c1142350fph.LIZLLL(4, 0);
        c1142350fph.LIZJ(i4);
        int i5 = multiGuestLayoutExtra.enlargeStatus;
        c1142350fph.LIZLLL(5, 0);
        c1142350fph.LIZJ(i5);
        int i6 = multiGuestLayoutExtra.currentPanelLayoutType;
        c1142350fph.LIZLLL(6, 0);
        c1142350fph.LIZJ(i6);
        SocialGameLayoutExtra socialGameLayoutExtra = multiGuestLayoutExtra.socialGame;
        if (socialGameLayoutExtra != null) {
            c1142350fph.LIZLLL(7, 2);
            c1142350fph.LJ(_SocialGameLayoutExtra_ProtoEncoder.LIZJ(socialGameLayoutExtra));
            _SocialGameLayoutExtra_ProtoEncoder.LIZIZ(c1142350fph, socialGameLayoutExtra);
        }
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, MultiGuestLayoutExtra multiGuestLayoutExtra) {
        LIZIZ(c1142350fph, multiGuestLayoutExtra);
    }
}
