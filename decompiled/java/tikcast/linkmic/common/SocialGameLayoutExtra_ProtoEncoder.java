package tikcast.linkmic.common;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;

/* JADX INFO: loaded from: classes18.dex */
public final class SocialGameLayoutExtra_ProtoEncoder implements InterfaceC1132110fZB<SocialGameLayoutExtra> {
    public static void LIZIZ(C1142350fph c1142350fph, SocialGameLayoutExtra socialGameLayoutExtra) {
        int i = socialGameLayoutExtra.gameId;
        c1142350fph.LIZLLL(1, 0);
        c1142350fph.LIZJ(i);
        int i2 = socialGameLayoutExtra.gameJustDanceStatus;
        c1142350fph.LIZLLL(2, 0);
        c1142350fph.LIZJ(i2);
        long j = socialGameLayoutExtra.gameSessionId;
        c1142350fph.LIZLLL(3, 0);
        c1142350fph.LJFF(j);
        long j2 = socialGameLayoutExtra.gameStartPlayMs;
        c1142350fph.LIZLLL(4, 0);
        c1142350fph.LJFF(j2);
        long j3 = socialGameLayoutExtra.gameOptionId;
        c1142350fph.LIZLLL(5, 0);
        c1142350fph.LJFF(j3);
        C1142340fpg.LJFF(c1142350fph, 6, socialGameLayoutExtra.lokiPanelName);
        C1142340fpg.LJFF(c1142350fph, 7, socialGameLayoutExtra.requiredLokiResourceId);
        C1142340fpg.LJFF(c1142350fph, 8, socialGameLayoutExtra.optionalLokiResourceId);
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, SocialGameLayoutExtra socialGameLayoutExtra) {
        LIZIZ(c1142350fph, socialGameLayoutExtra);
    }
}
