package webcast.data;

import X.C1142350fph;
import X.InterfaceC1132110fZB;

/* JADX INFO: loaded from: classes18.dex */
public final class _MsgFilter_ProtoEncoder implements InterfaceC1132110fZB<MsgFilter> {
    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, MsgFilter msgFilter) {
        MsgFilter msgFilter2 = msgFilter;
        boolean z = msgFilter2.isGifter;
        c1142350fph.LIZLLL(1, 0);
        c1142350fph.LJ(z ? 1 : 0);
        boolean z2 = msgFilter2.isSubscribedToAnchor;
        c1142350fph.LIZLLL(2, 0);
        c1142350fph.LJ(z2 ? 1 : 0);
    }
}
