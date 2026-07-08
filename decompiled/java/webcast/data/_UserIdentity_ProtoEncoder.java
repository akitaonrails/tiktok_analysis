package webcast.data;

import X.C1142350fph;
import X.InterfaceC1132110fZB;

/* JADX INFO: loaded from: classes18.dex */
public final class _UserIdentity_ProtoEncoder implements InterfaceC1132110fZB<UserIdentity> {
    public static void LIZIZ(C1142350fph c1142350fph, UserIdentity userIdentity) {
        boolean z = userIdentity.isGiftGiverOfAnchor;
        c1142350fph.LIZLLL(1, 0);
        c1142350fph.LJ(z ? 1 : 0);
        boolean z2 = userIdentity.isSubscriberOfAnchor;
        c1142350fph.LIZLLL(2, 0);
        c1142350fph.LJ(z2 ? 1 : 0);
        boolean z3 = userIdentity.isMutualFollowingWithAnchor;
        c1142350fph.LIZLLL(3, 0);
        c1142350fph.LJ(z3 ? 1 : 0);
        boolean z4 = userIdentity.isFollowerOfAnchor;
        c1142350fph.LIZLLL(4, 0);
        c1142350fph.LJ(z4 ? 1 : 0);
        boolean z5 = userIdentity.isModeratorOfAnchor;
        c1142350fph.LIZLLL(5, 0);
        c1142350fph.LJ(z5 ? 1 : 0);
        boolean z6 = userIdentity.isAnchor;
        c1142350fph.LIZLLL(6, 0);
        c1142350fph.LJ(z6 ? 1 : 0);
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, UserIdentity userIdentity) {
        LIZIZ(c1142350fph, userIdentity);
    }
}
