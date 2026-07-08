package tikcast.linkmic.common;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;

/* JADX INFO: loaded from: classes18.dex */
public final class _PosIdentity_ProtoEncoder implements InterfaceC1132110fZB<PosIdentity> {
    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, PosIdentity posIdentity) {
        PosIdentity posIdentity2 = posIdentity;
        int i = posIdentity2.type;
        c1142350fph.LIZLLL(1, 0);
        c1142350fph.LIZJ(i);
        C1142340fpg.LJFF(c1142350fph, 2, posIdentity2.value);
    }
}
