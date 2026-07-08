package tikcast.linkmic.common;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;

/* JADX INFO: loaded from: classes18.dex */
public final class _SpotInfo_ProtoEncoder implements InterfaceC1132110fZB<SpotInfo> {
    public static void LIZIZ(C1142350fph c1142350fph, SpotInfo spotInfo) {
        int iLIZIZ;
        int i = spotInfo.spotId;
        c1142350fph.LIZLLL(1, 0);
        c1142350fph.LIZJ(i);
        PosIdentity posIdentity = spotInfo.posIdentity;
        if (posIdentity != null) {
            c1142350fph.LIZLLL(2, 2);
            c1142350fph.LJ(C1142340fpg.LJIIIZ(1, posIdentity.type) + C1142340fpg.LJIILL(2, posIdentity.value));
            int i2 = posIdentity.type;
            c1142350fph.LIZLLL(1, 0);
            c1142350fph.LIZJ(i2);
            C1142340fpg.LJFF(c1142350fph, 2, posIdentity.value);
        }
        MultiGuestSpotExtra multiGuestSpotExtra = spotInfo.multiGuestSpotExtra;
        if (multiGuestSpotExtra != null) {
            c1142350fph.LIZLLL(3, 2);
            c1142350fph.LJ(_MultiGuestSpotExtra_ProtoEncoder.LIZJ(multiGuestSpotExtra));
            _MultiGuestSpotExtra_ProtoEncoder.LIZIZ(c1142350fph, multiGuestSpotExtra);
        }
        MultiGuestSpotNonSeiExtra multiGuestSpotNonSeiExtra = spotInfo.multiGuestSpotNonSeiExtra;
        if (multiGuestSpotNonSeiExtra != null) {
            c1142350fph.LIZLLL(4, 2);
            SocialGameUserSpotNonSeiExtra socialGameUserSpotNonSeiExtra = multiGuestSpotNonSeiExtra.socialGameUser;
            if (socialGameUserSpotNonSeiExtra == null) {
                iLIZIZ = 0;
            } else {
                int iLJIIIZ = C1142340fpg.LJIIIZ(1, socialGameUserSpotNonSeiExtra.gameScore);
                iLIZIZ = iLJIIIZ + C1142350fph.LIZIZ(iLJIIIZ) + C1142350fph.LIZ(1);
            }
            c1142350fph.LJ(iLIZIZ);
            SocialGameUserSpotNonSeiExtra socialGameUserSpotNonSeiExtra2 = multiGuestSpotNonSeiExtra.socialGameUser;
            if (socialGameUserSpotNonSeiExtra2 != null) {
                c1142350fph.LIZLLL(1, 2);
                c1142350fph.LJ(C1142340fpg.LJIIIZ(1, socialGameUserSpotNonSeiExtra2.gameScore));
                int i3 = socialGameUserSpotNonSeiExtra2.gameScore;
                c1142350fph.LIZLLL(1, 0);
                c1142350fph.LIZJ(i3);
            }
        }
        CohostTypeSpotExtra cohostTypeSpotExtra = spotInfo.cohostSpotExtra;
        if (cohostTypeSpotExtra != null) {
            c1142350fph.LIZLLL(5, 2);
            c1142350fph.LJ(_CohostTypeSpotExtra_ProtoEncoder.LIZJ(cohostTypeSpotExtra));
            _CohostTypeSpotExtra_ProtoEncoder.LIZIZ(c1142350fph, cohostTypeSpotExtra);
        }
        if (spotInfo.cohostSpotNonSeiExtra != null) {
            c1142350fph.LIZLLL(6, 2);
            c1142350fph.LJ(0);
        }
        PosIdentityExtra posIdentityExtra = spotInfo.posIdentityExtra;
        if (posIdentityExtra != null) {
            c1142350fph.LIZLLL(7, 2);
            c1142350fph.LJ(C1142340fpg.LJIILL(1, posIdentityExtra.contentLinkmicID));
            C1142340fpg.LJFF(c1142350fph, 1, posIdentityExtra.contentLinkmicID);
        }
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, SpotInfo spotInfo) {
        LIZIZ(c1142350fph, spotInfo);
    }
}
