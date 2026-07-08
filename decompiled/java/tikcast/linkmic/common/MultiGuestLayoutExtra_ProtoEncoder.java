package tikcast.linkmic.common;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;

/* JADX INFO: loaded from: classes18.dex */
public final class MultiGuestLayoutExtra_ProtoEncoder implements InterfaceC1132110fZB<MultiGuestLayoutExtra> {
    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, MultiGuestLayoutExtra multiGuestLayoutExtra) {
        MultiGuestLayoutExtra multiGuestLayoutExtra2 = multiGuestLayoutExtra;
        int i = multiGuestLayoutExtra2.originLayoutStyle;
        c1142350fph.LIZLLL(1, 0);
        c1142350fph.LIZJ(i);
        int i2 = multiGuestLayoutExtra2.currentLayoutStyle;
        c1142350fph.LIZLLL(2, 0);
        c1142350fph.LIZJ(i2);
        int i3 = multiGuestLayoutExtra2.originMaxPosition;
        c1142350fph.LIZLLL(3, 0);
        c1142350fph.LIZJ(i3);
        int i4 = multiGuestLayoutExtra2.currentMaxPosition;
        c1142350fph.LIZLLL(4, 0);
        c1142350fph.LIZJ(i4);
        int i5 = multiGuestLayoutExtra2.enlargeStatus;
        c1142350fph.LIZLLL(5, 0);
        c1142350fph.LIZJ(i5);
        int i6 = multiGuestLayoutExtra2.currentPanelLayoutType;
        c1142350fph.LIZLLL(6, 0);
        c1142350fph.LIZJ(i6);
        SocialGameLayoutExtra socialGameLayoutExtra = multiGuestLayoutExtra2.socialGame;
        if (socialGameLayoutExtra != null) {
            c1142350fph.LIZLLL(7, 2);
            c1142350fph.LJ(C1142340fpg.LJIIIZ(1, socialGameLayoutExtra.gameId) + C1142340fpg.LJIIIZ(2, socialGameLayoutExtra.gameJustDanceStatus) + C1142340fpg.LJIIL(3, socialGameLayoutExtra.gameSessionId) + C1142340fpg.LJIIL(4, socialGameLayoutExtra.gameStartPlayMs) + C1142340fpg.LJIIL(5, socialGameLayoutExtra.gameOptionId) + C1142340fpg.LJIILL(6, socialGameLayoutExtra.lokiPanelName) + C1142340fpg.LJIILL(7, socialGameLayoutExtra.requiredLokiResourceId) + C1142340fpg.LJIILL(8, socialGameLayoutExtra.optionalLokiResourceId));
            SocialGameLayoutExtra_ProtoEncoder.LIZIZ(c1142350fph, socialGameLayoutExtra);
        }
    }
}
